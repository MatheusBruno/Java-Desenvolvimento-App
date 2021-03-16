
package Atividade2;
import java.util.Scanner;
public class SomaValor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        int numero = 0;
        int soma = 0;
        
        
        do {
            System.out.println("Insira um número: ");
            numero = ler.nextInt();
            
            if(numero > 0) {
                soma = numero + soma;
            }
        }while (numero > 0);
        
        System.out.println("Soma dos valores: " + soma);
        
    }
    
}
