package assignment;

public class methods {
		
		//method returning nothing with 1 Parameter
		public void display(String name)
		{
			System.out.println("My Name is "+name);
		}
		
		//method with return type and parameters
		public int cube(int n)
		{
			return n*n*n;
		}
		
		//method return string and with 2 Parameters
		public String fullName(String fname,String lname)
		{
			return fname+" "+lname;
		}
		
		public static void main(String[] args) {
			
			methods obj=new methods();
			obj.display("Manoj");
			
			String name=obj.fullName("manoj", "kumar");
			System.out.println("Full Name is "+name);
			System.out.println(obj.cube(5));
			
		}}
	
