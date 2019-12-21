package br.com.controlepedido.dto;

import java.util.Date;

/**
 * @author MDiasT
 */
public class CreditoDebitoClienteProdutoDTO {
    private Long id_credito_debito;
    private String nome_razao;
    private String descricao;
    private Date data;
    private Long pedido_numero;
    private Double valor_credito;
    private Double valor_debito;

    public CreditoDebitoClienteProdutoDTO(){
    }

    public CreditoDebitoClienteProdutoDTO(Long id_credito_debito, String nome_razao, String descricao, Date data,
            Long pedido_numero, Double valor_credito, Double valor_debito) {
        this.id_credito_debito = id_credito_debito;
        this.nome_razao = nome_razao;
        this.descricao = descricao;
        this.data = data;
        this.pedido_numero = pedido_numero;
        this.valor_credito = valor_credito;
        this.valor_debito = valor_debito;
    }
    
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
     * @return the nome_razao
     */
    public String getNome_razao() {
        return nome_razao;
    }

    /**
     * @param nome_razao the nome_razao to set
     */
    public void setNome_razao(String nome_razao) {
        this.nome_razao = nome_razao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "CreditoDebitoClienteProdutoDTO{"  
                + " id_credito_debito=" + id_credito_debito
                + ", nome_razao=" + nome_razao
                + ", descricao=" + descricao
                + ", data=" + data
                + ", pedido_numero=" + pedido_numero
                + ", valor_credito=" + valor_credito
                + ", valor_debito=" + valor_debito + '}';
    }
}
