package view;

import java.util.Random;

import controller.ComparacaoController;

public class Principal_Comparacao {

	public static void main(String[] args) {
		Random numRandom = new Random();
		int num1 = numRandom.nextInt(100000);
		int num2 = numRandom.nextInt(10);
		
		ComparacaoController cMet = new ComparacaoController();
		
		System.out.println("1º Número = "+num1+"\n2º Número: "+num2+"\nO 2º número aparece "+cMet.verificaNum(num1, num2, 0)+" vezes");
	}

}
