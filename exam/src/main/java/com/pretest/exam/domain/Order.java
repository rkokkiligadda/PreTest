package com.pretest.exam.domain;

public class Order {
    private String orderId;
    private String productId;
    private Double qty;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Order()
    {

    }
    public Order(String orderId,String productId, Double qty)
    {
        this.orderId = orderId ;
        this.productId = productId ;
        this.qty = qty ;
    }

    @Override
    public String toString()
    {
        return "{orderId:"+orderId+", productId:"+productId+", qty:"+qty+"}" ;
    }
}
