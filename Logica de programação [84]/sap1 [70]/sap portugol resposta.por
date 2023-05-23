programa {
	funcao inicio(){
	    
	    real salbrut, salhr, hrstrab, inss=0.0
		inteiro opcao, valorA, valorB, valorC, valorAB
        
        escreva("Menu...\n (1)Calcule o salario liquido de professor\t(2)Descobrir a categoria de um tri�ngulo\n<")
        leia(opcao)
        
        escolha(opcao){
        
        caso 1: 
            escreva("Insira o valor da hora por aula:\n")
            leia(salhr)
            escreva("Insira a quantia de horas trabalhadas:\n")
            leia(hrstrab)
            limpa()
            
            salbrut=salhr*hrstrab
            
            se(salbrut<=1100.00){
                inss=0.075
            }senao se(salbrut>=1100.01 e salbrut<=2203.48){
                inss=0.09
                escreva("Ol�..\n Seu salario liquido � de ",salbrut-(salbrut*inss)," R$")
            }senao se(salbrut>=2203.49 e salbrut<=3305.22){
                inss=0.12
                escreva("Ol�..\n Seu salario liquido � de ",salbrut-(salbrut*inss)," R$")
            }senao se(salbrut>=3305.23 e salbrut<=6433.57){
                inss=0.14
                escreva("Ol�..\n Seu salario liquido � de ",salbrut-(salbrut*inss)," R$")
            }senao{
                escreva("Valor invalido, tente novamente\n")}
            pare
        
        caso 2: 
            escreva("Insira o valor A:\n")
            leia(valorA)
            escreva("Insira o valor B:\n")
            leia(valorB)
            escreva("Insira o valor C:\n")
            leia(valorC)
            
            valorAB=valorA+valorB
            se(valorAB<valorC){
                escreva("Os valores n�o d�o em um triangulo, tente novamente")
            }senao se(valorA==valorB e valorC==valorA){
                escreva("Este triangulo � um equil�tero")    
            }senao se(valorA==valorB ou valorB == valorC ou valorA==valorC){
                escreva("Este triangulo � um is�scele")
            }senao{
                escreva("Este triangulo � um escaleno")
            }
            pare
    }
}
}
