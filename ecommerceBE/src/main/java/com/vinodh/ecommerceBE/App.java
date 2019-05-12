package com.vinodh.ecommerceBE;

import model.dao.CustomerDAO;
import model.entity.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    		System.out.println( "Hello World!" );
        
    		Customer c = new Customer();
    		c.setCustName("vinodh");
    		c.setCustAge(20);
    		
    		CustomerDAO cd = new CustomerDAO();
    		boolean b = cd.insertCustomer(c);
    		if(b)
    		{
    			System.out.println("Inserted Successfully");
    		}
    	}
    	catch(Exception exp)
    	{
    		exp.printStackTrace();
    	}
    }
}
