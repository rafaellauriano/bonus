package estudo;

import java.util.Scanner;

public class DiaMesAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int dia,mes, ano = 0;
		boolean valor = false;
		
		System.out.println("Digite o dia:");
		dia = sc.nextInt();
		System.out.println("Digite o mes:");
		mes = sc.nextInt();
		System.out.println("Digite o ano:");
		ano = sc.nextInt();
		
		if(ano > 1) {
			valor = true;
		}else if((mes < 1) || (mes > 12) || (dia < 1) || (dia > 31)) {
			valor = false;
		}else if((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11) && (dia > 30)) {
			valor = false;
		}else if(mes == 2) {
			if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
				if(dia > 29) {
					valor = false;
				}else if(dia > 28) {
					valor = false;
				}else {
					valor = false;
				}
				
			    if (valor == false) {
				   System.out.println("Data inválida");
			   }else {
				   System.out.println("Data verdadeira");
			   }
			}
		}
		
		System.out.println(valor);
		
		sc.close();

	}

}
