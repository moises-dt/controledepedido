package br.com.controlepedido.dto;

/**
 *
 * @author MDT
 */
public class ProdutosDTO {
    private Long id_produtos;
    private String codigo;
    private String descricao;
    private String tipoVolume;
    private Double valor;
    private Double comissaoPallet;
    private Double comissaoNormal;
    private String categoria;
    private Boolean descontinuado;

    

    public ProdutosDTO(){
    }

    public ProdutosDTO(Long id_produtos, String codigo, String descricao, String tipoVolume,
            Double valor, Double comissaoPallet, Double comissaoNormal, String categoria, Boolean descontinuado) {
        this.id_produtos = id_produtos;
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipoVolume = tipoVolume;
        this.valor = valor;
        this.comissaoPallet = comissaoPallet;
        this.comissaoNormal = comissaoNormal;
        this.categoria = categoria;
        this.descontinuado = descontinuado;
    }

    
    
    public Long getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(Long id_produtos) {
        this.id_produtos = id_produtos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoVolume() {
        return tipoVolume;
    }

    public void setTipoVolume(String tipoVolume) {
        this.tipoVolume = tipoVolume;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getComissaoPallet() {
        return comissaoPallet;
    }

    public void setComissaoPallet(Double comissaoPallet) {
        this.comissaoPallet = comissaoPallet;
    }

    public Double getComissaoNormal() {
        return comissaoNormal;
    }

    public void setComissaoNormal(Double comissaoNormal) {
        this.comissaoNormal = comissaoNormal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the descontinuado
     */
    public Boolean getDescontinuado() {
        return descontinuado;
    }

    /**
     * @param descontinuado the descontinuado to set
     */
    public void setDescontinuado(Boolean descontinuado) {
        this.descontinuado = descontinuado;
    }

    @Override
    public String toString() {
        return "ProdutosDTO{"
                + "id_produtos=" + getId_produtos()
                + ", descricao=" + getDescricao() + '}';
    }
}
