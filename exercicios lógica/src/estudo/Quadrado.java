//leia trez numeros reais A,B,C. Crie uma variavel X e atribua o quadrado da soma de A, B, C
package estudo;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os tres numeros:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double x = Math.pow(a+b+c, 2);
		
		System.out.println(x);
		
		sc.close();
	}

}
