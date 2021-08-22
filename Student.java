package week3.day1;

public class Student extends Department{
	public void studentName() {
	   	 System.out.println("Student Name is Ramya");
	   	 
	    }
		  public void studentDept() {
	    	  System.out.println("StudentDept is EEE");
	      }
	     public void studentId() {
	    	 System.out.println("StudentId is 178906");
	     }

	   
		public static void main(String[] args) {
			Student obje=new Student();
			obje.collegeName();
			obje.collegeCode();
			obje.collegeRank();
			obje.deptName();
			obje.studentName();
			obje.studentDept();
			obje.studentId();
		    

		}

}
