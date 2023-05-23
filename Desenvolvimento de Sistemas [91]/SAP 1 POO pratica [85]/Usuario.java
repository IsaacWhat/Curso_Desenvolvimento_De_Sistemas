package sap01;
import java.util.Scanner;
import java.util.Date;
public abstract class Usuario {
    Scanner scan = new Scanner(System.in);
    private String login;
    private String senha;
    private Date dataRegistro;
    private String email;

    public Usuario() {
    }
    public Usuario(String login, String senha, Date dataRegistro, String email) {
        this.login = login;
        this.senha = senha;
        this.dataRegistro = dataRegistro;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Date getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean verificarLogin(){
        int confirm=0;
        while(confirm!=1){
            System.out.println("Insira o Username ou login: ");
            String TentLogin=scan.next();
            System.out.printf("Insira a senha: ");
            String TentSenha=scan.next();
            if(TentLogin.equals(this.getLogin()) || TentLogin.equals(this.getEmail())){
                if(TentSenha.equals(this.getSenha())){
                    confirm=1;
                    System.out.println("Login efetuado com sucesso");
                }else{
                    System.out.println("Login ou senha invalidos, Tente novamente");
                }
            }else{
                System.out.println("Login ou senha invalidos, Tente novamente");
            }
        }
        return true;
    }
    
}
