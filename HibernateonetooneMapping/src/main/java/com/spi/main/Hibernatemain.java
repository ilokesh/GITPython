package com.spi.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spi.hibernate.Customer;
import com.spi.hibernate.Txn;



public class Hibernatemain {
	static SessionFactory sessionfactory = null;
	public static void main(String[] args) throws Exception {

		Transaction tx = null;	
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.config.xml");
			//get session
			sessionfactory = configuration.buildSessionFactory();
			
			System.out.println("session crfeated");
			// start transaction
			
			// saving the module
			
			
			//commit transaction
			
		
			//System.out.println("Transactio id = " txn.getID());
			Hibernatemain hibernate=new Hibernatemain();
			hibernate.buildtxnDelecreation();
		
		
	}
	private  Txn buildtxnDelecreation() throws Exception

	{
		Session session= sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		 Txn txn = new Txn();
		 txn.setTxnid(1);
		 String startDate="01-02-2013";
		 SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
		 java.util.Date date = sdf1.parse(startDate);
		 java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());   
			txn.setDate(sqlStartDate);
			txn.setTotal(100);
			Customer customer = new Customer();
			customer.setTxnid(1);
			customer.setAddress("adress1");
			customer.setEmial("email1");
			customer.setCustname("Me");
			
             customer.setTxn(txn);
             System.out.println("getting in");
             session.save(customer);
             transaction.commit();
         	session.close();
		return txn;

	}
}



