package com.pretest.exam.controller;

import com.pretest.exam.domain.Order;
import com.pretest.exam.domain.Supply;
import com.pretest.exam.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class SupplyController {

    @Autowired
    private SupplyService service ;


    @GetMapping("/get")
    public ResponseEntity ProductInfo()
    {
        List<Supply> p1 = service.getSupply() ;
        return ResponseEntity.ok(p1) ;
    }

    @PostMapping("/updateSupply")
    public ResponseEntity CreateSupply(@RequestBody Supply supply)
    {
        Supply p2 = service.CreateSupply(supply) ;
        System.out.print(p2);
        return ResponseEntity.status(HttpStatus.CREATED).build() ;
        //return ResponseEntity.ok(p1) ;
    }

    @GetMapping("/getOrderDetails")
    public ResponseEntity getOrderDetails()
    {
        List<Order> p3 = service.getOrderDetails() ;
        System.out.println(p3) ;
        return ResponseEntity.ok(p3) ;
    }
}
