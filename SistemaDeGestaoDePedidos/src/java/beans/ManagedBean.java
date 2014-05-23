/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import CRUD.Crud;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author 81358300
 */
@Named(value = "managedBean")
@Dependent
public class ManagedBean {

    Crud crud;
    
    public ManagedBean() {
        this.crud = new Crud();
    }
    
}
