import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	
	public static void main(String[] args) {
		
		int opc=0;
		Scanner tc = new Scanner(System.in);
		
		
		ArrayList<ContaCorrente> contas = new ArrayList<>();
		
		
		
		do{
			System.out.println("Digite:\n 1- cadastrar conta.\n 2- Efetuar Deposito:\n 3- Efetuar Saque: \n 4- Efetuar Tranferencia:\n 5-Mostrar as contas:\n 6-Sair");
			opc=tc.nextInt();
			
		switch(opc){
		
		case 1:{
			System.out.println("Digite um CPF");
			Cliente c1 = new Cliente(tc.next());
			c1.lerCliente();
			ContaCorrente conta = new ContaCorrente(c1);
			conta.lerContaCorrente();;	
			if(!contas.contains(conta)){
				
				contas.add(conta);
			}
			break;
		}
		case 2:{
			double valor;
			int numeroConta;
			System.out.println("Digite um valor");
			valor=tc.nextDouble();
			System.out.println("Informe o numero da conta destino");
			numeroConta=tc.nextInt();
			ContaCorrente c= new ContaCorrente(numeroConta);
			int i= contas.indexOf(c);
			c=contas.get(i);
			c.depositar(valor);
			break;
		}
		case 3:{
			double valor;
			int numeroConta;
			System.out.println("Digite um valor");
			valor=tc.nextDouble();
			System.out.println("Informe o numero");
			numeroConta=tc.nextInt();
			ContaCorrente c= new ContaCorrente(numeroConta);
			int i= contas.indexOf(c);
			c=contas.get(i);
			c.sacar(valor);
			break;
		}
		
		case 4:{
			double valor;
			int numeroConta;
			int numeroConta2;
			System.out.println("Digite um valor ");
			valor=tc.nextDouble();
			System.out.println("Informe o numero da conta de origem");
			numeroConta=tc.nextInt();
			ContaCorrente c= new ContaCorrente(numeroConta);
			int i= contas.indexOf(c);
			c=contas.get(i);
			c.sacar(valor);
	
			System.out.println("Informe o numero da conta Destino");
			numeroConta2=tc.nextInt();
			ContaCorrente c2= new ContaCorrente(numeroConta2);
			int i2= contas.indexOf(c2);
			c2=contas.get(i2);
			c2.depositar(valor);
			break;
			
		}
		
		case 5:{
			int numeroConta;
			System.out.println("Informe o numro da conta");
			numeroConta=tc.nextInt();
			ContaCorrente c = new ContaCorrente(numeroConta);
			int posicao = contas.indexOf(c);
			c=contas.get(posicao);
			c.mostrarContaCorrente();
		break;
		}
		}
	}while(opc!=6);

}
}

