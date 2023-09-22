package classes;

public class Pessoas {

    private int ID_pessoa;
    private String nome;
    private String cpf;
    private String data_nascimento;
    private int telefone;
    private String email;

    public int getID_pessoa() {
        return ID_pessoa;
    }

    public void setID_pessoa(int ID_pessoa) {
        this.ID_pessoa = ID_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private Endereco endereco;

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Endereco getEndereco() {
        return this.endereco;
    }

    public class Endereco {

        private String rua;
        private String numero;
        private String cep;
        private String cidade;
        private String estado;

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

    }
}
