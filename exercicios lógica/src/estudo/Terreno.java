package estudo;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.println("Area do terreno = %.2f " + area);
		System.out.printf("Preço do terreno = %.2f " , preco);
		
		
		sc.close();
	}

}
