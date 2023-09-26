package ClassesNew;

import java.time.LocalDate;
import java.util.Date;

public class Alimentos extends Produto {
    private String dataValidade;
    private String dataFabricacao;
    private double peso;
    
    public Alimentos (int id, String nome, double preco, int estoque, String dataFabricacao, String dataValidade, double peso){
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

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
     public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getIdProduto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}