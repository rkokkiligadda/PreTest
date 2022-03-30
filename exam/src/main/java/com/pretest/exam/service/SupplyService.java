package com.pretest.exam.service;

import com.pretest.exam.domain.Order;
import com.pretest.exam.domain.Supply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class SupplyService {

    public List<Supply> getSupply()
    {
        Supply p1 = new Supply("Product1","2021-03-16T08:53:48.616Z",10.0);
        Supply p2 = new Supply("Product2","2021-03-16T08:59:48.616Z",5.0);
        Supply p3 = new Supply("Product3","2021-03-16T09:10:48.616Z",30.0);
        List<Supply> l = new ArrayList<Supply>() ;
        l.add(p1);
        l.add(p2);
        l.add(p3);

        //List<Supply> collect = l.stream().sorted(((o1,o2)->o1.getpId().compareTo(o2.getpId()))).collect(Collectors.toList());


        return l ;
    }

    public Supply CreateSupply(Supply supply)
    {
        Supply p1 = new Supply(supply.getProductId(),supply.getUpdateTimeStamp(),supply.getQuantity());
        return p1;
    }

    public List<Order> getOrderDetails()
    {
        Order o1 = new Order("Order1", "Prod1", 2.0) ;
        Order o2 = new Order("Order2", "Prod1", 2.0);
        List<Order> ord = new ArrayList<Order>() ;
        ord.add(o1);
        ord.add(o2);
        //l.add(p3);
        //System.out.println(ord);
        ord.forEach(i -> System.out.println(i)) ;
        return ord ;
    }
}
