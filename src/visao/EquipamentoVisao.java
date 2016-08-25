/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
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

    }
}
