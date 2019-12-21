/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controlepedido.dto;

/**
 *
 * @author MDT
 */
public class ConfiguraEmailDTO {
    
    private int Id_email;
    private String servidorsmtp;
    private String porta;
    private String email;
    private String senha;
    private Boolean criptografia;
    private String assunto;
    private String mensagem;

    /**
     * @return the Id_email
     */
    public int getId_email() {
        return Id_email;
    }

    /**
     * @param Id_email the Id_email to set
     */
    public void setId_email(int Id_email) {
        this.Id_email = Id_email;
    }

    /**
     * @return the servidorsmtp
     */
    public String getServidorsmtp() {
        return servidorsmtp;
    }

    /**
     * @param servidorsmtp the servidorsmtp to set
     */
    public void setServidorsmtp(String servidorsmtp) {
        this.servidorsmtp = servidorsmtp;
    }

    /**
     * @return the porta
     */
    public String getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(String porta) {
        this.porta = porta;
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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the criptografia
     */
    public Boolean getCriptografia() {
        return criptografia;
    }

    /**
     * @param criptografia the criptografia to set
     */
    public void setCriptografia(Boolean criptografia) {
        this.criptografia = criptografia;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    
}
