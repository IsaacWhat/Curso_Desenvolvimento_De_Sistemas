programa {
	funcao inicio() {
		real valort, forma
		inteiro desc
		
		escreva("Olá\n")
		escreva("Digite o valor do produto:\n")
		leia(valort)
		escreva("Como ira pagar ?\n (1) = A vista no cartão, (2) = dinheiro ou cheque, (3) = Parcelado 2X, (4) = Parcelado 3x\n")
		leia(forma)
		
		se(forma == 1){
		    desc = valort - (valort * 0.10)
		    escreva("Valor final = ",desc, " R$")
		}senao se(forma == 2){
		    desc = valort - (valort * 0.15)
		    escreva("Valor final = ",desc," R$")
		}senao se(forma == 3){
		    escreva("Valor final = ",valort," R$")
		}senao se(forma == 4){
		    desc = valort + (valort * 0.10)
		    escreva("Valor final = ",desc, " R$")
		}senao{
		    escreva("Forma de pagamento invalida, insira apenas de 1 a 4")
		}
		}
	}