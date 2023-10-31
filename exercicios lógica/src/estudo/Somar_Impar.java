//Leia dois valores inteiros X e Y (em qualquer ordem, crescente ou decrescente). A seguir, calcule e mostre
//a soma dos números impares entre eles.
package estudo;

import java.util.Scanner;

public class Somar_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, troca, soma;
		
		System.out.println("Digite dois numeros inteiros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		//para deixar X e Y em ordem crecente
		if(x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		
		soma = 0;
		for(int i = x+1; i < y; i++) {
			if(i % 2 != 0) {
				soma +=  i;
			}
		}
		System.out.println("Soma = "+ soma);
		
		sc.close();

	}

}
