package estudo;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu peso:");
		double peso = sc.nextInt();
		System.out.println("Digite a sua altura:");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Magreza");
		}else if((imc >= 18.5) && (imc < 25)) {
			System.out.println("Saudável");
		}else if((imc >= 25) && (imc < 30)) {
			System.out.println("Sobrepeso");
		}else {
			System.out.println("Obesidade");
		}
		
		System.out.println();
		System.out.println("Imc = " + imc);
		
		
		sc.close();

	}

}
