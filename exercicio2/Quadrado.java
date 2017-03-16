public class Quadrado{
	//Atributos
	private double lado;
	
	//Métodos
	public Quadrado(double lado){
		this.lado = lado;
		System.out.println("Quadrado criado com sucesso!");	
	}

	public double area(){
		return this.lado*this.lado;
	}

	public double perimetro(){
		return this.lado*4;
	}

	public static void main(String args[]){
		Quadrado quadrado = new Quadrado(10);
		System.out.println("Area = "+quadrado.area()+"\nPerimetro = "+quadrado.perimetro());
	}
}
