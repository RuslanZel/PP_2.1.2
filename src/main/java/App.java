import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanCopy = (HelloWorld) applicationContext.getBean("helloworld");

//        System.out.println(bean.getMessage());
//        System.out.println(beanCopy.getMessage());
        System.out.println(bean == beanCopy);

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat catCopy = (Cat) applicationContext.getBean("cat");

//        System.out.println(cat.getMessageCat());
//        System.out.println(catCopy.getMessageCat());
        System.out.println(cat == catCopy);
    }
}