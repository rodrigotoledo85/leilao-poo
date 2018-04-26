package leilao.modelo;

import java.util.Calendar;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarle
 */
public class Comentario {
    private Integer id;
    private Integer avaliacao;
    private String texto;
    private Calendar criadoEm;
    
    private Usuario de;
    private Item sobre;

    public Comentario(Integer id, Integer avaliacao, String texto, Usuario de, Item sobre) {
        this.id = id;
        this.avaliacao = avaliacao;
        this.texto = texto;
        this.de = de;
        this.sobre = sobre;
        
        this.criadoEm = Calendar.getInstance();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", avaliacao=" + avaliacao + ", texto=" + texto + ", criadoEm=" + criadoEm + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.avaliacao);
        hash = 79 * hash + Objects.hashCode(this.texto);
        hash = 79 * hash + Objects.hashCode(this.criadoEm);
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
        final Comentario other = (Comentario) obj;
        if (!Objects.equals(this.texto, other.texto)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.avaliacao, other.avaliacao)) {
            return false;
        }
        if (!Objects.equals(this.criadoEm, other.criadoEm)) {
            return false;
        }
        return true;
    }

    public Usuario getDe() {
        return de;
    }

    public void setDe(Usuario de) {
        this.de = de;
    }

    public Item getSobre() {
        return sobre;
    }

    public void setSobre(Item sobre) {
        this.sobre = sobre;
    }
    
    
}
