package ClassesNew;

public class Cliente extends Pessoa {

    private boolean elegivelDesconto;

    public Cliente(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco);
        this.elegivelDesconto = false;
    }

    public Cliente(int ID_pessoa, String nome, long telefone, String email, String cidade) {
        this(ID_pessoa, nome, telefone, email, cidade, "");
    }

    public void tornarElegivelParaDesconto() {
        elegivelDesconto = true;
    }

    public String elegivelParaDesconto() {
        if (elegivelDesconto) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    @Override
    public String toString() {
        return "Cliente ID => " + getID_pessoa() + "\nNome = " + getNome() + "\nTelefone = " + getTelefone()
                + "\nEmail = " + getEmail() + "\nCidade = " + getCidade() + "\nEndereco = " + getEndereco() + "\nElegivel para desconto = " + elegivelParaDesconto();
    }

}
