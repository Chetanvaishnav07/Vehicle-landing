package hib.dto;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org .hibernate.Transaction;
import org.hibernate.ObjectNotFoundException;
public class GetRecord {
     public static void main(String[]args){
         Configuration c1=new Configuration();
         Configuration c2=c1.configure();
         SessionFactory sf=c2.buildSessionFactory();
         Session session=sf.openSession();
          
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter user id to load the detail");
        int userId=sc.nextInt();
        try{
            Usersignup usu=(Usersignup)session.load(Usersignup.class,userId );
            System.out.println(usu.getUserId()+"  "+usu.getName());
        }
        catch(ObjectNotFoundException ex)
        {
            System.out.println("Record not found");
        }
     }

}

