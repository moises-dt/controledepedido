package br.com.controlepedido.gui;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.dto.ClienteDTO;
import br.com.controlepedido.service.ClienteService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author MDT
 */
public class ClientesGUI extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private ClienteDTO c = new ClienteDTO();
    private ClienteService cSer = new ClienteService();
    List<ClienteDTO> lista = null;

    public ClientesGUI() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNomeRazao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSite = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFormaPagamento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btGravarAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelarLimpar = new javax.swing.JButton();
        btFecharTela = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Controle de Pedidos - CLIENTES");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Notes.png"))); // NOI18N
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

        jLabel1.setText("ID:");

        txtId.setEditable(false);
        txtId.setFocusable(false);

        jLabel2.setText("Nome/Razão:");

        jLabel3.setText("CPF/CNPJ:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Número:");

        jLabel6.setText("Complemento:");

        jLabel7.setText("Bairro:");

        jLabel8.setText("Cidade:");

        jLabel9.setText("Cep:");

        jLabel10.setText("Uf:");

        jLabel11.setText("Email:");

        jLabel12.setText("Site:");

        jLabel13.setText("Telefone:");

        jLabel14.setText("Código:");

        jLabel15.setText("Forma de Pagamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUf))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(88, 88, 88)
                                        .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Cpf/Cnpj", "Nome/Razão", "Endereço", "Número", "Complemento", "Bairro", "Cidade", "Cep", "Uf", "Email", "Site", "Telefone", "Forma Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(40);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblClientes.getColumnModel().getColumn(1).setMaxWidth(60);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblClientes.getColumnModel().getColumn(5).setMaxWidth(40);
            tblClientes.getColumnModel().getColumn(10).setPreferredWidth(30);
            tblClientes.getColumnModel().getColumn(10).setMaxWidth(30);
            tblClientes.getColumnModel().getColumn(14).setMinWidth(0);
            tblClientes.getColumnModel().getColumn(14).setPreferredWidth(0);
            tblClientes.getColumnModel().getColumn(14).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btGravarAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Add.png"))); // NOI18N
        btGravarAlterar.setText("   Gravar / Alterar");
        btGravarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Erase.png"))); // NOI18N
        btExcluir.setText("  Excluir");
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
                .addGap(30, 30, 30)
                .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarAlterarActionPerformed

        if (txtNomeRazao.getText().length() <= 3) {
            JOptionPane.showMessageDialog(null, "Por Favor informe um Nome ou Razão Social maior que 3 digitos");
        } else {
            capturainformacoes();
            try {
                if (txtId.getText().equals("")) {
                    cSer.incluir(c);
                    JOptionPane.showMessageDialog(this, "Inclusão feita com sucesso");
                } else {
                    cSer.alterar(c);
                    JOptionPane.showMessageDialog(this, "Alteração feita com sucesso");
                }
                carregarTabela();
            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            limpatela();
        }
    }//GEN-LAST:event_btGravarAlterarActionPerformed

    private void btFecharTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharTelaActionPerformed
        if (txtNomeRazao.getText().equals("")) {
            this.dispose();
        } else {
            int confirma = JOptionPane.showConfirmDialog(this, "Deseja Salvar o seu cliente antes de fechar?");
            if (confirma == 0) {
            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btFecharTelaActionPerformed

    private void btCancelarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarLimparActionPerformed
        limpatela();
    }//GEN-LAST:event_btCancelarLimparActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            carregarTabela();
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_formInternalFrameActivated

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        limpatela();
        int linha = tblClientes.getSelectedRow();
        if (evt.getClickCount() == 2) {
            if (linha >= 0) {
                txtId.setText(tblClientes.getValueAt(linha, 0).toString());
                txtCodigo.setText(tblClientes.getValueAt(linha, 1).toString());
                txtCpfCnpj.setText(tblClientes.getValueAt(linha, 2).toString());
                txtNomeRazao.setText(tblClientes.getValueAt(linha, 3).toString());
                txtEndereco.setText(tblClientes.getValueAt(linha, 4).toString());
                txtNumero.setText(tblClientes.getValueAt(linha, 5).toString());
                txtComplemento.setText(tblClientes.getValueAt(linha, 6).toString());
                txtBairro.setText(tblClientes.getValueAt(linha, 7).toString());
                txtCidade.setText(tblClientes.getValueAt(linha, 8).toString());
                txtCep.setText(tblClientes.getValueAt(linha, 9).toString());
                txtUf.setText(tblClientes.getValueAt(linha, 10).toString());
                txtEmail.setText(tblClientes.getValueAt(linha, 11).toString());
                txtSite.setText(tblClientes.getValueAt(linha, 12).toString());
                txtTelefone.setText(tblClientes.getValueAt(linha, 13).toString());
                txtFormaPagamento.setText(tblClientes.getValueAt(linha, 14).toString());
            }
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String id_cliente = txtId.getText();
        if (txtId.getText().equals("")) {
            JOptionPane.showConfirmDialog(this, "Nenhum cliente selecionado para excluir");
        } else {
            try {
                cSer.excluir(Long.parseLong(id_cliente));
                JOptionPane.showMessageDialog(this, "Exclusão do Cliente " + txtCodigo.getText() + " com sucesso !");
                carregarTabela();
            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, "Houve algum erro ao tentar excluir esta informação");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void carregarTabela() throws ApplicationException {
        modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        lista = cSer.listar();

        for (ClienteDTO cliente : lista) {
            modelo.addRow(new String[]{
                cliente.getId_cliente().toString(),
                cliente.getCodigo(),
                cliente.getCpf_cnpj(),
                cliente.getNome_razao(),
                cliente.getEndereco(),
                cliente.getNumero(),
                cliente.getComplemento(),
                cliente.getBairro(),
                cliente.getCidade(),
                cliente.getCep(),
                cliente.getUf(),
                cliente.getEmail(),
                cliente.getSite(),
                cliente.getTelefone(),
                cliente.getFormapagamento(),
            });
        }
    }

    public void capturainformacoes() {
        c.setCodigo(txtCodigo.getText());
        c.setCpf_cnpj(txtCpfCnpj.getText());
        c.setNome_razao(txtNomeRazao.getText());
        c.setEndereco(txtEndereco.getText());
        c.setNumero(txtNumero.getText());
        c.setComplemento(txtComplemento.getText());
        c.setBairro(txtBairro.getText());
        c.setCidade(txtCidade.getText());
        c.setCep(txtCep.getText());
        c.setUf(txtUf.getText());
        c.setEmail(txtEmail.getText());
        c.setSite(txtSite.getText());
        c.setTelefone(txtTelefone.getText());
        if (txtId.getText().trim().equals("")) {

        } else {
            c.setId_cliente(Long.parseLong(txtId.getText()));
        }
        c.setFormapagamento(txtFormaPagamento.getText());
    }

    public void limpatela() {
        txtId.setText("");
        txtCodigo.setText("");
        txtCpfCnpj.setText("");
        txtNomeRazao.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtUf.setText("");
        txtEmail.setText("");
        txtSite.setText("");
        txtTelefone.setText("");
        txtFormaPagamento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarLimpar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFecharTela;
    private javax.swing.JButton btGravarAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpfCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormaPagamento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeRazao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
