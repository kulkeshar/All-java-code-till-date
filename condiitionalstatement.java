package basicjava;

public class condiitionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Number of ticket--<=5==>5%
		//Number of ticket>5&&Number of ticket <=10==>10%
		//if(condition){
		//
		//}
		//program 1
		
		int a=10;
		if(a>=10) {
		System.out.println("A is 10");	
		}
		
		//program 2(check Whether the number is positive or negative)
		
		int b=90;
		if(b>0) {
			System.out.println("Number is positive");
		}
		else{
		System.out.println("Number is negative");	
		}
		
		//program 3(Not recommended) don't do that way
		if(b>0)System.out.println("Number is positive)");
		else System.out.println("Number is negative");
		
		
		//progrem 4(program to check to greater number)
		int x=10;
		int y=20;
		
		if(x>y) {
			System.out.println("x is greater");
			
		}
		else {
			System.out.println("y is greater");
		}
		
		//program 5
		
		//Number of ticket>o&&number of ticket<=5==>5% discount
		//Number of ticket>5&&number of ticket<=10==>10 discount
		//Number of ticket >10==>30% discount
		
		int numberofticket=11;
		if(numberofticket>0&&numberofticket<=5) {
			System.out.println("5% discount");
			}
		
		if(numberofticket>5&&numberofticket<=10) {
			System.out.println("10% discount");
			
			}
		if(numberofticket>10) {
			System.out.println("30%discounnt");
			
		}
		
		//program 6
		
		numberofticket=-10;
		
		if(numberofticket>0&&numberofticket<=5) {
			System.out.println("5%discount");
			
		}
		else if(numberofticket>5&&numberofticket<=10){
			System.out.println("10%discount");
		}
		
		else if(numberofticket>10) {
		System.out.println("30%discount");
			
		}
		else {
			System.out.println("incurrect input");
		}
		
		
		//program 7
		
		
		//If percent is above 90---> A Grade
		//If percent is above 75---> B Grade
		//If percent is above 65--> CGrade
		int marks=65;
		
		
		//if(marks>90){
		System.out.println("A Grade");
		
		
	if(marks>75){
		System.out.println("B grade");
		
		}
	if(marks>60){
		System.out.println("C grade");
		
	}
	
	if(marks>90) {
		System.out.println("Agrade");
		
	}
	else if(marks>75) {
		System.out.println("B grade");
		
	}
	
	else if(marks>60) {
		System.out.println("C grade");
		
	}
	
	else {
		System.out.println("fail");
		
	}
	
	//Program 8
	
	int x1=100;
	int x2=200;
	int x3=300;
	
	if(x1>x2) {
		System.out.println("x1 is greater");
		
	}
	if(x1>x3) {
		System.out.println("x1 is greater");
		
	}
	
	else {
		System.out.println("x3 is greater");
		
	}
	
	//Program 9
	
	
	x1=1000;
	x2=200;
	x3=400;
	
	if(x1>x2&&x2>x3) {
		System.out.println("x1 is greater");
		
	}
	else if(x2>x1&&x2>x3) {
		System.out.println("x2 is greater");
			
	}
	else{
		System.out.println("x3 is greatert");
	}
	
	
	
	//// Thank you
	

	
	
	
		
	
	
	}
		
	
	}
	
		
	
	
	
	
	
		
	
		
	
	
	

		
	
	
	
   

