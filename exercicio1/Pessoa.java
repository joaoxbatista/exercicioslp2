public class Pessoa{

	private int pontos;
	
	public void printPontos(){
		System.out.println("Quantidade de pontos: "+this.pontos);
	}

	public boolean setPontos(int pontos){
		this.pontos = pontos;
		return true;
	}
	
	public boolean zerar(){
		if(this.pontos > 0){
			this.pontos = 0;
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]){
		Pessoa joao = new Pessoa();

		if(joao.setPontos(40)){
			System.out.println("Os pontos foram setados com sucesso!");
		}
		
		joao.printPontos();

		if(joao.zerar()){
			System.out.println("Os pontos foram zerados");
		}	

		joao.printPontos();
	}


}
