#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	//Quest�o 1
	/
	float reais;
	
	printf("Ol�..\nInsira a quantia de reais para a convers�o(D�lar 11/06/22):\n");
	scanf("%f",&reais);
	printf("Sua convers�o foi de %.2f",reais/5.12);
	/
	
	//Quest�o 2
	/
	int Num;
	
	printf("Ol�..\nInsira um n�mero:\n");
	scanf("%d",&Num);
	printf("Seu numero ao quadrado � %d",Num*Num);
	/
	
	//Quest�o 3
	/
	int base,halt;
	
	printf("Ol�..\nInsira a base:\n");
	scanf("%d",&base);
	printf("Insira o valor da altura\n");
	scanf("%d",&halt);
	system("cls");
	printf("Ol� novamente..\n O perimetro � de %d e a area � de %d",base+halt,base*halt);
	/
	
	//Quest�o 4
	/
	float raio;
	float pi = 3.14;
	
	printf("Ol�...\nInsira o raio da circunfer�ncia:\n");
	scanf("%f",&raio);
	system("cls");
	printf("Ol�...\nO perimetro dos valores informados foi de %.1f e sua area � de %.1f",(2*pi*raio),pi*(raio*raio));
	/
	
	//Quest�o 5
	/
	int Vmedia,temp,disPkm,ltcons;
	
	printf("Ol�...\nQual a velocidade media obtida na viagem ? (apenas km)\n");
	scanf("%d",&Vmedia);
	printf("Insira tamb�m o tempo da viagem (apenas horas)\n");
	scanf("%d",&temp);
	disPkm=temp*Vmedia;
	ltcons=disPkm/12;
	printf("Ol�...\nFoi utilizado um total de %d litros de gasolina",ltcons);
	/
}
