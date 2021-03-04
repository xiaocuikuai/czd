package cn.usst.dao;

import cn.usst.domain.Items;

public interface ItemsDao {
    public Items findById(Integer id);
    void saveone(Items items);
}
