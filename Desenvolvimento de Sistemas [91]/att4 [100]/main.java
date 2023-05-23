package POO;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int op=0;
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria("Rod",10000,1000);
        while(op!=3){
            System.out.println("\tConta Bancaria\n(1)Depositar (2)Sacar (3)Sair");
            op=scan.nextInt();
            if(op==1){
                System.out.printf("\nInsira o valor a ser depositado: ");
                double deposit=scan.nextDouble();
                conta1.depositar(deposit);
            }else if(op==2){
                System.out.printf("\nInsira o valor a ser sacado: ");
                double sac=scan.nextDouble();
                conta1.sacar(sac);
            }else if(op==3){
                System.out.printf("Adeus\n");
            }else{
                System.out.printf("\nOpção invalida tente novamente\n");
            }
        }
    }    
}