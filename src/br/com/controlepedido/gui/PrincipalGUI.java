package br.com.controlepedido.gui;

import br.com.controlepedido.connection.DataBaseConnectionFactory;
import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.service.PedidosService;
import br.com.controlepedido.service.RelatorioService;
import br.com.controlepedido.util.Formatar;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * @author MDT
 */
public class PrincipalGUI extends javax.swing.JFrame {
    RelatorioService rSer = new RelatorioService();
    PedidosService pSer = new PedidosService();
    Formatar f = new Formatar();
    SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form PrincipalGUI
     */
    public PrincipalGUI() {
        setExtendedState(PrincipalGUI.MAXIMIZED_BOTH);
        initComponents();
        confirmaracesso();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivos = new javax.swing.JMenu();
        menuProdutos = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuPedidos = new javax.swing.JMenuItem();
        menuExcluirPedido = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuRealtorioProdutos = new javax.swing.JMenuItem();
        menuRelatorioClientes = new javax.swing.JMenuItem();
        menuRelatorioPedidos = new javax.swing.JMenuItem();
        MenuCreditoDebito = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        menuEmail = new javax.swing.JMenuItem();

        jToolBar1.setRollover(true);

        jMenu5.setText("jMenu5");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("jMenu4");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Pedidos - MDT Sistemas");
        setIconImages(null);
        setName("Principal"); // NOI18N

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );

        menuArquivos.setText("  Arquivos          ");

        menuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Shopping cart.png"))); // NOI18N
        menuProdutos.setText("  Produtos  ");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        menuArquivos.add(menuProdutos);

        menuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Add.png"))); // NOI18N
        menuCliente.setText("  Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuArquivos.add(menuCliente);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Report.png"))); // NOI18N
        jMenuItem2.setText("Crédito Débito");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuArquivos.add(jMenuItem2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Notes.png"))); // NOI18N
        jMenu3.setText("Pedidos");

        menuPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Clipboard.png"))); // NOI18N
        menuPedidos.setText("  Gerar Pedidos");
        menuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidosActionPerformed(evt);
            }
        });
        jMenu3.add(menuPedidos);

        menuExcluirPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuExcluirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Erase.png"))); // NOI18N
        menuExcluirPedido.setText("Excluir Pedido");
        menuExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirPedidoActionPerformed(evt);
            }
        });
        jMenu3.add(menuExcluirPedido);

        menuArquivos.add(jMenu3);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Turn off.png"))); // NOI18N
        menuSair.setText("  Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivos.add(menuSair);

        jMenuBar1.add(menuArquivos);

        menuRelatorio.setText("  Relatorios           ");

        menuRealtorioProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens24x24/FauxS-XP (Cobalt) 1.0 Icon 23.png"))); // NOI18N
        menuRealtorioProdutos.setText("Produtos");
        menuRealtorioProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRealtorioProdutosActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuRealtorioProdutos);

        menuRelatorioClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens24x24/FauxS-XP (Cobalt) 1.0 Icon 23.png"))); // NOI18N
        menuRelatorioClientes.setText("Clientes");
        menuRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioClientesActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuRelatorioClientes);

        menuRelatorioPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens24x24/Assignment.png"))); // NOI18N
        menuRelatorioPedidos.setText("Pedidos");
        menuRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioPedidosActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuRelatorioPedidos);

        MenuCreditoDebito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens24x24/creditodebito.png"))); // NOI18N
        MenuCreditoDebito.setText("Crédito/Débito");
        MenuCreditoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreditoDebitoActionPerformed(evt);
            }
        });
        menuRelatorio.add(MenuCreditoDebito);

        jMenuBar1.add(menuRelatorio);

        menuConfiguracoes.setText("Configurações");

        menuEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/iconfinder_073_95947.png"))); // NOI18N
        menuEmail.setText("Email");
        menuEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmailActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuEmail);

        jMenuBar1.add(menuConfiguracoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        ProdutosGUI pg = new ProdutosGUI();
        chamarTela(pg);
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        Integer confirma = JOptionPane.showConfirmDialog(this, "Deseja fechar o sistema");
        if (confirma == 0) {
            System.exit(0);
        } else if (confirma == 1) {
            //JOptionPane.showMessageDialog(this, "Obrigado por permanecer no sistema");
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        ClientesGUI cg = new ClientesGUI();
        chamarTela(cg);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioClientesActionPerformed
        rSer.relatorioCliente();
    }//GEN-LAST:event_menuRelatorioClientesActionPerformed

    private void menuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidosActionPerformed
        BasePedidoGUI bpg = new BasePedidoGUI();
        chamarTela(bpg);
    }//GEN-LAST:event_menuPedidosActionPerformed

    private void menuRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioPedidosActionPerformed
        RelatorioPedidos rp = new RelatorioPedidos();
        chamarTela(rp);
    }//GEN-LAST:event_menuRelatorioPedidosActionPerformed

    private void menuRealtorioProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRealtorioProdutosActionPerformed
        rSer.realtorioProdutos();
    }//GEN-LAST:event_menuRealtorioProdutosActionPerformed

    private void menuExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirPedidoActionPerformed
        Integer confirma = JOptionPane.showConfirmDialog(this, "Você deseja realmente excluir um pedido?");
        String codigo = "";
        if (confirma == 0) {
            codigo = JOptionPane.showInputDialog(this, "Digite o Número do Pedido que deseja excluir!!!");
            if (codigo.equals("")) {
                codigo = JOptionPane.showInputDialog(this, "É necessário digitar o 'Número do Pedido'");
            } else {
                try {
                    pSer.excluirPedidoNumero(Long.parseLong(codigo));
                    JOptionPane.showMessageDialog(this, "O Pedido Número " + codigo + " foi excluido com sucesso!");
                } catch (ApplicationException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao Tentar excluir o pedido número " + codigo);
                }
            }
        }
    }//GEN-LAST:event_menuExcluirPedidoActionPerformed

    private void menuEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmailActionPerformed
        ConfEmailGUI ceg = new ConfEmailGUI();
        chamarTela(ceg);
    }//GEN-LAST:event_menuEmailActionPerformed

    private void MenuCreditoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCreditoDebitoActionPerformed
        RelatorioCreditoDebito rcd = new RelatorioCreditoDebito();
        chamarTela(rcd);
    }//GEN-LAST:event_MenuCreditoDebitoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CreditoDebitoGUI cd = new CreditoDebitoGUI();
        chamarTela(cd);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    public void chamarTela(JInternalFrame p) {
        DesktopPane.add(p);
        int x = (DesktopPane.getWidth() / 2) - (p.getWidth() / 2);
        int y = (DesktopPane.getHeight() / 2) - (p.getHeight() / 2);
        p.setVisible(true);
        p.setLocation(x, y);
        p.toFront();
        p.show();
    }

    public void confirmaracesso() {

        Date now = new Date();
        Date dataatual = now;
        String dataparada = "12/01/2020";
        Date datalimite = now;
        try {
            datalimite = f.stringParaDate(dataparada);
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (dataatual.after(datalimite)) {
//            System.out.println("Data igual ou depois");
            JOptionPane.showMessageDialog(this, "Sistema expirado dia: " + dt.format(datalimite) + ",\n entre em contato com o MDT Soluções \n Tel(24)2030-2337 ou (24)99235-4342");
            System.exit(0);
        } else if (dataatual.before(datalimite)) {
//            System.out.println("data antes nem no dia ");
//            JOptionPane.showMessageDialog(this, "Bem vindo ao sistema de controle de pedido\no sistema expira em: " + dt.format(datalimite));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem MenuCreditoDebito;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuArquivos;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenuItem menuEmail;
    private javax.swing.JMenuItem menuExcluirPedido;
    private javax.swing.JMenuItem menuPedidos;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JMenuItem menuRealtorioProdutos;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuRelatorioClientes;
    private javax.swing.JMenuItem menuRelatorioPedidos;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables

    public Connection getConnection() throws SQLException {
        return DataBaseConnectionFactory.getConnection();
    }

}
