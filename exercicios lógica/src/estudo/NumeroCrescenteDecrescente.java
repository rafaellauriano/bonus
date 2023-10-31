package estudo;

import java.util.Scanner;

public class NumeroCrescenteDecrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite os dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != y) {
			if(x < y) {
				System.out.println("CRESCENTE!");
			}else {
				System.out.println("DECRESCENTE!");
			}
			
			System.out.println("digite os dois numeros:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
