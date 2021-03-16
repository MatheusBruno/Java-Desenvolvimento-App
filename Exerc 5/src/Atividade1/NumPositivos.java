
package Atividade1;
import java.util.Scanner;

public class NumPositivos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero = 0;
        double soma = 0;
        int contar = 0;
        
       do 
       {
           System.out.println("Insira um número");
           numero = ler.nextDouble();
           
           if(numero > 0){
               soma = numero + soma;
               contar++;
           }           
       }while(numero > 0);
       
        System.out.println("Soma: " + soma);
        System.out.println("Números digitados: " + contar);
        System.out.println("Média: " + (soma / contar) );
        
        
    }
    
}
