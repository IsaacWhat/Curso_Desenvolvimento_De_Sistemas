package atts;
import java.util.ArrayList;
import java.util.Scanner;
public class CadastroPessoas{
    ArrayList<Pessoa> cadastros = new ArrayList<>();
    private int qtdAtual;

    public CadastroPessoas(){}
    public CadastroPessoas(int qtdAtual) {this.qtdAtual = qtdAtual;}

    public int getQtdAtual() {return qtdAtual;}
    public void setQtdAtual(int qtdAtual) {this.qtdAtual = qtdAtual;}

    public void cadastrarPessoa(Pessoa ps){
        cadastros.add(ps);
        qtdAtual++;
    }

    public void imprimeCadastro(){
        for(Pessoa p : cadastros){
            System.out.println(p.imprimeDados());
        }
    }
}
