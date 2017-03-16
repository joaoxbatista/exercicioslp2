public class Termometro{
	//Atributos	
	private double temperatura;
	
	//Métodos
	public Termometro(){
		this.temperatura = 15;
		System.out.println("Termometro criado com sucesso - valor 15!");
	}

	public Termometro(double temperatura){
		this.temperatura = temperatura;
		System.out.println("Termometro criado com sucesso - valor passado por parametro!");
	}

	public boolean aumentarTemperatura(){
		if(this.temperatura+5 <= 100){
			this.temperatura += 5;
			return true;	
		}
		
		return false;
	}
	
	public boolean diminuirTemperatura(){
		if(this.temperatura-5 >= -20){
			this.temperatura -= 5;
			return true;	
		}		
		return false;			
	}

	public double getTemperatura(){
		return this.temperatura;
	}

	public static void main(String args[]){
		Termometro term = new Termometro(95);
		term.aumentarTemperatura();
		term.aumentarTemperatura();
		term.diminuirTemperatura();
		System.out.println("Temperatura = "+term.getTemperatura());
		
	}
}
