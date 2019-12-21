package br.com.controlepedido.gui;

import br.com.controlepedido.dto.ClienteDTO;
import br.com.controlepedido.dto.CreditoDebitoClienteProdutoDTO;
import br.com.controlepedido.dto.CreditoDebitoDTO;
import br.com.controlepedido.dto.ProdutosDTO;
import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.service.ClienteService;
import br.com.controlepedido.service.CreditoDebitoService;
import br.com.controlepedido.service.ProdutosService;
import br.com.controlepedido.util.Formatar;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author MDiasT
 */
public class CreditoDebitoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    CreditoDebitoService cdSER = new CreditoDebitoService();
    List<CreditoDebitoClienteProdutoDTO> lista = null;
    Formatar f = new Formatar();
    CreditoDebitoDTO cd = new CreditoDebitoDTO();
    ClienteService cSER = new ClienteService();
    ProdutosService pSER = new ProdutosService();
    
    Long id_cliente =0l, id_produtos = 0l;
    String nome ="", descricao ="";
    
    public CreditoDebitoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGravarAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btFecharTela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCreditoDebito = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPedidoNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValorDebito = new javax.swing.JTextField();
        txtValorCredito = new javax.swing.JTextField();
        dccData = new com.toedter.calendar.JDateChooser();
        btPesquisar = new javax.swing.JButton();
        cbClientes = new javax.swing.JComboBox<>();
        cbProdutos = new javax.swing.JComboBox<>();

        setTitle("Controle de Pedidos - CRÉDITO E DÉBITO");
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

        btGravarAlterar.setText("Alterar");
        btGravarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Erase.png"))); // NOI18N
        btExcluir.setText("   Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btFecharTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Exit.png"))); // NOI18N
        btFecharTela.setText("   Fechar Tela");
        btFecharTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharTelaActionPerformed(evt);
            }
        });

        tabelaCreditoDebito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Produto", "Data", "Nº do Pedido", "Valor Crédito", "Valor Débito"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCreditoDebito.setName("tabelaCreditoDebito"); // NOI18N
        tabelaCreditoDebito.setVerifyInputWhenFocusTarget(false);
        tabelaCreditoDebito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCreditoDebitoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCreditoDebito);
        if (tabelaCreditoDebito.getColumnModel().getColumnCount() > 0) {
            tabelaCreditoDebito.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaCreditoDebito.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaCreditoDebito.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaCreditoDebito.getColumnModel().getColumn(3).setMinWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(3).setMaxWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(4).setMinWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(4).setMaxWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(5).setMinWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(5).setPreferredWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(5).setMaxWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(6).setMinWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(6).setPreferredWidth(80);
            tabelaCreditoDebito.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jLabel1.setText("Id");

        jLabel2.setText("Pedido Número");

        txtId.setEditable(false);

        jLabel3.setText("Cliente");

        jLabel4.setText("Descrição");

        jLabel5.setText("Data");

        jLabel6.setText("Valor Crédito");

        jLabel7.setText("Valor Débito");

        txtValorDebito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtValorCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        cbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPedidoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cbProdutos, javax.swing.GroupLayout.Alignment.LEADING, 0, 400, Short.MAX_VALUE)
                                                .addComponent(cbClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dccData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(306, 306, 306)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btGravarAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPedidoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisar)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(dccData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtValorDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void carregarTabelaCreditoDebito() throws ApplicationException {
        modelo = (DefaultTableModel) tabelaCreditoDebito.getModel();
        modelo.setNumRows(0);
        lista = cdSER.listartabela();

        for(CreditoDebitoClienteProdutoDTO creditodebito : lista) {
            modelo.addRow(new String[]{
                creditodebito.getId_credito_debito().toString(),
                creditodebito.getNome_razao(),
                creditodebito.getDescricao(),
                creditodebito.getData().toString(),
                creditodebito.getPedido_numero().toString(),
                creditodebito.getValor_credito().toString(),
                creditodebito.getValor_debito().toString(),
            });
        }
    }
    
    private List<ClienteDTO> carregaComboBoxCliente(){
    List<ClienteDTO> listaCliente = new ArrayList<ClienteDTO>();
        try {
            cbClientes.addItem(" ... Selecione ... ");
            listaCliente = cSER.listarComboBox();
        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
        for(int i = 0;i<listaCliente.size(); i++ ){
            String str = listaCliente.get(i).getNome_razao();
            cbClientes.addItem(str);
        }
        return listaCliente;
    }
    
    private List<ProdutosDTO> carregaComboBoxProduto(){
    List<ProdutosDTO> listaProdutos = new ArrayList<ProdutosDTO>();
        try {
            cbProdutos.addItem(" ... Selecione ... ");
            listaProdutos = pSER.listarComboBox();
        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
        for(int i = 0;i<listaProdutos.size(); i++ ){
            String str = listaProdutos.get(i).getDescricao();
            cbProdutos.addItem(str);
        }
        return listaProdutos;
    }
    
    private void carregarTabelaCreditoDebitoPesquisa() throws ApplicationException {
        modelo = (DefaultTableModel) tabelaCreditoDebito.getModel();
        modelo.setNumRows(0);
        lista = cdSER.listarPedidoNumeroTabela(Long.parseLong(txtPedidoNumero.getText()));

        for(CreditoDebitoClienteProdutoDTO creditodebito : lista) {
            modelo.addRow(new String[]{
                creditodebito.getId_credito_debito().toString(),
                creditodebito.getNome_razao(),
                creditodebito.getDescricao(),
                creditodebito.getData().toString(),
                creditodebito.getPedido_numero().toString(),
                creditodebito.getValor_credito().toString(),
                creditodebito.getValor_debito().toString(),
            });
        }
    }
    
    private void btGravarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarAlterarActionPerformed
        if(txtId.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Não é permitido 'INCLUIR' um Crédito e Débito nesta tela, só através de Pedidos!!!");
        }else{
            try {
                if(id_cliente != 0l && id_produtos != 0l){
                    capturaInformacoes();
                    cdSER.alterar(cd);
                    JOptionPane.showMessageDialog(this, "Alteração Executada com sucesso");
                    LimpaTela();
                    carregarTabelaCreditoDebito();
                }else{
                    JOptionPane.showMessageDialog(this, " É Necessário Selecionar o Cliente ou Produto ");
                }
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btGravarAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linha = tabelaCreditoDebito.getSelectedRow();
        if(tabelaCreditoDebito.getValueAt(linha, 0) == null){
            JOptionPane.showMessageDialog(this, "É necessário Selecioanr na tabela o item a ser excluido");
        }else{
            int confirma = JOptionPane.showConfirmDialog(this, "Deseja realmente EXCLUIR o Crédito ou Débito ID NÚMERO " + tabelaCreditoDebito.getValueAt(linha, 0) +" ?");
            if (confirma == 0) {
                try {
                cdSER.excluir(Long.parseLong(tabelaCreditoDebito.getValueAt(linha, 0).toString()));
                JOptionPane.showMessageDialog(this, "Item ID NÚMERO " + tabelaCreditoDebito.getValueAt(linha, 0) + " EXCLUIDO com sucesso!!!");
                carregarTabelaCreditoDebito();
                } catch (ApplicationException ex) {
                    ex.printStackTrace();
                }
            } 
        }
        LimpaTela();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btFecharTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharTelaActionPerformed
        if (txtPedidoNumero.getText().equals("")) {
            this.dispose();
        } else {
            int confirma = JOptionPane.showConfirmDialog(this, "Deseja Salvar a ALTERAÇÂO antes de fechar?");
            if (confirma == 0) {
            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btFecharTelaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            carregaComboBoxProduto();
            carregaComboBoxCliente();
            carregarTabelaCreditoDebito();
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void tabelaCreditoDebitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCreditoDebitoMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tabelaCreditoDebito.getSelectedRow();
            txtId.setText(tabelaCreditoDebito.getValueAt(linha, 0).toString());
            try {
                dccData.setDate(f.stringAmericanaParaDate(tabelaCreditoDebito.getValueAt(linha, 3).toString()));
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
            txtPedidoNumero.setText(tabelaCreditoDebito.getValueAt(linha, 4).toString());
            txtValorCredito.setText(f.doubleParaStringComPontoDeMilhar(Double.parseDouble(tabelaCreditoDebito.getValueAt(linha, 5).toString())));
            txtValorDebito.setText(f.doubleParaStringComPontoDeMilhar(Double.parseDouble(tabelaCreditoDebito.getValueAt(linha, 6).toString())));
        }
    }//GEN-LAST:event_tabelaCreditoDebitoMouseClicked

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if(txtPedidoNumero.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "É Necessário digitar o Número do Pedido");
            try {
                carregarTabelaCreditoDebito();
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
        }else{
            try {
                cdSER.listarPedidoNumeroTabela(Long.parseLong(txtPedidoNumero.getText()));
                carregarTabelaCreditoDebitoPesquisa();
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        nome = cbClientes.getSelectedItem().toString();
        if(!cbClientes.getSelectedItem().toString().equals(" ... Selecione ... ")){
            try {
                List<ClienteDTO> cliente = cSER.buscaNome(nome);
                id_cliente = cliente.get(0).getId_cliente();
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbClientesActionPerformed

    private void cbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutosActionPerformed
        descricao = cbProdutos.getSelectedItem().toString();
        if(!cbProdutos.getSelectedItem().toString().equals(" ... Selecione ... ")){
            try {
                List<ProdutosDTO> produtos = pSER.buscaDescricao(descricao);
                id_produtos = produtos.get(0).getId_produtos();
                
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbProdutosActionPerformed
    
    private void LimpaTela(){
        txtId.setText("");
        carregaComboBoxProduto();
        carregaComboBoxCliente();
        dccData.setDate(Date.from(Instant.now()));
        txtPedidoNumero.setText("");
        txtValorCredito.setText("");
        txtValorDebito.setText("");
    }
    
    private void capturaInformacoes(){
        cd.setPedido_numero(Long.parseLong(txtPedidoNumero.getText()));
        cd.setId_credito_debito(Long.parseLong(txtId.getText()));
        cd.setData(dccData.getDate());
        if(id_cliente != 0l){
        cd.setId_cliente(id_cliente);
        }
        if(id_produtos != 0l){
            cd.setId_produto(id_produtos);
        }
        cd.setPedido_numero(Long.parseLong(txtPedidoNumero.getText()));
        cd.setValor_credito(Double.parseDouble(f.convertendoDoubleAmericano(txtValorCredito.getText())));
        cd.setValor_debito(Double.parseDouble(f.convertendoDoubleAmericano(txtValorDebito.getText())));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFecharTela;
    private javax.swing.JButton btGravarAlterar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbProdutos;
    private com.toedter.calendar.JDateChooser dccData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCreditoDebito;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPedidoNumero;
    private javax.swing.JTextField txtValorCredito;
    private javax.swing.JTextField txtValorDebito;
    // End of variables declaration//GEN-END:variables
}
