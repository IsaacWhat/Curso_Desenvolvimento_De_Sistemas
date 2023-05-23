package atts;
public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(){}
    public Funcionario(String nome, int dia, int mes, int ano, float salario){
        super(nome, dia, mes, ano);
        this.salario = salario;
    }
    
    public float getSalario(){return salario;}
    public void setSalario(float salario){this.salario = salario;}
    public float calcularImposto (){return (float) (this.salario * 0.03);}
    
    @Override
    public String imprimeDados(){
        return String.format("Nome do funcionário: "+nome+"\nData de Nascimento: "+nascimento.getData()+"\nSalário: "+ salario+"\nImpostoPago: "+this.calcularImposto()+"\n");
    }
}
