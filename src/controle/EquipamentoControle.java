/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import armazenamento.MeioArmazenamento;
import java.util.ArrayList;
import java.util.Date;
import modelo.Equipamento;

/**
 *
 * @author 3817113
 */
public class EquipamentoControle {
    public static void recebeDatosCadastro(String nome, String patrimonio, Date dataAquisicao, Date dataTermino, float valor) {
        Equipamento objetoEquipamento = new Equipamento();
        objetoEquipamento.setNome(nome);
        objetoEquipamento.setPatrimonio(patrimonio);
        objetoEquipamento.setDataAquisicao(dataAquisicao);
        objetoEquipamento.setDataTermino(dataTermino);
        objetoEquipamento.setValor(valor);
        objetoEquipamento.salvar();
    }
    public static ArrayList<Equipamento> obterListaEquipamentos(){
        return Equipamento.ObterLista();
    }
    
    public static Equipamento obterEquipamentoPeloNumeroDoPatrimonio(String NumeroPatrimonio){
        return Equipamento.ObterPeloNumero(NumeroPatrimonio);
    }
    
}
