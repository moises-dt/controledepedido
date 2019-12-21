package br.com.controlepedido.service;
import br.com.controlepedido.dao.ConfiguraEmailDAO;
import br.com.controlepedido.dto.ConfiguraEmailDTO;
import br.com.controlepedido.exception.ApplicationException;
import java.util.List;

/**
 * @author MDT
 */
public class ConfiguracaoEmailService {
    
    private ConfiguraEmailDAO coDAO = new ConfiguraEmailDAO();
    
        public void incluir(ConfiguraEmailDTO ce) throws ApplicationException {
            coDAO.incluir(ce);
        }
        
        public void alterar(ConfiguraEmailDTO ce) throws ApplicationException {
            coDAO.alterar(ce);
        }
        
        public List<ConfiguraEmailDTO> listar() throws ApplicationException {
            return coDAO.listar();
        }
        
        public List<ConfiguraEmailDTO> detalhar(int codigo) throws ApplicationException {
            return coDAO.detalhar(codigo);
        }
}
