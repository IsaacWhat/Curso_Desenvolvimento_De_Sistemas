programa {
  funcao inicio() {
    inteiro num, tmaiorid = 0
    para(inteiro cont=1;cont<=10;cont++){
		  escreva("escreva a idade do individuo ",cont,":\n<")
		  leia(num)

		  se(num>==18){
		        tmaiorid++
                }
	    }
	escreva("Apenas ",tmaiorid," são Maiores de idade")
  }
}