package cn.usst.test;

import cn.usst.dao.ItemsDao;
import cn.usst.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao dao = ac.getBean(ItemsDao.class);
        Items byId = dao.findById(1);
        System.out.println(byId);
    }
}
