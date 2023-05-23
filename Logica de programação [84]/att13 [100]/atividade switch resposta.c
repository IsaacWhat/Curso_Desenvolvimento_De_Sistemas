#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <ctype.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	// Questão 1
	/*
	int percurso, opcao;
	
	printf("Olá...\n Bem-vindo ao gasolinometro.\n  Insira a quantia de km do percurso e irei lhe informar a quantia gasta de gasolina:\n<");
	scanf("%d",&percurso);
	printf("\n   Insira também o tipo de veiculo: \n [1] Tipo A =12km por litro \t[3] Tipo C = 8km por litro\n [2] Tipo B = 9km por litro\n<");
	scanf("%d",&opcao);

	switch(opcao){
		case 1:
			printf("\n Como seu carro consome 1 litro a cada 12km, teve um total de gasto em gasolinda de %d litros",percurso*12);
		  break;
		case 2:
			printf("\n Como seu carro consome 1 litro a cada 9km, teve um total de gasto em gasolinda de %d litros",percurso*9);
		  break;
		case 3:
			printf("\n Como seu carro consome 1 litro a cada 8km, teve um total de gasto em gasolinda de %d litros",percurso*8);
		  break;
		default:
			printf(" Tipo de veiculo invalido, tente novamente");
		  break;
	}
	*/
	// Questão 2 unica forma de avançar foi esssa
	/*
	int trocar;
	char letra;
	
	printf("Olá...\n Bem-vindo ao troca letra.\n  Insira uma letra a ser trocada:\n<");
	scanf("%c",&letra);
	printf("\n  Deseja trocar ela para:\n [1]Maiscúla\t[2]Minuscula\n<");
	scanf("%d",&trocar);
	switch(trocar){
		case 1:
			letra = toupper(letra);
			printf("\n Maiuscula: %c \n", letra);
		  break;
		case 2:
			letra = tolower(letra);
			printf("\n Minuscula: %c \n", letra);
		  break;
	}
	*/
	// Questão 3
	int pratoopcao,sobremesaopcao,bebidaopcao;
	
	printf("Olá..\n Bem-vindo.\n  Irei informar a quantia total de calorias com base nas refeições selecionadas\n   Primeiro escolha o Prato principal:\n [1]Vegetariano\t [3]Frango\n [2]Peixe\t [4]Carne\n<");
	scanf("%d",&pratoopcao);
	switch(pratoopcao){
		case 1: pratoopcao=180;
			break;
		case 2: pratoopcao=230;		
			break;
		case 3: pratoopcao=250;
			break;
		case 4: pratoopcao=350;
		}
	printf("  Agora escolha a sobremesa\n [1]Mousse diet\t [3]Abacaxi\n [2]Sorvete diet [4]Mousse chocolate\n<");
	scanf("%d",&sobremesaopcao);
	switch(sobremesaopcao){
		case 1: sobremesaopcao=170;
		break;
		case 2: sobremesaopcao=110;
		break;
		case 3: sobremesaopcao=75;
		break;
		case 4: sobremesaopcao=200;
		break;
	}
	printf("  Agora escolha a bebida\n [1]Suco de melão \t[3]Chá\n [2]Suco de laranja\t[4]Refrigerante diet\n<");
	scanf("%d",&bebidaopcao);
	switch(bebidaopcao){
		case 1: bebidaopcao=100;
		break;
		case 2: bebidaopcao=70;
		break;
		case 3: bebidaopcao=20;
		break;
		case 4: bebidaopcao=65;
		break;
	}
	printf("Sua refeição teve um total de %d calorias",pratoopcao+sobremesaopcao+bebidaopcao);
}
