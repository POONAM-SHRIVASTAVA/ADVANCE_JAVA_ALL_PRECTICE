package com.example.Emp;


import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.example.Emp.model.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = new Configuration().configure().addAnnotatedClass(Emp.class).buildSessionFactory().openSession();
       Emp emp = new Emp();
       emp.setId(1);
       emp.setName("priya");
       emp.setCity("bhilai");
       emp.setSalary(4500);
       session.save(emp);
       
       session.getTransaction().begin();;
       
       session.save(emp);
       session.getTransaction().commit();
       
       
       
      
      
       
    }
}
