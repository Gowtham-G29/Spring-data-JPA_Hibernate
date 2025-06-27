import org.hibernate.Session;

public class HibernateDemo {
    public static void main(String[] args) {

        Session session=HibernateUtil.getSession();
        try{
            UserInfo userInfo =new UserInfo("Alice","alice@gmail.com");
            session.beginTransaction();
            session.persist(userInfo);
            session.getTransaction().commit();
            System.out.println("Successfully added userInfo"+ userInfo.getId());
        }finally {
            HibernateUtil.closeSession();;
        }
    }
}
