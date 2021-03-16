
package Atividade3;
import java.util.Scanner;

public class ExecMariazinha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mariazinha = 150;
        int maricota = 110;
        int ano = 0;
        
        while(maricota <= mariazinha)
        {
            maricota = maricota + 3;
            mariazinha = mariazinha + 2;
            ano = ano + 1;
        }
        
        System.out.println("Maricota precisara de " + ano + " para ficar maior que Mariazinha");
        
        
    }
    
}
