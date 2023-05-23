package Att5;
import java.util.Scanner;
public class InvoiceTest {
     public static void main(String[] args){
        Invoice in = new Invoice();
        Scanner scan = new Scanner(System.in);
        int op=0;
        while(op!=3){
            System.out.printf("\n Menu Invoice\n(1)Set/Get  (2)invoice Ammount  (3)sair\n");
            op=scan.nextInt();
            if(op==1){
                System.out.printf("Insira o numero: ");
                String p = scan.next();
                in.Setnumero(p);
                System.out.printf("\nInsira a descrição: ");
                String o = scan.next();
                in.Setdescricao(o);
                System.out.printf("\nInsira a quantia comprada: ");
                int i = scan.nextInt();
                in.Setquantidade(i);
                System.out.printf("\nInsira o preço; ");
                double u =scan.nextDouble();
                in.Setpreco(u);
                System.out.printf("\nMostrar gets?\n (1)sim (>2)não\n");
                int y =scan.nextInt();
                if(y==1){
                    System.out.print("\nNumero: "+in.Getnumero()+"\nDescrição: "+in.Getdescricao()+"\nQuantia comprada: "+in.Getquantidade()+"\nPreço: "+in.Getpreco()+"\n");
                }
            }else if(op==2){
                double fat=0;
                in.getInvoiceAmount(fat);
            }else if(op==3){
                System.out.printf("\n:)\n");
            }else{
                System.out.printf("\n Tente novamente \n");
            }
        }
     }
}
