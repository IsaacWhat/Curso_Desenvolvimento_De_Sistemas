programa {
	funcao inicio() {
	    real nota1, nota2, nota3
	    inteiro MA, ME
	    cadeia id
	    
	    escreva("Olá\n")
		escreva("escreva sua identidade:\n")
		leia(id)
		escreva("Sua primeira nota: (0~10)\n")
		leia(nota1)
		escreva("Sua segunda nota: (0~10)\n")
		leia(nota2)
		escreva("Sua terceira nota: (0~10)\n")
		leia(nota3)
		escreva("Sua media de exercicios:")
		leia(ME)
		limpa()
		
		MA = (nota1 + nota2 * 2 + nota3 * 3 + ME)/7
		
		se(MA>=9){
		    escreva("Olá ",id," Suas notas foram ",nota1,", ",nota2," e ",nota3," sua media de exercicios foi de ", ME," e sua media de aproveitamento foi de ",MA," e foi APROVADO com o conceito A")
		}senao se(MA<9 e MA>=7){
		    escreva("Olá ",id," Suas notas foram ",nota1,", ",nota2," e ",nota3," sua media de exercicios foi de ", ME," e sua media de aproveitamento foi de ",MA," e foi APROVADO com o conceito B")
		}senao se(MA<7 e MA>=6){
		    escreva("Olá ",id," Suas notas foram ",nota1,", ",nota2," e ",nota3," sua media de exercicios foi de ", ME," e sua media de aproveitamento foi de ",MA," e foi APROVADO com o conceito C")
		}senao se(MA<6 e MA>=4){
		    escreva("Olá ",id," Suas notas foram ",nota1,", ",nota2," e ",nota3," sua media de exercicios foi de ", ME," e sua media de aproveitamento foi de ",MA," e foi REPROVADO com o conceito D")
		}senao se(MA<4){
		    escreva("Olá ",id," Suas notas foram ",nota1,", ",nota2," e ",nota3," sua media de exercicios foi de ", ME," e sua media de aproveitamento foi de ",MA," e foi REPROVADO com o conceito E")
		}senao{
		    escreva("Notas Invalidas")
		}
	}
}
