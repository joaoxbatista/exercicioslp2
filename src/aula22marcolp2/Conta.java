package aula22marcolp2;

public class Conta {
	
	private String numero;
	private double saldo;
	
	public Conta(String numero){
		this.numero = numero;
		this.saldo = 0;
	}
	//Métodos getters and setters
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(float valor){
		if(valor > 0 && this.saldo <= valor){
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor){
		if(valor > 0){
			this.saldo += valor;
		}
	}
	
	
}
