/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.modelo;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author tarle
 */
public abstract class FormaPagamento {
    private Integer id;
    private String nome;
    private String numero;
    private Calendar criadoEm;

    public FormaPagamento() {
    }

    public FormaPagamento(Integer id, String nome, String numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.criadoEm = Calendar.getInstance();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FormaPagamento other = (FormaPagamento) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "id=" + id + ", nome=" + nome + ", numero=" + numero + ", criadoEm=" + criadoEm + '}';
    }
    
    
}
