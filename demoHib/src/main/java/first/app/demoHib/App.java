package first.app.demoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create an Alien object
        Player obj = new Player();
        obj.setAid(7);
        obj.setName("dhoni");
        obj.setrole("wk");
        
        // Print Alien details
        System.out.println(obj.getAid());
        System.out.println(obj.getName());
        System.out.println(obj.getrole());

        // Setting up Hibernate session
        Configuration con = new Configuration().configure("hibernate.cfg.xml")  // Configuring Hibernate
                                               .addAnnotatedClass(Player.class);  // Add your entity class
       
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        try {
            // Start a transaction
            session.beginTransaction();

            // Save the Alien object
            session.save(obj);// hibernate which is convert the java code to sql.
           

            // Commit the transaction
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the session
            session.close();
            sf.close();
        }
    }
}
