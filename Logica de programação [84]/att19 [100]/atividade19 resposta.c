#include <stdlib.h>
#include <locale.h>
#include <stdio.h>

int main() {
    setlocale(LC_ALL, "Portuguese");
    
    // Questão 1
    
    
    
    int A[10][10];
    
    for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(i==j){
				A[i][j]=((3*i)+(3*i))-1;
			}else if(i<j){
				A[i][j]=((2*i)+(7*j))-2;
			}else if(i>j){
				A[i][j]=((4*i)+(4*i)+(4*i))+((5*j)+(5*j))+1;
			} 
    	}
    }
    for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			printf(" |%d|\t",A[i][j]);
    	}
    	printf("\n");
	}
}
	
	
    // Questão 2
    
	
	
    int matriz[5][5],somaNPS=0;

    for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			printf("Digite o valor da matriz[%d][%d]",i,j);
			scanf("%d",&matriz[i][j]);
		}
	}
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(i==j || i+j==4){}
			else{
				somaNPS+=matriz[i][j];
			}
		}
	}
	printf("A soma dos valores fora da diagonal principal e secundaria foi de : %d",somaNPS);
}
	

	//	Questão 3
	
	
	int matriz[5][5],somaPS=0,somaNPS=0;

    for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			printf("Digite o valor da matriz[%d][%d]",i,j);
			scanf("%d",&matriz[i][j]);
		}
	}
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(i==j || i+j==4){
				somaPS+=matriz[i][j];
			}else{
				somaNPS+=matriz[i][j];
			}
			}
		}
	printf("\n\nA soma dos valores dentro da diagonal principal ou secundaria foi de %d\n",somaPS);
	printf("A soma dos valores fora da diagonal principal e secundaria foi de : %d",somaNPS);
}


