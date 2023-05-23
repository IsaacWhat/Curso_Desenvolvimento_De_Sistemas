programa {
    inclua biblioteca Texto
	funcao inicio() {
	cadeia nome
	caracter sexo
	inteiro idade, contador = 1
	
	enquanto(contador<=20){
	    escreva("\nOlá individuo ",contador,"\nDigite seu nome\n<")
	    leia(nome)
	    escreva("Digite sua idade:\n<")
	    leia(idade)
	    escreva("Digite seu sexo: (M ou F)\n<")
	    leia(sexo)
	    se(idade>21 e sexo == 'M')
	        escreva("\b ",nome," \b\n")
	    contador++
	    }
	}
}