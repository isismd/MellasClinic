package ClassesNew;

public class Vendedor extends Pessoa {

    double salario;
    private double comissao;

    public Vendedor(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco, float salario) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double comissao() {
        return comissao;
    }

    public void comissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor ID => " + getID_pessoa() + "\nNome = " + getNome() + "\nTelefone = " + getTelefone() + "\nEmail = " + getEmail()
                + "\nCidade = " + getCidade() + "\nEndereco = " + getEndereco() + "\nSalario = " + salario + "\n";
    }
}
