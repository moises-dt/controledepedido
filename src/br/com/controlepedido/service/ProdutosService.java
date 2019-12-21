package br.com.controlepedido.service;

import br.com.controlepedido.exception.ApplicationException;
import br.com.controlepedido.dao.ProdutosDAO;
import br.com.controlepedido.dto.ProdutosDTO;
import java.util.List;

/**
 *
 * @author MDT
 */
public class ProdutosService {
    
    private ProdutosDAO pDao = new ProdutosDAO();
    
    public void incluir(ProdutosDTO p) throws ApplicationException {
        pDao.incluir(p);
    }
    
    public void alterar(ProdutosDTO p) throws ApplicationException {
        pDao.alterar(p);
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        pDao.excluir(codigo);
    }
    
    public List<ProdutosDTO> detalharCodigo(String cod) throws ApplicationException {
        return pDao.detalharCodigo(cod);
    }
    
    public List<ProdutosDTO> detalharNome(String desc) throws ApplicationException {
        return pDao.detalharNome(desc);
    }
    
    public List<ProdutosDTO> listar() throws ApplicationException {
        return pDao.listar();
    }
    
    public List<ProdutosDTO> listarComboBox() throws ApplicationException {
        return pDao.listarComboBox();
    }
    
    public List<ProdutosDTO> buscaDescricao(String descricao) throws ApplicationException {
        return pDao.buscaDescricao(descricao);
    }
    
    public List<ProdutosDTO> listarDescontinuado() throws ApplicationException {
        return pDao.listarDescontinuado();
    }
}
