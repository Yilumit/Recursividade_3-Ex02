package controller;

public class ComparacaoController {

	public ComparacaoController() {
		super();
	}
	
	public int verificaNum(int numPercorrido, int numVerificador, int qntdAparecidas) {
		if(numPercorrido == 0) {
			return 0;
		} 
		int resto = numPercorrido%10;
		if (numVerificador==resto) {
			qntdAparecidas ++ ;
			return qntdAparecidas;
			
		} 
		return qntdAparecidas;
		
	}

}
