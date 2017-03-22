package aula22marcolp2;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta("123123");
		conta.depositar(300.40);
	
		System.out.println("Saldo -- "+conta.getSaldo());
		conta.depositar(600);
		System.out.println("Deposito -- "+conta.getSaldo());
		conta.sacar(300);
		System.out.println("Saque -- "+conta.getSaldo());
	}

}
