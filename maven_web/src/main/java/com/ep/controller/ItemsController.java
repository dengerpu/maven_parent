package com.ep.controller;

import com.ep.domain.Items;
import com.ep.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * @author dep
 * @version 1.0
 */
@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    // 展示商品信息页面
    @RequestMapping("/showItem")
    public String showItem(Model model) {
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "viewItem";
    }
}
