package br.com.controlepedido.gui;

import br.com.controlepedido.dto.ClienteDTO;
import br.com.controlepedido.dto.CreditoDebitoDTO;
import br.com.controlepedido.dto.PedidosDTO;
import br.com.controlepedido.dto.ProdutosDTO;
import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.service.ClienteService;
import br.com.controlepedido.service.CreditoDebitoService;
import br.com.controlepedido.service.EnviaEmailService;
import br.com.controlepedido.service.PedidosService;
import br.com.controlepedido.service.ProdutosService;
import br.com.controlepedido.service.RelatorioService;
import br.com.controlepedido.util.Formatar;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;


/**
 * @author MDT
 */
public class BasePedidoGUI extends javax.swing.JInternalFrame {

    Double valor = 0.0,
           valor1 = 0.0,
           valor2 = 0.0,
           resultado = 0.0;
    Integer qtd = 0,
            confirma = 0;
    
    CreditoDebitoDTO cd = new CreditoDebitoDTO();
    CreditoDebitoService cdSer = new CreditoDebitoService();

    RelatorioService rSer = new RelatorioService();

    EnviaEmailService ceSer = new EnviaEmailService();

    DefaultTableModel modelo = new DefaultTableModel();

    ClienteService cSer = new ClienteService();
    List<ClienteDTO> listacliente = null;

    PedidosDTO pe = new PedidosDTO();
    PedidosService peSer = new PedidosService();
    List<PedidosDTO> listapedido = null;

    ProdutosService pSer = new ProdutosService();
    List<ProdutosDTO> listaprodutos = null;

    SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
    Formatar f = new Formatar();

