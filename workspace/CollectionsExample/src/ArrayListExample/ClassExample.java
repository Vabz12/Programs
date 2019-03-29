package ArrayListExample;
import java.util.*;
public class ClassExample {

	public static void main(String[] args) {

		  Student s = new Student(); 
		  ArrayList<Student> al=new ArrayList<Student>();
  		  al.add(s);
		  
  		  Iterator<Student> itr=al.iterator();
		  
		  while(itr.hasNext()){      
		    System.out.println();  
		  }  
		 }  
	}

class Student
{  	
	static String fname;
	static String mname;
	static String lname;
	static int age;
	static int phone;
	static String address;
	static Scanner sc = new Scanner(System.in);
	 
	  public static String getFname() {
		return fname;
	}

	public static void setFname(String fname) {
		Student.fname = fname;
	}

	public static String getMname() {
		return mname;
	}

	public static void setMname(String mname) {
		Student.mname = mname;
	}

	public static String getLname() {
		return lname;
	}

	public static void setLname(String lname) {
		Student.lname = lname;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Student.age = age;
	}

	public static int getPhone() {
		return phone;
	}

	public static void setPhone(int phone) {
		Student.phone = phone;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Student.address = address;
	}

	public void add(){
		  System.out.println("Enter your First Name : ");
			fname = sc.nextLine();
			System.out.println("Enter your Middle Name : ");
			mname = sc.nextLine();
			System.out.println("Enter your Last Name : ");
			lname = sc.nextLine();
			System.out.println("Enter your Address : ");
			address = sc.nextLine();
			System.out.println("Enter your Age : ");
			age = sc.nextInt();
			System.out.println("Enter your Phone Num : ");
			phone = sc.nextInt();		
	  }
}  