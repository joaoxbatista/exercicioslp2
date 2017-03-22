package aula22marcolp2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Aluno {
	
	//Atributos
	private int matricula;
	private String nome;
	private String sobrenome;
	private Date data_nascimento;
	private int nota1;
	private int nota2;
	
	//Construtores
	
	//Métodos - Getters and Setters
	public void setDataNascimento(String data_nascimento){
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		try {
			this.data_nascimento = df.parse(data_nascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public Date getDataNascimento(){
		return this.data_nascimento;
	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//Métodos
	
	public float getMedia(){
		return (this.nota1+this.nota2)/2;
	}
}
