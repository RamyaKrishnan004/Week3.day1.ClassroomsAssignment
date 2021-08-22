package week3.day1;

public class StudentInfo {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id : "+id);	
		}
		public void getStudentInfo(int id,String name) {
			System.out.println("Student id : "+id);
			System.out.println("Student name : "+name);
			
		}
		public void getStudentInfo(String email,long phoneNumber) {
			System.out.println("Studen Email : "+email);
			System.out.println("Student phone number : "+phoneNumber);
		}


		public static void main(String[] args) {
			
			StudentInfo obj=new StudentInfo();
			obj.getStudentInfo(5546);
			obj.getStudentInfo(5546, "NRK");
			obj.getStudentInfo("ramyank004@gmail.com", 98745632);
		}

}
