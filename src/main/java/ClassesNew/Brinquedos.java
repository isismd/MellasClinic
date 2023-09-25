package ClassesNew;

public class Brinquedos extends Produto {

    private int faixaEtaria;
    private String material;
    
    public Brinquedos (int id, String nome, float preco, int estoque, int faixaEtaria, String material){
        super(id, nome, preco, estoque);
        this.faixaEtaria = faixaEtaria;
        this.material = material;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.08);
    }
    
    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
