#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	//Questão 1 
	/
	printf("Olá Mundo");
	/
	
	//Questão 2
	/
	float valor1, valor2;
	
	printf("Escreva o primeiro valor:\n");
	scanf("%f", &valor1);
	printf("Escreva o segundo valor:\n");
	scanf("%f", &valor2);
	printf("A soma dos valores foi de %.1f",valor1+valor2); 
	/
	
	//Questão 3
	/
	float nota1,nota2,nota3;
	
	printf("Escreva sua primeira nota:\n");
	scanf("%f",&nota1);
	printf("Escreva sua segunda nota:\n");
	scanf("%f",&nota2);
	printf("Escreva sua terceira nota:\n");
	scanf("%f",&nota3);
	printf("Sua media é de %.1f",(nota1+nota2+nota3)/3);
	/
	
	//Questão 4
	/
	char nome[10];
	char local[20]="SenaiJacarecanga";
	int num;
	
	printf("Olá\n Insira seu nome:\n");
	scanf("%s",&nome);
	printf("Insira seu telefone:\n");
	scanf("%d",&num);
	printf("Seu cadastro foi concluido...\n nome: %s \nTelefone: %d \nLocalidade: %s",nome,num,local);
	/
}
