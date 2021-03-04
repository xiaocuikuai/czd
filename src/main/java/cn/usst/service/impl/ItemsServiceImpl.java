package cn.usst.service.impl;

import cn.usst.dao.ItemsDao;
import cn.usst.domain.Items;
import cn.usst.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao dao;
    @Override
    public Items findById(Integer id) {
        Items byId = dao.findById(id);
        return byId;
    }

    @Override
    public void saveone() {
        Items items = new Items();
        items.setName("haha");
        items.setDetail("xixi");
        dao.saveone(items);
        Items byId = dao.findById(9);
        System.out.println(byId);
    }
}
