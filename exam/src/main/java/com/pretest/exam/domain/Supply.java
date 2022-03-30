package com.pretest.exam.domain;

import java.util.Date;

public class Supply {

    private String productId;
    private String updateTimeStamp;
    private Double quantity;

    public Supply(String productId, String updateTimeStamp, Double quantity) {
        this.productId= productId;
        this.updateTimeStamp = updateTimeStamp ;
        this.quantity = quantity ;
    }

    public Supply()
    {

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(String updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "{productId:"+productId+", updateTimeStamp:"+updateTimeStamp+", quantity:"+quantity+", Status:"+"Out Of Sync Update}" ;
    }

}
