package manytomany;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test{
    public static void main(String[] args) {
        try (Session ses = HBUtil.getSessionFactory().openSession()) {

            Transaction tx = ses.beginTransaction();
            Course c1=new Course("java");
            Course c2=new Course("java");
            Course c3=new Course("java");
            
            Student s1 =new Student("Ramesh");
            Student s2 =new Student("Suresh");
            //mapping
            s1.getCourse().add(c1);
            s2.getCourse().add(c1);
            s1.getCourse().add(c2);
            s2.getCourse().add(c3);
          
            
            ses.persist(c1);
            ses.persist(c2);
            ses.persist(c3);
            ses.persist(s1);
            ses.persist(s2);
            
            tx.commit();
            System.out.print("SUCCESSFULLY INSERTED");
            
            
            
        
}
    }
}