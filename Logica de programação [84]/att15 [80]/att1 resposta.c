#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	setlocale(LC_ALL, "Portuguese");
	int menup=1,opcao, peso1, peso2, peso3;
	float nota1, nota2, nota3;

	while(menup<3 && menup>0){
		system("cls");
		printf("\n Bem-vindo ao menu..\n [1]Média Aritmétrica\t[2]Média ponderada\n [3]Sair\n<");
		scanf("%d",&menup);
		system("cls");
		switch(menup){
			case 1 :
				opcao=0;
				printf("\n Você escolheu a opção Média aritmétrica\n");
				while(opcao!=2){
					printf("\n  Insira a primeira nota: ");
					scanf("%f",&nota1);
					printf("  Insira a segunda nota: ");
					scanf("%f",&nota2);
					printf(" Sua média é %.1f\n",(nota1+nota2)/2);
					printf("\nDeseja tentar novamente ?\n[1]Sim\t[2]Não\n<");
					scanf("%d",&opcao);
				break;
			case 2 :
				opcao=0;
				printf("\n Você escolheu a opção Média ponderada\n");
				while(opcao!=2){
					printf("\n   Digite a primeira nota: ");
					scanf("%f", &nota1);
					printf("Digite o peso da primeira nota: ");
					scanf("%d", &peso1);
					printf("\nDigite a segunda nota: ");
					scanf("%f", &nota2);
					printf("Digite o peso da segunda nota: ");
					scanf("%d", &peso2);
					printf("\nDigite a terceira nota: ");
					scanf("%f", &nota3);
					printf("Digite o peso da terceira nota: ");
					scanf("%d", &peso3);
					printf("\nA media ponderada é %.2f\n",((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3));
					printf("\nDeseja tentar novamente ?\n[1]Sim\t[2]Não\n<");
					scanf("%d",&opcao);
				break;
			default:
				printf("Adeus :(");
		}
	}
}
}
}
