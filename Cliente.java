
package Cliente;


public class Cliente {
    
    public String nome;
    private int idade;
    private double renda;
    
    public int getIdade(){
        return idade;
    }
    
    public double getRenda(){
        return renda;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setRenda(double renda){
        this.renda = renda;
    }
    
    public String verificarIdade(){
            String reposta;
            if(this.idade >= 18){
                reposta = "Maior de idade!";
            }else{
                reposta = "Menor de idade";
            }
            return reposta;
    }
    
    public String verificarRenda(){
        String resposta;
        if(this.renda > 15000){
            resposta = "Rico!";
        }else{
            resposta = "Pobre!";
        }
        return resposta;
    }
    
    
}
