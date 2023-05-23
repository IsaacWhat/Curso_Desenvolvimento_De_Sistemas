package Att5;
import java.util.Scanner;
public class Date {
    Scanner scan=new Scanner(System.in);
    private int mes;
    private int dia;
    private int ano;
    
    public Date(){
        
    }
    public void Date(int dia,int mes,int ano){
        this.dia=dia;
        this.ano=ano;
        this.mes=mes;
    }
    public int Getmes(){ return this.mes; }
    public void Setmes(int mes){ this.mes=mes; }
    public int Getdia(){ return this.dia; }
    public void Setdia(int dia){ this.dia=dia; }
    public int Getano(){ return this.ano; }
    public void Setano(int ano){ this.ano=ano; }
    
    public void displayDate(){
        System.out.print(this.dia+"/"+this.mes+"/"+this.ano);
    }
    public void validar(){
        int c=0,v=0,b=0;
        while(c!=1){
            System.out.printf("Insira o dia: ");
            int o = scan.nextInt();
            if(o<=30 && o>=1){
                c=1;
            }else{
                System.out.printf("\nTente novamente"); }
        }
         while(v!=1){
            System.out.printf("Insira o mes: ");
            int i = scan.nextInt();
            if(i<=12 && i>=1){
                v=1;
            }else{
                System.out.printf("\nTente novamente"); }
        }
          while(b!=1){
            System.out.printf("Insira o ano: ");
            int u = scan.nextInt();
            if(u<=2022 && u>=1){
                b=1;
            }else{
                System.out.printf("\nTente novamente"); }
        }
    }
}
