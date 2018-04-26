/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.modelo;

/**
 *
 * @author tarle
 */
public class ContaBancaria extends FormaPagamento {
    private String banco;
    private String agencia;

    public ContaBancaria(String banco, String agencia, Integer id, String nome, String numero) {
        super(id, nome, numero);
        this.banco = banco;
        this.agencia = agencia;
    }

    
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numero=" + getNumero() + ", banco=" + banco + ", agencia=" + agencia + '}';
    }
    
    
}
