/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.EquipamentoControle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import modelo.Equipamento;
/**
 *
 * @author 3817113
 */
public class EquipamentoVisao {
    public static void exibirFormulario(){
        Scanner s = new Scanner(System.in);
        String nome, patrimonio;
        float valor;
        Date dataAquisicao,dataTermino;
        System.out.println("_________Tela de cadastro_________");
        System.out.println("  insira o nome:   ");
        nome= s.nextLine();
        System.out.println("  insira o numero do patrimonio:    ");
        patrimonio=s.nextLine();
        System.out.println("  insira a data de aquisição:    ");
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);
        do{
            try{
                dataAquisicao= formatoData.parse(s.nextLine());
                System.out.println("  data lida: "+ dataAquisicao );
                break;
            }catch(Exception e){
                System.out.println("  data invalida  ");
            }
        }while(true);
        
        System.out.println("  insira a data de termino da garantia:   ");
           do{
            try{
                dataTermino= formatoData.parse(s.nextLine());
                System.out.println("  data lida: "+ dataTermino );
                if (dataTermino.after(dataAquisicao)){
                    break;
                }else{
                   System.out.println("  data invalida  ");
                }
            }catch(Exception e){
                System.out.println("  data invalida  ");
            }
           }while(true);
        System.out.println("  insira valor:  ");
        do{
            try{
                valor = Float.parseFloat(s.nextLine());
                break;
            }catch(Exception e){
                System.out.println(" valor incalido, digite novamentes ");
            }
            
        }while(true);
        EquipamentoControle.recebeDatosCadastro(nome, patrimonio, dataAquisicao, dataTermino, valor);
        Menu.exibirMenu();
        
    }
    
    
    public static void exibirListagemDeEquipamentos() {
        System.out.println("========= lista de equipamentos============ ");
        System.out.println("Nome \t Data Aquisição");
        
//        ArrayList<Equipamento> list = EquipamentoControle.obterListaEquipamentos();
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i).getNome()+"\t"+list.get(i).getDataAquisicao());
//        }
//        
        for(Equipamento obj: EquipamentoControle.obterListaEquipamentos()){
            System.out.println(obj.getNome()+"\t"+obj.getDataAquisicao()+"\t"+ obj.getManutencoes().size());
        }
        
        System.out.println("o que deseja fazer ????? ");
        System.out.println("0) Voltar ao menu ");
        System.out.println("Numero do patrimonio) cadastrar manutençãp ");
        
        Scanner s = new Scanner(System.in);
        String ValorDigitado = s.nextLine();
        if(s.equals("0")){
            Menu.exibirMenu();
        }else{
            Equipamento encontrado= EquipamentoControle.obterEquipamentoPeloNumeroDoPatrimonio(ValorDigitado);
            if (encontrado==null){
                System.out.println("ERRO 404.  FILE NOT FOUND ");
                Menu.exibirMenu();
            }else{
            
            }
        }

    }
}
