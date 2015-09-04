import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	
	public static void main(String[] args) {
		
		int opc;
		int count = 0;
		Scanner tc = new Scanner(System.in);
		
		
		ArrayList<ContaCorrente> contas = new ArrayList<>();
		
		
		
		System.out.println("Digite:1- cadastrar conta.\n 2- Efetuar Deposito:\n 3- Efetuar Saque: \n 4- Efetuar Tranferencia:\n");
		opc=tc.nextInt();
		do{
		switch(opc){
		
		case 1:{
			System.out.println("Digite um CPF");
			Cliente c1 = new Cliente(tc.next());
			c1.lerCliente();
			ContaCorrente conta = new ContaCorrente(c1);
			if(!contas.contains(conta)){
				conta.lerContaCorrente();;	
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
			contas.contains(contas.indexOf(numeroConta));
			
		}
		}
		
	}while(opc!=0);

}
}
