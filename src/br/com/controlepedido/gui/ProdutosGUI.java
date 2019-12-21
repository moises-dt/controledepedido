package br.com.controlepedido.gui;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.dto.ProdutosDTO;
import br.com.controlepedido.service.ProdutosService;
import br.com.controlepedido.util.Formatar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author MDT
 */
public class ProdutosGUI extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private ProdutosDTO p = new ProdutosDTO();
    private ProdutosService pSer = new ProdutosService();
    List<ProdutosDTO> lista = null;
    Formatar f = new Formatar();
    Boolean descontinuado=false;

    /**
     * Creates new form ProdutosGUI
     */
    public ProdutosGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdCodigo = new javax.swing.JTextField();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipoVolume = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtComissaoPallet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtComissaoNormal = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        chbDescontinuado = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btGravarAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelarLimpar = new javax.swing.JButton();
        btFecharTela = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setClosable(true);
        setTitle("Controle de Pedidos - PRODUTOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Shopping cart.png"))); // NOI18N
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

        jLabel1.setText("Codigo:");

        txtIdCodigo.setEditable(false);
        txtIdCodigo.setToolTipText("");
        txtIdCodigo.setFocusable(false);

        txtCodigoProduto.setToolTipText("");

        jLabel2.setText("Codigo Produto:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Tipo Volume:");

        jLabel5.setText("Valor:");

        jLabel6.setText("Categoria:");

        jLabel7.setText("Comissão Pallet:");

        jLabel8.setText("Comissão Normal:");

        txtValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Find.png"))); // NOI18N
        btPesquisar.setText("     Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        chbDescontinuado.setText("Descontinuado");
        chbDescontinuado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDescontinuadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbDescontinuado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtComissaoPallet, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtComissaoNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescricao)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtComissaoNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtComissaoPallet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(chbDescontinuado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btGravarAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Add.png"))); // NOI18N
        btGravarAlterar.setText("   Gravar / Alterar");
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

        btCancelarLimpar.setText("Cancelar / Limpar");
        btCancelarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarLimparActionPerformed(evt);
            }
        });

        btFecharTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Exit.png"))); // NOI18N
        btFecharTela.setText("   Fechar Tela Clientes");
        btFecharTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Codigo Produto", "Descrição", "Tipo Volume", "Valor", "Categoria", "Com. Pallet", "Com. Normal", "descontinuado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.getTableHeader().setReorderingAllowed(false);
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProduto.getColumnModel().getColumn(0).setMaxWidth(50);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblProduto.getColumnModel().getColumn(1).setMaxWidth(90);
            tblProduto.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblProduto.getColumnModel().getColumn(3).setMaxWidth(150);
            tblProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblProduto.getColumnModel().getColumn(4).setMaxWidth(70);
            tblProduto.getColumnModel().getColumn(5).setPreferredWidth(200);
            tblProduto.getColumnModel().getColumn(5).setMaxWidth(200);
            tblProduto.getColumnModel().getColumn(6).setPreferredWidth(70);
            tblProduto.getColumnModel().getColumn(6).setMaxWidth(70);
            tblProduto.getColumnModel().getColumn(7).setPreferredWidth(75);
            tblProduto.getColumnModel().getColumn(7).setMaxWidth(75);
            tblProduto.getColumnModel().getColumn(8).setMinWidth(0);
            tblProduto.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblProduto.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarAlterarActionPerformed
        if (txtDescricao.getText().length() <= 3) {
            JOptionPane.showMessageDialog(null, "Por Favor informe um Descrição maior que 3 digitos");
        } else {
            carregaInformacoes();
            try {
                if (txtIdCodigo.getText().trim().equals("")) {
                    pSer.incluir(p);
                    JOptionPane.showMessageDialog(this, "Inclusão feita com sucesso");
                } else {
                    pSer.alterar(p);
                    JOptionPane.showMessageDialog(this, "Alteração feita com sucesso");
                }
                carregarTabela();
            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            limpaTela();
        }
    }//GEN-LAST:event_btGravarAlterarActionPerformed

    private void btCancelarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarLimparActionPerformed
        limpaTela();
    }//GEN-LAST:event_btCancelarLimparActionPerformed

    private void btFecharTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharTelaActionPerformed
        if (txtDescricao.getText().equals("")) {
            this.dispose();
        } else {
            int confirma = JOptionPane.showConfirmDialog(this, "Deseja Salvar o seu Produto antes de fechar?");
            if (confirma != 0) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btFecharTelaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            carregarTabela();
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela na inicialização");
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        int linha = tblProduto.getSelectedRow();
        if (evt.getClickCount() == 2) {
            if (linha >= 0) {
                try {
                    txtIdCodigo.setText(tblProduto.getValueAt(linha, 0).toString());
                    txtCodigoProduto.setText(tblProduto.getValueAt(linha, 1).toString());
                    txtDescricao.setText(tblProduto.getValueAt(linha, 2).toString());
                    txtTipoVolume.setText(tblProduto.getValueAt(linha, 3).toString());
                    txtValor.setText(f.doubleParaStringComPontoDeMilhar(Double.parseDouble(tblProduto.getValueAt(linha, 4).toString())));
                    txtCategoria.setText(tblProduto.getValueAt(linha, 5).toString());
                    txtComissaoPallet.setText(tblProduto.getValueAt(linha, 6).toString());
                    txtComissaoNormal.setText(tblProduto.getValueAt(linha, 7).toString());
                    if(tblProduto.getValueAt(linha, 8).toString().equals("true")){
                        chbDescontinuado.setSelected(true);
                    }if(tblProduto.getValueAt(linha, 8).toString().equals("false")){
                        chbDescontinuado.setSelected(false);
                    }
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Houve algum erro ao capturar as informações");
                }
            }
        }
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String id_produto = txtIdCodigo.getText();
        if (id_produto == null || txtIdCodigo.getText().equals("")) {
            JOptionPane.showConfirmDialog(this, "Nenhum produto selecionado para excluir");
        } else {
            try {
                pSer.excluir(Long.parseLong(id_produto));
                JOptionPane.showMessageDialog(this, "Exclusão do Produto " + txtCodigoProduto.getText() + " com sucesso !");
                carregarTabela();
            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, "Houve algum erro ao tentar excluir esta informação");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if (txtCodigoProduto.getText().equals("") && txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Código do Produto ou a Descrição para poder gerar busca!!!");
        } else if (txtCodigoProduto.getText().equals("")) {
            try {
                carregarTabelaProdutoDescricao(txtDescricao.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (txtDescricao.getText().equals("")) {
            carregarTabelaProdutoCodigo(txtCodigoProduto.getText());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void chbDescontinuadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDescontinuadoActionPerformed
        if(chbDescontinuado.isSelected()){
            descontinuado = true;
        }else{
            descontinuado = false;
        }
    }//GEN-LAST:event_chbDescontinuadoActionPerformed

    // carrega a tabela Produtos pela busca por codigo
    private void carregarTabelaProdutoCodigo(String cod) {
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);

        try {
            for (ProdutosDTO produtos : pSer.detalharCodigo(cod)) {
                modelo.addRow(new String[]{
                    produtos.getId_produtos().toString(),
                    produtos.getCodigo(),
                    produtos.getDescricao(),
                    produtos.getTipoVolume(),
                    produtos.getValor().toString(),
                    produtos.getCategoria(),
                    produtos.getComissaoPallet().toString(),
                    produtos.getComissaoNormal().toString(),
                    produtos.getDescontinuado().toString(),});
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // carrega a tabela Produtos pela busca por descricao
    private void carregarTabelaProdutoDescricao(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);

        try {
            for (ProdutosDTO produtos : pSer.detalharNome(desc)) {
                modelo.addRow(new String[]{
                    produtos.getId_produtos().toString(),
                    produtos.getCodigo(),
                    produtos.getDescricao(),
                    produtos.getTipoVolume(),
                    produtos.getValor().toString(),
                    produtos.getCategoria(),
                    produtos.getComissaoPallet().toString(),
                    produtos.getComissaoNormal().toString(),
                    produtos.getDescontinuado().toString(),});
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void carregaInformacoes() {
        p.setCodigo(txtCodigoProduto.getText());
        p.setDescricao(txtDescricao.getText());
        p.setTipoVolume(txtTipoVolume.getText());
        p.setValor(Double.parseDouble(f.convertendoDoubleAmericano(txtValor.getText())));
        p.setCategoria(txtCategoria.getText());
        p.setComissaoPallet(Double.parseDouble(txtComissaoPallet.getText()));
        p.setComissaoNormal(Double.parseDouble(txtComissaoNormal.getText()));
        if (!txtIdCodigo.getText().trim().equals("")) {
            p.setId_produtos(Long.parseLong(txtIdCodigo.getText()));
        }           
        p.setDescontinuado(descontinuado);
    }

    private void carregarTabela() throws ApplicationException {
        modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);
        lista = pSer.listar();

        for (ProdutosDTO produto : lista) {
            modelo.addRow(new String[]{
                produto.getId_produtos().toString(),
                produto.getCodigo(),
                produto.getDescricao(),
                produto.getTipoVolume(),
                produto.getValor().toString(),
                produto.getCategoria(),
                produto.getComissaoPallet().toString(),
                produto.getComissaoNormal().toString(),
                produto.getDescontinuado().toString(),
            });
        }
    }

    private void limpaTela() {
        txtIdCodigo.setText("");
        txtCodigoProduto.setText("");
        txtDescricao.setText("");
        txtTipoVolume.setText("");
        txtValor.setText("");
        txtCategoria.setText("");
        txtComissaoPallet.setText("");
        txtComissaoNormal.setText("");
        chbDescontinuado.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarLimpar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFecharTela;
    private javax.swing.JButton btGravarAlterar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JCheckBox chbDescontinuado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtComissaoNormal;
    private javax.swing.JTextField txtComissaoPallet;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdCodigo;
    private javax.swing.JTextField txtTipoVolume;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
