package br.com.controlepedido.dto;

import java.util.Date;

/**
 * @author MDT
 */
public class PedidosDTO {
    
    private Long id_produtos;
    private Long id_cliente;
    private Date data;
    private Long id_pedido;
    private Long pedido_numero;
    private String quantidade;
    private Double valor_unitario;
    private Double valor_unitario_comissao;
    private Double comissao_porcentagem;
    private Double valor_total_produto;

    public Long getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(Long id_produtos) {
        this.id_produtos = id_produtos;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Long getPedido_numero() {
        return pedido_numero;
    }

    public void setPedido_numero(Long pedido_numero) {
        this.pedido_numero = pedido_numero;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public Double getValor_unitario_comissao() {
        return valor_unitario_comissao;
    }

    public void setValor_unitario_comissao(Double valor_unitario_comissao) {
        this.valor_unitario_comissao = valor_unitario_comissao;
    }

    public Double getComissao_porcentagem() {
        return comissao_porcentagem;
    }

    public void setComissao_porcentagem(Double comissao_porcentagem) {
        this.comissao_porcentagem = comissao_porcentagem;
    }

    public Double getValor_total_produto() {
        return valor_total_produto;
    }

    public void setValor_total_produto(Double valor_total_produtos) {
        this.valor_total_produto = valor_total_produtos;
    }

        
}
