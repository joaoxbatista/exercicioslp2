package atividademoodle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EntradaCinema {
	private String dataFilme;
	private int horario;
	private String sala;
	private double valor;
	
	public EntradaCinema(int horario, String sala, double valor){
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
	}
	public String toString(){
		return "=================== \n Informações do Ingresso \n =================== \n Horario = "+this.horario+"\n Sala = "+this.sala+"\n Valor = "+this.getValor();
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public void CalculaDesconto(String data_nascimento, String numero_cateira){
		int idade = this.getIdade(data_nascimento);
		
		if(idade < 12 && idade > 0){
			this.valor = this.valor-((this.valor/100)*50);
		}
			
		if(idade >= 10 && idade <= 15){
			this.valor = this.valor-((this.valor/100)*40);
		}
		else if(idade >= 16 && idade <= 20){
			this.valor = this.valor-((this.valor/100)*30);
		}
		else if(idade > 20){
			this.valor = this.valor-((this.valor/100)*20);
		}
		
		this.CalculaDescontoHorario();
	}
	
	
	public void CalculaDesconto(String data_nascimento){
		int idade = this.getIdade(data_nascimento);
		
		if(idade < 12){
			this.valor = this.valor-((this.valor/100)*50);
		}
		
		this.CalculaDescontoHorario();
	}
	
	//Calcula a data de nascimento
	public int getIdade(String data_nascimento){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento = new Date();
		
		try {
			dataNascimento = sdf.parse(data_nascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Calendar calendarDataNasc = Calendar.getInstance();  
		calendarDataNasc.setTime(dataNascimento); 
	    Calendar hoje = Calendar.getInstance();  

	    return hoje.get(Calendar.YEAR) - calendarDataNasc.get(Calendar.YEAR);
	}
	
	public void CalculaDescontoHorario(){
		if(this.horario < 16){
			this.valor = this.valor-((this.valor/100)*10);
		}
	}
	
	
}
