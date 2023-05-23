package Att13;
import java.util.Scanner;
import java.util.ArrayList;
public class teste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Automovel auto = new Automovel();
        Bicicleta bike = new Bicicleta();
        ArrayList<Automovel> autolist = new ArrayList<Automovel>();
        System.out.println("oque deseja adicionar \n(1)Automovel (2)Bicicleta");
        int escolhe = scan.nextInt();
        switch(escolhe){
            case 1:
                System.out.println("\n\nAdjust\n");
                auto.adjust();
                System.out.println("\n\nCheckList\n");
                auto.checklist();
                System.out.println("\n\nCleanup\n");
                auto.cleanup();
            break;
            case 2:
                System.out.println("\n\nAdjust\n");
                bike.adjust();
                System.out.println("\n\nCheckList\n");
                bike.checklist();
                System.out.println("\n\nCleanup\n");
                bike.cleanup();
            break;
        }
    }
}
