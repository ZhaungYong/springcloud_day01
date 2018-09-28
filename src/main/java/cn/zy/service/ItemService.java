package cn.zy.service;

import cn.zy.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {
    private final static Map<String, Item> MAP = new HashMap<>();

    static {
        MAP.put("1", new Item(1L, "123", "", "", 123L));
        MAP.put("2", new Item(1L, "123", "", "", 123L));
        MAP.put("3", new Item(1L, "123", "", "", 123L));
        MAP.put("4", new Item(1L, "123", "", "", 123L));
        MAP.put("5", new Item(1L, "123", "", "", 123L));
        MAP.put("6", new Item(1L, "123", "", "", 123L));
        MAP.put("7", new Item(1L, "123", "", "", 123L));
        MAP.put("8", new Item(1L, "123", "", "", 123L));
        MAP.put("9", new Item(1L, "123", "", "", 123L));
        MAP.put("10", new Item(1L, "123", "", "", 123L));
    }

    public Item getItem(String id){
        return MAP.get(id);
    }
}
