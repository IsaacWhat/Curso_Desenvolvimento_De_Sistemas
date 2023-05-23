package POO;
public class ContaBancaria {
    String nome;
    double saldo;
    double limite;
    
    public ContaBancaria(){
        
    }
    public ContaBancaria(String Nome, double saldo, double limite){
        this.nome=nome;
        if(saldo<0){
            this.saldo=0.0;
        }else{
            this.saldo=saldo;
        }
        this.limite=limite;
    }
    
    void depositar(double valor){
            this.saldo+=valor;
            System.out.print("\nO seu saldo atual é "+this.saldo);
        }
    void sacar(double valor){
        if(valor>this.limite || valor>this.saldo){
            System.out.printf("\nLimite/Saldo indisponivel\n");
        }else{
            this.saldo-=valor;
            System.out.print("\nO seu saldo atual é "+this.saldo);
        }
    }
}
