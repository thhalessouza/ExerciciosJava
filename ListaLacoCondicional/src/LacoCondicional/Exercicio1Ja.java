package LacoCondicional;

import java.util.Scanner;

public class Exercicio1Ja {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		
		int maior = 0;
		
		System.out.println("Digite três números inteiros:");
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
				
				
		if((n1 > n2) && (n1 > n3))
			maior = n1; 
			
		
		else if ((n2 > n1) && (n2 > n3))
			maior = n2;
			
		
		else if((n3 > n1) && (n3 > n2))
			maior = n3;
		
		
		System.out.println("Maior: " + maior );
		
		entrada.close();
				
	}


	}


