package com.zj.item.service;

import com.zj.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @program: leyou
 * @description: 填写描述
 * @author: 张军
 * @create: 2020-08-20 17:36
 **/
@Service
public class ItemService {
    public Item saveItem(Item item){
        //新增商品，并把新增的商品返回
        int id=new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
