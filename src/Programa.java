import java.util.Scanner;

public class Programa {
	
	
	public static void main(String[] args) {
		
		int opc;
		int count = 0;
		Scanner tc = new Scanner(System.in);
		ContaCorrente [] c1  = new ContaCorrente[2];

		
		System.out.println("Digite:1- cadastrar conta.\n 2- Efetuar Deposito:\n 3- Efetuar Saque: \n 4- Efetuar Tranferencia:\n");
		opc=tc.nextInt();
		do{
		switch(opc){
		
		case 1:{
			ContaCorrente conta = new ContaCorrente();
			conta.lerContaCorrente();
			c1[count] = conta;
			count++;
			break;
		}
		case 2:{
			int numero;
			float deposito;
			System.out.println("Informe o numero da conta para fazer o saque:");
			numero=tc.nextInt();
			System.out.println("Informe o o valor do deposito:");
			deposito=tc.nextFloat();
		}
		}
		
	}while(opc!=0);

}
}
