/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controlepedido.dao;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.connection.DataBaseConnection;
import br.com.controlepedido.connection.DataBaseConnectionFactory;
import br.com.controlepedido.dto.ConfiguraEmailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MDT
 */
public class ConfiguraEmailDAO  extends DataBaseConnection {
    
//    servidorsmtp, porta, email, senha, criptografia, assunto, mensagem
    
    private static final String SQL_INSERT = " INSERT INTO configuracaoemail(servidorsmtp, porta, email, senha, criptografia, assunto, mensagem) "
            + " VALUES (?, ?, ?, ?, ?, ?, ?) ";
    private static final String SQL_UPDATE = " UPDATE configuracaoemail SET servidorsmtp=?, porta=?, email=?, senha=?, criptografia=?," 
           +" assunto=?, mensagem=? WHERE Id_email = ? ";
    private static final String SQL_SELECT_ALL = " SELECT * FROM configuracaoemail ";
    private static final String SQL_SELECT_DETALHAR = " SELECT * FROM configuracaoemail WHERE id_email=? ";

    
    public void incluir(ConfiguraEmailDTO ce) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, ce.getServidorsmtp());
            ps.setString(2, ce.getPorta());
            ps.setString(3, ce.getEmail());
            ps.setString(4, ce.getSenha());
            ps.setBoolean(5, ce.getCriptografia());
            ps.setString(6, ce.getAssunto());
            ps.setString(7, ce.getMensagem());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Configurações de Email " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public void alterar(ConfiguraEmailDTO ce) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, ce.getServidorsmtp());
            ps.setString(2, ce.getPorta());
            ps.setString(3, ce.getEmail());
            ps.setString(4, ce.getSenha());
            ps.setBoolean(5, ce.getCriptografia());
            ps.setString(6, ce.getAssunto());
            ps.setString(7, ce.getMensagem());
            ps.setInt(8, ce.getId_email());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Configurações de Email " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public List<ConfiguraEmailDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ConfiguraEmailDTO> lista = new ArrayList<ConfiguraEmailDTO>();

        try {

            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ConfiguraEmailDTO ce = new ConfiguraEmailDTO();
                ce.setId_email(rs.getInt("id_email"));
                ce.setServidorsmtp(rs.getString("servidorsmtp"));
                ce.setPorta(rs.getString("porta"));
                ce.setEmail(rs.getString("email"));
                ce.setSenha(rs.getString("senha"));
                ce.setCriptografia(rs.getBoolean("criptografia"));
                ce.setAssunto(rs.getString("assunto"));
                ce.setMensagem(rs.getString("mensagem"));
                lista.add(ce);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Configuração de Email " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ConfiguraEmailDTO> detalhar(int codigo) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<ConfiguraEmailDTO> lista = new ArrayList<>();

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_DETALHAR);
            ps.setInt(1, codigo);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                ConfiguraEmailDTO ce = new ConfiguraEmailDTO();
                ce.setId_email(rs.getInt("id_email"));
                ce.setServidorsmtp(rs.getString("servidorsmtp"));
                ce.setPorta(rs.getString("porta"));
                ce.setEmail(rs.getString("email"));
                ce.setSenha(rs.getString("senha"));
                ce.setCriptografia(rs.getBoolean("criptografia"));
                ce.setAssunto(rs.getString("assunto"));
                ce.setMensagem(rs.getString("mensagem"));
                lista.add(ce);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Detalhar Pedido " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public Connection getConnection() throws SQLException {
        return DataBaseConnectionFactory.getConnection();
    }
}
