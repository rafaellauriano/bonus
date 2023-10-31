package estudo;

import java.util.Scanner;

public class NumeroMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = sc.nextInt();
		
		if(a < b && a < c) {
			menor = a;
		}else if(b < c) {
			menor = b;
		}else {
			menor = c;
		}
		
		System.out.println("O número menor é: " + menor);
		
		
		sc.close();
			

	}

}
