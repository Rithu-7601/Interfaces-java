import java.util.Scanner;

interface MainBank{
	
	int n = 10;
	void deposit(float amt);
	void withdraw (float amt);

}
class SBI implements MainBank{
	
	public void deposit(float amt) {
		System.out.println("Depositing rs"+amt+" @ SBI");
	}
	public void withdraw(float amt) {
		System.out.println("Withdrawing rs"+amt+" @ SBI");
	}
	
}
class ICICI implements MainBank{
	
	public void deposit(float amt) {
		System.out.println("Depositing rs"+amt+" @ ICICI");
	}
	public void withdraw(float amt) {
		System.out.println("Withdrawing rs"+amt+" @ ICICI");
	}
	
}

class Bank{
	public static void main(String[] args) {
		MainBank s = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the type of bank 1.SBI  2. ICICI");
		int opt = sc.nextInt();
		
		
		switch(opt) {
		
		case 1:
			s = new SBI();
			break;
		case 2:
			s = new ICICI();
			break;
		default:
			System.out.println("invalid bank");
			
		}
		
		s.deposit(1000);
		s.withdraw(500);
		
		//member datas in interfaces are static and they can accessed as
		
		System.out.println(MainBank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(s.n);
		
		sc.close();
	}
}
//output
//enter the type of bank 1.SBI  2. ICICI
//1
//Depositing rs1000.0 @ SBI
//Withdrawing rs500.0 @ SBI
//10
//10
//10
//10
