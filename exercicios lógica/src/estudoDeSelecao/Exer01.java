//fazer um programa para saber se o número é impar
package estudoDeSelecao;

import javax.swing.JOptionPane;

public class Exer01 {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		
		if(numero % 2 == 1) {
			
			JOptionPane.showMessageDialog(null, "O número é impar");
			
		}

	}

}
