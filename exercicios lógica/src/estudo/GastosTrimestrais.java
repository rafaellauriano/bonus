package estudo;

import java.util.Scanner;

public class GastosTrimestrais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gastosJaneiro, gastosFevereiro, gastosMarco, gastosTotais;
		
		System.out.println("Digite os gastos de janeiro: ");
		gastosJaneiro = sc.nextInt();
		System.out.println("Digite os gastos de fevereiro: ");
		gastosFevereiro = sc.nextInt();
		System.out.println("Digite os gastos de março: ");
		gastosMarco = sc.nextInt();
		
		gastosTotais = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos Totais do 1º trimestre: " + gastosTotais);
		
		
		
		
		sc.close();

	}

}
