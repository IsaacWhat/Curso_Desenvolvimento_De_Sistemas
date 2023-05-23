package sap01;
public class Produto {
    private int idProd;
    private String nome;
    private double valor;
    
    public Produto() {
    }

    public Produto(int idProd, String nome, double valor) {
        this.idProd = idProd;
        this.nome = nome;
        this.valor = valor;
    }

    public int getIdProd() {
        return idProd;
    }
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String infoProduto(){
        return String.format("Nome: "+this.getNome()+"\nPreço: "+this.getValor());
    }
}
