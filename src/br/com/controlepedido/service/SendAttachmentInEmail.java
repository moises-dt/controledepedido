package br.com.controlepedido.service;

import br.com.controlepedido.dto.ClienteDTO;
import br.com.controlepedido.dto.ConfiguraEmailDTO;
import br.com.controlepedido.exception.ApplicationException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 * @author MDT
 */
public class SendAttachmentInEmail {

    String email, senha, servidor, porta, assunto, mensagem, emailcliente, criptografia = "";
    ConfiguracaoEmailService cesSer = new ConfiguracaoEmailService();
    ClienteService cSer = new ClienteService();

    public void enviaEmailAnexo(Long pedido, Long cod) {
        Long numero = pedido;
        Long codigo = cod;

        try {
            for (ClienteDTO cliente : cSer.detalharIdCliente(codigo)) {
                emailcliente = cliente.getEmail();
            }

            for (ConfiguraEmailDTO configura : cesSer.detalhar(1)) {
                email = configura.getEmail();
                senha = configura.getSenha();
                servidor = configura.getServidorsmtp();
                porta = configura.getPorta();
                assunto = configura.getAssunto();
                mensagem = configura.getMensagem();
                criptografia = configura.getCriptografia().toString();
            }

        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
        if (emailcliente.equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário preencher o email na ficha do cliente");

        } else {
            
            String to = emailcliente;

            String from = email;
            String username = email;
            String password = senha;
            
            String host = servidor;
            
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", criptografia);
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", porta);

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(to));
                message.setSubject(assunto);

                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(mensagem);

                String arquivo = "C:\\ControledePedido\\src\\pedidosgerados\\pedido n" + numero + ".pdf";

                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                messageBodyPart = new MimeBodyPart();
                String filename = arquivo;
                DataSource source = new FileDataSource(filename);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(filename);
                multipart.addBodyPart(messageBodyPart);
                message.setContent(multipart);

                Transport.send(message);

                JOptionPane.showMessageDialog(null, "Email com o pedido nº" + numero + " enviado com sucesso para o email: "+emailcliente +
                ".\nO arquivo do pedido nº" + numero + " se encontra na pasta C:\\ControledePedido\\src\\pedidosgerados\\ ");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
