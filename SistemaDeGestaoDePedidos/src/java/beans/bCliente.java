/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author 81358300
 */
@Named(value = "bCliente")
@SessionScoped
public class bCliente implements Serializable {

    GregorianCalendar calendar;

    public bCliente() {
        this.calendar = new GregorianCalendar();
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }
    
    

}
