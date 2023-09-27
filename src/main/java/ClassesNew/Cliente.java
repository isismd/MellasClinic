package ClassesNew;

public class Cliente extends Pessoa {

    boolean elegivelDesconto;

    public Cliente(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco);
    }

    public void tornarElegivelParaDesconto() {
        elegivelDesconto = true;
    }

    @Override
    public String toString() {
        return "Cliente ID => " + getID_pessoa() + "\nNome = " + getNome() + "\nTelefone = " + getTelefone()
                + "\nEmail = " + getEmail() + "\nCidade = " + getCidade() + "\nEndereco = " + getEndereco() + "\n";
    }

}
