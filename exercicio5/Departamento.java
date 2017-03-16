import java.util.*;

public class Departamento{
	private String nome;
	public List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public String getNome(){
		return this.nome;
	}

	public boolean setNome(String nome){
		this.nome = nome;
		return true;
	}

	public static void main(String args[]){
		Departamento vendas = new Departamento();
		vendas.setNome("Vendas");

		//Criação do motorista jose
		Motorista jose = new Motorista();
		jose.setNome("Jose da Silva");
		jose.setIdade(21);
		jose.setSexo("Masculino");
		jose.setEndereco("Alagoas", "Coité do Nóia", "Centro");

		vendas.funcionarios.add(jose);

		//Criação da Recepcionista maria
		Recepcionista maria = new Recepcionista();
		vendas.funcionarios.add(maria);
		maria.setNome("Maria da Silva");
		maria.setIdade(22);
		maria.setSexo("Feminino");
		maria.setEndereco("Alagoas", "Arapiraca", "Centro");

		//Criação da Porteiro irineu
		Porteiro irineu = new Porteiro();
		vendas.funcionarios.add(irineu);
		irineu.setNome("Irineu da Silva");
		irineu.setIdade(52);
		irineu.setSexo("Masculino");
		irineu.setEndereco("Alagoas", "Palmeira dos Indios", "Centro");


		System.out.println(vendas.funcionarios);
	}
}