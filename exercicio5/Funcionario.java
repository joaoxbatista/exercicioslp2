public class Funcionario extends Pessoa{
	
	//Atributos
	protected double salario;
	protected String cargo;
	protected Endereco endereco;

	//Setters
	public void setSalario(double salario){
		if(salario > 0){
			this.salario = salario+300;
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

	//Construtores
	public Funcionario(String nome, int idade, String sexo, double salario, String cargo, Endereco endereco){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
		this.cargo = cargo;
		this.endereco = endereco;
	}

	public Funcionario(String nome, int idade, String sexo, double salario){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
	}

	public Funcionario(String nome, int idade, String sexo, double salario, String cargo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
		this.cargo = cargo;
	}

	public Funcionario(){}

	//Método para conversão do objeto em string
	public String toString(){
		String divisor = "\n-----------------------------------------\n";
		return divisor+"Nome = "+this.nome+"\nIdade = "+this.idade+"\nSexo = "+this.sexo+"\nSalario = "+this.salario+"\nEndereco = "+this.endereco+"\nCargo = "+this.cargo+divisor;

	}

	
}
