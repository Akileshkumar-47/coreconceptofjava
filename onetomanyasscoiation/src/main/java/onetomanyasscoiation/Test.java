package onetomanyasscoiation;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        try (Session ses = HBUtil.getSessionFactory().openSession()) {

            Transaction tx = ses.beginTransaction();

            Department d = new Department("IT");

            Empolyee e1 = new Empolyee("Sankar", 78000);
            Empolyee e2 = new Empolyee("Maadhavan", 67000);

            d.addEmployee(e1);
            d.addEmployee(e2);

            ses.persist(d);

            tx.commit();
            System.out.println("DATA INSERTED SUCCESSFULLY!");
        }
    }
}
