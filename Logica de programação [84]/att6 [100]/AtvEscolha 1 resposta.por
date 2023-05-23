programa {
	funcao inicio() {
		
		caracter sexo
		inteiro sal
		
		escreva("Qual seu sexo ? (M ou F)\n--> ")
		leia(sexo)
		escreva("Quanto é o seu salario ?\n--> ")
		leia(sal)
		limpa()
		
		escolha(sexo){
		    caso 'M': escreva("Olá...\n Por conta de seu sexo vocé tera 15% de imposto = ", sal*0.15)
		    pare
		    caso 'F': escreva("Olá...\n Por conta de seu sexo vocé tera 10% de imposto = ", sal*0.10)
		}
	}
}
