package bee1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer primeiraEntrada,segundaEntrada,resultado;
		
		System.out.println("Digite a entrada 1: ");
		primeiraEntrada = sc.nextInt();
		System.out.println("Digite a entrada 2:");
		segundaEntrada = sc.nextInt();
		
		resultado = primeiraEntrada * segundaEntrada;
		
		System.out.println("PROD = " + resultado);
		
		
		sc.close();
	}

}
