package cn.usst.service;

import cn.usst.domain.Items;

public interface ItemsService {

    public Items findById(Integer id);
    void saveone();
}
