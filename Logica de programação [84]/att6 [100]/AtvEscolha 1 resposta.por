programa {
	funcao inicio() {
		
		caracter sexo
		inteiro sal
		
		escreva("Qual seu sexo ? (M ou F)\n--> ")
		leia(sexo)
		escreva("Quanto � o seu salario ?\n--> ")
		leia(sal)
		limpa()
		
		escolha(sexo){
		    caso 'M': escreva("Ol�...\n Por conta de seu sexo voc� tera 15% de imposto = ", sal*0.15)
		    pare
		    caso 'F': escreva("Ol�...\n Por conta de seu sexo voc� tera 10% de imposto = ", sal*0.10)
		}
	}
}
