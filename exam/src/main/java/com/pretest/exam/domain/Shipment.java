package com.pretest.exam.domain;

public class Shipment {
    private String orderId;
    private String shipmentId ;
    private String productId;
    private String shipmentDate;
    private Double qty ;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Shipment()
    {

    }
    public Shipment(String orderId,String shipmentId,String productId,String shipmentDate,Double qty)
    {
        this.orderId =orderId;
        this.shipmentId = shipmentId;
        this.productId = productId;
        this.shipmentDate= shipmentDate ;
        this.qty = qty;
    }


}
