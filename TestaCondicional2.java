
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 3;
		int idade = 15;
		if (idade >= 18 && acompanhado) {
			System.out.println("Sejam bem vindo!");
		} 
		else {
			System.out.println("Você não pode entrar!");
			}		
	}

}
