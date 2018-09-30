package cn.zy.contorller;

import cn.zy.config.JdbcConfigBean;
import cn.zy.pojo.Item;
import cn.zy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("item/{id}")
    public Item getItem(@PathVariable("id") String id) {
        return itemService.getItem(id);
    }

    @Autowired
    private JdbcConfigBean jdbcConfigBean;
    @GetMapping(value = "test")
    public String test(){
        return this.jdbcConfigBean.toString();
    }
}
