#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	setlocale(LC_ALL, "Portuguese");

	// Quest�o 1
/*
	int soma,cont=1;

	for(cont>=1;cont<500;cont++){
		if(cont%2==1 && cont%3==0){
			soma+=cont;
		}
	}
	printf("A soma dos numeros �mpares e multiplos de 3 deram %d",soma);
/*

	// Quest�o 2
/*
	int cont=2;
	float altura,alturaMaior,alturaMenor;

	printf("Insira a altura da 1� pessoa\n");
	scanf("%f",&altura);
	alturaMaior=altura;
	alturaMenor=altura;
	for(cont<=2;cont<=15;cont++){
		printf("Insira a altura da %d� pessoa\n",cont);
		scanf("%f",&altura);
		if(altura>alturaMaior){
			alturaMaior=altura;}
		if(altura<alturaMenor){
			alturaMenor=altura;}
	}
	printf(" A maior pessoa do grupo � a de %.2f cm\n  A menor pessoa do grupo � a de %.2f cm",alturaMaior,alturaMenor);
*/

	// Quest�o 3
/*
	int cont = 100;

	printf("Numeros impares de 100 a 200:\n");
	for(cont>=100;cont<=200;cont++){
		if(cont%2==1){
			printf("%d, ",cont);
		}
	}
*/

	// Quest�o 4
/*
	int num,soma=1;

	printf("Ol�...\nEscolha um numero:\n");
	scanf("%d",&num);

	for(;num>=1;num--){
		soma*=num;
		if(num<=1){
			printf(" %d = %d",num,soma);
		}else{
		printf(" %d X",num);
		}
	}
*/

	// Quest�o 5
/*
	int cont=0,num,soma;

	printf("Ol�...\nEscolha um n�mero dentre 1 e 10\n<");
	scanf("%d",&num);
	if(num<=10 & num>=1){
		printf("\nTabuada de %d\n",num);
		for(cont>=0;cont<=10;cont++){
			soma=cont*num;
			printf(" %d x %d = %d\n",cont,num,soma);
		}
	}else{
		printf("N�mero invalido, tente novamente");
	}
*/

	// Quest�o 6
/*
	int cont=2;
	float valor,valMaior=valor,valMenor=valor;

	printf("Insira o 1� valor real:\n");
	scanf("%f",&valor);
	valMaior=valor;
	valMenor=valor;
	for(cont>=2;cont<=15;cont++){
		printf("Insira o %d� valor real:\n",cont);
		scanf("%f",&valor);
		if(valor>valMaior){
			valMaior=valor;
			}
		if(valor<valMenor){
			valMenor=valor;
			}
	}
	printf("O maior numero dos valores foi %.1f\n O menor foi o valor %.1f",valMaior,valMenor);
*/
}
