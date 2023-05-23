package sap01;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Sap01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int confirm=0;
        String nome,senha,email;
        ArrayList<Produto> prods = new ArrayList<>();
        Produto pd1 = new Produto(1,"Calça",80.50);
        Produto pd2 = new Produto(2,"Blusa",75.45);
        Produto pd3 = new Produto(3,"Shorts",45.45);
        prods.add(pd1);
        prods.add(pd2);
        prods.add(pd3);
        Pedido ped= new Pedido();
        Cliente cl=new Cliente("ClienteLoja","123",new Date(),"Cliente@gmail.com");
        Admin adm = new Admin("AdmLoja","15715",new Date("19/08/2008"),"AdmLoja@hotmail.com");
            System.out.printf("Deseja 1-cadastrar ou 2-logar ?");
            int escolha=scan.nextInt();
            if(escolha==2){
                System.out.printf("Deseja logar como 1-usuario ou 2-adm ?");
                int escolhas = scan.nextInt();
                if(escolhas==1){
                    cl.verificarLogin();
                    System.out.println("Oque deseja fazer ?\n1-Atualizar perfil  2-Mostrar Informações\n3-visualizar pedidos");
                    int escolhe = scan.nextInt();
                    if(escolhe==1){
                        cl.atualizarPerfil();
                    }else if(escolhe==2){
                        cl.imprimirInfo();
                    }else if(escolhe==3){
                        cl.visualizarPedidos();
                    
                }else if(escolhas==2){
                    adm.verificarLogin();
                }
            }else if(escolha==1){
                System.out.printf("Insira o nome do usuario: ");
                nome=scan.next();
                System.out.printf("Insira a senha do usuario: ");
                senha=scan.next();
                System.out.printf("Insira o email do usuario: ");
                email=scan.next();
                Cliente clo=new Cliente(nome,senha,new Date(),email);
                clo.verificarLogin();
                    System.out.println("Oque deseja fazer ?\n1-Atualizar perfil  2-Mostrar Informações\n3-visualizar pedidos");
                    int escolhe = scan.nextInt();
                    if(escolhe==1){
                        clo.atualizarPerfil();
                    }else if(escolhe==2){
                        clo.imprimirInfo();
                    }else if(escolhe==3){
                        clo.visualizarPedidos();
            }
        
        
        
        
        
    
       
    }
}
