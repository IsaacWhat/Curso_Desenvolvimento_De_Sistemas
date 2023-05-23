#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL,"Portuguese");
	
	int fechar=1,opcao,confirm=0;
	int alunos;
	float notas[100][4];
	
	while(fechar==1){
		printf("\n  ==Sistema de notas da Escola Jesuítas==\n");
		printf(" [1]Inserir notas\t[3]Calcular média\n [2]Visualizar notas\t[4]Sair\n<");
		scanf("%d",&opcao);
		switch(opcao){
			case 1:
				system("cls");
				printf("Você escolheu [Inserir notas]\n Quantos alunos há na sala ?\n<");
				scanf("%d",&alunos);
				for(int i=0;i<alunos;i++){
					for(int j=0;j<4;j++){
						printf("  Insira a nota %dº do %dº aluno: ",j+1,i+1);
						scanf("%f", &notas[i][j]);
						if(notas[i][j]<4.0){
							notas[i][j]=0.0;
						}
					}
				}
				confirm=1;
				system("cls");
				break;
			case 2:
			system("cls");
			if(confirm==1){
				printf("Você escolheu [Visualizar notas]");
				for(int i=0;i<alunos;i++){
					printf("\n Aluno %dº",i+1); 
					for(int j=0;j<4;j++){
						printf(" | %.1f |",notas[i][j]);
					}
				}
				printf("\n\n");
				system("pause");
				system("cls");
			}else{
				printf("**Insira primeiro as notas**");
			}
				break;
			case 3:
				system("cls");
				if(confirm==1){
				printf("Você escolheu [Calcular média]");
				for(int i=0;i<alunos;i++){
					printf("\n Aluno %dº",i+1);
						printf(" |  %.1f  | ",(notas[i][0]+notas[i][0+1]+notas[i][0+1]+notas[i][0+1])/4);
					}
					printf("\n\n");
					system("pause");
					system("cls");
				}else{
					printf("**Insira primeiro as notas**");
					}
				break;
			case 4:
				system("cls");
				printf("\n Adeus :(");
				fechar=0;
				break;
			default: 
				system("cls");
				printf("**Opção invalida, tente novamente**");
		}
	}
}


