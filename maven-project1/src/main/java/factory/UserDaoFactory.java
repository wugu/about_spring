package factory;

import com.bean.dao.UserDao;
import com.bean.dao.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
