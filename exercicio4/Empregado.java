public class Empregado extends Pessoa{
	//Atributos
	private double salario;
	private String cargo;
	private Endereco endereco;

	//Setters
	public void setSalario(double salario){
		if(salario > 0){
			this.salario = salario;
		}
	}
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	public void setEndereco(String estado, String cidade, String bairro){
		this.endereco = new Endereco(estado, cidade, bairro);
	}

	//Getters
	public double getSalario(){
		return this.salario;
	}
	public String getCargo(){
		return this.cargo;
	}
	public Endereco getEndereco(){
		return this.endereco;
	}

	public Empregado(String nome, int idade, String sexo, double salario, String cargo, Endereco endereco){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
		this.cargo = cargo;
		this.endereco = endereco;
	}

	public Empregado(String nome, int idade, String sexo, double salario){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
	}

	public Empregado(String nome, int idade, String sexo, double salario, String cargo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String toString(){

		return "Nome = "+this.nome+"\nIdade = "+this.idade+"\nSexo = "+this.sexo+"\nSalario = "+this.salario+"\nEndereco = "+this.endereco+"\nCargo = "+this.cargo;

	}
	public Empregado(){
		System.out.println("Empregado criado com sucesso!");
	}

	//Métodos
	public static void main(String args[]){
		Empregado joao = new Empregado();
		joao.setNome("João Batista Gomes Silva");
		joao.setIdade(21);
		joao.setSexo("Masculino");
		joao.setEndereco("Alagoas", "Coité do Nóia", "Centro");
		joao.setSalario(1500);
		joao.setCargo("Desenvolvedor Web");
		System.out.println(joao);
	}
}
