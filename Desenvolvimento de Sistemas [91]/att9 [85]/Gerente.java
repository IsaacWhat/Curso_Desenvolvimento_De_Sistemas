package atts;
public class Gerente extends Funcionario {
    private String area;

    public Gerente(){}
    public Gerente(String nome, int dia, int mes, int ano, float salario, String area){
        super(nome, dia, mes, ano, salario);
        this.area = area;
    }

    public String getArea(){return area;}
    public void setArea(String area) {this.area = area;}

    @Override
    public float calcularImposto(){
        return (float)(this.getSalario()*0.05);
    }

    @Override
    public String imprimeDados(){
        return String.format("Nome do gerente: "+nome+"\nData de Nascimento: "+nascimento.getData()+"\nÁrea: "+this.area+"\nSalário: "+this.getSalario()+"\nImposto: "+this.calcularImposto()+"\n");
    }
}
