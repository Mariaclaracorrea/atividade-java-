package primeiro_projeto;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// Variáveis
		double a,b,som;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		System.out.println("informe valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();
		
		//Processamento
		som = a+b;
		//Saída
		System.out.println("O resultado é : " + som);
		ler.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
