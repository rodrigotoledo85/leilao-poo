/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import leilao.modelo.Categoria;
import leilao.modelo.Endereco;
import leilao.modelo.Usuario;
import leilao.ui.login.FormLogin;


/**
 *
 * @author 10720816
 */
public class Leilao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria c = new Categoria(null, "Teste categoria");
        Categoria c1 = new Categoria(null, "Teste categoria 2");
        Categoria c2 = new Categoria(null, "Teste categoria 3");
      
        Endereco e = new Endereco("R. Vitorio Marcola", "30310360", "383", "BH");
        Usuario u = new Usuario(null, "Teste 2", "teste@email.com", "123", null, Calendar.getInstance(), e);
        
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("LeilaoPU");
        
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
        
        Query q = em.createNamedQuery("Categoria.findAll");
        List<Categoria> categorias = q.getResultList();
        
        for(Categoria aux : categorias)
            System.out.println(aux);
        
        em.close();
        factory.close();
        
        System.out.println(c);
    }
    
}
