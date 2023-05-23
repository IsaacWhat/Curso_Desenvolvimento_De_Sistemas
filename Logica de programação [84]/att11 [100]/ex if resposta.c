#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	// Questão 1
	
	int num;
	
	printf("Olá...\nInsira um numero:\n<");
	scanf("%d",&num);
	
	if(num%3==0)
		printf("É múltiplo de 3");
	else
		printf("Não é múltiplo de 3");
	
	
	// Questão 2
	
	int val1,val2,soma;
	
	printf("Olá...\nInsira o primeiro numero:\n<");
	scanf("%d",&val1);
	printf("Insira o segundo numero:\n<");
	scanf("%d",&val2);
	soma=val1+val2;
	
	if(soma<=20)
		printf("A soma dos numeros foi abaixo de 21 por isso sera subtraido 5 de sua soma e tera o resultado de %d",soma-5);
	else
		printf("A soma dos numeros foi maior que 20 por isso sera adicionado +8 na sua soma e tera o resultado de %d",soma+8);
	
	
	// Questão 3
	
	int val1,val2;
	
	printf("Olá..\nInsira o primeiro numero:\n<");
	scanf("%d",&val1);
	printf("Insira o segundo numero:\n<");
	scanf("%d",&val2);
	
	if(val1+val2>=10)
		printf("A soma dos valores foi o incrivel %d",val1+val2);
	else
		system("cls");
		printf(":(");
	
	
	// Questão 4
	
	int num;
	
	printf("Olá...\nInsira um numero:\n<");
	scanf("%d",&num);
	
	if(num%5==0)
		printf("O numero inserido é multiplo de 5");
	else
		printf("O numero inserido não é multiplo de 5");
	
	
	// Questão 5
	
	int num;
	
	printf("Olá...\nInsira um valor\n<");
	scanf("%d",&num);
	
	if(num%3==0 && num%7==0){
		printf("O seu numero é divisivel por 3 e 7");
	}else if(num%3==0){
		printf("O seu numero é divisivel por 3, mas não é divisivel por 7");
	}else if(num%7==0){
		printf("O seu numero é divisivel por 7, mas não é divisivel por 3");
	}else
		printf("O seu numero não é divisivel por 3 e nem por 5");
	
	
}
