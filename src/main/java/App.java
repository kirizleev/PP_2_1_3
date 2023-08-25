import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld anotherBean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catbean = applicationContext.getBean("cat", Cat.class);
        Cat anotherCatbean = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(anotherBean.getMessage());
        System.out.println(bean == anotherBean);
        System.out.println(catbean.getName());
        System.out.println(anotherCatbean.getName());
        System.out.println(catbean == anotherCatbean);
    }
}