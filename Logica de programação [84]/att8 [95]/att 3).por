programa {
	funcao inicio() {
		inteiro contP = 0,contI= 0, num, cont=0
		
		para(inteiro contT=1;contT<=10;contT++){
		    escreva("escreva o numero ",contT,":\n<")
		    leia(num)
	        	se(num%2==0){
		           contP++
	        	}senao{
	        	    contI++
	            	}
		}
	escreva("Num total foram ",contP," Pares e ",contI," Impares")
}
}