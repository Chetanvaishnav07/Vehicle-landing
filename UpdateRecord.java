
package hib.dto;
import org.hibernate.SessionFactory;
import java.util.Scanner;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.ObjectNotFoundException;
public class UpdateRecord {
    public static void main (String[]args){
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf= c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
       System.out.println("Update your record please  Enter Userid");
       Scanner sc=new Scanner(System.in);
       String userId= sc.next();
       
       Usersignup usu=(Usersignup)session.get(Usersignup.class,userId);
       if(usu==null){
           System.out.println("Record not found");
       }
       else{
           System.out.println("...Menu...");
           System.out.println("what do you wanna update");
           System.out.println("1");
           System.out.println("2");
           System.out.println("3");
           System.out.println("4");
           System.out.println("5");
           System.out.println("6");
           int choice=sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("Enter updated full name");
                   String un=sc.next();
                   usu.setName(un);
                   session.update(usu);
                   tx.commit();
                   System.out.println("field updated");
                   break;
                
                case 2:
                   System.out.println("You cannot update your userID");
                   break;
                   
                 case 3:
                   System.out.println("Enter Updated Contact number");
                   int cn=sc.nextInt();
                   usu.setContactNo(cn);
                   session.update(usu);
                   tx.commit();
                   System.out.println("ContactNO updated");
                   break;
                   
                   case 4:
                   System.out.println("Enter updated AdhharNO");
                   long an=sc.nextLong();
                   usu.setAddharNo(an);
                   session.update(usu);
                   tx.commit();
                   System.out.println("Adhaar  updated");
                   break;
                   
                   case 5:
                   System.out.println("Enter updated Email");
                   String ea=sc.next();
                   usu.setEmail(ea);
                   session.update(usu);
                   tx.commit();
                   System.out.println("Email updated");
                   break;
                   
                    case 6:
                   System.out.println("Enter updated Address");
                   String aa=sc.next();
                   usu.setAddress(aa);
                   session.update(usu);
                   tx.commit();
                   System.out.println("Email updated");
                   break;
                   
                   
                   
                    
                      
                   
               
           }
       }
       session.close();
    }
    
}
                                                            