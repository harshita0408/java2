package Java3;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class icici extends bank
{ bank b=new bank();
 int withdrawn =0;
 int dep=0;
 int prev_transacrion;
 String tran_status;
 int deposit(int money)
 {
 dep=b.getsalary()+money;
 return dep;
 }
 int withdrawl(int money)
 {
 withdrawn=dep-money;
 try
 {
	 if(withdrawn < 0)
	 {
	 System.out.println("Deposite cannot be negative");
	 tran_status="TRANSACTION FAIL";
	 return withdrawn;
	 }
	 else
	 {
	 tran_status="TRANSACTION PASS";
	 return withdrawn;
	 }
 }
 catch(Exception e)
 {
 System.out.println(e.getMessage());
 System.out.println("TRANSACTION FAILURE");
 }
 return 0;
 }
 void log()
 {
 System.out.println("Time of transaction");
 DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
 LocalDateTime now=LocalDateTime.now();
 System.out.println(dtf.format(now));
 System.out.println("User Account no"+ b.getAccountNo());
 System.out.println("Amount Withdrawn "+withdrawn);
 
 System.out.println("Amount Before Withdrawn"+dep);
 
 System.out.println("Amount After Withdrawn "+withdrawn);
 
 System.out.println("Amount Withdrawn "+tran_status);
 
 }
 void exit()
 {
	 System.exit(0);

	}

}
