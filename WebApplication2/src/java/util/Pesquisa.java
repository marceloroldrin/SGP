/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import model.Profissao;

/**
 *
 * @author 81358300
 */
public class Pesquisa {

    public ArrayList<Profissao> pesquisar(ArrayList<Profissao> listaDeProfissoes, String txtBusca) {

        ArrayList<Profissao> lista = new ArrayList();
     
        for (Profissao profissao : listaDeProfissoes) {
               
                if (profissao.getNome().toLowerCase().matches(".*" + txtBusca.toLowerCase() + ".*")) {
                    lista.add(profissao);
                }
            
        }
        return lista;
    }


}
