
package br.com.controlepedido.service;

/**
 * @author MDT
 */
public class EnviaEmailService {

        SendAttachmentInEmail saie = new SendAttachmentInEmail();
        
        
    public void enviaEmailAnexo(Long pedido, Long cod){
        saie.enviaEmailAnexo(pedido, cod);
    }
}
