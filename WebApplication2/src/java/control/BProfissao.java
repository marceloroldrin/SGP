/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Profissao;
import util.Pesquisa;

/**
 *
 * @author 81358300
 */
@Named(value = "bProfissao")
@SessionScoped
public class BProfissao implements Serializable {

    private String txtBusca;
    private Profissao profissao;
    private ArrayList<Profissao> listaDeProfissoes;
    private ArrayList<Profissao> listaDeBusca;

    public BProfissao() {
        this.profissao = new Profissao();
        this.listaDeProfissoes = new ArrayList();
        preecherLista();
    }

    private void preecherLista() {
        this.listaDeProfissoes.add(new Profissao("Administrador de banco de dados (DBA)", 4393));
        this.listaDeProfissoes.add(new Profissao("Administrador de rede", 4100));
        this.listaDeProfissoes.add(new Profissao("Analista de dados e infra-estrutura", 3584));
        this.listaDeProfissoes.add(new Profissao("Analista de negócios", 5096));
        this.listaDeProfissoes.add(new Profissao("Analista de organização e métodos", 3500));
        this.listaDeProfissoes.add(new Profissao("Analista de processos", 3500));
        this.listaDeProfissoes.add(new Profissao("Analista de produção ", 4290));
        this.listaDeProfissoes.add(new Profissao("Analista de projetos ", 4159));
        this.listaDeProfissoes.add(new Profissao("Analista de segurança da informação", 4934));
        this.listaDeProfissoes.add(new Profissao("Analista de sistemas ", 5332));
        this.listaDeProfissoes.add(new Profissao("Analista de sistemas Web", 6200));
        this.listaDeProfissoes.add(new Profissao("Analista BI", 4200));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte de vendas", 1041));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte ERP ", 2240));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte Linux ", 2100));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte Mainframe  ", 3360));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte Notes ", 2579));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte Redes ", 2352));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte técnico", 1200));
        this.listaDeProfissoes.add(new Profissao("Analista de suporte Unix ", 2900));
        this.listaDeProfissoes.add(new Profissao("Analista de telecomunicações ", 4040));
        this.listaDeProfissoes.add(new Profissao("Analista de testes ", 2240));
        this.listaDeProfissoes.add(new Profissao("Analista programador  mainframe  ", 2464));
        this.listaDeProfissoes.add(new Profissao("Analista programador .NET", 3380));
        this.listaDeProfissoes.add(new Profissao("Analista programador Abap ", 4390));
        this.listaDeProfissoes.add(new Profissao("Analista programador ASP ", 2800));
        this.listaDeProfissoes.add(new Profissao("Analista programador C++ ", 3360));
        this.listaDeProfissoes.add(new Profissao("Analista programador Delphi ", 2800));
        this.listaDeProfissoes.add(new Profissao("Analista programador Java ", 3900));
        this.listaDeProfissoes.add(new Profissao("Analista programador PHP ", 3360));
        this.listaDeProfissoes.add(new Profissao("Analista programador progress", 4480));
        this.listaDeProfissoes.add(new Profissao("Analista programador Visual Basic ", 2240));
        this.listaDeProfissoes.add(new Profissao("Analista segurança de sistemas", 4890));
        this.listaDeProfissoes.add(new Profissao("Arquiteto de Sistemas", 4816));
        this.listaDeProfissoes.add(new Profissao("Arquiteto de Infraestrutura", 4715));
        this.listaDeProfissoes.add(new Profissao("Arquiteto de testes", 3360));
        this.listaDeProfissoes.add(new Profissao("Auditor de sistemas", 3360));
        this.listaDeProfissoes.add(new Profissao("Líder de sistemas", 8155));
        this.listaDeProfissoes.add(new Profissao("Líder de telecomunicações", 7700));
        this.listaDeProfissoes.add(new Profissao("Líder programação de sistemas", 8936));
        this.listaDeProfissoes.add(new Profissao("Consultor TI especializado", 6783));
        this.listaDeProfissoes.add(new Profissao("Consultor TI funcional", 6392));
        this.listaDeProfissoes.add(new Profissao("Coordenador de projetos ", 7500));
        this.listaDeProfissoes.add(new Profissao("Coordenador de suporte técnico", 4675));
        this.listaDeProfissoes.add(new Profissao("Engenheiro de sistemas - software", 6205));
        this.listaDeProfissoes.add(new Profissao("Engenheiro de telecomunicações", 5023));
        this.listaDeProfissoes.add(new Profissao("Executivo de contas", 20000));
        this.listaDeProfissoes.add(new Profissao("Gerente de contas TI", 15000));
        this.listaDeProfissoes.add(new Profissao("Gerente de e-commerce", 14934));
        this.listaDeProfissoes.add(new Profissao("Gerente de operação", 6720));
        this.listaDeProfissoes.add(new Profissao("Gerente de processos", 9600));
        this.listaDeProfissoes.add(new Profissao("Gerente de produção ", 7059));
        this.listaDeProfissoes.add(new Profissao("Gerente de projetos ", 8500));
        this.listaDeProfissoes.add(new Profissao("Gerente de Projetos SAP", 10500));
        this.listaDeProfissoes.add(new Profissao("Gerente de segurança ", 11060));
        this.listaDeProfissoes.add(new Profissao("Gerente de sistemas", 15596));
        this.listaDeProfissoes.add(new Profissao("Gerente de suporte técnico", 10600));
        this.listaDeProfissoes.add(new Profissao("Gerente de telecomunicações", 16678));
        this.listaDeProfissoes.add(new Profissao("Operador de computador ", 2189));
        this.listaDeProfissoes.add(new Profissao("Técnico de celular", 1008));
        this.listaDeProfissoes.add(new Profissao("Técnico de hardware", 1008));
        this.listaDeProfissoes.add(new Profissao("Técnico de telecomunicações ", 3441));
        this.listaDeProfissoes.add(new Profissao("Webdesigner", 4271));
        this.listaDeProfissoes.add(new Profissao("Webmaster", 5940));

    }

    public ArrayList<Profissao> getListaDeProfissoes() {
        return listaDeProfissoes;
    }

    public void setListaDeProfissoes(ArrayList<Profissao> listaDeProfissoes) {
        this.listaDeProfissoes = listaDeProfissoes;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public String getTxtBusca() {
        return txtBusca;
    }

    public void setTxtBusca(String txtBusca) {
        this.txtBusca = txtBusca;
    }

    public ArrayList<Profissao> getListaDeBusca() {
        return listaDeBusca;
    }

    public void setListaDeBusca(ArrayList<Profissao> listaDeBusca) {
        this.listaDeBusca = listaDeBusca;
    }

    public void preencherListaDeBusca() {

        this.listaDeBusca = new ArrayList();
        Pesquisa p = new Pesquisa();
        this.listaDeBusca = p.pesquisar(this.listaDeProfissoes, this.txtBusca);
    }

}
