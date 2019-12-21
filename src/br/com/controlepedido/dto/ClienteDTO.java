
package br.com.controlepedido.dto;

/**
 * @author MDT
 */
public class ClienteDTO {

    private Long id_cliente;
    private String codigo;
    private String cpf_cnpj;
    private String nome_razao;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    private String email;
    private String site;
    private String telefone;
    private String formapagamento;
    
    public ClienteDTO(){
    }

    public ClienteDTO(Long id_cliente, String codigo, String cpf_cnpj, String nome_razao,
            String endereco, String numero, String complemento, String bairro, String cidade,
            String cep, String uf, String email, String site, String telefone, String formapagamento) {
        this.id_cliente = id_cliente;
        this.codigo = codigo;
        this.cpf_cnpj = cpf_cnpj;
        this.nome_razao = nome_razao;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.email = email;
        this.site = site;
        this.telefone = telefone;
        this.formapagamento = formapagamento;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cpf_cnpj
     */
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    /**
     * @param cpf_cnpj the cpf_cnpj to set
     */
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the formapagamento
     */
    public String getFormapagamento() {
        return formapagamento;
    }

    /**
     * @param formapagamento the formapagamento to set
     */
    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
    
    @Override
    public String toString() {
        return "ClienteDTO{"
                + " id_cliente=" + getId_cliente()
                + " nome_razao=" + getNome_razao() + '}';
    }
}
