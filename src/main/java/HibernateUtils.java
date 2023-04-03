/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author caothanh
 */
public class HibernateUtils {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    
 
    private static SessionFactory buildSessionFactory() {
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder() //
                .configure() // Load hibernate.cfg.xml from resource folder by default
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void close() {
        getSessionFactory().close();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        try (Session session = HibernateUtils.getSessionFactory().openSession();) {
            // Begin a unit of work
            session.beginTransaction();
            //ADD
//            User user = new User("sam", "mas", "sam@gmail.com");
// 
//            Group group = new Group("Designer");
//            session.save(group);
//
//            UserGroup userGroup = new UserGroup();
//            userGroup.setGroup(group);
//            userGroup.setUser(user);
//            userGroup.setActivated(true);
//            userGroup.setRegisteredDate(new Date());
//
//            user.addUserGroup(userGroup);

//            session.save(user);
                
            //ADD2
//            // this user is obtained from the database with ID 2
//            User user = (User) session.get(User.class, Long.valueOf("2"));
//
//            // this group is obtained from the database with ID 3
//            Group group = (Group) session.get(Group.class, Long.valueOf("3"));
//
//            UserGroup userGroup = new UserGroup();
//            userGroup.setGroup(group);
//            userGroup.setUser(user);
//            userGroup.setActivated(true);
//            userGroup.setRegisteredDate(new Date());
//
//            session.save(userGroup);

                //delete
//                UserGroup userGroup = new UserGroup();
//
//                User user = new User();
//                user.setId(Long.parseLong("2"));
//                userGroup.setUser(user);
//
//                Group group = new Group();
//                group.setId(Long.parseLong("3"));
//                userGroup.setGroup(group);
//
//                session.delete(userGroup);
            //get
            User user = (User) session.get(User.class, Long.valueOf("2"));
            
            System.err.println(user.getUserGroups().get(0).getGroup().getId()+"-----"+user.getUserGroups().get(0).getGroup().getName()+"-----"+user.getUserGroups().get(0).getRegisteredDate());
            System.err.println(user.getUserGroups().get(1).getGroup().getId()+"-----"+user.getUserGroups().get(1).getGroup().getName()+"-----"+user.getUserGroups().get(1).getRegisteredDate());
            System.err.println(user.getUserGroups().get(2).getGroup().getId()+"-----"+user.getUserGroups().get(2).getGroup().getName()+"-----"+user.getUserGroups().get(2).getRegisteredDate());
            
            
            
            
            session.getTransaction().commit();
                    
    }
}}
