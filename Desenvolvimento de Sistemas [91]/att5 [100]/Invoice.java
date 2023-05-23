package Att5;
class Invoice {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public Invoice(){
        
    } 
    public void Invoice(String numero,String descricao,int quantidade,double preco){
        this.numero=numero;
        this.descricao=descricao;
        this.quantidade=quantidade;
        this.preco=preco;
    }
    public String Getnumero(){ return this.numero; }
    public void Setnumero(String numero){ this.numero=numero; }
    public String Getdescricao(){ return this.descricao; }
    public void Setdescricao(String descricao){ this.descricao=descricao; }
    public int Getquantidade(){ return this.quantidade; }
    public void Setquantidade(int quantidade){ this.quantidade=quantidade; }
    public double Getpreco(){ return this.preco;  }
    public void Setpreco(double preco){ this.preco=preco; }
    public void getInvoiceAmount(double x){
        if(this.quantidade<0){ this.quantidade=0; }
        if(this.preco<0){ this.preco=0; }
        x=this.preco*this.quantidade;
        System.out.print("\nInvoice Ammount: "+x+"\n");
    }
}
