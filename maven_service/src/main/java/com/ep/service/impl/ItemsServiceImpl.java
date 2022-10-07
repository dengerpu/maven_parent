package com.ep.service.impl;

import com.ep.domain.Items;
import com.ep.mapper.ItemsMapper;
import com.ep.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @author dep
 * @version 1.0
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;
    public Items findById(int itemId) {
        return itemsMapper.findById(itemId);
    }
}
