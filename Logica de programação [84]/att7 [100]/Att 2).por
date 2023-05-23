programa {
    inclua biblioteca Texto
	funcao inicio() {
		inteiro salario
		real presta
		cadeia resp = "SIM"
		
		enquanto(resp=="SIM"){
		escreva("Olá...\nInforme seu salario:\n")
		leia(salario)
		escreva("Insira o valor da prestação:\n")
		leia(presta)
	    
	    se(presta>=salario*0.3){
	        escreva("Emprestimo Negado, pois o maximo é de  ",salario*0.3)
	    }senao{
	        escreva("Emprestimo aceita")}
	    
	    escreva("\n\tDeseja tentar novamente? (SIM ou NÃo)\n")
	    leia(resp)
	    limpa()
	  
	    resp=Texto.caixa_alta (resp)
	}
}
}
