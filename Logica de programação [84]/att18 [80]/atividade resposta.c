#include <stdlib.h>
#include <locale.h>
#include <stdio.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

	// quest�o 1


    int matriz[5][5];

    for(int i=0;i<5;i++){
    	for(int a=0;a<5;a++){
			if(i==a){
				matriz[i][a]=1;
			}else{
				matriz[i][a]=0;
			}
		}
	}
	for(int o=0;o<5;o++){
		for(int p=0;p<5;p++){
			printf(" %d ",matriz[o][p]);
		}
		printf("\n");
	}
}


	// quest�o 2


    int matriz[4][4],matrizResult=0;

    for(int i=0;i<4;i++){
    	for(int a=0;a<4;a++){
			printf("Digite o valor de mat [%d] [%d]: ", i,a);
			scanf("%d", &matriz[i][a]);
    	}
    }
    for(int o=0;o<4;o++){
		for(int p=0;p<4;p++){
			if(matriz[o][p]>10){
				matrizResult++;
			}
		}
	}
	system("cls");
	 printf("No total obtiveste [%d] n�meros acima de 10",matrizResult);
	}


	// quest�o 3


    int matriz[3][3],matrizResult=0;

	for(int i=0;i<3;i++){
    	for(int a=0;a<3;a++){
			printf("Digite o valor de mat [%d] [%d]: ", i,a);
			scanf("%d", &matriz[i][a]);
		}
	}

    for(int i=0;i<3;i++){
    	for(int a=0;a<3;a++){
			if(i==a){
				matrizResult+=matriz[i][a];
			}
		}
	}
	printf("A soma total da diagonal principal foi %d",matrizResult);
}

    // quest�o 4


	int matriz[3][3],matrizResult;

	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("Digite o valor de matriz [%d] [%d] ",i,j);
			scanf("%d",&matriz[i][j]);
		}
	}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(i+j==2){
				matrizResult+=matriz[i][j];
			}
		}
	}
 printf("A soma da diagonal secundaria � de %d",matrizResult);
}


