package basicjava;

public class ClassStringRivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// touperCase() methods 
		String dir="east";
		String x=dir.toUpperCase();
		System.out.println(x);
		System.out.println("He went to"+x);
		
		//toLowerCase()
		
		String x1=dir.toLowerCase();
		System.out.println(x1);
		System.out.println("iam not going to" +x1);
		
		//length
		
		String car="bmw";
		System.out.println(car);
		int x2=car.length();
		System.out.println(x2+x2);
		System.out.println(x2);
		System.out.println(car.length());
		
		
		
		//Method changing 
		String place="NYC";
		int x3=place.toUpperCase().toLowerCase().length();
		//System.out.println(x3);
				
		
				
		//logic behind deta type and methods
		
                 // data type 
			   
			  // introvert      extrovert 
			  //  less social   speaks more 
			  //  calm          loud 
			  //  talks less    speaks more (friendly) 
			   
			   
			  // boolean -- it can hold only two values true and false 
			  // int --- 87,-89,78 
			  // String ---- 'amol' ,'chinmaydeshpande@gmail.com' 
			   
			  // user defined data type 
			  // Person  -----> amol 
			  // property -----> height , weight , age , color , gender 
			  // method - talk() , walk(), sleep() 
			   
			  // Vehicle -- Audi  
			  // property - color , model , type , regNo  
			  // method - start() , stop() 
			   
			  // Bank - ICICI 
			  // property - accNO , addressName , accName , accType 
			  // method - withdrawl()  depoist() 
			   
			  // Data type ---- properties and method 
			  // method - action and return type 
			   
			   
			  // toUpperCase() 
			   
			  String firstName = "amol";  // object is created 
			  String upperCaseFirstName = firstName.toUpperCase(); 
			  System.out.println(upperCaseFirstName); 
			   
			  // toLowerCase() 
			  // action - to convert every character to lowerCase  
			  // return another 
			   
			  String lastName  = "Rao"; 
			  String lowerCaseLastName = lastName.toLowerCase(); 
			  System.out.println(lowerCaseLastName); 
			   
			  //length() 
			  //action - counts number of character in string  
			  //return - int 
			   
			
	}

}
