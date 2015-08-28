import java.util.Scanner;

public class Cliente {
	
	private  String nome;
	private  String cpf;
	private int idade;
	
	Scanner tc = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = tc.next();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = tc.next();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = tc.nextInt();
	}


	
	

	
	
	
		
		
	

}
