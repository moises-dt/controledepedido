package br.com.controlepedido.service;

import br.com.controlepedido.connection.DataBaseConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * @author MDT
 */
public class RelatorioService {
    
        
    
    public void relatorioCliente() {                                                      
        Connection con;
        try {
            con = DataBaseConnectionFactory.getConnection();
            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatoriocliente.jasper";
            JasperPrint jasperprint = null;
            try {
                jasperprint = JasperFillManager.fillReport(src, null, con);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar o relatório");
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }  
    
    public void realtorioProdutos () {                                                      
        Connection con;
        try {
            con = DataBaseConnectionFactory.getConnection();
            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioprodutos.jasper";
            JasperPrint jasperprint = null;
            try {
                jasperprint = JasperFillManager.fillReport(src, null, con);
            } catch (Exception ex) {

            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }      
    
    public void criarGerarRelatorio(Long pedido) throws JRException {
        Connection con;

        try {
            con = DataBaseConnectionFactory.getConnection();

            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioPedidosCodigo.jasper";

            JasperPrint jasperprint = null;
            try {
                HashMap numero = new HashMap();
                numero.put("pedido_numero", pedido);

                jasperprint = JasperFillManager.fillReport(src, numero, con);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JasperExportManager.exportReportToPdfFile(jasperprint, "C:\\ControledePedido\\src\\pedidosgerados\\pedido n"+pedido+".pdf");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void criarGerarRelatorioEnvio(Long pedido) throws JRException {
        Connection con;

        try {
            con = DataBaseConnectionFactory.getConnection();

            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioPedidosCodigoEnvio.jasper";

            JasperPrint jasperprint = null;
            try {
                HashMap numero = new HashMap();
                numero.put("pedido_numero", pedido);

                jasperprint = JasperFillManager.fillReport(src, numero, con);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JasperExportManager.exportReportToPdfFile(jasperprint, "C:\\ControledePedido\\src\\pedidosgerados\\pedido n"+pedido+".pdf");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void CriarRelatorioDatas(Date datainicial, Date datafinal) {
        Connection con;

        try {
            con = DataBaseConnectionFactory.getConnection();

            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioPedidosPeriodo.jasper";

            JasperPrint jasperprint = null;
            try {
                HashMap datas = new HashMap();
                datas.put("datainicial", datainicial);
                datas.put("datafinal", datafinal);

                jasperprint = JasperFillManager.fillReport(src, datas, con);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void CriarRelatorioPedido(Long pedidonumero) {
        Connection con;

        try {
            con = DataBaseConnectionFactory.getConnection();

            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioPedidosCodigo.jasper";

            JasperPrint jasperprint = null;
            try {
                HashMap numero = new HashMap();
                numero.put("pedido_numero", pedidonumero);

                jasperprint = JasperFillManager.fillReport(src, numero, con);

            } catch (JRException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void CriarRelatorioDatasCreditoDebito(Date datainicial, Date datafinal) {
        Connection con;

        try {
            con = DataBaseConnectionFactory.getConnection();
            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioCreditoDebitoPeriodo.jasper";
            JasperPrint jasperprint = null;
            try {
                HashMap datas = new HashMap();
                datas.put("datainicial", datainicial);
                datas.put("datafinal", datafinal);
                jasperprint = JasperFillManager.fillReport(src, datas, con);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void CriarRelatorioCreditoDebito(Long pedidonumero) {
        Connection con;

        try {
            con = DataBaseConnectionFactory.getConnection();

            String src = "C:/ControledePedido/src/br/com/controlepedido/relatorio/relatorioCreditoDebitoPedido.jasper";

            JasperPrint jasperprint = null;
            try {
                HashMap numero = new HashMap();
                numero.put("pedido_numero", pedidonumero);

                jasperprint = JasperFillManager.fillReport(src, numero, con);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
