package estudoDeSelecao;

import javax.swing.JOptionPane;

/*A empresa Xsoftwares concedeu um bônus de 20 % do valor do salário
 * a todos os funcionários com tempo de trabalho na empresa igual ou superior
 * a cinco anos e de 10 % aos demais. Calcule o valor do bônus.
 */

public class Exer02 {

	public static void main(String[] args) {
		double salario, bonus;
		int tempo;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
		tempo = Integer.parseInt(JOptionPane.showInputDialog("A quanto tempo está na empresa?"));
		
		if(tempo >= 5) {
			bonus = salario * 0.20;
		}else {
			bonus = salario * 0.10;
		}
		
		JOptionPane.showMessageDialog(null, "O bônus foi de: " + bonus);

	}

}