    /**
     * Creates new form PedidoGUI
     */
    public BasePedidoGUI() {
        
        initComponents();
        dccData.setDate(Date.from(Instant.now()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpPrincipal = new javax.swing.JTabbedPane();
        panelCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientePedido = new javax.swing.JTable();
        txtBuscaCliente = new javax.swing.JTextField();
        rbCodigoCliente = new javax.swing.JRadioButton();
        rbNomeCliente = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btPesquisaCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelProduto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rbCodigoProduto = new javax.swing.JRadioButton();
        rbNomeProduto = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscaProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutoPedido = new javax.swing.JTable();
        btPesquisaProdutos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtComissaoValor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCodigoPedido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtComissaoPallet = new javax.swing.JTextField();
        txtComissaoNormal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtValorUnitarioComissao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        dccData = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        txtValorTotalProdutos = new javax.swing.JTextField();
        btGerarPdf = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btGravarAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelarLimpar = new javax.swing.JButton();
        btFecharTela = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtValorCobrado = new javax.swing.JTextField();
        txtCreditogerado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        txtIdPedido = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTotalProdutos = new javax.swing.JTextField();
        txtTotalComissao = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Controle de Pedidos - PEDIDOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Clipboard.png"))); // NOI18N
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

        tblClientePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id Cliente", "Codigo Cliente", "Nome / Razão Social"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientePedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientePedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientePedido);
        if (tblClientePedido.getColumnModel().getColumnCount() > 0) {
            tblClientePedido.getColumnModel().getColumn(0).setMinWidth(150);
            tblClientePedido.getColumnModel().getColumn(0).setMaxWidth(150);
            tblClientePedido.getColumnModel().getColumn(1).setMinWidth(150);
            tblClientePedido.getColumnModel().getColumn(1).setMaxWidth(150);
            tblClientePedido.getColumnModel().getColumn(2).setResizable(false);
        }

        rbCodigoCliente.setText("Por Código do Cliente");
        rbCodigoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCodigoClienteMouseClicked(evt);
            }
        });
        rbCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoClienteActionPerformed(evt);
            }
        });

        rbNomeCliente.setSelected(true);
        rbNomeCliente.setText("Por Nome do Cliente");
        rbNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeClienteMouseClicked(evt);
            }
        });
        rbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolha o tipo de busca:");

        jLabel2.setText("Digite o código ou o nome do cliente:");

        btPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Find.png"))); // NOI18N
        btPesquisaCliente.setText("  Pesquisar");
        btPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Observação: Após fazer a buscar clique duas vezes no nome ou no codigo do cliente na tabela acima.");

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(rbCodigoCliente)
                                .addGap(18, 18, 18)
                                .addComponent(rbNomeCliente))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCodigoCliente)
                    .addComponent(rbNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpPrincipal.addTab("Informações do Cliente", panelCliente);

        jLabel4.setText("Escolha o tipo de busca:");

        rbCodigoProduto.setText("Por Código do Produto");
        rbCodigoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCodigoProdutoMouseClicked(evt);
            }
        });
        rbCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoProdutoActionPerformed(evt);
            }
        });

        rbNomeProduto.setSelected(true);
        rbNomeProduto.setText("Por Nome do Produto");
        rbNomeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeProdutoMouseClicked(evt);
            }
        });
        rbNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeProdutoActionPerformed(evt);
            }
        });

        jLabel5.setText("Digite o código ou a descrição do produto:");

        tblProdutoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Produto", "Descrição do Produto", "Codigo", "Tipo Volume", "Valor", "Categoria", "Comissão Pallet", "Comissão Normal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutoPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoPedidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProdutoPedido);
        if (tblProdutoPedido.getColumnModel().getColumnCount() > 0) {
            tblProdutoPedido.getColumnModel().getColumn(0).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(0).setMaxWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(1).setResizable(false);
            tblProdutoPedido.getColumnModel().getColumn(2).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(2).setMaxWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(3).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(3).setMaxWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(4).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(4).setMaxWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(5).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(5).setMaxWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(6).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(6).setMaxWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(7).setMinWidth(100);
            tblProdutoPedido.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        btPesquisaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/Find.png"))); // NOI18N
        btPesquisaProdutos.setText("  Pesquisar");
        btPesquisaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaProdutosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Observação: Após fazer a buscar clique duas vezes no nome ou no codigo do produto na tabela acima.");

        javax.swing.GroupLayout panelProdutoLayout = new javax.swing.GroupLayout(panelProduto);
        panelProduto.setLayout(panelProdutoLayout);
        panelProdutoLayout.setHorizontalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addGroup(panelProdutoLayout.createSequentialGroup()
                        .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelProdutoLayout.createSequentialGroup()
                        .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProdutoLayout.createSequentialGroup()
                                .addComponent(rbCodigoProduto)
                                .addGap(18, 18, 18)
                                .addComponent(rbNomeProduto))
                            .addGroup(panelProdutoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelProdutoLayout.setVerticalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCodigoProduto)
                    .addComponent(rbNomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpPrincipal.addTab("Informações do Produto", panelProduto);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informações do Cliente"));

        jLabel7.setText("Código Cliente:");

        txtCodigoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.setFocusable(false);

        jLabel8.setText("Nome Cliente:");

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeCliente.setEnabled(false);
        txtNomeCliente.setFocusable(false);

        jLabel19.setText("Id Cliente");

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCliente.setEnabled(false);
        txtIdCliente.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(52, 52, 52)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigoCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Código Produto:");

        jLabel10.setText("Data:");

        jLabel11.setText("Comissão Valor: %");

        txtComissaoValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtComissaoValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtComissaoValorFocusLost(evt);
            }
        });

        jLabel12.setText("Descrição:");

        jLabel13.setText("Quantidade:");

        txtQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });

        jLabel14.setText("Valor Unitario:");
        jLabel14.setToolTipText("");

        txtValorUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitarioFocusLost(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 102, 102));
        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel15.setText("Código do Pedido:");

        jLabel16.setText("Comissão Pallet: %");

        jLabel17.setText("Comissão Normal:%");

        txtComissaoPallet.setEditable(false);
        txtComissaoPallet.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtComissaoNormal.setEditable(false);
        txtComissaoNormal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel18.setText("Valor Unitário Comissão:");

        txtValorUnitarioComissao.setEditable(false);
        txtValorUnitarioComissao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorUnitarioComissao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel20.setText("Id Produto:");

        txtIdProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdProduto.setEnabled(false);
        txtIdProduto.setFocusable(false);

        jLabel22.setText("Valor Total Produtos");

        txtValorTotalProdutos.setEditable(false);
        txtValorTotalProdutos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorTotalProdutos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btGerarPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controlepedido/imagens18x18/emailcomanexo16x16.png"))); // NOI18N
        btGerarPdf.setText("Enviar Email Pedido Anexo");
        btGerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel20)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricao)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                            .addComponent(txtIdProduto))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigoPedido)
                                            .addComponent(dccData, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtValorUnitario)
                                            .addComponent(txtComissaoNormal)
                                            .addComponent(txtValorUnitarioComissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtComissaoPallet, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addComponent(txtValorTotalProdutos)
                                        .addComponent(txtComissaoValor)))))
                        .addGap(18, 18, 18)
                        .addComponent(btGerarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(txtCodigoPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(dccData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComissaoNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtComissaoPallet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtValorUnitarioComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtComissaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtValorTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGerarPdf))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        btFecharTela.setText("   Fechar Tela Clientes / Gerar Novo Pedido");
        btFecharTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btGravarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Débito Crédito")));
        jPanel7.setToolTipText("Teste");
        jPanel7.setAutoscrolls(true);
        jPanel7.setFocusTraversalPolicyProvider(true);
        jPanel7.setInheritsPopupMenu(true);
        jPanel7.setName(""); // NOI18N
        jPanel7.setRequestFocusEnabled(false);

        jLabel23.setText("Crédito Gerado:");

        jLabel24.setText("Valor Cobrado");

        txtValorCobrado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorCobrado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorCobradoFocusLost(evt);
            }
        });

        txtCreditogerado.setEditable(false);
        txtCreditogerado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtCreditogerado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtValorCobrado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtValorCobrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel24))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtCreditogerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel23))
        );

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Cliente", "Cod. Produto", "Cod. Pedido", "Data", "Quantidade", "Comissão Porcentagem", "Valor Unitário Produto", "Valor Total Produtos", "Valor Unitário Comissão", "Pedido Nr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPedido);
        if (tblPedido.getColumnModel().getColumnCount() > 0) {
            tblPedido.getColumnModel().getColumn(0).setMinWidth(70);
            tblPedido.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblPedido.getColumnModel().getColumn(0).setMaxWidth(70);
            tblPedido.getColumnModel().getColumn(1).setMinWidth(80);
            tblPedido.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblPedido.getColumnModel().getColumn(1).setMaxWidth(80);
            tblPedido.getColumnModel().getColumn(2).setMinWidth(80);
            tblPedido.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblPedido.getColumnModel().getColumn(2).setMaxWidth(80);
            tblPedido.getColumnModel().getColumn(4).setMinWidth(80);
            tblPedido.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblPedido.getColumnModel().getColumn(4).setMaxWidth(80);
            tblPedido.getColumnModel().getColumn(9).setMinWidth(50);
            tblPedido.getColumnModel().getColumn(9).setPreferredWidth(50);
            tblPedido.getColumnModel().getColumn(9).setMaxWidth(50);
        }

        txtIdPedido.setBackground(new java.awt.Color(204, 204, 204));
        txtIdPedido.setForeground(new java.awt.Color(204, 204, 204));
        txtIdPedido.setBorder(null);
        txtIdPedido.setCaretColor(new java.awt.Color(204, 204, 204));
        txtIdPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtIdPedido.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtIdPedido.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtIdPedido.setOpaque(false);
        txtIdPedido.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("TOTAIS:");

        txtTotalProdutos.setEditable(false);
        txtTotalProdutos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtTotalComissao.setEditable(false);
        txtTotalComissao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(250, 250, 250))
        );

        jPanel5.getAccessibleContext().setAccessibleName("");
        jPanel5.getAccessibleContext().setAccessibleDescription("");
        jPanel7.getAccessibleContext().setAccessibleDescription("Crédito e Débito");

        JpPrincipal.addTab("Gerar Pedido", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeClienteActionPerformed
        if (rbCodigoCliente.isSelected()) {
            rbCodigoCliente.setSelected(false);
        }
    }//GEN-LAST:event_rbNomeClienteActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        carregarTabelaCliente();
        carregarTabelaProdutos();
    }//GEN-LAST:event_formInternalFrameActivated

    private void rbCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoProdutoActionPerformed
        if (rbNomeProduto.isSelected()) {
            rbNomeProduto.setSelected(false);
        }
    }//GEN-LAST:event_rbCodigoProdutoActionPerformed

    private void rbNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeProdutoActionPerformed
        if (rbCodigoProduto.isSelected()) {
            rbCodigoProduto.setSelected(false);
        }
    }//GEN-LAST:event_rbNomeProdutoActionPerformed

    // botão de pesquisa clientes
    private void btPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaClienteActionPerformed
        if (txtBuscaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite algo para poder gerar busca!!!");
            carregarTabelaCliente();
        } else if (rbCodigoCliente.isSelected()) {
            try {
                carregarTabelaClienteCodigo(txtBuscaCliente.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (rbNomeCliente.isSelected()) {
            carregarTabelaClienteNome(txtBuscaCliente.getText());
        }
    }//GEN-LAST:event_btPesquisaClienteActionPerformed

    private void rbCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoClienteActionPerformed
        if (rbNomeCliente.isSelected()) {
            rbNomeCliente.setSelected(false);
        }
    }//GEN-LAST:event_rbCodigoClienteActionPerformed

    //botao de pesquisa produtos
    private void btPesquisaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaProdutosActionPerformed

        if (txtBuscaProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite algo para poder gerar busca!!!");
            carregarTabelaProdutos();
        } else if (rbCodigoProduto.isSelected()) {
            try {
                carregarTabelaProdutoCodigo(txtBuscaProduto.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (rbNomeProduto.isSelected()) {
            carregarTabelaProdutoNome(txtBuscaProduto.getText());
        }
    }//GEN-LAST:event_btPesquisaProdutosActionPerformed

    //Carregar as informações do cliente na base do pedido
    private void tblClientePedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientePedidoMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tblClientePedido.getSelectedRow();
            JpPrincipal.setSelectedIndex(1);
            txtIdCliente.setText(tblClientePedido.getValueAt(linha, 0).toString());
            txtCodigoCliente.setText(tblClientePedido.getValueAt(linha, 1).toString());
            txtNomeCliente.setText(tblClientePedido.getValueAt(linha, 2).toString());
        }
    }//GEN-LAST:event_tblClientePedidoMouseClicked

    //Carrega as informações do produto na base de pedido
    private void tblProdutoPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoPedidoMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tblProdutoPedido.getSelectedRow();
            JpPrincipal.setSelectedIndex(2);
            txtIdProduto.setText(tblProdutoPedido.getValueAt(linha, 0).toString());
            txtDescricao.setText(tblProdutoPedido.getValueAt(linha, 1).toString());
            txtCodigoProduto.setText(tblProdutoPedido.getValueAt(linha, 2).toString());
            txtValorUnitario.setText(f.doubleParaStringComPontoDeMilhar(Double.parseDouble(tblProdutoPedido.getValueAt(linha, 4).toString())));
            txtComissaoPallet.setText(tblProdutoPedido.getValueAt(linha, 6).toString());
            txtComissaoNormal.setText(tblProdutoPedido.getValueAt(linha, 7).toString());
        }
    }//GEN-LAST:event_tblProdutoPedidoMouseClicked

    private void rbNomeClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeClienteMouseClicked
        rbNomeCliente.setSelected(true);
    }//GEN-LAST:event_rbNomeClienteMouseClicked

    private void rbCodigoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCodigoClienteMouseClicked
        rbCodigoCliente.setSelected(true);
    }//GEN-LAST:event_rbCodigoClienteMouseClicked

    private void rbNomeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeProdutoMouseClicked
        rbNomeProduto.setSelected(true);
    }//GEN-LAST:event_rbNomeProdutoMouseClicked

    private void rbCodigoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCodigoProdutoMouseClicked
        rbCodigoProduto.setSelected(true);
    }//GEN-LAST:event_rbCodigoProdutoMouseClicked

    private void btFecharTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharTelaActionPerformed
        if (txtDescricao.getText().equals("")) {
            confirma = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais Pedidos?");
            if (confirma != 0) {
                this.dispose();
            } else {
                JpPrincipal.setSelectedIndex(0);
                limpaTelaCompleto();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Necessita Adicionar as informações do Pedido antes de fechar!!!");
        }
    }//GEN-LAST:event_btFecharTelaActionPerformed

    private void btCancelarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarLimparActionPerformed
        limpaTelaCompleto();
    }//GEN-LAST:event_btCancelarLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (txtCodigoPedido.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Não existe Código de Pedido para excluir");
        } else if (txtIdPedido.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Nenhum pedido selecionado para excluir");
        } else {
            Long codigo = Long.parseLong(txtIdPedido.getText());
            Long codigopedido = Long.parseLong(txtCodigoPedido.getText());
            try {
                peSer.excluir(codigo);
                JOptionPane.showMessageDialog(this, "Exclusão do Pedido ID " + codigo + " com sucesso !");
            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, "Houve algum erro ao tentar excluir esta informação");
            }
            carregarTabelaPedidos(codigopedido);
            totalizador();
            totalizadorprodutos();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    //Aciona e valida o botao de gravacao das informacoes
    private void btGravarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarAlterarActionPerformed
        String idpedido = txtIdPedido.getText();
        if (txtIdPedido.getText().trim().equals("")) {
            if (txtCodigoPedido.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Necessário digitar o numero do pedido");
            } else if (dccData.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Necessário selecionar uma data para o pedido");
            } else if (txtQuantidade.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Necessário informar a quantidade de produtos para o pedido");
            } else if (txtComissaoValor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Necessário informar o valor da comissão do produto para o pedido");
            } else {
                try {
                    carregaInformacoesPedido();
                    peSer.incluir(pe);
                    if (!txtValorCobrado.getText().trim().equals("")) {
                        carregaInformacoesCreditoDebito();
                        cdSer.incluir(cd);
                    }                   
                    JpPrincipal.setSelectedIndex(1);
                    limpaTelaBasico();
                    carregarTabelaPedidos(Long.parseLong(txtCodigoPedido.getText()));
                    totalizador();
                    totalizadorprodutos();
                } catch (ApplicationException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        } else {
            try {
                carregaInformacoesPedido();
                peSer.alterar(pe);
                JpPrincipal.setSelectedIndex(1);
                limpaTelaBasico();
                carregarTabelaPedidos(Long.parseLong(txtCodigoPedido.getText()));
                totalizador();
                totalizadorprodutos();
            } catch (ApplicationException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btGravarAlterarActionPerformed

    private void btGerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarPdfActionPerformed
        if (txtCodigoPedido.getText().equals("") || txtIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário adicionar um cliente e colocar um codigo de pedido");
        } else {
            long codigo = Long.parseLong(txtCodigoPedido.getText());
            long cod = Long.parseLong(txtIdCliente.getText());
            try {
                rSer.criarGerarRelatorioEnvio(codigo);
            } catch (JRException ex) {
                ex.printStackTrace();
            }
            ceSer.enviaEmailAnexo(codigo, cod);
        }
    }//GEN-LAST:event_btGerarPdfActionPerformed

    private void txtValorUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitarioFocusLost
        valor = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
        txtValorUnitario.setText(f.doubleParaStringComPontoDeMilhar(valor));

        if (!txtComissaoValor.getText().trim().equals("")) {
            qtd = Integer.parseInt(txtQuantidade.getText());
            valor1 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
            valor2 = Double.parseDouble(f.convertendoDoubleAmericano(txtComissaoValor.getText()));
            resultado = (qtd * valor1) * (valor2 / 100);
            txtValorUnitarioComissao.setText(f.doubleParaStringComPontoDeMilhar(resultado));
        }
        if (!txtValorTotalProdutos.getText().trim().equals("")) {
            qtd = Integer.parseInt(txtQuantidade.getText());
            valor1 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
            resultado = (qtd * valor1);
            txtValorTotalProdutos.setText(f.doubleParaStringComPontoDeMilhar(resultado));
        }
    }//GEN-LAST:event_txtValorUnitarioFocusLost

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        if(!txtQuantidade.getText().trim().equals("")){
            qtd = Integer.parseInt(txtQuantidade.getText());
            valor1 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
            resultado = (qtd * valor1);
            txtValorTotalProdutos.setText(f.doubleParaStringComPontoDeMilhar(resultado));
            if (!txtComissaoValor.getText().trim().equals("")) {
                qtd = Integer.parseInt(txtQuantidade.getText());
                valor1 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
                valor2 = Double.parseDouble(f.convertendoDoubleAmericano(txtComissaoValor.getText()));
                resultado = (qtd * valor1) * (valor2 / 100);
                txtValorUnitarioComissao.setText(f.doubleParaStringComPontoDeMilhar(resultado));
            }
        }
    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void txtComissaoValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComissaoValorFocusLost
        qtd = Integer.parseInt(txtQuantidade.getText());
        valor1 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
        valor2 = Double.parseDouble(f.convertendoDoubleAmericano(txtComissaoValor.getText()));
        resultado = (qtd * valor1) * (valor2 / 100);
        txtValorUnitarioComissao.setText(f.doubleParaStringComPontoDeMilhar(resultado));
    }//GEN-LAST:event_txtComissaoValorFocusLost

    private void tblPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidoMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tblPedido.getSelectedRow();
            txtCodigoCliente.setText(tblPedido.getValueAt(linha, 0).toString());
            txtIdProduto.setText(tblPedido.getValueAt(linha, 1).toString());
            txtCodigoPedido.setText(tblPedido.getValueAt(linha, 2).toString());
            try {
                dccData.setDate(f.stringParaDate(tblPedido.getValueAt(linha, 3).toString()));
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
            txtQuantidade.setText(tblPedido.getValueAt(linha, 4).toString());
            txtComissaoValor.setText(tblPedido.getValueAt(linha, 5).toString());
            txtValorCobrado.setText(tblPedido.getValueAt(linha, 6).toString());
            txtValorTotalProdutos.setText(tblPedido.getValueAt(linha, 7).toString());
            txtValorUnitarioComissao.setText(tblPedido.getValueAt(linha, 8).toString());
            txtIdPedido.setText(tblPedido.getValueAt(linha, 9).toString());
        }
    }//GEN-LAST:event_tblPedidoMouseClicked

    private void txtValorCobradoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorCobradoFocusLost
        if (!txtValorCobrado.getText().trim().equals("")) {
            valor = Double.parseDouble(f.convertendoDoubleAmericano(txtValorCobrado.getText()));
            valor1 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText()));
            valor2 = Double.parseDouble(f.convertendoDoubleAmericano(txtValorCobrado.getText()));
            qtd = Integer.parseInt(txtQuantidade.getText());
            resultado = (valor2 - valor1) * qtd;
            txtCreditogerado.setText(f.doubleParaStringComPontoDeMilhar(resultado));
            txtValorCobrado.setText(f.doubleParaStringComPontoDeMilhar(valor));
            txtValorTotalProdutos.setText(f.doubleParaStringComPontoDeMilhar(qtd * valor2));
        }
    }//GEN-LAST:event_txtValorCobradoFocusLost

    // carrega a tabela Produtos pela busca por codigo
    private void carregarTabelaProdutoCodigo(String cod) {
        DefaultTableModel modelo = (DefaultTableModel) tblProdutoPedido.getModel();
        modelo.setNumRows(0);
        try {
            for (ProdutosDTO produtos : pSer.detalharCodigo(cod)) {
                modelo.addRow(new String[]{
                    produtos.getId_produtos().toString(),
                    produtos.getDescricao(),
                    produtos.getCodigo(),
                    produtos.getTipoVolume(),
                    produtos.getValor().toString(),
                    produtos.getCategoria(),
                    produtos.getComissaoPallet().toString(),
                    produtos.getComissaoNormal().toString(),});
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // carrega a tabela Produtos pela busca por descricao
    private void carregarTabelaProdutoNome(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) tblProdutoPedido.getModel();
        modelo.setNumRows(0);
        try {
            for (ProdutosDTO produtos : pSer.detalharNome(desc)) {
                modelo.addRow(new String[]{
                    produtos.getId_produtos().toString(),
                    produtos.getDescricao(),
                    produtos.getCodigo(),
                    produtos.getTipoVolume(),
                    produtos.getValor().toString(),
                    produtos.getCategoria(),
                    produtos.getComissaoPallet().toString(),
                    produtos.getComissaoNormal().toString(),});
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // carrega a tabela cliente pela busca por codigo
    private void carregarTabelaClienteCodigo(String cod) {
        DefaultTableModel modelo = (DefaultTableModel) tblClientePedido.getModel();
        modelo.setNumRows(0);
        try {
            for (ClienteDTO cliente : cSer.detalharCodigo(cod)) {
                modelo.addRow(new String[]{
                    cliente.getId_cliente().toString(),
                    cliente.getCodigo(),
                    cliente.getNome_razao(),});
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // carrega a tabela cliente pela busca por nome
    private void carregarTabelaClienteNome(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) tblClientePedido.getModel();
        modelo.setNumRows(0);
        try {
            for (ClienteDTO cliente : cSer.detalharNome(nome)) {
                modelo.addRow(new String[]{
                    cliente.getId_cliente().toString(),
                    cliente.getCodigo().toString(),
                    cliente.getNome_razao(),});
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // Carrega todos os clientes na tabela clientes
    private void carregarTabelaCliente() {
        modelo = (DefaultTableModel) tblClientePedido.getModel();
        modelo.setNumRows(0);
        try {
            listacliente = cSer.listar();
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        for (ClienteDTO cliente : listacliente) {
            modelo.addRow(new String[]{
                cliente.getId_cliente().toString(),
                cliente.getCodigo(),
                cliente.getNome_razao(),});
        }
    }

    // carrega todos os produtos na tabela de produtos
    private void carregarTabelaProdutos() {
        modelo = (DefaultTableModel) tblProdutoPedido.getModel();
        modelo.setNumRows(0);
        try {
            listaprodutos = pSer.listarDescontinuado();
        } catch (ApplicationException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        for (ProdutosDTO produtos : listaprodutos) {
            modelo.addRow(new String[]{
                produtos.getId_produtos().toString(),
                produtos.getDescricao(),
                produtos.getCodigo(),
                produtos.getTipoVolume(),
                produtos.getValor().toString(),
                produtos.getCategoria(),
                produtos.getComissaoPallet().toString(),
                produtos.getComissaoNormal().toString(),});
        }
    }

    // carregando a tabela de pedidos só com os pedidos que está com o mesmo código
    private void carregarTabelaPedidos(Long codigo) {
        modelo = (DefaultTableModel) tblPedido.getModel();
        modelo.setNumRows(0);
        try {
            listapedido = peSer.detalhar(codigo);
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        for (PedidosDTO pedidos : listapedido) {
            modelo.addRow(new String[]{
                pedidos.getId_cliente().toString(),
                pedidos.getId_produtos().toString(),
                pedidos.getPedido_numero().toString(),
                dt.format(pedidos.getData()),
                pedidos.getQuantidade(),
                pedidos.getComissao_porcentagem().toString(),
                pedidos.getValor_unitario().toString(),
                pedidos.getValor_total_produto().toString(),
                pedidos.getValor_unitario_comissao().toString(),
                pedidos.getId_pedido().toString(),});
        }
    }

    //Limpa os campos de pedido basico
    private void limpaTelaBasico() {
        txtIdProduto.setText("");
        txtCodigoProduto.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtValorUnitario.setText("");
        txtComissaoPallet.setText("");
        txtComissaoNormal.setText("");
        txtComissaoValor.setText("");
        txtValorUnitarioComissao.setText("");
        txtIdPedido.setText("");
        txtValorTotalProdutos.setText("");
        txtCreditogerado.setText("");
        txtValorCobrado.setText("");
    }

    //lIMPA OS CAMPOS DE PEDIDOS COMPLETO
    private void limpaTelaCompleto() {
        txtIdCliente.setText("");
        txtCodigoCliente.setText("");
        txtNomeCliente.setText("");
        txtIdProduto.setText("");
        txtCodigoPedido.setText("");
        txtCodigoProduto.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtValorUnitario.setText("");
        txtComissaoPallet.setText("");
        txtComissaoNormal.setText("");
        txtComissaoValor.setText("");
        txtValorUnitarioComissao.setText("");
        txtIdPedido.setText("");
        txtValorTotalProdutos.setText("");
        txtCreditogerado.setText("");
        txtValorCobrado.setText("");
    }

    //carrega as informações para gerar as gravações ou atualizações
    private void carregaInformacoesPedido() {
        pe.setId_produtos(Long.parseLong(txtIdProduto.getText()));
        pe.setId_cliente(Long.parseLong(txtIdCliente.getText()));
        pe.setPedido_numero(Long.parseLong(txtCodigoPedido.getText()));
        pe.setData(dccData.getDate());
        pe.setQuantidade(txtQuantidade.getText());
        if(txtValorCobrado.getText().trim().equals("")){
            pe.setValor_unitario(Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitario.getText())));
        }else{
            pe.setValor_unitario(Double.parseDouble(f.convertendoDoubleAmericano(txtValorCobrado.getText())));
        }
        pe.setComissao_porcentagem(Double.parseDouble(f.convertendoDoubleAmericano(txtComissaoValor.getText())));
        pe.setValor_unitario_comissao(Double.parseDouble(f.convertendoDoubleAmericano(txtValorUnitarioComissao.getText())));
        pe.setValor_total_produto(Double.parseDouble(f.convertendoDoubleAmericano(txtValorTotalProdutos.getText())));
        if (!txtIdPedido.getText().trim().equals("")) {
            pe.setId_pedido(Long.parseLong(txtIdPedido.getText()));
        }
    }

    private void carregaInformacoesCreditoDebito() {
        //Capturando as informações para o cadastro do Credito Débito
//        if(!txtValorCobrado.getText().trim().equals("")){
            cd.setId_cliente(Long.parseLong(txtIdCliente.getText()));
            cd.setId_produto(Long.parseLong(txtIdProduto.getText()));
            cd.setData(dccData.getDate());
            cd.setPedido_numero(Long.parseLong(txtCodigoPedido.getText()));
            if (!txtCreditogerado.getText().equals("")) {
                Double valorTeste = Double.parseDouble(f.convertendoDoubleAmericano(txtCreditogerado.getText()));
                if (valorTeste >= 0.0) {
                    cd.setValor_credito(Double.parseDouble(f.convertendoDoubleAmericano(txtCreditogerado.getText())));
                    cd.setValor_debito(0.0);
                } else if (valorTeste <= 0.0) {
                    cd.setValor_credito(0.0);
                    cd.setValor_debito(Double.parseDouble(f.convertendoDoubleAmericano(txtCreditogerado.getText())));
                }
            }
//        }
    }

    private void totalizador() {
        Double totsalario = 0.0;
        for (int i = 0; i <= tblPedido.getRowCount() - 1; i++) {
            totsalario += Double.parseDouble(tblPedido.getValueAt(i, 8).toString());
            txtTotalComissao.setText(String.valueOf(f.doubleParaStringComPontoDeMilhar(totsalario)));
        }
    }

    private void totalizadorprodutos() {
        Double totsalario = 0.0;
        for (int i = 0; i <= tblPedido.getRowCount() - 1; i++) {
            totsalario += Double.parseDouble(tblPedido.getValueAt(i, 7).toString());
            txtTotalProdutos.setText(String.valueOf(f.doubleParaStringComPontoDeMilhar(totsalario)));
        }
    }

    public void chamarTela(JInternalFrame p) {
        PrincipalGUI.DesktopPane.add(p);
        int x = (PrincipalGUI.DesktopPane.getWidth() / 2) - (p.getWidth() / 2);
        int y = (PrincipalGUI.DesktopPane.getHeight() / 2) - (p.getHeight() / 2);
        p.setVisible(true);
        p.setLocation(x, y);
        p.toFront();
        p.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JpPrincipal;
    private javax.swing.JButton btCancelarLimpar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFecharTela;
    private javax.swing.JButton btGerarPdf;
    private javax.swing.JButton btGravarAlterar;
    private javax.swing.JButton btPesquisaCliente;
    private javax.swing.JButton btPesquisaProdutos;
    private com.toedter.calendar.JDateChooser dccData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelProduto;
    private javax.swing.JRadioButton rbCodigoCliente;
    private javax.swing.JRadioButton rbCodigoProduto;
    private javax.swing.JRadioButton rbNomeCliente;
    private javax.swing.JRadioButton rbNomeProduto;
    private javax.swing.JTable tblClientePedido;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTable tblProdutoPedido;
    private javax.swing.JTextField txtBuscaCliente;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoPedido;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtComissaoNormal;
    private javax.swing.JTextField txtComissaoPallet;
    private javax.swing.JTextField txtComissaoValor;
    private javax.swing.JTextField txtCreditogerado;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalComissao;
    private javax.swing.JTextField txtTotalProdutos;
    private javax.swing.JTextField txtValorCobrado;
    private javax.swing.JTextField txtValorTotalProdutos;
    private javax.swing.JTextField txtValorUnitario;
    private javax.swing.JTextField txtValorUnitarioComissao;
    // End of variables declaration//GEN-END:variables
}
