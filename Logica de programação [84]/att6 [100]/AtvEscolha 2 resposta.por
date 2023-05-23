programa {
	funcao inicio() {
		inteiro forma, base1, base2, altura, result, raio, diag1, diag2
		real resultr
		
		escreva("Menu:\n(1)Triângulo\n(2)Trapézio\n(3)Círculo\n(4)Losango\n\tOpção: ")
		leia(forma)
		limpa()
		
		escolha(forma){
		    caso 1: escreva("Qual o valor de b?\n")
		            leia(base1)
		            escreva("Qual o valor de h?\n")
		            leia(altura)
		            escreva("O calculo foi feito e resultou em\n",result = (base1*altura)/2)
		    pare
		    caso 2: escreva("Qual o valor de b1?\n")
		            leia(base1)
		            escreva("Qual o valor de b2?\n")
		            leia(base2)
		            escreva("Qual o valor de h?\n")
		            leia(altura)
		            escreva("O calculo foi feito e resultou em\n",result = ((base1+base2)*altura)/2)
		    pare
		    caso 3: escreva("Qual o valor r?\n")
		            leia(raio)
		            escreva("O calculo foi feito e resultou em\n",resultr = 3.14*(raio*raio))
		    pare
		    caso 4: escreva("Qual o valor d1?\n")
		            leia(diag1)
		            escreva("Qual o valor d2?\n")
		            leia(diag2)
		            escreva("O calculo foi feito e resultou em\n",result = (diag1*diag2)/2)
		    pare
		    caso contrario: escreva("Opção Invalida, tente novamente")
		}
	}
}
