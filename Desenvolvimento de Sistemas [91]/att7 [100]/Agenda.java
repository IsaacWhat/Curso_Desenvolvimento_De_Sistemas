package Quest;
public class Agenda {
    private String nome;
    private Contatos[] contato;
     
    public Agenda (){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Contatos[] getContato() {
        return contato;
    }
    public void setContato(Contatos[] contato) {
        this.contato = contato;
    }
    public void ToString(){
        System.out.printf("Agenda '"+this.nome+"'\n");
        for(int i=0;i<3;i++){
            System.out.print("Nome: "+this.contato[i].getNome()+"\nNumero: "+this.contato[i].getNumero()+"\nEmail: "+this.contato[i].getEmail()+"\n\n");
        }
    }
    
}
