package cn.usst.controller;

import cn.usst.domain.Items;
import cn.usst.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;
    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items byId = service.findById(1);
        model.addAttribute("item",byId);
        return "itemDetail";

    }
    @RequestMapping("/saveone")
    public String saveone(){
        service.saveone();
        return "success";

    }
}
