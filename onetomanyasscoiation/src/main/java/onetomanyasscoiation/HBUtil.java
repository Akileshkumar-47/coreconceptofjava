package onetomanyasscoiation;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HBUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() { 
		registry = new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		return sessionFactory;	
}
}