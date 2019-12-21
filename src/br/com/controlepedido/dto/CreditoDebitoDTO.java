package br.com.controlepedido.dto;

import java.util.Date;

/**
 * @author MDT
 */
public class CreditoDebitoDTO {

private Long id_credito_debito;
private Long id_cliente;
private Long id_produto;
private Date data;
private Long pedido_numero;
private Double valor_credito;
private Double valor_debito;

    /**
     * @return the id_credito_debito
     */
    public Long getId_credito_debito() {
        return id_credito_debito;
    }

    /**
     * @param id_credito_debito the id_credito_debito to set
     */
    public void setId_credito_debito(Long id_credito_debito) {
        this.id_credito_debito = id_credito_debito;
    }

    /**
     * @return the id_cliente
     */
    public Long getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_produto
     */
    public Long getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(Long id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the pedido_numero
     */
    public Long getPedido_numero() {
        return pedido_numero;
    }

    /**
     * @param pedido_numero the pedido_numero to set
     */
    public void setPedido_numero(Long pedido_numero) {
        this.pedido_numero = pedido_numero;
    }

    /**
     * @return the valor_credito
     */
    public Double getValor_credito() {
        return valor_credito;
    }

    /**
     * @param valor_credito the valor_credito to set
     */
    public void setValor_credito(Double valor_credito) {
        this.valor_credito = valor_credito;
    }

    /**
     * @return the valor_debito
     */
    public Double getValor_debito() {
        return valor_debito;
    }

    /**
     * @param valor_debito the valor_debito to set
     */
    public void setValor_debito(Double valor_debito) {
        this.valor_debito = valor_debito;
    }


    
}
