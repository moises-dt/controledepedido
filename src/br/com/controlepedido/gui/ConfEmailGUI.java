/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controlepedido.gui;

import br.com.controlepedido.dto.ConfiguraEmailDTO;
import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.service.ConfiguracaoEmailService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MDT
 */
public class ConfEmailGUI extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    private ConfiguraEmailDTO ce = new ConfiguraEmailDTO();
    private ConfiguracaoEmailService ceSer = new ConfiguracaoEmailService();
    List<ConfiguraEmailDTO> detalha = null;
    
    /**
     * Creates new form ConfEmailGUI
     */
    public ConfEmailGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passSenhaEmail = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtServidorSmtp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        checkSSL = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAssuntoEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTextoPadrao = new javax.swing.JTextArea();
        btGravarAlterar = new javax.swing.JButton();
        btFecharTela = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblemails = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setResizable(true);
        setTitle("Configurações de Email - MDT Sistemas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/iconfinder_073_95947.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Email do Usuário:");

        jLabel2.setText("Senha Email: ");

        passSenhaEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passSenhaEmail.setText("jPasswordField1");

        jLabel3.setText("Servidor SMTP:");

        jLabel4.setText("Porta:");

        jLabel5.setText("Criptografia SSL");

        jLabel6.setText("Assunto dos Emails:");

        jLabel7.setText("Texto Padrão:");

        txtTextoPadrao.setColumns(20);
        txtTextoPadrao.setRows(5);
        jScrollPane1.setViewportView(txtTextoPadrao);

        btGravarAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Add.png"))); // NOI18N
        btGravarAlterar.setText("   Gravar / Alterar");
        btGravarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarAlterarActionPerformed(evt);
            }
        });

        btFecharTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Exit.png"))); // NOI18N
        btFecharTela.setText("   Fechar Tela");
        btFecharTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharTelaActionPerformed(evt);
            }
        });

        tblemails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "email", "senha", "servidor", "porta", "cripto", "assunto", "texto"
            }
        ));
        tblemails.setEnabled(false);
        tblemails.setFocusable(false);
        jScrollPane3.setViewportView(tblemails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGravarAlterar)
                            .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPorta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passSenhaEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtServidorSmtp, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(txtEmailUsuario)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtAssuntoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(checkSSL)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtServidorSmtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passSenhaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtAssuntoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(checkSSL))
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarAlterarActionPerformed

        capturainformacoes();
            try {
                    ceSer.alterar(ce);
                    carregartabela();
                    JOptionPane.showMessageDialog(this, "Alterações feita com sucesso");

            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
    }//GEN-LAST:event_btGravarAlterarActionPerformed

    public void capturainformacoes() {
        ce.setServidorsmtp(txtServidorSmtp.getText());
        ce.setPorta(txtPorta.getText());
        ce.setEmail(txtEmailUsuario.getText());
        ce.setSenha(passSenhaEmail.getText());
        ce.setCriptografia(checkSSL.isSelected());
        ce.setAssunto(txtAssuntoEmail.getText());
        ce.setMensagem(txtTextoPadrao.getText());
        ce.setId_email(01);
    }
           
    private void btFecharTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharTelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharTelaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            carregartabela();
        } catch (ApplicationException ex) {
            Logger.getLogger(ConfEmailGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtEmailUsuario.setText(tblemails.getValueAt(0, 0).toString());
        passSenhaEmail.setText(tblemails.getValueAt(0, 1).toString());
        txtServidorSmtp.setText(tblemails.getValueAt(0, 2).toString());
        txtPorta.setText(tblemails.getValueAt(0, 3).toString());
        if(tblemails.getValueAt(0, 4).toString().equals("true")){
            checkSSL.setSelected(true);
        }else{
            checkSSL.setSelected(false);
        }
        txtAssuntoEmail.setText(tblemails.getValueAt(0, 5).toString());
        txtTextoPadrao.setText(tblemails.getValueAt(0, 6).toString());
    }//GEN-LAST:event_formInternalFrameActivated
    
    public void carregartabela() throws ApplicationException {
        modelo = (DefaultTableModel) tblemails.getModel();
        modelo.setNumRows(0);
        detalha = ceSer.detalhar(1);


        for (ConfiguraEmailDTO email : detalha) {
            modelo.addRow(new String[]{
                email.getEmail(),
                email.getSenha(),
                email.getServidorsmtp(),
                email.getPorta(),
                String.valueOf(email.getCriptografia()),
                email.getAssunto(),
                email.getMensagem(),
                });
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFecharTela;
    private javax.swing.JButton btGravarAlterar;
    private javax.swing.JCheckBox checkSSL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField passSenhaEmail;
    private javax.swing.JTable tblemails;
    private javax.swing.JTextField txtAssuntoEmail;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtServidorSmtp;
    private javax.swing.JTextArea txtTextoPadrao;
    // End of variables declaration//GEN-END:variables
}
