package br.com.controlepedido.dao;

import br.com.controlepedido.connection.DataBaseConnection;
import br.com.controlepedido.connection.DataBaseConnectionFactory;
import br.com.controlepedido.dto.CreditoDebitoClienteProdutoDTO;
import br.com.controlepedido.dto.CreditoDebitoDTO;
import br.com.controlepedido.exception.ApplicationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MDT
 */
public class CreditoDebitoDAO extends DataBaseConnection{
    
    private static final String SQL_INSERT = " INSERT INTO creditodebito(id_cliente, id_produto, data, pedido_numero,"
            + " valor_credito, valor_debito) VALUES (?, ?, ?, ?, ?, ?) ";
    private static final String SQL_UPDATE = " UPDATE creditodebito SET id_cliente=?, id_produto=?, data=?, pedido_numero=?,"
            + " valor_credito=?, valor_debito=? WHERE id_credito_debito=? ";
    private static final String SQL_DELETE = " DELETE FROM creditodebito WHERE id_credito_debito = ? ";
    private static final String SQL_SELECT_ALL = " SELECT * FROM creditodebito ORDER BY pedido_numero, data, id_cliente ";
    private static final String SQL_SELECT_BUSCA_NUMERO_PEDIDO = " SELECT * FROM creditodebito WHERE pedido_numero=? ";
    private static final String SQL_SELECT_TABELA = " SELECT cd.id_credito_debito, c.nome_razao, p.descricao, cd.data, "
            + " cd.pedido_numero, cd.valor_credito, cd.valor_debito FROM creditodebito cd INNER JOIN cliente c "
            + " ON cd.id_cliente = c.id_cliente INNER JOIN produtos p ON cd.id_produto = p.id_produtos ORDER BY cd.id_credito_debito DESC ";
    private static final String SQL_SELECT_TABELA_BUSCA = " SELECT cd.id_credito_debito, c.nome_razao, p.descricao, cd.data, "
            + " cd.pedido_numero, cd.valor_credito, cd.valor_debito FROM creditodebito cd INNER JOIN cliente c "
            + " ON cd.id_cliente = c.id_cliente INNER JOIN produtos p ON cd.id_produto = p.id_produtos WHERE cd.pedido_numero = ? ORDER BY cd.id_credito_debito DESC ";
    
    public void incluir(CreditoDebitoDTO ct) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
       
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setLong(1, ct.getId_cliente());
            ps.setLong(2, ct.getId_produto());
            if (ct.getData() != null) {
                ps.setDate(3, new java.sql.Date(ct.getData().getTime()));
            } else {
                ps.setDate(3, null);
            }
            ps.setLong(4, ct.getPedido_numero());
            ps.setDouble(5, ct.getValor_credito());
            ps.setDouble(6, ct.getValor_debito());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Crédito e Débito " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public void alterar(CreditoDebitoDTO ct) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setLong(1, ct.getId_cliente());
            ps.setLong(2, ct.getId_produto());
            if (ct.getData() != null) {
                ps.setDate(3, new java.sql.Date(ct.getData().getTime()));
            } else {
                ps.setDate(3, null);
            }
            ps.setLong(4, ct.getPedido_numero());
            ps.setDouble(5, ct.getValor_credito());
            ps.setDouble(6, ct.getValor_debito());
            ps.setLong(7, ct.getId_credito_debito());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Crédito e Débito " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public void excluir(Long codigo) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setLong(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Excluir Crédito e Débito " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public List<CreditoDebitoDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<CreditoDebitoDTO> lista = new ArrayList<CreditoDebitoDTO>();
                
        try {
        
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
        
            rs = ps.executeQuery();
            while (rs.next()) {
                CreditoDebitoDTO ct = new CreditoDebitoDTO();
                ct.setId_credito_debito(rs.getLong("id_credito_debito"));
                ct.setId_cliente(rs.getLong("id_cliente"));
                ct.setId_produto(rs.getLong("id_produto"));
                ct.setData(rs.getDate("data"));
                ct.setPedido_numero(rs.getLong("pedido_numero"));
                ct.setValor_credito(rs.getDouble("valor_credito"));
                ct.setValor_debito(rs.getDouble("valor_debito"));
                lista.add(ct);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Crédito e Débito " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<CreditoDebitoDTO> listarpedidonumero(Long codigo) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<CreditoDebitoDTO> lista = new ArrayList<CreditoDebitoDTO>();
                
        try {
        
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_BUSCA_NUMERO_PEDIDO);
            ps.setLong(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                CreditoDebitoDTO ct = new CreditoDebitoDTO();
                ct.setId_credito_debito(rs.getLong("id_credito_debito"));
                ct.setId_cliente(rs.getLong("id_cliente"));
                ct.setId_produto(rs.getLong("id_produto"));
                ct.setData(rs.getDate("data"));
                ct.setPedido_numero(rs.getLong("pedido_numero"));
                ct.setValor_credito(rs.getDouble("valor_credito"));
                ct.setValor_debito(rs.getDouble("valor_debito"));
                lista.add(ct);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Crédito e Débito por Número do pedido " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<CreditoDebitoClienteProdutoDTO> listartabela() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<CreditoDebitoClienteProdutoDTO> lista = new ArrayList<CreditoDebitoClienteProdutoDTO>();
                
        try {
        
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_TABELA);
            rs = ps.executeQuery();
            while (rs.next()) {
                CreditoDebitoClienteProdutoDTO cdcp = new CreditoDebitoClienteProdutoDTO();
                cdcp.setId_credito_debito(rs.getLong("id_credito_debito"));
                cdcp.setNome_razao(rs.getString("nome_razao"));
                cdcp.setDescricao(rs.getString("descricao"));
                cdcp.setData(rs.getDate("data"));
                cdcp.setPedido_numero(rs.getLong("pedido_numero"));
                cdcp.setValor_credito(rs.getDouble("valor_credito"));
                cdcp.setValor_debito(rs.getDouble("valor_debito"));
                lista.add(cdcp);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Crédito e Débito para Tabela " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<CreditoDebitoClienteProdutoDTO> listarPedidoNumeroTabela(Long pedidonumero) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<CreditoDebitoClienteProdutoDTO> lista = new ArrayList<CreditoDebitoClienteProdutoDTO>();
                
        try {
        
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_TABELA_BUSCA);
            ps.setLong(1, pedidonumero);
            rs = ps.executeQuery();
            while (rs.next()) {
                CreditoDebitoClienteProdutoDTO cdcp = new CreditoDebitoClienteProdutoDTO();
                cdcp.setId_credito_debito(rs.getLong("id_credito_debito"));
                cdcp.setNome_razao(rs.getString("nome_razao"));
                cdcp.setDescricao(rs.getString("descricao"));
                cdcp.setData(rs.getDate("data"));
                cdcp.setPedido_numero(rs.getLong("pedido_numero"));
                cdcp.setValor_credito(rs.getDouble("valor_credito"));
                cdcp.setValor_debito(rs.getDouble("valor_debito"));
                lista.add(cdcp);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Crédito e Débito por Número do pedido BUSCA " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return DataBaseConnectionFactory.getConnection();
    }
    
}
