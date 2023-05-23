package att11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        int cont=0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Float> contas = new ArrayList<Float>();
        System.out.printf("Quantas contas serão implementadas: ");
        cont = scan.nextInt();
        Conta[] conta = new Conta[cont];
        
        
        for(int i=0;i<conta.length;i++){
            System.out.print("Insira o saldo da conta "+(i+1)+"º: ");
            float saldos=scan.nextFloat();
            //conta[i].setSaldo(saldos);
            contas.add(saldos);
        }
        
        Collections.sort(contas, Collections.reverseOrder());
        for(float a: contas){
            System.out.print(a+"\n");
        }
    }
}
