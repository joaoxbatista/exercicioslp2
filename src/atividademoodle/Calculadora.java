package atividademoodle;

public class Calculadora {
	private double entrada1, entrada2;
	private char operacao;
	
	public Calculadora(){}
	public Calculadora(double entrada1, double entrada2, char operacao){
		this.entrada1 = entrada1;
		this.entrada2 = entrada2;
		this.operacao = operacao;
	}
	
	
	public void getValor(){
		double result = 0;
		switch (this.operacao) {
		case '+':
			
			result = this.entrada1+this.entrada2;
			System.out.println(result);
			break;
			
		case '-':
			
			result = this.entrada1-this.entrada2;
			System.out.println(result);
			break;
		
		case '*':
			result = this.entrada1*this.entrada2;
			System.out.println(result);
			break;
		
		case '/':
			if(this.entrada2 == 0){
				System.out.println("Erro: divisão por zero.");
				
			}else{
				result = this.entrada1/this.entrada2;
				System.out.println(result);
			}
			break;
		}
		
		
	}
	
	
}
