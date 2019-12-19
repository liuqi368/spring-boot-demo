package com.example.demo.controller;

import com.example.model.Shop;
import com.example.model.SopTaskShopPeriod;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuqi
 * @Title: ShopControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/1120:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopControllerTest {

    private List<Shop> lists =new ArrayList();
    private List<SopTaskShopPeriod> listd =new ArrayList();
    @Before
    public void beforeShop(){
        Shop shop=new Shop();
        shop.setId(1);
        shop.setId(2);
        shop.setId(3);
        shop.setId(4);
        lists.add(shop);


        SopTaskShopPeriod sopTaskShopPeriod=new SopTaskShopPeriod();
        sopTaskShopPeriod.setNum(1);
        sopTaskShopPeriod.setNum(2);
        sopTaskShopPeriod.setNum(3);
        listd.add(sopTaskShopPeriod);
    }

    @Test
    public void testShop(){

        Map map =new HashMap();

        for( Shop shop :lists){
            for(SopTaskShopPeriod sopTaskShopPeriod: listd){
                Integer id = shop.getId();
                if(id==sopTaskShopPeriod.getNum()){
                    map.put(id,sopTaskShopPeriod);
                }else{
                    map.put(id,10);
                }
            }
        }
        List rlist=new ArrayList();
        rlist.add(map);

    }


}
