package atts;
import java.util.Scanner;
public class TesteCadastro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroPessoas cadastro = new CadastroPessoas();
        
        //Caso não queira inserir dados e ir direto a um construtor ja feito
        System.out.println("Inserir dados ?\n1-Não  >=2-Sim");
        int escolha = scan.nextInt();
        
        if(escolha==1){
            Cliente cliente1F = new Cliente("Rodrigo",30,9,2001,1);
            Cliente cliente2F = new Cliente("Ronaldo", 15, 5, 2000, 2);
            Funcionario funcionario1F = new Funcionario("Davi",6,6,1995,2300); 
            Funcionario funcionario2F = new Funcionario("João",12,2,1990,2100); 
            Gerente gerente1F = new Gerente("Pedro",22,9,1986,4200,"RH"); 
            cadastro.cadastrarPessoa(cliente1F);
            cadastro.cadastrarPessoa(cliente2F);
            cadastro.cadastrarPessoa(funcionario1F);
            cadastro.cadastrarPessoa(funcionario2F);
            cadastro.cadastrarPessoa(gerente1F);
            cadastro.imprimeCadastro(); 
        }else if(escolha==2){
            String nomec1,nomec2,nomef1,nomef2,nomeg,areag;
            int diac1,diac2,diaf1,diaf2,diag,mesc1,mesc2,mesf1,mesf2,mesg,anoc1,anoc2,anof1,anof2,anog;
            float salf1,salf2,salg;
            System.out.println("Insira o nome do primeiro cliente: ");
            nomec1=scan.next();
            System.out.println("Insira o dia que o primeiro cliente nasceu:");
            diac1=scan.nextInt();
            System.out.println("Insira o mes que o primeiro cliente nasceu:");
            mesc1=scan.nextInt();
            System.out.println("Insira o ano que o primeiro cliente nasceu:");
            anoc1=scan.nextInt();
            
            
            System.out.println("Insira o nome do segundo cliente: ");
            nomec2=scan.next();
            System.out.println("Insira o dia que o segundo cliente nasceu:");
            diac2=scan.nextInt();
            System.out.println("Insira o mes que o segundo cliente nasceu:");
            mesc2=scan.nextInt();
            System.out.println("Insira o ano que o segundo cliente nasceu:");
            anoc2=scan.nextInt();
            
            
            System.out.println("Insira o nome do primeiro Funcionario: ");
            nomef1=scan.next();
            System.out.println("Insira o dia que o primeiro funcionario nasceu:");
            diaf1=scan.nextInt();
            System.out.println("Insira o mes que o primeiro funcionario nasceu:");
            mesf1=scan.nextInt();
            System.out.println("Insira o ano que o primeiro funcionario nasceu:");
            anof1=scan.nextInt();
            System.out.println("Insira o salario do primeiro funcionario:");
            salf1=scan.nextFloat();
            
            
            System.out.println("Insira o nome do segundo Funcionario: ");
            nomef2=scan.next();
            System.out.println("Insira o dia que o segundo funcionario nasceu:");
            diaf2=scan.nextInt();
            System.out.println("Insira o mes que o segundo funcionario nasceu:");
            mesf2=scan.nextInt();
            System.out.println("Insira o ano que o segundo funcionario nasceu:");
            anof2=scan.nextInt();
            System.out.println("Insira o salario do segundo funcionario:");
            salf2=scan.nextFloat();
            
            
            System.out.println("Insira o nome do gerente: ");
            nomeg=scan.next();
            System.out.println("Insira o dia que o gerente nasceu:");
            diag=scan.nextInt();
            System.out.println("Insira o mes que o gerente nasceu:");
            mesg=scan.nextInt();
            System.out.println("Insira o ano que o gerente nasceu:");
            anog=scan.nextInt();
            System.out.println("Insira o salario do gerente:");
            salg=scan.nextFloat();
            System.out.println("Insira a area do gerente:");
            areag=scan.next();
           
            Cliente cliente1E = new Cliente(nomec1,diac1,mesc1,anoc1,1);
            Cliente cliente2E = new Cliente(nomec2,diac2,mesc2,anoc2,2);
            Funcionario funcionario1E = new Funcionario(nomef1,diaf1,mesf1,anof1,salf1);
            Funcionario funcionario2E = new Funcionario(nomef2,diaf2,mesf2,anof2,salf2);
            Gerente gerente1E = new Gerente(nomeg,diag,mesg,anog,salg,areag);
            cadastro.cadastrarPessoa(cliente1E);
            cadastro.cadastrarPessoa(cliente2E);
            cadastro.cadastrarPessoa(funcionario1E);
            cadastro.cadastrarPessoa(funcionario2E);
            cadastro.cadastrarPessoa(gerente1E);
            cadastro.imprimeCadastro(); 
        }
        
        
        
        
        
        
        
        
        
        
    }
}