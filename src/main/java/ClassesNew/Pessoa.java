package ClassesNew;

public abstract class Pessoa {
    protected int ID_pessoa;
    protected String nome;
    protected int telefone;
    protected String email;
    protected String cidade;
    protected String endereco;

    public int getID_pessoa() {
        return ID_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setID_pessoa(int ID_pessoa) {
        this.ID_pessoa = ID_pessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
}
