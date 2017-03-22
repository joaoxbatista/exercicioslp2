package exercicio4;
public class Endereco{
	//Atributos	
	private String estado;
	private String cidade;
	private String bairro;
	
	//Métodos
	public Endereco(String estado, String cidade, String bairro){
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
	}

	public Endereco(){
		this.estado = "Alagoas";
		this.cidade = "Arapiraca";
		this.bairro = "Centro";
	}

	public String toString(){
		return this.estado+", "+this.cidade+", "+this.bairro;
	}
}
