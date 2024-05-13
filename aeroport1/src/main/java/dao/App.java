package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import metier.Airport;
import metier.Siege;
import metier.Vol;

public class App {

    public static void main(String[] args) {
        
        Airport airport = new Airport("Tokyo", "Tokyo", "Casa", "Japan");
        Vol vol = new Vol();
        vol.setAirport(airport);
        vol.setCompagnie("Test Airlines");
        vol.setDate_depart("20");
        vol.setDate_arrive("11");
        vol.setPrix(500);
        
        Siege siege = new Siege(vol, 1,true); // Create a siege associated with the vol
        
        Configuration config = new Configuration();
        config.configure("Hibernate.cfg.xml");
        
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(airport); // Save the associated airport
        session.save(vol); // Save the vol
        session.save(siege); // Save the siege
        
        tx.commit();
        session.close();
        
        System.out.println("Record saved successfully!");
    }

}
