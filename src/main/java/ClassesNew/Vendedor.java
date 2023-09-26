package ClassesNew;

public class Vendedor implements Pessoa {

    private int ID_pessoa;
    private String nome;
    private long telefone;
    private String email;
    private String cidade;
    private String endereco;
    private float salario;

    public Vendedor(int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco, float salario) {
        this.ID_pessoa = ID_pessoa;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.endereco = endereco;
        this.salario = salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public long getTelefone() {
        return telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int getID_pessoa() {
        return ID_pessoa;
    }

    @Override
    public void setID_pessoa(int ID_pessoa) {
        this.ID_pessoa = ID_pessoa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
