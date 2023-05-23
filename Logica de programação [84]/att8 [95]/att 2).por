programa {
	funcao inicio() {
		inteiro calc, num
		
		escreva("Digite o valor entre 1 e 10 para a tabuada:\n<")
		leia(num)
		
		se(num>0 e num<=10){
	    	para(calc=1;calc<=10;calc++){
		    escreva(num," x ",calc," = ",num*calc,"\n")
		}
		}senao{
		    escreva("Numero invalido, tente novamente")
		}
	}
}