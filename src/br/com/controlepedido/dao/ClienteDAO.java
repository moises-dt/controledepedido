package br.com.controlepedido.dao;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.connection.DataBaseConnection;
import br.com.controlepedido.connection.DataBaseConnectionFactory;
import br.com.controlepedido.dto.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MDT
 */
public class ClienteDAO extends DataBaseConnection {

    private static final String SQL_INSERT = " INSERT INTO cliente(codigo, cpf_cnpj, nome_razao, endereco, numero, complemento,"
            + " bairro, cidade, cep, uf, email, site, telefone, formapagamento)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    private static final String SQL_UPDATE = " UPDATE cliente SET codigo=?, cpf_cnpj=?, nome_razao=?, endereco=?, numero=?,"
            + " complemento=?, bairro=?, cidade=?, cep=?, uf=?, email=?, site=?, telefone=?, formapagamento=? WHERE id_cliente = ? ";
    private static final String SQL_DELETE = " DELETE FROM cliente WHERE id_cliente=? ";
    private static final String SQL_SELECT_ALL = " SELECT * FROM cliente ORDER BY nome_razao ";
    private static final String SQL_SELECT_ALL_NOME = " SELECT * FROM cliente WHERE nome_razao = ? ";
    private static final String SQL_SELECT_BUSCA_NOME = " SELECT DISTINCT id_cliente, codigo, nome_razao FROM cliente WHERE UPPER(nome_razao) ILIKE ? ";
    private static final String SQL_SELECT_BUSCA_NUMERO = " SELECT DISTINCT id_cliente, codigo, nome_razao FROM cliente WHERE codigo = ? ";
    private static final String SQL_SELECT_BUSCA_CODIGO = " SELECT DISTINCT id_cliente, codigo, email FROM cliente WHERE id_cliente = ? ";
    

    public void incluir(ClienteDTO c) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getCpf_cnpj());
            ps.setString(3, c.getNome_razao());
            ps.setString(4, c.getEndereco());
            ps.setString(5, c.getNumero());
            ps.setString(6, c.getComplemento());
            ps.setString(7, c.getBairro());
            ps.setString(8, c.getCidade());
            ps.setString(9, c.getCep());
            ps.setString(10, c.getUf());
            ps.setString(11, c.getEmail());
            ps.setString(12, c.getSite());
            ps.setString(13, c.getTelefone());
            ps.setString(14, c.getFormapagamento());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Cliente" + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }

    public void alterar(ClienteDTO c) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getCpf_cnpj());
            ps.setString(3, c.getNome_razao());
            ps.setString(4, c.getEndereco());
            ps.setString(5, c.getNumero());
            ps.setString(6, c.getComplemento());
            ps.setString(7, c.getBairro());
            ps.setString(8, c.getCidade());
            ps.setString(9, c.getCep());
            ps.setString(10, c.getUf());
            ps.setString(11, c.getEmail());
            ps.setString(12, c.getSite());
            ps.setString(13, c.getTelefone());
            ps.setString(14, c.getFormapagamento());
            ps.setLong(15, c.getId_cliente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Cliente" + ex.getMessage());
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

    public List<ClienteDTO> detalharCodigo(String cod) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ClienteDTO> lista = new ArrayList<>();
        
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_BUSCA_NUMERO);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId_cliente(rs.getLong("id_cliente"));
                c.setCodigo(rs.getString("codigo"));
                c.setNome_razao(rs.getString("nome_razao"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Cliente Código " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ClienteDTO> detalharIdCliente(Long ID) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ClienteDTO> lista = new ArrayList<>();
        
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_BUSCA_CODIGO);
            ps.setLong(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId_cliente(rs.getLong("id_cliente"));
                c.setCodigo(rs.getString("codigo"));
                c.setEmail(rs.getString("email"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Cliente ID " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }

    public List<ClienteDTO> detalharNome(String nome) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ClienteDTO> lista = new ArrayList<>();
        
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_BUSCA_NOME);
            ps.setString(1, "%"+nome+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId_cliente(rs.getLong("id_cliente"));
                c.setCodigo(rs.getString("codigo"));
                c.setNome_razao(rs.getString("nome_razao"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Cliente Nome " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    

    public List<ClienteDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ClienteDTO> lista = new ArrayList<ClienteDTO>();

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId_cliente(rs.getLong("id_cliente"));
                c.setCodigo(rs.getString("codigo"));
                c.setCpf_cnpj(rs.getString("cpf_cnpj"));
                c.setNome_razao(rs.getString("nome_razao"));
                c.setEndereco(rs.getString("endereco"));
                c.setNumero(rs.getString("numero"));
                c.setComplemento(rs.getString("complemento"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setCep(rs.getString("cep"));
                c.setUf(rs.getString("uf"));
                c.setEmail(rs.getString("email"));
                c.setSite(rs.getString("site"));
                c.setTelefone(rs.getString("telefone"));
                c.setFormapagamento(rs.getString("formapagamento"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Cliente " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ClienteDTO> listarComboBox() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ClienteDTO> lista = new ArrayList<ClienteDTO>();

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId_cliente(rs.getLong("id_cliente"));
                c.setNome_razao(rs.getString("nome_razao"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Cliente Combobox " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ClienteDTO> buscaNome(String nome) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ClienteDTO> lista = new ArrayList<ClienteDTO>();

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL_NOME);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId_cliente(rs.getLong("id_cliente"));
                c.setNome_razao(rs.getString("nome_razao"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Cliente Busca por Nome " + ex.getMessage());
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
