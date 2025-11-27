package curdapplication;


import org.hibernate.Session;       
import org.hibernate.Transaction; 

public class StudentDAO {
	
	public void saveStudent(Student st) {
		Transaction tx=null;
		try(Session ses=HBUtil.getSessionFactory().openSession()){
			tx=ses.beginTransaction();
			ses.persist(st);
			tx.commit();
		}
	}
	public Student getStudent(int roll) {
		try(Session ses= HBUtil.getSessionFactory().openSession()){
			return ses.get(Student.class,roll);
		}
		
	}
	public void deleteStudent(int roll) {
		Transaction tx=null;
		try(Session ses=HBUtil.getSessionFactory().openSession()){
			tx=ses.beginTransaction();
			Student st=ses.get(Student.class,roll);
			if(st != null) {
				ses.remove(st);
			}
		}
	}
	public void updatePercentage(Student st) {
		Transaction tx=null;
		try(Session ses=HBUtil.getSessionFactory().openSession()){
			tx=ses.beginTransaction();
			ses.merge(st);
			tx.commit();
	}
}
}