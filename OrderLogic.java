
package hib.dto;
import hib.dto.Usersignup;
import java .util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;


public class OrderLogic {
    public static void main(String[]args)
    {
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Criteria q= session.createCriteria(Usersignup.class);
        q.addOrder(Order.asc("userId"));
        List<Usersignup> usu1=q.list();
        if(usu1==null){
        System.out.println("Record not found"); 
        }
        else{
            for(Usersignup usu : usu1)
            {
                System.out.println(usu.getName()+"    "+usu.getUserId()+"        "+usu.getContactNo()+"      "+usu.getAddharNo()+"  "+usu.getEmail()+"  "+usu.getAddress());
            }
            
        }
        
        
    }
    
}
