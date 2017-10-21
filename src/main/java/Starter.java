//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import ru.bereza.jpa.config.AppConfiguration;
//import ru.bereza.jpa.dao.DaoServiceImpl;
//import ru.bereza.jpa.dao.User;
//
///**
// * @author Igor Bereza
// */
//public class Starter {
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = null;
////        try {
//            context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//            DaoServiceImpl application = context.getBean(DaoServiceImpl.class);
//
//            User user = new User();
//            user.setName("Name");
//            user.setId(1);
//
//            application.save(user);
//
////        } catch (Exception e) {
////            e.printStackTrace();
////        } finally {
////            context.close();
////        }
//    }
//}
