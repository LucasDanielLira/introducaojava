/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import armazenamento.MeioArmazenamento;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 3817113
 */
public class Equipamento {
    private String nome, patrimonio;
    private Date dataAquisicao, dataTermino;
    private float valor;
    private ArrayList<Manutencao> listamanutencao;
    
    public Equipamento(){
        this.listamanutencao=new ArrayList();
    }
    
    public ArrayList<Manutencao> getManutencoes(){
        return this.listamanutencao;
    }
    
    public static Equipamento ObterPeloNumero(String NumeroPatrimonio) {
        for(Equipamento objDaVez: Equipamento.ObterLista()){
            if (objDaVez.getPatrimonio().equals(NumeroPatrimonio)) return objDaVez;
        }
        return null;
    }
    
    public static ArrayList<Equipamento> ObterLista(){
        return MeioArmazenamento.MEIO_ARMAZENAMENTO_EQUIPAMENTO;
    }
    
    public void salvar(){
        MeioArmazenamento.MEIO_ARMAZENAMENTO_EQUIPAMENTO.add(this);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the patrimonio
     */
    public String getPatrimonio() {
        return patrimonio;
    }

    /**
     * @param patrimonio the patrimonio to set
     */
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    /**
     * @return the dataAquisicao
     */
    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    /**
     * @param dataAquisicao the dataAquisicao to set
     */
    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    /**
     * @return the dataTermino
     */
    public Date getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
}
