import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
    public static void main(String[] args) {
        //加载类路径下的配置文件
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从文件系统下加载配置文件
        //ApplicationContext ctx2 = new FileSystemXmlApplicationContext("C:\\Users\\biyue\\IdeaProjects\\maven-peoject4\\src\\main\\resources\\applicationContext.xml");



        //仅了解
        //BeanFactory延迟加载，ApplicationContext立即加载
//        Resource resouces = new ClassPathResource("applicationContext.xml");
//        BeanFactory bf = new XmlBeanFactory(resouces);


    }
}
