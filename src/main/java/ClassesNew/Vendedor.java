package ClassesNew;

public class Vendedor extends Pessoa {
    
 
    private float salario; 
    
    public Vendedor (int ID_pessoa, String nome, int telefone, String email, String cidade, String endereco, int ID_vendedor, float salario) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco);
        this.salario = salario;
    }
   
    public float getSalario() {
        return salario;
    }


    public void setSalario(float salario) {
        this.salario = salario;
    }
  
    
}
