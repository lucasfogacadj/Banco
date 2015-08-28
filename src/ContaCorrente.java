import java.util.Scanner;

public class ContaCorrente {
	

	private Cliente titular;
	private int numero;
	private int agencia;
	private int senha;
	private double saldo;
	private double valorDeposito;
	
	Scanner tc = new Scanner(System.in);

	public Cliente getTitular() {
		return titular;
	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		System.out.println("Informe o numero da conta");
		this.numero = tc.nextInt();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		System.out.println("Informe o nome da agenci:");

		this.agencia = tc.nextInt();
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		System.out.println("Informe o a senha:");

		this.senha = tc.nextInt();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		System.out.println("Informe o saldo da conta:");

		this.saldo = tc.nextDouble();
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		System.out.println("Informe o valor do depositoÇ");
		this.valorDeposito = tc.nextDouble();
	}


	
	

	

		
		
	


}
