package factory;

import com.bean.dao.OrderDao;
import com.bean.dao.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
