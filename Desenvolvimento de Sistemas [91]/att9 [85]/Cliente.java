package atts;
public class Cliente extends Pessoa {
    private int codigo;
    
    public Cliente(){};
    public Cliente(String nome, int dia, int mes, int ano, int codigo){
        super(nome, dia, mes, ano);
        this.codigo = codigo;
    }
    

    public int getCodigo(){return codigo;}
    public void setCodigo(int codigo){this.codigo = codigo;}

    @Override
    public String imprimeDados(){
        return String.format("Nome do cliente:"+nome+" \nData de Nascimento: "+nascimento.getData()+"\nCódigo: "+this.getCodigo()+"\n");
    }
}
