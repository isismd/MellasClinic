package ClassesNew;

public class Roupas extends Produto implements Comercializavel{

    private String tamanho;
    private String cor;
    private double desconto;
    
    public Roupas (int id, String nome, float preco, int estoque, String tamanho, String cor){
        super(id, nome, preco, estoque);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.07);
    }
    
    @Override
    public boolean podeSerVendido(int quantidade) {
        return this.getEstoque()>= quantidade;
    }
    
     public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = calcularDesconto();
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
