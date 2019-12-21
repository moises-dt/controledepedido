package br.com.controlepedido.dao;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.connection.DataBaseConnection;
import br.com.controlepedido.connection.DataBaseConnectionFactory;
import br.com.controlepedido.dto.PedidosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MDT
 */
public class PedidosDAO extends DataBaseConnection {

    private static final String SQL_INSERT = " INSERT INTO pedidos(id_produtos, id_cliente, data, quantidade, valor_unitario,"
            + " valor_unitario_comissao, comissao_porcentagem, pedido_numero, valor_total_produto)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = " UPDATE pedidos SET id_produtos=?, id_cliente=?, data=?, quantidade=?, valor_unitario=?,"
            + " valor_unitario_comissao=?, comissao_porcentagem=?, pedido_numero=?, valor_total_produto=? WHERE id_pedido = ? ";
    private static final String SQL_DELETE = " DELETE FROM pedidos WHERE id_pedido=? ";
    private static final String SQL_DELETEPEDIDO = " DELETE FROM pedidos WHERE pedido_numero=? ";
    private static final String SQL_SELECT = " SELECT * FROM pedidos ";

    public void incluir(PedidosDTO p) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setLong(1, p.getId_produtos());
            ps.setLong(2, p.getId_cliente());
            if (p.getData() != null) {
                ps.setDate(3, new java.sql.Date(p.getData().getTime()));
            } else {
                ps.setDate(3, null);
            }
            ps.setString(4, p.getQuantidade());
            ps.setDouble(5, p.getValor_unitario());
            ps.setDouble(6, p.getValor_unitario_comissao());
            ps.setDouble(7, p.getComissao_porcentagem());
            ps.setLong(8, p.getPedido_numero());
            ps.setDouble(9, p.getValor_total_produto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Pedidos " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public void alterar(PedidosDTO p) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setLong(1, p.getId_produtos());
            ps.setLong(2, p.getId_cliente());
            if (p.getData() != null) {
                ps.setDate(3, new java.sql.Date(p.getData().getTime()));
            } else {
                ps.setDate(3, null);
            }
            ps.setString(4, p.getQuantidade());
            ps.setDouble(5, p.getValor_unitario());
            ps.setDouble(6, p.getValor_unitario_comissao());
            ps.setDouble(7, p.getComissao_porcentagem());
            ps.setLong(8, p.getPedido_numero());
            ps.setDouble(9, p.getValor_total_produto());
            ps.setLong(10, p.getId_pedido());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Pedidos " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public void excluirPedidoNumero(Long codigo) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_DELETEPEDIDO);
            ps.setLong(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Excluir pedido número " + ex.getMessage());
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
            throw new ApplicationException("Excluir pedido " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public List<PedidosDTO> detalhar(Long codigo) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<PedidosDTO> lista = new ArrayList<>();

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT + " where pedido_numero=? ");
            ps.setLong(1, codigo);

            rs = ps.executeQuery();
            while (rs.next()) {
                PedidosDTO p = new PedidosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setId_cliente(rs.getLong("id_cliente"));
                p.setData(rs.getDate("data"));
                p.setId_pedido(rs.getLong("id_pedido"));
                p.setPedido_numero(rs.getLong("pedido_numero"));
                p.setQuantidade(rs.getString("quantidade"));
                p.setValor_unitario(rs.getDouble("valor_unitario"));
                p.setValor_unitario_comissao(rs.getDouble("valor_unitario_comissao"));
                p.setComissao_porcentagem(rs.getDouble("comissao_porcentagem"));
                p.setValor_total_produto(rs.getDouble("valor_total_produto"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Pedido " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }

    public List<PedidosDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<PedidosDTO> lista = new ArrayList<>();

        try {

            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT);

            rs = ps.executeQuery();
            while (rs.next()) {
                PedidosDTO p = new PedidosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setId_cliente(rs.getLong("id_cliente"));
                p.setData(rs.getDate("data"));
                p.setId_pedido(rs.getLong("id_pedido"));
                p.setQuantidade(rs.getString("quantidade"));
                p.setValor_unitario(rs.getDouble("valor_unitario"));
                p.setValor_unitario_comissao(rs.getDouble("valor_unitario_comissao"));
                p.setComissao_porcentagem(rs.getDouble("comissao_porcentagem"));
                p.setValor_total_produto(rs.getDouble("valor_total_produto"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Pedido " + ex.getMessage());
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
