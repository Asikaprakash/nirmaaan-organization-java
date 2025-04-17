package day9;

public class student {
	String name;
	int Rollno;
	long phoneno;
	public static void main(String[] args) {
		 student std1= new student();
		 std1.name = "Nila";
		 std1.Rollno = 123;
		 std1.phoneno = 638675275;
		 
		 student std2 =new student();
		 std2.name = "Abi";
		 std2.Rollno = 124;
		 std2.phoneno = 934980134;
		 
		 student std3 = new student();
		 std3.name = "Clina";
		 std3.Rollno =125;
		 std3.phoneno = 921367598;
		 
		 System.out.println(std1.name);
		 System.out.println(std1.Rollno);
		 System.out.println(std1.phoneno);
		 
		
	}

}
