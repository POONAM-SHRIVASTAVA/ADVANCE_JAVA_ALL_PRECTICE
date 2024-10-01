package com.example.onetoonedemo;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = new Configuration()
     		   .configure().addAnnotatedClass(Person.class).addAnnotatedClass(Address.class).
        buildSessionFactory().openSession();
    	Transaction txn = session.beginTransaction();
    	//Person person1 =session.get(Person.class,1); 
    	//System.out.println(person1);
    	//System.out.println(person1.getAddress());
    	Address adrAddress =session.get(Address.class,1);
    	System.out.println(adrAddress);
    	System.out.println(adrAddress.getPerson());
    	
       Person person =new Person();
       person.setName("Ankit");
       person.setPhone("78888");
 
       
       Address adrsAddress =new Address();
       adrsAddress.setHouseNo("B/187");
       adrsAddress.setCity("mumbai");
       adrsAddress.setArea("malad");
       
       
       person.setAddress(adrsAddress);
       adrsAddress.setPerson(person);
       
       
       
       session.save(person);
       session.save(adrsAddress);
      
       
       txn.commit();
    }
}
