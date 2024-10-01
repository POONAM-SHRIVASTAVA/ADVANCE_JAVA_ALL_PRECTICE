package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//this file load xml file  
       Vehicle vh =(Vehicle)context.getBean("vehicle");// xml file k under key id search krega ki shi h ki nahi;and bike ka object bnayega aur ye object value return krega getbean method se 
       vh.run();
        
    }
}
