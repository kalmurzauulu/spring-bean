package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
       HelloWorld bean1= applicationContext.getBean("helloworld",HelloWorld.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean==bean1);


        Cat catBean = applicationContext.getBean("cat",Cat.class);
        System.out.println(catBean);

        Cat catBean1 = applicationContext.getBean("cat",Cat.class);
        System.out.println(catBean1);
        System.out.println(catBean==catBean1);

    }
}
