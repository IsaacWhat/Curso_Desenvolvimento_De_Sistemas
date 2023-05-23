#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	int menup=1,sal,meses,opcao;

	while(menup<4 && menup>0){
		printf("\n Bem-vindo ao menu..\n  [1]Novo salário\t[2]Férias\n  [3]Décimo terceiro\t[4]Sair\n<");
		scanf("%d",&menup);
		system("cls");
		
		switch(menup){
			case 1 :
				opcao=0;
				printf("\n Você escolheu a opção [Novo salário]\n");
				while(opcao!=2){
					printf("\n   Insira o seu salario atual:\n<");
					scanf("%d",&sal);
					system("cls");
					if(sal<=350){
						printf(" O seu novo salario é de %.2f \n",1.0*sal+(sal*0.15));
					}else if(sal>350 && sal<=600){
						printf(" O seu novo salario é de %.2f \n",1.0*sal+(sal*0.10));
					}else{
						printf(" O seu novo salario é de %.2f \n",1.0*sal+(sal*0.05));
					}
						printf("\nDeseja tentar novamente ?\n[1]Sim\t[2]Não\n<");
						scanf("%d",&opcao);
				}
				break;
			case 2 :
				opcao=0;
				printf("\n Você escolheu a opção [Férias]\n");
				while(opcao!=2){
					printf("\n   Insira o seu salario bruto atual:\n<");
					scanf("%d",&sal);
					system("cls");
					printf(" O seu salario de férias é de %.2f \n",1.0*sal+(sal/3));
					printf("\nDeseja tentar novamente ?\n[1]Sim\t[2]Não\n<");
					scanf("%d",&opcao);
				}
				break;
			case 3 :
				opcao=0;
				printf("\n Você escolheu a opção [Décimo terceiro]\n");
				while(opcao!=2){
					printf("\n   Insira o seu salario bruto atual:\n<");
					scanf("%d",&sal);
					printf(" Insira a quantia de meses trabalhados:\n<");
					scanf("%d",&meses);
					system("cls");
					if(meses<=12 && meses>0){
						printf(" O seu décimo terceiro é de %.2f \n",1.0*((sal*meses)/12));
					}else
						printf(" Meses invalidos");
					printf("\nDeseja tentar novamente ?\n[1]Sim\t[2]Não\n<");
					scanf("%d",&opcao);
				}
			break;
			default :
				printf("Adeus :(");
		}
	}
}
