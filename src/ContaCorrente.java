import java.util.Scanner;

public class ContaCorrente {
	

	public Cliente titular;
	private int numero;
	private int agencia;
	private int senha;
	private double saldo;
	private double valorDeposito;
	private double limite;
	
	Scanner tc = new Scanner(System.in);
	
	public ContaCorrente(Cliente t){
		this.setTitular(t);
		this.limite=100;
		
	}
	
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public void deposita(){
		setValorDeposito(valorDeposito);
		
	}
	
	
	public void lerContaCorrente(){
		
		System.out.println("Informe o titular: ");
		titular.lerCliente();
		
		System.out.println("Informe o numero da conta: ");
		this.setNumero(tc.nextInt());
		System.out.println("Informe o numero da agencia: ");
		this.setAgencia(tc.nextInt());
		System.out.println("Informe a senha:");
		this.setSenha(tc.nextInt());
		System.out.println("Informe o Saldo:");
		this.setSaldo(tc.nextDouble());
		
	}
	

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public void setTc(Scanner tc) {
		this.tc = tc;
	}


	public void mostrarContaCorrente(){
		System.out.println("Informações da Conta: ");
		System.out.println(this.getAgencia());
		System.out.println(this.getNumero());
		System.out.println(this.getSaldo());
		System.out.println(this.getSenha());
		System.out.println(this.getValorDeposito());
	}
	
	public Cliente getTitular() {
		return titular;
	}


	public int getNumero() {
		return numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public int getSenha() {
		return senha;
	}


	public double getSaldo() {
		return saldo;
	}


	public double getValorDeposito() {
		return valorDeposito;
	}


	public Scanner getTc() {
		return tc;
	}


	public boolean depositar(double valor){
		setSaldo(this.getSaldo()+ valor);
		return true;
	}
	
	public boolean sacar( double valor){
		if(this.getSaldo()+this.getLimite()<valor){
			setSaldo(this.getSaldo()-valor);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean tranferencia(ContaCorrente destino, double valor){
		if(this.sacar(valor)){
			return destino.depositar(valor);
		}
		else {
			return false;
		}
	}


	


}
