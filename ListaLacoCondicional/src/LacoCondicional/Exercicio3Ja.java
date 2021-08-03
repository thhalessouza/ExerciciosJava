package LacoCondicional;

import java.util.Scanner;

public class Exercicio3Ja {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int adultos, idade ; 
		
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		if(idade >=10 && idade <=14) {
	    System.out.println("\nPertence ao Infantil.");
		}
	    else if(idade >=15 && idade <=17) {
	    System.out.println("\nPertence ao Juvenil.");
	    }
	    else if(idade >= 18 && idade <=25) {
	    	System.out.println("\nPertence ao Adulto.");
	    }
	    	entrada.close();
	    }
	}

