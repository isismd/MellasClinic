package ClassesNew;

import java.util.Date;

public class Alimentos extends Produto implements Comercializavel{
    private Date dataValidade;
    private Date dataFabricacao;
    private double peso;
    
    public Alimentos (int id, String nome, double preco, int estoque, Date dataValidade, Date dataFabricacao, double peso){
        super(id, nome, preco, estoque);
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
        return this.getEstoque()>= quantidade;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
