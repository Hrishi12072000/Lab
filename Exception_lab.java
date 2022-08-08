package com.Hrk.thursday_lab5;

public class Exception_lab 
{
	static String name,phoneNo,address,userId,password,repassword;
	public Exception_lab(String userId, String password){
	      try {
	         if (userId.length()>=9) 
	         {
	            String msg = "length of userId should be less than 8";
	            CustomAgeException excuser = new CustomAgeException();
	            throw excuser;
	         }
	         else if(password.length()>=9 ) {
	            String msg = "Improper password Should have lenth of 8 character minimum)";
	            CustomAgeException ex = new CustomAgeException(msg);
	            throw ex;
	         }
	      }catch(CustomAgeException e) {
	         e.printStackTrace();
	      }
	      this.userId = userId;
	      this.password = password; 
	   }
	public void display(){
	      
		  System.out.println("Name of the Student: "+name );
		  System.out.println("phoneNo of the Student: "+phoneNo );
	      System.out.println("phoneNo of the Student: "+address );
	      System.out.println("userId of the Student: "+this.userId );
	      System.out.println("password of the Student: "+this.password );
	   }
	public Exception_lab() {
		// TODO Auto-generated constructor stub
	}
	public static  void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your name :");
	    name = sc.next();
		System.out.println("Enter your phone no :");
		phoneNo=sc.next();
		System.out.println("Enter your address :");
		address=sc.next();
		System.out.println("Enter your user id :");
		userId=sc.next();
		System.out.println("Enter your password :");
		System.out.println("password rule :");
		System.out.println("A password must have at least eight characters.");
		System.out.println("A password consists of only letters and digits.");
		System.out.println("A password must contain at least two digits.");
		password=sc.next();
		System.out.println("Enter your password to confirm :");
		String reapssword=sc.next();
		if(password!=repassword){
		System.out.println("password match");
		}else
		{
			System.out.println("password did not matched");
		}
		
		Exception_lab obj1 = new Exception_lab(userId,password);
		obj1.display();
	}
}
