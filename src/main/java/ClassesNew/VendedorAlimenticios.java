package ClassesNew;

public class VendedorAlimenticios extends Vendedor implements Gratificacao {

    public VendedorAlimenticios(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco, float salario) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco, salario);
    }

    @Override
    public void bonificacao() {
        this.salario += 100.00;
    }

    @Override
    public String toString() {
        return "Vendedor ID => " + getID_pessoa() + "\nNome = " + getNome() + "\nTelefone = " + getTelefone() + "\nEmail = " + getEmail()
                + "\nCidade = " + getCidade() + "\nEndereco = " + getEndereco() + "\n Bonificação == R$ 100.00 " + "\nSalario = " + salario + "\n";
    }
}
