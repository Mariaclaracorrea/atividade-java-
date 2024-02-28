package primeiro_projeto;
import java.util.Scanner; 

public class primeira_atividade {

	public static void main(String[] args) {
		// variáveis 
		String idade,nome;
		
		// Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entradaa de dados 
		System.out.println("informe o nome: ");
		nome = ler.next();
		
		System.out.println ("informe a idade: ");
		idade = ler.next();
		
		//Processamento 
		System.out.println("seu nome e sua idade: " + nome + idade);
		// TODO Auto-generated method stub

	}

}
