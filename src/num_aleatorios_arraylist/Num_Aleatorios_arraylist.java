/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num_aleatorios_arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cesaralan
 */
public class Num_Aleatorios_arraylist 
{

   
    public static void main(String[] args) 
{
    
// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner ca=new Scanner(System.in); 
      
//declaracion de variables
      int res;
      
 //metodo de ArrayList
      ArrayList Lista=new ArrayList();
      
      do
      { 
//        System.out.println("numero es:");
//        dato=ca.nextInt();
//        Lista.add(dato);
          Random NumA=new Random();
          int n=1+NumA.nextInt(10);
          System.out.println("num aleatorio es:" +n);
          Lista.add(n);
          
        System.out.println("desea continuar 1, 0 para salir");
        res=ca.nextInt();
      }
      while(res!=0); 
      
      for (int i=0; i<Lista.size();i++)
      {
          System.out.println(Lista.get(i));
      }
    }    
}