#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int opcao, diaria, diariatotal,formapag,formaparce,veiEsc,sair;

int desconto(){
	if(diariatotal>0){
		printf("\n Deseja pagar como?\n(1)A vista\t(2)Parcelado\n<");
		scanf("%d",&formapag);
		system("cls");
		if(formapag==1){
			if(diariatotal>1000){
				printf(" Sua compra teve um desconto de %15 e o total a ser pago passou para %.2f R$\n", 1.0*(diariatotal-(diariatotal*0.15)));system("pause");
			}else{
				printf(" Sua compra não possui desconto, continuara a ser cobrado um total de %.2f R$\n",1.0*diariatotal);system("pause");
			}
		}else if(formapag==2){
			printf("  Escolha em quantas vezes\n(1) 2x Sem juros\t(3) 8x 4%% de juros a cada parcela\n(2) 4x 2%% de juros a cada parcela\n<");
			scanf("%d",&formaparce);
			system("cls");
			if(formaparce==1){
				printf("\n A cada mês sera cobrado %.2f R$\n",1.0*diariatotal*0.5);system("pause");
			}else if(formaparce==2){
				printf("\n A cada mês sera cobrado %.2f R$\n",1.0*((diariatotal/4)+(diariatotal*0.02)));system("pause");
			}else if(formaparce==3){
				printf("\n A cada mês sera cobrado %.2f R$\n",1.0*((diariatotal/8)+(diariatotal*0.04)));system("pause");
			}else{
				printf("\n Forma invalida de pagamento");
			}
		}else{
			printf("\n Forma invalida de pagamento");
		}
	}
}

int escolhacarro2022(int a){
	if(a==1){
		veiEsc=80;
	}else if(a==2){
		veiEsc=100;
	}else if(a==3){
		veiEsc=140;
	}
	printf("\n  Valor Diária: %.2f\n Quantos dias de aluguel: ",1.0*veiEsc);
    scanf("%d", &diaria);
    if(diaria>=1){
 	   	diariatotal = veiEsc*diaria;
		system("cls"); printf("Valor total:%.2f R$", 1.0*diariatotal);
	}else{
		system("cls"); printf("Quantia de dias invalida, tente novamente");
	}
}

int escolhacarro2021(int a){
	if(a==1){
		veiEsc=90;
	}else if(a==2){
		veiEsc=85;
	}else if(a==3){
		veiEsc=95;
	}
	printf("\n  Valor Diária: %.2f\n Quantos dias de aluguel: ",1.0*veiEsc);
    scanf("%d", &diaria);
	if(diaria>=1){
 	   	diariatotal = veiEsc*diaria;
		system("cls"); printf("Valor total:%.2f R$", 1.0*diariatotal);
	}else{
		system("cls"); printf("Quantia de dias invalida, tente novamente");
	}
}

int escolhamoto2022(int a){
	if(a==1){
		veiEsc=85;
	}else if(a==2){
		veiEsc=50;
	}else if(a==3){
		veiEsc=65;
	}
	printf("\n  Valor Diária: %.2f\n Quantos dias de aluguel: ",1.0*veiEsc);
    scanf("%d", &diaria);
	if(diaria>=1){
 	   diariatotal = veiEsc*diaria;
		system("cls"); printf("Valor total:%.2f R$", 1.0*diariatotal);
	}else{
		system("cls"); printf("Quantia de dias invalida, tente novamente");
	}
}

int escolhamoto2021(int a){
	if(a==1){
		veiEsc=65;
	}else if(a==2){
		veiEsc=40;
	}else if(a==3){
		veiEsc=55;
	}
	printf("\n  Valor Diária: %.2f\n Quantos dias de aluguel: ",1.0*veiEsc);
    scanf("%d", &diaria);
	if(diaria>=1){
 	   diariatotal = veiEsc*diaria;
		system("cls"); printf("Valor total:%.2f R$", 1.0*diariatotal);
	}else{
		system("cls"); printf("Quantia de dias invalida, tente novamente");
	}
}

int main() {
    setlocale(LC_ALL, "Portuguese");
	
    while(sair==0){
   		printf("\n\tLOCADORA DE VEÍCULOS\n(1)Alugar Carros\t(2)Alugar Motos\n(3)Sair\n<");
    	scanf("%d", &opcao);
   		if(opcao>0 && opcao<=3){
  			switch(opcao){
        		case 1:
       		    	printf("\n\tCARROS\n  Escolha o ano do veículo\n(1)2022 \t(2)2021\n<");
            		scanf("%d", &opcao);
            		if(opcao>0 && opcao<3){
          				switch(opcao){
            	    		case 1:
                	    		printf("\n\tCARROS 2022\n(1)Alfa Romeo-Giulia\t 2)Bmw-M3\t(3)Subaru-Brz\n->");
                    			scanf("%d", &opcao);
               		  			if(opcao>0 && opcao<=3){
        	    					escolhacarro2022(opcao);
        	    					desconto();
        	    				}else{
        	    					system("cls"); printf("Opção invalida, Tente novamente");
								}
                			break;
   		 	    			case 2:
 	    	    				printf("\n\tCARROS 2021\n(1) Volkswagen Taos\t(2) Fiat-Argo\t (3) Jeep-Renegade\n<");
								scanf("%d", &opcao);
								if(opcao>0 && opcao<=3){
        	    					escolhacarro2021(opcao);
        	    					desconto();
        	    				}else{
        	    					system("cls"); printf("Opção invalida, Tente novamente");
								}
            				break; 
						}
					}else{
						system("cls"); printf("Ano invalida, Tente novamente");
					}
				break;
        		case 2:
        			printf("\n\tMOTOS\n  Escolha o ano do veículo\n(1)2022 \t(2)2021\n<");
            		scanf("%d", &opcao);
            		if(opcao>0 && opcao<3){
    	        		switch(opcao){
        	        		case 1:
            	        		printf("\n\tMOTOS 2022\n(1)Kawasaki Z900 R-Edition   2)Honda NC 750X\t(3)Yamaha MT-10\n->");
            	        		scanf("%d", &opcao);
                	    		if(opcao>0 && opcao<=3){
                   					escolhamoto2022(opcao);
                   					desconto();
           		     			}else{
                					system("cls"); printf("Opção invalida, Tente novamente");
								}
							break;
                			case 2:
                	    		printf("\n\tMOTOS 2021\n(1)Kawasaki Z900 2021\t(2)Honda ADV\t(3)Yamaha MT-03\n<");
                	    		scanf("%d", &opcao);
                	    		if(opcao>0 && opcao<=3){
                	   				escolhamoto2021(opcao);
                	   				desconto();
                				}else{
                					system("cls"); printf("Opção invalida, Tente novamente");
								}
                			break; 
						}
					}else{
						system("cls"); printf("Ano invalida, Tente novamente");
					}
				break;
				case 3:
					system("cls"); printf("Até logo");
					sair=1;
				break;
				default:
					system("cls"); printf("Opção invalida, tente novamente");
			}
		}else{
			system("cls"); printf("Opção invalida, tente novamente");
		}
	}
}
