package com.example.employeecrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.employeecrud.daoimpl.EmployeeDAOImpl;
import com.example.employeecrud.model.Employee;

import java.awt.Choice;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
      /*second type h  ye data console me show krta h 
       * hume sub import karane ki need h like hibernate ans jpx for session aur sessionfectory kyoki isme error jaldy aate h 
       * 
       * (Configuration cfg= new Configuration();
     cfg.configure().addAnnotatedClass(Employee.class);
      SessionFactory sf =cfg.buildSessionFactory();
      Session session = sf.openSession();
      Transaction txn =session.beginTransaction();
      String hql ="from Employee";
      Query <Employee>query = session.createQuery(hql);
      
      List<Employee>data= session.createQuery(hql).list();
      
      
      Iterator <Employee> itr =data.iterator();
      while(itr.hasNext()) {
    	  System.out.println();
    	  System.out.println(itr.next());
    	  
      }*/
      
      
      
      
      /* ye first type h isme hume koi import nahi karna ki need sh kuch hi part import karate h 	
   Session session = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
       session.beginTransaction();
       Employee emp = new Employee();
       emp.setName("Amit");
       emp.setPhone("68789898");
       emp.setSalary(680000);
       session.save(emp);
       Employee emp1 = new Employee();
       emp1.setName("pooja");
       emp1.setPhone("67778");
       emp1.setSalary(68000);
       session.save(emp1);
      
       session.getTransaction().commit();
       session.close();
       */
       
    	
    	//third type srat so we dnot needd configuration file
    	
    	
    	
    	  Scanner sc = new Scanner(System.in);
          EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
          char continuationChoice;
          do {
       	   System.out.println("1. Add employee\n2. Get all employees\n3. Get by id\n4. Remove employee\n5. Exit");
              System.out.print("Enter choice: ");
              int choice = sc.nextInt();
              if(choice==1) {
           	   Employee employee = new Employee();
           	   System.out.print("Enter name:");
           	   sc.nextLine();
           	   employee.setName(sc.nextLine());
           	   System.out.print("Enter phone:");
           	   employee.setPhone(sc.nextLine());
           	   System.out.print("Enter salary:");
           	   employee.setSalary(sc.nextFloat());
           	   int id = employeeDAOImpl.save(employee);
           	   System.out.println("Inserted id "+id);
              }
              else if(choice==2) {
           	   List<Employee> employees = employeeDAOImpl.getAll();
           	   if(employees.size()==0) {
           		   System.out.println("No employee found !");
           	   }
           	   else {
           		   Iterator<Employee> itr = employees.iterator();
           		   while(itr.hasNext()) {
           			   Employee employee = itr.next();
           			   System.out.println(employee);
           		   }
           	   }
              }
              else if(choice==3) {
           	   System.out.print("Enter id you want to search:");
           	   int id = sc.nextInt();
           	   Employee employee = employeeDAOImpl.getById(id);
           	   if(employee!=null) {
           		   System.out.println(employee);
           	   }
           	   else {
           		   System.out.println("Employee with given id not found");
           	   }
              }
              else if(choice==4){
           	   System.out.print("Enter id:");
           	   int id = sc.nextInt();
           	   int result = employeeDAOImpl.remove(id);
           	   if(result!=-1) {
           		   System.out.println("Employee removed!");
           	   }
           	   else {
           		   System.out.println("Employee with given id not found");
           	   }
              }
              else {
           	  System.out.println("Invalid choice"); 
              }
              System.out.print("Do you want to continue? (Y/N)");
              continuationChoice = sc.next().charAt(0);
          }
          while(continuationChoice=='Y');
          
          
       }
   }


