/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import CRUD.Crud;
import modelo.Cliente;

/**
 *
 * @author 81358300
 */
public class TesteCrud {

    public static void main(String[] args) {
        Crud c = new Crud();
        Cliente cliente = new Cliente();
        
        cliente.setNome("Marcelo Roldrin");
        cliente.setEndereco("Rua sem nome");
        cliente.setTelefone("0000-0000");

        try {
        c.salvar(cliente);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
