package sap01;
import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario{
    private String nomeCliente;
    private String endereco;
    private CartaoCredito cartao;
    ArrayList<Pedido> pedidos = new ArrayList<>();    
    
    public Cliente() {
    }

    public Cliente(String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
    }

    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void atualizarPerfil(){
        System.out.println("Oque deseja atualizar no perfil?\n 1-Nome  2-Endereço  3-Login\n 4-Email  5-Senha 6-Cartão de credito");
        int escolha=scan.nextInt();
        switch(escolha){
            case 1:
                System.out.printf("Insira o nome para ser realizado: ");
                String nome=scan.next();
                this.setNomeCliente(nome);
                System.out.println("Nome alterado com sucesso");
                break;
            case 2:
                System.out.printf("Insira o novo endereço: ");
                String end=scan.next();
                this.setEndereco(end);
                System.out.println("Endereço alterado com sucesso");
                break;
            case 3:
                System.out.printf("Insira um novo Username: ");
                String user=scan.next();
                this.setLogin(user);
                System.out.println("Username alterado com sucesso");
                break;
            case 4:
                System.out.printf("Insira o novo email: ");
                String emai=scan.next();
                this.setEmail(emai);
                System.out.println("Email alterado com sucesso");
                break;
            case 5:
                System.out.printf("Insira a nova senha: ");
                String senh=scan.next();
                this.setSenha(senh);
                System.out.println("Senha alterado com sucesso");
                break;
            case 6:
                System.out.printf("Oque deseja alterar:\n 1-Numero do Cartão  2-Titular  3-Ccv");
                int escolhacart =scan.nextInt();
                switch(escolhacart){
                    case 1:
                        System.out.printf("Insira o novo numero do cartão: ");
                        String numcart =scan.next();
                        this.cartao.setNumero(numcart);
                        break;
                    case 2:
                        System.out.printf("Insira o novo titular: ");
                        String titular=scan.next();
                        this.cartao.setTitular(titular);
                        break;
                    case 3:
                        System.out.printf("Insira o novo ccv: ");
                        String ccvmud=scan.next();
                        this.cartao.setCcv(ccvmud);
                        break;
                    default:
                        System.out.println("Opção invalida");
                        
                }
        }
    }
    public String imprimirInfo(){
        return String.format("===================\nNome: "+this.getNomeCliente()+"\nEmail: "+this.getEmail()+"\nEndereço: "+this.getEndereco()+"\n Num.cartão: "+this.cartao.getNumero()+"\nTitular: "+this.cartao.getTitular()+"\n====================");
    }
   
    public String visualizarPedidos(){
        for(Pedido p: pedidos){
            System.out.println(p.getNomePedido());
        }
        return"";
    }
    
}
