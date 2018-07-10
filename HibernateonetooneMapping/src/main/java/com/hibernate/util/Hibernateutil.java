package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Hibernateutil {
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if(sessionfactory == null) sessionfactory = buildSessionFactory();
		return sessionfactory;
	}
	public static SessionFactory buildSessionFactory() {
		try {	
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.config.xml");
			System.out.println("hibernate configuration loaded ");
			/*ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			System.out.println("service register got created");*/
			/*SessionFactory sessionfactory = configuration.buildSessionFactory(serviceregistry);*/
			return sessionfactory;
		}catch (Throwable ex) {
			System.out.println("session factory not initialized"+ ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);	
		}
	}
}