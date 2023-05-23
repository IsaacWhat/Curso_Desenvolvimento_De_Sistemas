#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	//Questão 1
	/
	float reais;
	
	printf("Olá..\nInsira a quantia de reais para a conversão(Dólar 11/06/22):\n");
	scanf("%f",&reais);
	printf("Sua conversão foi de %.2f",reais/5.12);
	/
	
	//Questão 2
	/
	int Num;
	
	printf("Olá..\nInsira um número:\n");
	scanf("%d",&Num);
	printf("Seu numero ao quadrado é %d",Num*Num);
	/
	
	//Questão 3
	/
	int base,halt;
	
	printf("Olá..\nInsira a base:\n");
	scanf("%d",&base);
	printf("Insira o valor da altura\n");
	scanf("%d",&halt);
	system("cls");
	printf("Olá novamente..\n O perimetro é de %d e a area é de %d",base+halt,base*halt);
	/
	
	//Questão 4
	/
	float raio;
	float pi = 3.14;
	
	printf("Olá...\nInsira o raio da circunferência:\n");
	scanf("%f",&raio);
	system("cls");
	printf("Olá...\nO perimetro dos valores informados foi de %.1f e sua area é de %.1f",(2*pi*raio),pi*(raio*raio));
	/
	
	//Questão 5
	/
	int Vmedia,temp,disPkm,ltcons;
	
	printf("Olá...\nQual a velocidade media obtida na viagem ? (apenas km)\n");
	scanf("%d",&Vmedia);
	printf("Insira também o tempo da viagem (apenas horas)\n");
	scanf("%d",&temp);
	disPkm=temp*Vmedia;
	ltcons=disPkm/12;
	printf("Olá...\nFoi utilizado um total de %d litros de gasolina",ltcons);
	/
}
