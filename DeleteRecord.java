package hib.dto;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org .hibernate.Transaction;
import org.hibernate.ObjectNotFoundException;
public class DeleteRecord {
    public static void main(String[]args){
    Configuration c1=new Configuration();
    Configuration c2=c1.configure();
    SessionFactory sf=c2.buildSessionFactory();
    Session session=sf.openSession();
    Transaction tx=session.beginTransaction();
    
    Scanner sc=new Scanner(System.in);
    System .out.println("Enter userid to delete the record");
    int userId=sc.nextInt();
    
    Usersignup usu=(Usersignup)session.get(Usersignup.class,userId);
    if(usu==null)
    {
        System.out.println("Record not Found");
    }
    else{
        session.delete(usu);
        tx.commit();
        System.out.println("record deleted");
    }
    
    session.close();
    
    
}
    
}
