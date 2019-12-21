package br.com.controlepedido.dao;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.connection.DataBaseConnection;
import br.com.controlepedido.connection.DataBaseConnectionFactory;
import br.com.controlepedido.dto.ProdutosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MDT
 */
public class ProdutosDAO extends DataBaseConnection{
    
    private static final String SQL_INSERT = " INSERT INTO produtos(codigo, descricao, tipovolume, valor, categoria,"
            + " comissao_pallet, comissao_normal, descontinuado) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
    private static final String SQL_UPDATE = " UPDATE produtos SET codigo=?, descricao=?, tipovolume=?, valor=?, categoria=?,"
            + " comissao_pallet=?, comissao_normal=?, descontinuado=? WHERE id_produtos=? ";
    private static final String SQL_DELETE = " DELETE FROM produtos WHERE id_produtos=? ";
    private static final String SQL_SELECT_ALL = " SELECT * FROM produtos ORDER BY descricao ";
    private static final String SQL_SELECT_ALL_DESCONTINUADO = " SELECT * FROM produtos WHERE descontinuado = false ORDER BY descricao ";
    private static final String SQL_SELECT_ALL_DESCRICAO = " SELECT * FROM produtos WHERE descricao = ? ";
    private static final String SQL_SELECT_BUSCA_NOME = " SELECT * FROM produtos WHERE UPPER(descricao) ILIKE ? ";
    private static final String SQL_SELECT_BUSCA_NUMERO = " SELECT * FROM produtos WHERE codigo = ? AND descontinuado = false ";
    

    public void incluir(ProdutosDTO p) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
       
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getDescricao());
            ps.setString(3, p.getTipoVolume());
            ps.setDouble(4, p.getValor());
            ps.setString(5, p.getCategoria());
            ps.setDouble(6, p.getComissaoPallet());
            ps.setDouble(7, p.getComissaoNormal());
            ps.setBoolean(8, p.getDescontinuado());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Produtos" + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public void alterar(ProdutosDTO p) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getDescricao());
            ps.setString(3, p.getTipoVolume());
            ps.setDouble(4, p.getValor());
            ps.setString(5, p.getCategoria());
            ps.setDouble(6, p.getComissaoPallet());
            ps.setDouble(7, p.getComissaoNormal());
            ps.setBoolean(8, p.getDescontinuado());
            ps.setLong(9, p.getId_produtos());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Produtos" + ex.getMessage());
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
            throw new ApplicationException("Excluir Cliente" + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public List<ProdutosDTO> detalharCodigo(String cod) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ProdutosDTO> lista = new ArrayList<>();
        
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_BUSCA_NUMERO);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setTipoVolume(rs.getString("tipovolume"));
                p.setValor(rs.getDouble("valor"));
                p.setComissaoPallet(rs.getDouble("comissao_pallet"));
                p.setComissaoNormal(rs.getDouble("comissao_normal"));
                p.setCategoria(rs.getString("categoria"));
                p.setDescontinuado(rs.getBoolean("descontinuado"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Produtos Código " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }

    public List<ProdutosDTO> detalharNome(String desc) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ProdutosDTO> lista = new ArrayList<>();
        
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_BUSCA_NOME);
            ps.setString(1, "%"+desc+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setTipoVolume(rs.getString("tipovolume"));
                p.setValor(rs.getDouble("valor"));
                p.setComissaoPallet(rs.getDouble("comissao_pallet"));
                p.setComissaoNormal(rs.getDouble("comissao_normal"));
                p.setCategoria(rs.getString("categoria"));
                p.setDescontinuado(rs.getBoolean("descontinuado"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Produtos Nome " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }

    public List<ProdutosDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ProdutosDTO> lista = new ArrayList<ProdutosDTO>();
                
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setTipoVolume(rs.getString("tipovolume"));
                p.setValor(rs.getDouble("valor"));
                p.setComissaoPallet(rs.getDouble("comissao_pallet"));
                p.setComissaoNormal(rs.getDouble("comissao_normal"));
                p.setCategoria(rs.getString("categoria"));
                p.setDescontinuado(rs.getBoolean("descontinuado"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Produtos " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ProdutosDTO> listarDescontinuado() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ProdutosDTO> lista = new ArrayList<ProdutosDTO>();
                
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL_DESCONTINUADO);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setTipoVolume(rs.getString("tipovolume"));
                p.setValor(rs.getDouble("valor"));
                p.setComissaoPallet(rs.getDouble("comissao_pallet"));
                p.setComissaoNormal(rs.getDouble("comissao_normal"));
                p.setCategoria(rs.getString("categoria"));
                p.setDescontinuado(rs.getBoolean("descontinuado"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Produtos " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ProdutosDTO> listarComboBox() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ProdutosDTO> lista = new ArrayList<ProdutosDTO>();
                
        try {
        
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setDescricao(rs.getString("descricao"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Produtos ComboBox " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ProdutosDTO> buscaDescricao(String descricao) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ProdutosDTO> lista = new ArrayList<ProdutosDTO>();
                
        try {
        
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL_DESCRICAO);
            ps.setString(1, descricao);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                p.setId_produtos(rs.getLong("id_produtos"));
                p.setDescricao(rs.getString("descricao"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Produtos Descrição Produto " + ex.getMessage());
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
