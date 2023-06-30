package factory;

import com.bean.dao.UserDao;
import com.bean.dao.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
//默认单例，改为true为非单例
    @Override
    public boolean isSingleton() {
        return false;//单例
    }
}
