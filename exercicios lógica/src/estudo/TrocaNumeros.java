//leia dois numeros inteiros para as variaveis X e Y, e realize a troca entre as duas variaveis
//e exiba os valores trocados
package estudo;

import java.util.Scanner;

public class TrocaNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dois numeros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int troca = x;
		x = y;
		y = troca;
		
		System.out.println(x);
		System.out.println(y);
		
		sc.close();
	}
}
