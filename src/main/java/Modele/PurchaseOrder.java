/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Date;

/**
 *
 * @author pedago
 */
public class PurchaseOrder {

    private int orderNum;
    private int customerId;
    private int productId;
    private int quantity;
    private double shippingCost;
    private Date salesDate;
    private Date shippingDate;
    private String freightCompany;
    
    public PurchaseOrder(int orderNum, int customerId, int productId, int quantity, double shippingCost, Date salesDate, Date shippingDate, String freightCompany)
    {
        this.orderNum = orderNum;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.shippingCost = shippingCost;
        this.salesDate = salesDate;
        this.shippingDate = shippingDate;
        this.freightCompany = freightCompany;
    }
    
    public PurchaseOrder(int customerId, int productId)
    {
        this.customerId = customerId;
        this.productId = productId;
    }
    
    public void setOrderNum(int orderNum)
    {
        this.orderNum = orderNum;
    }
    
    int getOrderNum()
    {
        return this.orderNum;
    }    

    int getCustomerId()
    {
        return this.customerId;
    }

    int getProductId()
    {
        return this.productId;
    }

    int getQuantity()
    {
        return this.quantity;
    }
    
    double getShippingCost()
    {
        return this.shippingCost;
    }
    
    Date getSalesDate()
    {
        return this.salesDate;
    }

    Date getShippingDate()
    {
        return this.shippingDate;
    }
    
    String getFreightCompany()
    {
        return this.freightCompany;
    }
}

