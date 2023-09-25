package ClassesNew;

public class Roupas extends Produto implements Comercializavel{

    private String tamanho;
    private String cor;
    
    public Roupas (int id, String nome, float preco, int estoque, int quantidade, float desconto, String tamanho, String cor){
        super(id, nome, preco, estoque, quantidade, desconto);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.07);
    }
    
    @Override
    public boolean podeSerVendido(int quantidade) {
        return this.getEstoque()>= this.getQuantidade();
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
