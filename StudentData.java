package javaanudip;



class Student {
	
		private String studentName;
		private int studentId;
		private String collegeName;
		
		public void setStudentName(String studentName) 
		{                                             
			this.studentName=studentName;
		}
		
		public String getStudentName()              
		{
			return studentName;                     
		}
		
		public void setStudentId(int studentId)
		{
			this.studentId = studentId;
		}
		
		public int getStudentId()
		{
			return studentId;
		}
		
		public void setCollegeName(String collegeName)
		{
			this.collegeName=collegeName;
		}
		
		public String getCollegeName()
		{
			return collegeName;
		}
	}
public class StudentData {
	public static void main(String[] args) 
	{
		Student Student1 = new Student();      
		Student1.setStudentName("naveena");      
		Student1.setStudentId(176);           
		Student1.setCollegeName("Avanthi");    
		
		System.out.println("Student Name: "+ Student1.getStudentName()); 
		System.out.println("Student Id: "+ Student1.getStudentId());
		System.out.println("Student College Name: "+ Student1.getCollegeName());	
	}

}


	