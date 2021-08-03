package PacoteJava;

import java.util.Scanner;

public class Exercicio1Idade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, idadeMes, idadeAno, diasAno, diasMes, diasTotal;
		
		
				
		
		System.out.println("Quantos anos você tem? ");
		idade = entrada.nextInt();
		
		System.out.println("\nQual mês você nasceu? ");
		idadeMes = entrada.nextInt();
		
		System.out.println("\nQual seu ano de nascimento? ");
		idadeAno = entrada.nextInt();
		
		diasAno = idade * 365;
	    diasMes = idadeMes * 30;
	    diasTotal = diasAno+diasMes+idade;
	    
	    System.out.println("O seu total em dias é: " + diasTotal);
	      
	      entrada.close(); 
	      
	    
				 
		
		
		
	}
}

