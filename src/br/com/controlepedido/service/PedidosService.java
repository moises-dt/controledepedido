package br.com.controlepedido.service;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.dao.PedidosDAO;
import br.com.controlepedido.dto.PedidosDTO;
import java.util.List;

/**
 *
 * @author MDT
 */
public class PedidosService {
    
    private PedidosDAO pDao = new PedidosDAO();
    
    public void incluir(PedidosDTO pe) throws ApplicationException {
        pDao.incluir(pe);
    }
    
    public void alterar(PedidosDTO pe) throws ApplicationException {
        pDao.alterar(pe);
    }
    
    public void excluirPedidoNumero(Long codigo) throws ApplicationException {
        pDao.excluirPedidoNumero(codigo);
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        pDao.excluir(codigo);
    }
    
    public List<PedidosDTO> detalhar(Long codigo) throws ApplicationException {
        return pDao.detalhar(codigo);
    }
    
    public List<PedidosDTO> listar() throws ApplicationException {
        return pDao.listar();
    }
    
}
