#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	
			// Quest�o 1
	/*
	int num[10],pares=0;
	
	for(int i=0;i<10;i++){
		printf("Insira o %d� valor\n<",i+1);
		scanf("%d",&num[i]);
		if(num[i]%2==0)
			pares++;
	}
	printf("No total teve %d pares",pares);
	*/
	
			// Quest�o 2
	/*
	int num[10],Mnum,Menum;
	
	printf("Insira o 1� valor\n<");
	scanf("%d",&num[0]);
	Mnum=num[0];
	Menum=num[0];
	
	for(int i=0;i<10;i++){
		printf("Insira o %d� valor\n<",i+1);
		scanf("%d",&num[i]);
		
		if(num[i]>Mnum)
			Mnum=num[i];
		else if(num[i]<Menum)
			Menum=num[i];
		}
		printf("\n Seu maior valor � de %d e a menor de %d.",Mnum,Menum);
	*/
	
			// Quest�o 3
	/*
	int numa[10],numb[10],numc[10];
	int somaa,somab,somac;
	
	for(int i=0;i<10;i++){
		printf("Insira de A-%d� valor\n<",i+1);
		scanf("%d",&numa[i]);
	}
	system("cls");
	for(int i=0;i<10;i++){
		printf("Insira de B-%d� valor\n<",i+1);
		scanf("%d",&numb[i]);
	}
	system("cls");
	for(int i=0;i<10;i++){
		printf("C-%d� = %d + %d = %d\n",i+1,numa[i],numb[i],numa[i]+numb[i]);
		numc[i]=numa[i]+numb[i];
	}
	*/
	
			// Quest�o 4
	/*
	int valor[100];
	
	printf("N�meros n�o divisores de 7 ate 100\n");
	for(int i=0;i<100;i++){
		valor[i]=i;
		if(valor[i]%7!=0)
			printf(" %d ",valor[i]);
	}
	*/
}
