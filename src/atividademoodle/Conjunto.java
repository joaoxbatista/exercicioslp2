package atividademoodle;
import java.util.ArrayList;

public class Conjunto {
	ArrayList<Integer> numeros = new ArrayList(); 
	
	public void adicionar(int numero){
		this.numeros.add(numero);
	}
	
	public void somaIgual(int x){
		boolean status = false;
		int tamanho = this.numeros.size();
		for (int a = 0; a < tamanho; a++) {
			for(int b = 0; b < tamanho; b++){
				if(this.numeros.get(a)+this.numeros.get(b) == x){
					status = true;
				}
			}
		}
		
		if(status){
			System.out.println("SIM");
		}else{
			System.out.println("NÃO");
		}
		
	}
	
	public void getElementos(){
		ArrayList<Integer> aux = this.numeros;
		String conjunto = new String();
		int tamanho = this.numeros.size();
		
		for (int a = 0; a < tamanho; a++) {
			for (int b = 0; b < tamanho; b++){
				if (a != b && this.numeros.get(a) == this.numeros.get(b)){
					aux.remove(a);
					tamanho -= 1;
					
				}
			}
		}
		
		System.out.println(aux);

	}
}
