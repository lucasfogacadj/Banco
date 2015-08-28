import java.util.Scanner;

public class Programa {
	
	
	public static void main(String[] args) {
		
		int opc;
		
		Scanner tc = new Scanner(System.in);
		ContaCorrente c1 = new ContaCorrente();

		
		System.out.println("Digite:1- cadastrar conta.\n 2- Efetuar Deposito:\n 3- Efetuar Saque: \n 4- Efetuar Tranferencia:\n");
		opc=tc.nextInt();
		do{
		switch(opc){
		
		case 1:{
			c1.getNumero();
			c1.getAgencia();
			c1.getSaldo();
			c1.getSenha();
			c1.getTitular();
			break;
		}
		case 2:{
			
		}
		}
		
	}while(opc!=0);

}
}
