/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import control.BProfissao;
import java.util.ArrayList;
import model.Profissao;

/**
 *
 * @author 81358300
 */
public class Teste {

    public static void main(String[] args) {
        Pesquisa p = new Pesquisa();
        BProfissao profissao = new BProfissao();
        
        ArrayList<Profissao> lista = p.pesquisar(profissao.getListaDeProfissoes(), "dad");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+"#" + lista.get(i).getNome() + " - " + lista.get(i).getSalario());
        }
    }
}
