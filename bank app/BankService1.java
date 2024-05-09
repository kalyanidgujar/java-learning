import java.util.Scanner;
class Account
{
    Scanner sc=new Scanner(System.in);
 	private String accountHolderName;                  //all var private for provide security (encapsulation)
	private String address;
	private long adharNumber;
	private String panNumber;
	private int upiPin;
	private double balance;
	private long phoneNumber;
	Account(String accountHolderName,String address,long adharNumber,String panNumber,int upiPin,double balance,long phoneNumber)  //para constructor
	
	{
		this.accountHolderName=accountHolderName;
		this.address=address;
		this.adharNumber=adharNumber;
		this.panNumber=panNumber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	 }
	 public  void displayInformation()                                         //method for display user info
	{
		System.out.println("Account Holder name :" + accountHolderName);
        System.out.println("Address :" +address);
        System.out.println("Aadhar number : "+adharNumber);
        System.out.println("PAN number : "+ panNumber);
        System.out.println("Phone Number : "+ phoneNumber);

	}
	
	 public double getBalance() {
        System.out.println("Enter pin");
        int a=sc.nextInt();
        if(a==upiPin)
        {
            return balance;

        }else 
        {
             System.out.println("Wrong upi pin , please provide valid pin");
         }
         return 0;
        
    }
    public void deposit(double amount) {
        balance =balance+ amount;
        System.out.println("Amount deposited successfully. Updated balance: " + balance);
    }
     public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

     public void setAccountHolderName(String updateName) {
        this.accountHolderName = updateName;
        System.out.println("name updated successfully ");
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
   public void setAddress(String uadd) {
        this.address = uadd;
         System.out.println("Address updated successfully ");
    }

    public String getAddress() {
        return address;
    }
    public long getAdharNumber() {
        return adharNumber;
    }
    public String getPanNumber() {
        return panNumber;
    }

     public void setUpi(int uupi) {
        this.upiPin = uupi;
        System.out.println("upi pin updated successfully");
    }

    public void setPhone(long uphone) {
        this.phoneNumber = uphone;
         System.out.println("phoneNumber updated successfully ");
    }

    public long getPhone() {
        return phoneNumber;
    }

    
}
class BankService1
{
	static Scanner sc=new Scanner(System.in);                    // static because var sc access all method
	static	Account obj=null;
	static double balance=0;

	public static void main(String[] args) {                      //main method start execution from here
		    boolean exit=false;
		while(!exit)

		   {
		   System.out.println("***Welcome to KDG Bank***");
		   System.out.println();
		   System.out.println("1. Create Account");
		   System.out.println("2. Existing User");
		   System.out.println("3.Exit");
		   System.out.print("Enter a option:"); 
		   int opt=sc.nextInt();
		   System.out.println();
		   
		   	  switch(opt)
		      {
		        case 1:{
		        	createAccount();                                       //call createAccoount method
		              }
		        	break;
		        case 2:{
                        existingUser();                                    //call existing User method
		              }
		              break;
		          case 3:{
		          	     exit = true;                                       //exit program
                         System.out.println("Exiting program.");
		               }
		             break;
		             default:
                    System.out.println("Error ! Enter Correct Option");
                    
           
		        }

		   }
		   

		
	}
	public static void createAccount()
	{
                System.out.println("***Create Account Holder***");
		   	  	System.out.print("Enter your Name:");
		   	  	String accountHolderName=sc.next();
		   	  	System.out.print("Enter Address:");
		   	  	String address=sc.next();
		   	  	System.out.print("Enter Adhar Number:");
		   	  	long adharNumber=sc.nextLong();
		   	  	System.out.print("Enter PAN Number:");
		   	  	String panNumber=sc.next();
		   	  	System.out.print("ENTER Upi Pin:");
		   	  	int upiPin=sc.nextInt();
		   	  	System.out.print("Enter Balance:");
		   	    balance=sc.nextDouble();
		   	    System.out.print("Enter Phone Number:");
		   	    long phoneNumber=sc.nextLong();
		   	  	System.out.println("Accounted created successfully!!!");
		   	  	obj=new Account(accountHolderName,address,adharNumber,panNumber,upiPin,balance,phoneNumber);
	}

	public static void existingUser()
	{
		       if(obj!=null)
	      		{
	      		System.out.println("***Features***");
	      		System.out.println("1.Check Balance");
	      		System.out.println("2.Deposit Ammount");
	      		System.out.println("3.Withdraw Ammount");
	      		System.out.println("4.Update Account");
	      		System.out.println("5.User Information");
	      		System.out.println("6 Logout");
	      		System.out.println("Choose Option:");
	      		int opt1=sc.nextInt();
	      		switch(opt1)
	      		{
	      		case 1:{
	      			 
	      			   System.out.println("Balance is: " + obj.getBalance());
	      			   
	      		     }
	      		     break;
	      		 case 2:{
	      		 	      System.out.println("Enter Deposit amount:");
                                double deposit = sc.nextDouble();
                                obj.deposit(deposit);
	      		        }
	      		        break;
	      		  case 3:{	
	      		  	       System.out.println("Enter Withdrawal amount:");
                                double withdrawal = sc.nextDouble();
                                obj.withdraw(withdrawal);
                         }
                         break;
                   case 4:{
                     	    updateAccount();
                     }
                     break;
                   case 5:{
                 	     obj.displayInformation();
                      }
                      break;
                  case 6:{
                  	     obj = null;
                         System.out.println("Logged out successfully.");
                         System.exit(0);                                                //logout
                       }
                       break;
                       default:
                                System.out.println("Error enter correct option");

	      		        }
                }
                else 
                {
                	System.out.println("No account created create account first");
                }

	}
	public static void updateAccount()
	{
		System.out.println("***Update your account here***");
		System.out.println("1. Account Holder Name");
        System.out.println("2. Address");
        System.out.println("3. UPI Pin");
        System.out.println("4. Phone Number");
        System.out.println("Choose option");
        int opt2 = sc.nextInt();
   switch (opt2) {
            case 1: {
              System.out.println("Enter New name:");
              String uname = sc.next();
              obj.setAccountHolderName(uname);
               }
              break;

            case 2: {
              System.out.println("Enter New Address:");
              String uadd = sc.next();
              obj.setAddress(uadd);
               }
               break;

             case 3: {
               System.out.println("Enter New UPI:");
               int uupi = sc.nextInt();
               obj.setUpi(uupi);
               }
               break;

              case 4: {
                System.out.println("Enter New Phone Number:");
                long uphone = sc.nextLong();
                obj.setPhone(uphone);
                }
                break;

               default:
                 System.out.println("Error ! please enter Correct Option");
              }

	}

	
	}