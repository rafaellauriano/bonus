package estudo;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o número da tabuada:");
		numero = sc.nextInt();
		
		for(int i = 0; i <=10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		
		sc.close();

	}

}
