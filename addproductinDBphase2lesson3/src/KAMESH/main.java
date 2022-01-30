package KAMESH;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
	Configuration config= new Configuration();
	config.configure("hibernate.xml");
	SessionFactory sf= config.buildSessionFactory();
	Session session= sf.openSession();
	Transaction tx=session.beginTransaction();
	
	product p=new product();
	p.setProductID(1);
	p.setProductName("paper");
	p.setProductPrice(2);
	p.setProductID(2);
	p.setProductName("pen");
	p.setProductPrice(5);
	session.save(p);
	tx.commit();
	

}
}
