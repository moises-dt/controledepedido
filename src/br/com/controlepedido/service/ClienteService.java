package br.com.controlepedido.service;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.dao.ClienteDAO;
import br.com.controlepedido.dto.ClienteDTO;
import java.util.List;

/**
 *
 * @author MDT
 */
public class ClienteService {
    
    private ClienteDAO cDao = new ClienteDAO();
    
    public void incluir(ClienteDTO c) throws ApplicationException {
        cDao.incluir(c);
    }
    
    public void alterar(ClienteDTO c) throws ApplicationException {
        cDao.alterar(c);
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        cDao.excluir(codigo);    
    }
    
    public List<ClienteDTO> detalharCodigo(String cod) throws ApplicationException {
        return cDao.detalharCodigo(cod);
    }
    
    public List<ClienteDTO> detalharIdCliente(Long ID) throws ApplicationException {
        return cDao.detalharIdCliente(ID);
    }
    
    public List<ClienteDTO> detalharNome(String nome) throws ApplicationException {
        return cDao.detalharNome(nome);
    }
    
    public List<ClienteDTO> listar() throws ApplicationException {
        return cDao.listar();
    }
    
    public List<ClienteDTO> listarComboBox() throws ApplicationException {
        return cDao.listarComboBox();
    }
     
    public List<ClienteDTO> buscaNome(String nome) throws ApplicationException {
        return cDao.buscaNome(nome);
    }
}
