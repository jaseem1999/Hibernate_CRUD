package com.smple.CRUDHib;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAOflim {
	
	public void insertion(DTOflim obj) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(DTOflim.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        try {
        	session.save(obj);
        	tx.commit();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
		}
        System.out.println("Insertion Successfully");
	}
	
	public void update(int id) {
		Scanner sc = new Scanner(System.in);
		DTOflim dto = new DTOflim();
		Configuration cfg = new Configuration().configure().addAnnotatedClass(DTOflim.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        try {
        	DTOflim flim = (DTOflim) session.get(DTOflim.class, id);
        	System.out.println(flim);
        	if(flim != null) { 
        		System.out.println("Which colunm you want to Update");
        		System.out.println("1. Flim name");
        		System.out.println("2. Flim collection");
        		int ch = sc.nextInt();
        		if(ch == 1) {
        			System.out.print("Enter new Flim name :: ");
        			String name = sc.next();
        			flim.setName(name);
        			session.update(flim);
        			System.out.println("Updation Successfully");
        		}else if(ch == 2) {
        			System.out.print("Enter new Flim collection :: ");
        			int col = sc.nextInt();
        			flim.setCollection(col);
        			session.update(flim);
        			System.out.println("Updation Successfully");
        		}else {
        			System.out.println("Wrong choise");
        		}
        	}
        	tx.commit();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
		}
	}
	
	public void delete(int id) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(DTOflim.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        try {
        	DTOflim flim = (DTOflim) session.get(DTOflim.class, id);
        	session.delete(flim);
        	tx.commit();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
		}
        System.out.println("Deletion Successfully");
	}
	
	public void view(int id) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(DTOflim.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        try {
        	DTOflim flim = (DTOflim) session.get(DTOflim.class, id);
        	System.out.println(flim);
        	tx.commit();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
		}
	}
	
}
