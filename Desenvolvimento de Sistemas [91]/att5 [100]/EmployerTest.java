package Att5;
import java.util.Scanner;
public class EmployerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Employer empregado1 = new Employer();
        Employer empregado2 = new Employer();
        int op=0;
        while(op!=3){
            System.out.printf("    Menu employer\n(1)Set/Get  (2)Exibir salario\n");
            op=scan.nextInt();
            if(op==1){
                System.out.printf("Insira o nome do primeiro empregado:\n");
                String nome1=scan.next();
                empregado1.Setnome(nome1);
                System.out.printf("Insira o sobrenome do primeiro empregado:\n");
                String sobrenome1=scan.next();
                empregado1.Setsobrenome(sobrenome1);
                System.out.printf("Insira o salario do primeiro empregado:\n");
                double salario1=scan.nextDouble();
                empregado1.Setsalario(salario1);
                System.out.printf("Insira o nome do segundo empregado:\n");
                String nome2=scan.next();
                empregado2.Setnome(nome2);
                System.out.printf("Insira o sobrenome do segundo empregado:\n");
                String sobrenome2=scan.next();
                empregado2.Setsobrenome(sobrenome2);
                System.out.printf("Insira o salario do segundo empregado:\n");
                double salario2=scan.nextDouble();
                empregado2.Setsalario(salario2);
                System.out.printf("Mostrar gets?\n(1)Sim (>2)Não\n");
                int p = scan.nextInt();
                if(p==1){
                    System.out.print("\n  Primeiro Funcionario\nNome: "+empregado1.Getnome()+"\nSobrenome: "+empregado1.Getsobrenome()+"\nSalario: "+empregado1.Getsalario()+"\n  Segundo Empregado\nNome: "+empregado2.Getnome()+"\nSobrenome: "+empregado2.Getsobrenome()+"\nSalario: "+empregado2.Getsalario());
                }
        }else if(op==2){
            empregado1.salanual();
            empregado2.salanual();
            System.out.printf("Aplicar desconto?\n(1)sim (>2)não\n");
            int y = scan.nextInt();
            if(y==1){
                empregado1.salanualdesc();
                empregado2.salanualdesc();
            }
        }
    }
}
}
