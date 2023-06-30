import com.bean.dao.OrderDao;
import factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        //通过静态工厂创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");

        orderDao.save();

        //ClassPathXmlApplicationContext类中才有close容器方法
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx1.registerShutdownHook();//这个方法表示先关闭容器再关闭虚拟机，这个关闭可以放在任何位置

        ctx1.close();//close方法比较暴力关闭容器，只能放在最后面
    }
}
