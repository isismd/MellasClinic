package ClassesNew;

import java.util.Date;

public class Alimentos extends Produto implements Comercializavel{
    private Date dataValidade;
    private Date dataFabricacao;
    private float peso;
    
    public Alimentos (int id, String nome, float preco, int estoque, int quantidade, float desconto, Date dataValidade, Date dataFabricacao, float peso){
        super(id, nome, preco, estoque, quantidade, desconto);
        this.dataValidade = dataValidade;
        this.dataFabricacao = dataFabricacao;
        this.peso = peso;
    
    }
    
    /**
     *
     * @return
     */
    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.05);
    }
    
    @Override
    public boolean podeSerVendido(int quantidade) {
        return this.getEstoque()>= this.getQuantidade();
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
