package Att12;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Soma som = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao  mult = new Multiplicacao();
        Divisao div = new Divisao();
        int op=0;
        
        while(op<5){
            System.out.println("\nMenu Calculadora\n(1)Soma\t (3)Multiplicação\n(2)Subtração  (4)Divisão\n(>5)Sair");
            op=scan.nextInt();
            switch(op){
                case 1:
                    System.out.printf("Insira o primeiro valor: ");
                    int num1=scan.nextInt();
                    System.out.printf("Insia o segundo valor: ");
                    int num2=scan.nextInt();
                    System.out.printf("\n=======================================\nA soma dos valores inseridos é "+som.calcula(num1, num2)+"\n=======================================\n");
                    break;
                case 2:
                    System.out.printf("Insira o primeiro valor: ");
                    int num3=scan.nextInt();
                    System.out.printf("Insia o segundo valor: ");
                    int num4=scan.nextInt();
                    System.out.printf("\n=======================================\nA subtração dos valores inseridos é "+sub.calcula(num3, num4)+"\n=======================================\n");
                    break;
                case 3:
                    System.out.printf("Insira o primeiro valor: ");
                    int num5=scan.nextInt();
                    System.out.printf("Insia o segundo valor: ");
                    int num6=scan.nextInt();
                    System.out.printf("\n=======================================\nA multiplicação dos valores inseridos é "+mult.calcula(num5, num6)+"\n=======================================\n");
                    break;
                case 4:
                    System.out.printf("Insira o primeiro valor: ");
                    int num7=scan.nextInt();
                    System.out.printf("Insia o segundo valor: ");
                    int num8=scan.nextInt();
                    System.out.printf("\n=======================================\nA divisão dos valores inseridos é "+div.calcula(num7, num8)+"\n=======================================\n");
                    break;
            }
       }
    }
}
