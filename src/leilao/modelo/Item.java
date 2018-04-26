/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.modelo;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tarle
 */
public class Item {
    private Integer id;
    private String nome;
    private String descricao;
    private Double precoInicial;
    private Calendar inicio;
    private Calendar fim;
    private Calendar criadoEm;
    private List<Categoria> categorias;
    
    private List<Lance> lances;
    private Lance vencedor;
    

    public Item() {
    }

    public Item(Integer id, String nome, String descricao, Double precoInicial, Calendar inicio, Calendar fim) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoInicial = precoInicial;
        this.inicio = inicio;
        this.fim = fim;
        this.criadoEm = Calendar.getInstance();
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", precoInicial=" + precoInicial + ", inicio=" + inicio + ", fim=" + fim + ", criadoEm=" + criadoEm + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoInicial() {
        return precoInicial;
    }

    public void setPrecoInicial(Double precoInicial) {
        this.precoInicial = precoInicial;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public Lance getVencedor() {
        return vencedor;
    }

    public void setVencedor(Lance vencedor) {
        this.vencedor = vencedor;
    }
    
    public void fecharLeilao() {
        Calendar agora = Calendar.getInstance();
        
        if(fim.after(agora)) {
            throw new IllegalArgumentException("Leilão não finalizou!");
        }

        for(Lance lance : getLances()){
            if(vencedor == null || lance.getValor() > vencedor.getValor()) {
                vencedor = lance;
            }
        }
    }
    
}
