public class Pessoa{
	//Atributos
	protected String nome;
	protected int idade;
	protected String sexo;

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	public String getNome(){
		return this.nome;
	}

	public int getIdade(){
		return this.idade;
	}

	public String getSexo(){
		return this.sexo;
	}

}
