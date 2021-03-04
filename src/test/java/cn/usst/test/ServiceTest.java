package cn.usst.test;

import cn.usst.dao.ItemsDao;
import cn.usst.domain.Items;
import cn.usst.service.ItemsService;
import cn.usst.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = ac.getBean(ItemsService.class);
        Items byId = service.findById(1);
        System.out.println(byId);
    }
}
