package atividademoodle;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		/*Questão 1
		Conjunto a = new Conjunto();
		a.adicionar(1);
		a.adicionar(2);
		a.adicionar(3);
		a.adicionar(4);
		a.adicionar(5);
		a.somaIgual(5);
		*/
		
		/*Questão 2*/
		
//		Conjunto a = new Conjunto();
//		a.adicionar(1);
//		a.adicionar(2);
//		a.adicionar(3);
//		a.adicionar(4);
//		a.adicionar(5);
//		a.adicionar(5);
//		a.adicionar(1);
//		a.getElementos();
		
		/*Questão 3*/
		
//		Calculadora calc = new Calculadora(20,1,'+');
//		calc.getValor();
//		
//		Calculadora calc2 = new Calculadora(20,1,'-');
//		calc2.getValor();
//		
//		Calculadora calc3 = new Calculadora(20,1,'*');
//		calc3.getValor();
//		
//		Calculadora calc4 = new Calculadora(20,0,'/');
//		calc4.getValor();
		
		
		/*Questão 4*/
		
		
		int horario = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário do Filme"));
		String sala = JOptionPane.showInputDialog("Digite a sala do Filme");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Filme"));
		
		//Definição do cinema
		EntradaCinema cinema = new EntradaCinema(horario, sala, valor);
				
		String numero_aluno = JOptionPane.showInputDialog("Digite o número de aluno, caso seja um");
		String data_nascimento = JOptionPane.showInputDialog("Digite sua data de nascimento");
		
		if(numero_aluno.length() > 0){
			cinema.CalculaDesconto(data_nascimento, numero_aluno);
		}else{
			cinema.CalculaDesconto(data_nascimento);
		}
		
		JOptionPane.showConfirmDialog(null, cinema);
		
	}

}
