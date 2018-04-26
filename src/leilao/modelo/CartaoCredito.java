/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.modelo;

import java.util.Calendar;

/**
 *
 * @author tarle
 */
public class CartaoCredito extends FormaPagamento {
    private String bandeira;
    private Calendar dataVencimento;
    private String codigoSeguranca;

    public CartaoCredito(String bandeira, Calendar dataVencimento, String codigoSeguranca, Integer id, String nome, String numero) {
        super(id, nome, numero);
        this.bandeira = bandeira;
        this.dataVencimento = dataVencimento;
        this.codigoSeguranca = codigoSeguranca;
    }   
    
    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" + "numero=" + getNumero() + ", bandeira=" + bandeira + ", dataVencimento=" + dataVencimento + ", codigoSeguranca=" + codigoSeguranca + '}';
    }
    
    
}
