package biblioteca;

public class Cliente {

    private int telefone;
    private String cpf;
    private double preco;

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double verificarDesconto() 
    {
        if (this.idade >= 60) {
            preco = (preco * 0.2);
        } else {
            preco = 0;
        }
        return preco;
    }
   
    public String toString(){
        return 
                "SAÍDA DE DADOS" + "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + " anos\n"
                + "Telefone: " + this.telefone + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Preço do livro a vista: " + this.preco +"\n";
    }

}
