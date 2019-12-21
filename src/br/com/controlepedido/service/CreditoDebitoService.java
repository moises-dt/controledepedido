package br.com.controlepedido.service;

import br.com.controlepedido.dao.CreditoDebitoDAO;
import br.com.controlepedido.dto.CreditoDebitoClienteProdutoDTO;
import br.com.controlepedido.dto.CreditoDebitoDTO;
import br.com.controlepedido.exception.ApplicationException;
import java.util.List;

/**
 * @author MDT
 */
public class CreditoDebitoService {
    
    CreditoDebitoDAO cdDao = new CreditoDebitoDAO();
    
    public void incluir(CreditoDebitoDTO ct) throws ApplicationException {
        cdDao.incluir(ct);
    }
    
    public void alterar(CreditoDebitoDTO ct) throws ApplicationException {
        cdDao.alterar(ct);
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        cdDao.excluir(codigo);
    }
    
    public List<CreditoDebitoDTO> listar() throws ApplicationException {
        return cdDao.listar();
    }
    
    public List<CreditoDebitoDTO> listarpedidonumero(Long codigo) throws ApplicationException {
        return cdDao.listarpedidonumero(codigo);
    }
    
    public List<CreditoDebitoClienteProdutoDTO> listartabela() throws ApplicationException {
        return cdDao.listartabela();
    }
    
    public List<CreditoDebitoClienteProdutoDTO> listarPedidoNumeroTabela(Long pedidonumero) throws ApplicationException {
        return cdDao.listarPedidoNumeroTabela(pedidonumero);
    }
}
