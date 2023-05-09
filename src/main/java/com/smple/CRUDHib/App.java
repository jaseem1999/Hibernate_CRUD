package com.smple.CRUDHib;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	DTOflim dto = new DTOflim();
    	DAOflim dao = new DAOflim();
    	Scanner sc = new Scanner(System.in);
    	int c = 1;
    	do {
    		System.out.println("Enter CRUD operation");
    		System.out.println("1. Insertion");
    		System.out.println("2. Updation");
    		System.out.println("3. Deletion");
    		System.out.println("4. View");
    		System.out.println("5. Exit");
    		c = sc.nextInt();
    		switch(c) {
    			case 1 :
    				System.out.print("Enter Name flim :: ");
    				String name = sc.next();
    				System.out.print("Enter total collection of flim :: ");
    				int col = sc.nextInt();
    				dto.setName(name); 
    				dto.setCollection(col);
    				dao.insertion(dto);
    				break;
    			case 2 :
    				System.out.print("Enter Flim id :: ");
    				int id = sc.nextInt();
    				dao.update(id);
    				break;
    			case 3 :
    				System.out.print("Enter Flim id :: ");
    				int delete = sc.nextInt();
    				dao.delete(delete);
    				break;
    			case 4:
    				System.out.print("Enter Flim id :: ");
    				int view = sc.nextInt();
    				dao.view(view);
    				break;
    			case 5 :
    				System.out.print("Thank you(CRUD Hibernate)");
    				break;
    			default:
    				System.out.print("Wrong Choise! ");
    		}
    	}while(c != 5);
    }
}