package ClassesNew;

public interface Comercializavel {
    float getPreco();
    String getNome();
    boolean podeSerVendido(int quantidade);
    float calcularPrecoTotal(int quantidade);
}
