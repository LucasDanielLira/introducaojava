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
        try{
            int op =s.nextInt();
            System.out.println(" 0 usuario digitou "+ op);
        
        }catch(Exception e){
             System.out.println(" tem namorado "+e.getMessage());
        }
        
    }
}
