package com.Example.hqlDemo;


 
import org.hibernate.Transaction;


import java.util.Iterator;
import java.util.List;
import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;


;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg = new Configuration();
    	cfg.configure().addAnnotatedClass(Employee.class);
         Session session = cfg.buildSessionFactory().openSession();
         Transaction txn =  session.beginTransaction();
        // int id =1;
     
        // String hql ="SELECT  E.name,E.phone FROM Employee E   WHERE E.id="+id;
         // we can use  ORDER BY WHERE E.salary,WHERE E.salary>5000 is condition also we  can put here
        // List result = session.createQuery(hql).list();
          //  Iterator itr =    result.iterator();
          //  while(itr.hasNext()){
          //  	
            //	Object rs[] = (Object[])itr.next();
            //	System.out.println(rs[0]+" , "+rs[1]);
           // }
        // txn.commit();
         
         
         
   // }
         
         
         //Secondary type
         
       //  Criteria criteria =session.createCriteria(Employee.class);
       //  List result =criteria.list();
       //  Iterator itr =    result.iterator();
        //  while(itr.hasNext()){
           	
          // 	Object rs[] = (Object[])itr.next();
           //	System.out.println(rs[0]+" , "+rs[1]);
          // } 
         
         
         
         //third type when we want to apply condition so it case use
         
         Criteria cr= session.createCriteria(Employee.class);
         cr.add(Restrictions.gt("salary", 9000f));
         List results =cr.list();
         Iterator itr = results.iterator();
       while(itr.hasNext()) { 
       	
       	System.out.println(itr.next()) ;
       }
         txn.commit();
         
     }
 }

