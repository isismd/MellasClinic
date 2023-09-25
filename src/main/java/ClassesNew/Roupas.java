package ClassesNew;

public class Roupas extends Produto {

    private String tamanho;
    private String cor;
    
    public Roupas (int id, String nome, float preco, int estoque, String tamanho, String cor){
        super(id, nome, preco, estoque); 
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.07);
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
