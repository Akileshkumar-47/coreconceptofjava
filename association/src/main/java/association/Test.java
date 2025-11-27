package association;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        try (Session ses = HBUtil.getSessionFactory().openSession()) {

            Transaction tx = ses.beginTransaction();

            Address addr = new Address("chennai", "tn", "630000");
            User user = new User("banitha", addr);

            ses.persist(user);

            tx.commit();
            System.out.println("DATA SAVED...");
        }
    }
}
