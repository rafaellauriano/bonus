package estudo;

import java.util.Scanner;

public class OrdemCrescnte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, troca;
		
		System.out.println("Digite o primeiro numero:");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			troca = n1;
			n1 = n2;
			n2 = troca;
		}
		
		if(n1 > n3) {
			troca = n1;
			n1 = n3;
			n3 = troca;
		}
		
		if(n2 > n2) {
			troca = n2;
			n2 = n3;
			n3 = troca;
		}
		
		System.out.println("Ordem crescente: " + n1 + " - " + n2 +" - "+ n3 );
		
		sc.close();

	}

}
