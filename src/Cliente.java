import java.util.Scanner;

public class Cliente {
	
	private  String nome;
	private  String cpf;
	private int idade;
	
	Scanner tc = new Scanner(System.in);
	
	public Cliente (String c){
		this.setCpf(c);
	}
	
	public void lerCliente(){
		System.out.println("Informe o nome: ");
		this.setNome(tc.next());

		
		System.out.println("Informe a idade: ");
		this.setIdade(tc.nextInt());
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTc(Scanner tc) {
		this.tc = tc;
	}


	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", tc=" + tc + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public Scanner getTc() {
		return tc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
		
		
	

}
