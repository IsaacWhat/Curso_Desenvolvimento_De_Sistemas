package sap01;
import java.util.Scanner;
import java.util.ArrayList;
public class Pedido {
    Scanner scan = new Scanner(System.in);
    private String nomePedido;
    private String endereco;
    ArrayList<Produto> prods = new ArrayList<>();
    ArrayList<Integer> prodesc= new ArrayList<>();
    
    public Pedido() {
    }

    public String getNomePedido() {
        return nomePedido;
    }
    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setProduto(Produto nome){
        prods.add(nome);
    }
    
    public String imprimirInfo(){
        System.out.printf("Produtos no atual pedido:\n");
        for(Produto e: prods){
            System.out.println("("+e.getIdProd()+")"+e.getNome()+"- R$ "+e.getValor());
        }
        System.out.printf("Total: "+this.calcularpreco());
        return "";
    }
    public double calcularpreco(){
        double preco=0;
        for(Produto o : prods){
            preco=+(o.getValor());
        }
        return preco;
    }
}
