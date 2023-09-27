package ClassesNew;

public class VendedorNaoAlimenticio extends Vendedor implements Gratificacao {

    public VendedorNaoAlimenticio(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco, float salario) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco, salario);
    }

    @Override
    public void bonificacao() {
        this.salario += 150.00;
    }

}
