package controle_de_fluxo;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		
		
		
		System.out.print("Digite o valor incial:");	
		
		int valorInicial = obterValores();
		
		System.out.print("Digite o valor final:");
		
		int valorFinal =  obterValores();
			
		try {
			
			exibir_numeros(valorInicial, valorFinal);
			
		} catch (ParametrosInvalidosException e){
			
			System.out.println("!!! O valor final deve ser maior que o primeiro !!!");
			
			
		}
		
		
	}
		
	
	static int obterValores ()  {
			 
			 
		Scanner scanner = new Scanner (System.in);		
			
		int valor = scanner.nextInt();
			
		return valor; 
			
	}		
			
			
	static void exibir_numeros (int inicio, int fim) throws ParametrosInvalidosException {
				
		if (inicio > fim) {
					
			throw new ParametrosInvalidosException();
					
		}	
				
		for (int i = inicio; i <= fim; i++) {
				
			System.out.println("Imprimindo o número " + i);
				
		}	
		
			
	}
		

}
