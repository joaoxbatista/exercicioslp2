public class Pessoa{

	private int pontos;
	
	//Método que retorna os pontos
	public void printPontos(){
		System.out.println("Quantidade de pontos: "+this.pontos);
	}
	
	//Método que seta os pontos (o mesmo poderia não retornar nada) ou seja
	//ser public void setPontos e não retornar verdadeiro
	public boolean setPontos(int pontos){
		this.pontos = pontos;
		return true;
	}

	//Método que zera os pontos
	public boolean zerar(){
		//Se os pontos forem maior que zero
		if(this.pontos > 0){
			this.pontos = 0;
			return true;
		}
		
		return false;
	}
	
	//Método Principal da Aplicação
	public static void main(String args[]){
		Pessoa joao = new Pessoa(); //Instancia um objeto pessoa
		
		//Caso o método setPontos retorne verdadeiro
		if(joao.setPontos(40)){
			System.out.println("Os pontos foram setados com sucesso!");
		}
		
		//Imprime os pontos
		joao.printPontos();
		
		//Caso o método zerar retorne verdadeiro
		if(joao.zerar()){
			System.out.println("Os pontos foram zerados");
		}	
		
		//Imprime os pontos
		joao.printPontos();
	}


}
