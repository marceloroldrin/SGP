/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author 81358300
 */
public class Crud {

    private Session session;
    
    public Crud() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void abrirTransacao(){
        this.session.beginTransaction();
    }
    public void fecharTransacao(){
        this.session.getTransaction().commit();
    }
    
    public void salvar(Object object){
        abrirTransacao();
        this.session.save(object);
        fecharTransacao();
    }
}
