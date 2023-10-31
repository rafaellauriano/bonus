package estudo;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = sc.nextInt();
		
		if(a > b && a > c) {
			maior = a;
		}else if(b > c) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.println("Maior = " + maior);
		
		sc.close();
		

	}

}
