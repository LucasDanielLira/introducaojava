/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.Scanner;

/**
 *
 * @author 3817113
 */
public class Menu {
    public static void exibirMenu(String[] args) {
        System.out.println(" ola mundo esse é o menu ");
        System.out.println("----------- menu ------------ ");
        System.out.println(" 1) cadastro de equipamento ");
        System.out.println(" 2) lista dos equipamentos  ");
        
        Scanner s= new Scanner(System.in);
        int op=0;
        do{
            try{
            op =Integer.parseInt(s.nextLine());
            System.out.println(" 0 usuario digitou "+ op);
            break;
            }catch(Exception e){
             System.out.println(" tem namorado "+e.getMessage());
            }
        }while(op != 1 || op!=2);
        switch (op){
            case 1:
               EquipamentoVisao.exibirFormulario();
                break;
            case 2:
                
                
                break;
        }
    }
}
