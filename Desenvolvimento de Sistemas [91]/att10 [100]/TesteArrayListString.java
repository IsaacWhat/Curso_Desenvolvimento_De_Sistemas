package att10;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteArrayListString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> lista1 = new ArrayList<>();
        ArrayList <String> lista2 = new ArrayList<>();

        for(int i=0;i<10;i++){
            System.out.printf("String n"+ (i+1)+": ");
            String string = scan.nextLine();
            lista1.add(string);
            if(string.length()<3){
                lista2.add(string);}
            lista1.removeAll(lista2);
        }
        System.out.println("Strings da lista 1 ");
        for(String o : lista1){
           
            System.out.print(" | "+o);
        }
        System.out.print(" |\n");
    }
}
