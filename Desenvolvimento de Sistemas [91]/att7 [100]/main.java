package Quest;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int op=0;
        int confirm=0;
        Agenda agend1 = new Agenda();
        Contatos[] conts = new Contatos[3];
        while(op!=3){
            System.out.printf("Menu\n(1) Insira os dadados (2) Ver todos os dados (>3) sair\n");
            op=scan.nextInt();
            if(op==1){
                System.out.printf("Insira o nome da agenda:");
                String tit=scan.next();
                agend1.setNome(tit);
                for(int i=0;i<conts.length;i++){
                    Contatos co = new Contatos();
                    System.out.println("Insira o nome do "+(i+1)+"º contato:");
                    String nome=scan.next();
                    System.out.println("Insira o numero do "+(i+1)+"º contato:");
                    String num=scan.next();
                    System.out.println("Insira o email do "+(i+1)+"º contato:");
                    String email=scan.next();
                    co.setNome(nome);
                    co.setEmail(email);
                    co.setNumero(num);
                    conts[i]=co;
                }
                agend1.setContato(conts);
                confirm=1;
            }else if(op==2){
                if(confirm==1){
                    agend1.ToString();
                }else if(confirm==0){
                    System.out.printf("\nPrimeiro insira os dados\n\n");
                }else{op=3;}
            }
        }
    }
}    
