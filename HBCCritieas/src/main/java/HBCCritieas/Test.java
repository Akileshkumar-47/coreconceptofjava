package HBCCritieas;

import org.hibernate.Session;

import HBCCritieas.HBUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

public class Test {
	   public static void main(String[] args) {
	        try (Session ses = HBUtil.getSessionFactory().openSession()) {
	        	
	        CriteriaBuilder cb=session.getCriteriaBuilder();
	        CriteriaQuery<Object[]> cq= cb.createQuery(Object[].class);
	        Root<Employee> emp = cq.from(Employee.class);
	        Join<Employee,Department> dept= emp.join("department",JoinType.INNER);
	        Join<Employee,Project> proj= emp.join("prjs",JoinType.INNER);
	        
	        Predicate p1=cb.greaterThan(emp.get("Salary"), 500000);
	        Predicate p2=cb.equal(emp.get("city"), "chennai");
	        Predicate p3=dept.get("name").in("IT","HR");
	        Predicate p4=cb.isNotEmpty(emp.get("prjs"));
	        Predicate p5=cb.and(p1,p2,p3,p4);
	        
	        cq.groupBy(dept.("name");
	        cq.having(cb.gt(cb.avg(emp.get("salary")), 600000));
	        
}
	   }
}
