package ClassesNew;

public class Cliente extends Pessoa{
    
    private int ID_cliente;
    
    public Cliente (int ID_pessoa, String nome, long telefone, String email, String cidade, String endereco, int ID_cliente) {
        super(ID_pessoa, nome, telefone, email, cidade, endereco);
        this.ID_cliente = ID_cliente;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

}
    
