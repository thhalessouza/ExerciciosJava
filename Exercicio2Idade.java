package PacoteJava;

import java.util.Scanner;

public class Exercicio2Idade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int totalDeDias, resto, resto2, diasT, diasMeses;
		
		System.out.println("Digite sua idade em dias: ");
		diasT = entrada.nextInt();
		
		totalDeDias = diasT / 365;
		resto = diasT % 365;
		diasMeses = resto / 30;
		resto2 = resto % 30;
		
		System.out.println("\nVocê tem: " + totalDeDias + " anos");
		System.out.println("\nVocê tem: " + diasMeses + " meses");		
		System.out.println("\nVocê tem: " + resto2 + " dias");
		
		 entrada.close(); 
		 
		
	}

}
