package com.example.Hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import java.io.FilterOutputStream;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure().addAnnotatedClass(Product.class).addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction txn = session.beginTransaction();
    
      

      // Product p = new Product();
      // p.setId(103);
       //p.setName("keyboard");
       //p.setQty(12);
      // p.setPrice(5000);
      // session.save(p);
      // txn.commit();
        
        
        
        //Employee emp =new Employee();
       // emp.setName("Ashish");
       // emp.setPhone("8789989009");
       // emp.setSalary(70000);
        ////session.save(emp);
       // txn.commit();
        
        
        Employee emp  = session.get(Employee.class,1);
        System.out.print(emp);
        txn.commit();
      session.close();
    }
}
       
