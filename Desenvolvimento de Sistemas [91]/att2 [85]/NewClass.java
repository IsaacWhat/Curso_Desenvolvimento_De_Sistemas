package attnet12;
import java.util.Scanner;
public class NewClass {
    public static void countBy(int x,int y){
        int cont[]= new int[y];
        int n=x;
        for(int i=0;i<y;i++){
            if(n%x==0){
               cont[i]=n;
            }
            n+=x;
        }
        for(int i=0;i<y;i++){
           System.out.printf("%d ",cont[i]);
        }
}
    public static void mes(int l){
        if(l<=3){
            System.out.printf("\no mes escolhido faz parte do 1° trimestre");
        }else if(l<=6){
            System.out.printf("\no mes escolhido faz parte do 2° trimestre");
        }else if(l<=9){
            System.out.printf("\no mes escolhido faz parte do 3° trimestre");
        }else if(l<=12){
            System.out.printf("\no mes escolhido faz parte do 4° trimestre");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        countBy(2,5);
        mes(3);
        mes(6);
        mes(11);
    }
}
