package ClassesNew;

public interface Pessoa {

    int getID_pessoa();
    String getNome();
    long getTelefone();
    String getEmail();
    String getCidade();
    String getEndereco();

    void setID_pessoa(int ID_pessoa);
    void setNome(String nome);
    void setTelefone(long telefone);
    void setEmail(String email);
    void setCidade(String cidade);
    void setEndereco(String endereco);
}
