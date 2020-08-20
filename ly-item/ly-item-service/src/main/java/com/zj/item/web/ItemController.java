package com.zj.item.web;

import com.zj.item.pojo.Item;
import com.zj.item.service.ItemService;
import com.zj.lycommon.enums.ExceptionEnums;
import com.zj.lycommon.exception.LyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: leyou
 * @description: 填写描述
 * @author: 张军
 * @create: 2020-08-20 17:41
 **/
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping
    public ResponseEntity<Item> savaItem(Item item){
        //校验价格是否为空
        if (item.getPrice() == null) {
            System.out.println("添加失败");
            //throw new RuntimeException("价格不能为空");
            /*自定义异常*/
            throw new LyException(ExceptionEnums.PRICE_CANNOT_BE_NULL);
        }
        item=itemService.saveItem(item);
        System.out.println("添加成功");
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }
}
