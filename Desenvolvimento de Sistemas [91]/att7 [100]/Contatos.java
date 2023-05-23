package Quest;
public class Contatos {
    private String nome;
    private String numero;
    private String email;
    
    public Contatos(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return ("Nome: "+this.nome+"\nNumero: "+this.numero+"\nEmail: "+this.email+"\n\n");
    }
}
