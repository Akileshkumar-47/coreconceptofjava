package curdapplication;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		StudentDAO sdao=new StudentDAO();
		//create
		Student s1=new Student("Amit kumar",LocalDate.of(2015,01,05),85);
		Student s2=new Student("Amit kumar",LocalDate.of(2018,01,06),90);
		sdao.saveStudent(s1);
		sdao.saveStudent(s2);
		
		//read
		Student s3=sdao.getStudent(1);
		System.out.println(s3);
		//update
		s3.setPercentage(99);
		sdao.updatePercentage(s3);
		//delete
		sdao.deleteStudent(2);
		System.out.println("CRUD APP COMPLETED......");
	}
}
