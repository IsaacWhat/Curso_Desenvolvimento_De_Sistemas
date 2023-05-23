package revlogica;
import java.util.Scanner;
public class RevLogica {
    public static void main(String[] args) {
        /* Questão 1
        Scanner scan = new Scanner(System.in);
        float preco;
        System.out.println("Ensira o valor de fábrica do carro:");
        preco= scan.nextFloat();
        System.out.printf("O valor do carro novo será R$ %.2f\n", preco+(preco*0.28)+(preco*0.45));
        */
        
        /* Questão 
        Scanner scan = new Scanner(System.in);
        String desc;
        float preco, qntd, total;
        System.out.println("Insira o nome do produto:");
        desc=scan.nextLine();
        System.out.println("Insira o preço do produto:");
        preco=scan.nextFloat();
        System.out.println("Insira a quantia comprada:");
        qntd=scan.nextFloat(); 
        total=preco*qntd;
        if(qntd<=5){
            System.out.printf("Nome: %s \nTotal:%.2f \nDesconto:%.2f \nTotal a pagar:%.2f",desc,total,total*0.02,total-(total*0.02));
        }else if(qntd>5 & qntd<10){
            System.out.printf("Nome: %s \nTotal:%.2f \nDesconto:%.2f \nTotal a pagar:%.2f",desc,total,total*0.03,total-(total*0.03));
        }else if(qntd<10){
            System.out.printf("Nome: %s \nTotal:%.2f \nDesconto:%.2f \nTotal a pagar:%.2f",desc,total,total*0.05,total-(total*0.05));
        }
        */
        
        /* Questão 3
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[20];
        int ccont=0,dcont=0,upcont=0;
        for(int cont=0;cont<20;cont++){
            System.out.printf("Insira o numero %d°\n",cont+1);
            vet[cont]=scan.nextInt();
        }
        for(int cont=0;cont<20;cont++){
            if(vet[cont]<=100){
                ccont++;
            }else if(vet[cont]>101 & vet[cont]<200){
                dcont++;
            }else{
                upcont++;
            }
        }
        System.out.printf("Numeros abaixo de 100:%d\nNumeros entre 101 e 200: %d\nAcima de 200: %d\n",ccont,dcont,upcont);
        */
        
        /* Questão 4
        Scanner scan = new Scanner(System.in);
        int num,nun;
        System.out.printf("Insira o primeiro numero: ");
        num=scan.nextInt();
        while(num>0){
            nun=scan.nextInt();
            num=nun+num;
            if(nun<0){
                num=-1;
            }else{
                System.out.printf("Soma: %d\n",num);
            }
        }
        */
    }
}
