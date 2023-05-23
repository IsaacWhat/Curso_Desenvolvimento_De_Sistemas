programa {
	funcao inicio() {
	cadeia nome	
	inteiro contador=1
	real nota1,nota2,media
	
	enquanto(contador<=15){
    	escreva("Olá aluno ",contador, "\nDigite seu nome:\t<")
        leia(nome)
        escreva("Digite a nota da primeira prova:\t-->")
        leia(nota1)
        escreva("Digite a nota da segunda prova:\t -->")
        leia(nota2)
        
        media = (nota1+nota2)/2
        
        escreva("\n",nome,"\tNota1\tNota2\tMedia\n\t",nota1,"\t\t",nota2,"\t\t",media,"\n\n")
        contador++
        }
    }
}