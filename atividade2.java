package primeiro_projeto;
import java.util.Scanner;

public class atividade2 {
	

	public static void main(String[] args) {
		// Variavel
		double horatrab, valorhora, salbruto, salliquido, inss;
		
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println ("informe quantas horas você trabalha por dia");
		
		horatrab = ler.nextDouble();
		
		System.out.println("informe quanto você ganha por hora");
		valorhora =  ler.nextDouble();
//processando
		salbruto = horatrab + valorhora;
				inss = salbruto * 0.12;
				salliquido = salbruto - inss;
				
				//Saida
				System.out.println("o valor do salario bruto é: " + salbruto);
				System.out.println(" o valor do salario liquido é :" + salliquido);
		// TODO Auto-generated method stubs

	}

}
