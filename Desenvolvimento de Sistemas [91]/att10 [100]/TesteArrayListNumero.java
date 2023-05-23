package att10;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteArrayListNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<10;i++){
            System.out.print("Insira o"+(i+1)+"º Número ");
            int numdig = scan.nextInt();
            num.add(numdig);
            if(numdig==10 || numdig==100 || numdig==1000){
                System.out.println("O numero escohido lhe deu um bonus de R$ 50,00.");
            }
        }
    }
    
}
