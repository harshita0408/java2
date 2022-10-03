package Java3;
import java.util.*;
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi s=new sbi();
		boi b=new boi();
		icici i=new icici();
		bank bank=new bank();
		Scanner scan=new Scanner(System.in);
		int option='\0';
		int option2='\0';
		int option3='\0';
		int salary;
		int nme,account,money;
		char c;
		System.out.println(".....Welcome to Bank.......");
		System.out.println("Name"+bank.getName());
		System.out.println("Account Number"+bank.getAccountNo());
		System.out.println("Salary"+bank.getsalary());

		System.out.println(".....select your bank.......");
		System.out.println("1 SBI.....");
		System.out.println("2 BOI..... ");
		System.out.println("3 ICICI....");
		do
		{
		option=scan.nextInt();
		switch(option)
		{ 
		case 1:
		       System.out.println("Welcome to SBI Bank");
		       System.out.println("what would you like to do");
		       System.out.println("D. Deposite");
	           System.out.println("W. Withdraw");
		       System.out.println("L. Check for long");
	           System.out.println("Q Exit");
		do { 
		c=scan.next().charAt(0);
		switch (c)
		{ 
		case 'D':
		         System.out.printf("Enter deposite amount:");		
		         salary=scan.nextInt();
		         s.deposit(salary);
		         System.out.println("Your Deposite amount"+s.deposit(salary));
	             break;
		case 'W':
		         System.out.println("Enter Withdrawn Amount");
		         salary=scan.nextInt();
	         	 s.withdrawl(salary);
	        	 System.out.println("Your Deposite amount"+s.deposit(salary));
		         break;
		case 'L': s.log();
		case 'Q':System.out.println("Exit");
                  break;
        default:System.out.println("Wrong input");
                break;
		}
        
		
		}while(c!='Q');
		break;
		case 2:
		        System.out.println("Welcome to BOI Bank");
		        System.out.println("what would you like to do");
		        System.out.println("D. Deposite");
		        System.out.println("W. Withdraw");
		        System.out.println("L. Check for long");
		        System.out.println("Q Exit");
		do {
		c=scan.next().charAt(0);
		switch (c)
		{ 
		case 'D':
		        System.out.printf("Enter deposite amount:");		
	        	salary=scan.nextInt();
	        	b.deposit(salary);
	        	System.out.println("Your Deposite amount"+b.deposit(salary));
		        break;
		case 'W':
		        System.out.printf("Enter Withdrawn Amount");
		        salary=scan.nextInt();
		        b.withdrawl(salary);
		        System.out.println("Your Withdrawn  amount"+b.deposit(salary));
		        break;
		case 'L': b.log();
		case 'Q' :System.out.println("Exit");
        break;
        default:System.out.println("Wrong input");
        break;
		}
        
		
		}while(c!='Q');
		break;

		case 3:
		      System.out.println("Welcome to ICICI Bank");
		      System.out.println("what would you like to do");
		      System.out.println("D. Deposite");
		      System.out.println("W. Withdraw");
		      System.out.println("L. Check for long");
		      System.out.println("Q Exit");
		do {
		c=scan.next().charAt(0);
		switch (c)
		{ 
		case 'D':System.out.printf("Enter deposite amount:");		
		         salary=scan.nextInt();
		         i.deposit(salary);
		         System.out.println("Your Deposite amount"+i.deposit(salary));
		         break;
		case 'W':
		        System.out.println("Enter Withdrawn Amount");
		        salary=scan.nextInt();
		        i.withdrawl(salary);
		        System.out.println("Your Deposite amount"+s.withdrawl(salary));
		        break;
		case 'L': i.log();
		case 'Q': System.out.println("Exit");
                  break;
        default:System.out.println("Wrong input!");
                break;
		}
		
		}while(c!='0');
			break;
		default:System.out.println("Something went wrong");
		break;
		}break;
		}while(option!=3);
	}

}
