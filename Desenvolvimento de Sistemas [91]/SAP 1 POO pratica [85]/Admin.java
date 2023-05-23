package sap01;
import java.util.Date;
public class Admin extends Usuario {
    private String nomeAdmin;

    public Admin() {
    }

    public Admin(String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
    }
    
    public String getNomeAdmin() {
        return nomeAdmin;
    }
    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }
    
    public void atualizarProduto(){
        
        System.out.printf("Qual produto deseja atualizar ?");
    }
}
