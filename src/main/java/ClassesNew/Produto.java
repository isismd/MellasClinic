package ClassesNew;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected float preco;
    protected int estoque;
    protected int quantidade;
    protected float desconto;
    
    public Produto (int id, String nome, float preco, int estoque, int quantidade, float desconto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.quantidade = quantidade;
        this.desconto = desconto;
                
    }
    public abstract double calcularDesconto();

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
