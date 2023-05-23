package Att5;
import java.util.Scanner;
public class DateTest {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Date dat1 = new Date();
        int c=0,v=0,b=0;
        while(c!=1){
            System.out.printf("Insira o dia: ");
            int o = scan.nextInt();
            dat1.Setdia(o);
            if(o<=30 && o>=1){
                c=1;
            }else{
                System.out.printf("\nTente novamente"); }
        }
         while(v!=1){
            System.out.printf("Insira o mes: ");
            int i = scan.nextInt();
            dat1.Setmes(i);
            if(i<=12 && i>=1){
                v=1;
            }else{
                System.out.printf("\nTente novamente"); }
        }
          while(b!=1){
            System.out.printf("Insira o ano: ");
            int u = scan.nextInt();
            dat1.Setano(u);
            if(u<=2022 && u>=1){
                b=1;
            }else{
                System.out.printf("\nTente novamente"); }
        }
        dat1.displayDate();
        
    }
}
