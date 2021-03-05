
package Cliente;
import java.util.Scanner;

public class MainCliente {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente cl1 = new Cliente();
        
        System.out.println("Digite um nome: ");
        cl1.nome = ler.nextLine();
        System.out.println("Digite um Idade: ");
        cl1.setIdade(ler.nextInt());
        System.out.println("Digite um Renda: ");
        cl1.setRenda(ler.nextDouble());
        
        System.out.println("Verificador de dados!");
        System.out.println("Nome: " + cl1.nome);
        System.out.println("Idade: " + cl1.getIdade());
        System.out.println("Renda: " + cl1.getRenda());
        System.out.println(cl1.verificarIdade());
        System.out.println(cl1.verificarRenda());
        
    }
    
}
