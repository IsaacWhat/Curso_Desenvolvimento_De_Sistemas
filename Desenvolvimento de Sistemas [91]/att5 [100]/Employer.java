package Att5;
public class Employer {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Employer(){
        
    }
    public void Employer(String nome, String sobrenome, double salario){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.salario=salario;
    }
    public String Getnome(){ return this.nome; }
    public void Setnome(String nome){ this.nome=nome; }
    public String Getsobrenome(){ return this.sobrenome; }
    public void Setsobrenome(String sobrenome){ this.sobrenome=sobrenome; }
    public double Getsalario(){ return this.salario; }
    public void Setsalario(double salario){ if(salario<0){ salario=0; } this.salario=salario; }
    
    public void salanual(){
        double anual=this.salario*12;
        System.out.print("O salario anual do "+this.nome+" empregado é "+anual+"\n");
    }
    public void salanualdesc(){
        double anual=(this.salario*12)+(this.salario*0.10);
        System.out.print("O salario anual com desconto do "+this.nome+" empregado é "+anual+"\n");
    }
}
