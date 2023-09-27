package ClassesNew;

public class VendedorAlimenticios extends Vendedor implements Gratificacao {

    public VendedorAlimenticios(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco, float salario) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco, salario);
    }

    @Override
    public void bonificacao() {
        this.salario += 100.00;
    }
}
