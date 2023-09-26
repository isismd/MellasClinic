package ClassesNew;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    
    private int idCliente;
    private int idVendedor;
    private List<Produto> produtos;
    private Date dataVenda;
    private double descontoTotal;
    private double valorTotal;
    private double valorComDesconto;
    
    public Venda(Cliente cliente, Vendedor vendedor) {
        this.idCliente = cliente.ID_pessoa;
        this.idVendedor = vendedor.ID_pessoa;
        this.produtos = new ArrayList<>();
        this.dataVenda = new Date();
        this.descontoTotal = 0;
        this.valorTotal = 0;
        this.valorComDesconto = 0;
    }
    
    public void adicionarProduto(Produto produto, int quantidadeDesejada) {
        if (produto.podeSerVendido(quantidadeDesejada)) {
            produtos.add(produto);
            valorTotal += produto.getPreco() * quantidadeDesejada;
        } else {
            System.out.println("A quantidade desejada é maior que a quantidade no estoque..");
        }
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public int getIdVendedor() {
        return idVendedor;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public Date getDataDaVenda() {
        return dataVenda;
    }
    
    public double calcularDescontoTotal(Cliente cliente) {
        if (cliente.elegivelDesconto) {
            for (Produto produto : produtos) {
                descontoTotal += produto.calcularDesconto();
            }
        } else {
            descontoTotal = 0;
        }
        
        return descontoTotal;
    }
    
    public double getValorTotal() {
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        
        return valorTotal;
    }
    
    public void verificarElegibilidadeDesconto(Cliente cliente) {
        if (getValorTotal() > 250) {
            cliente.tornarElegivelParaDesconto();
        }
    }
    
    public double getvalorComDesconto() {
        valorComDesconto = valorTotal - descontoTotal;
        return valorComDesconto;
    }
}
