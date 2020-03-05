package com.example.mydemo.adp;

public class adp {
    private String mPurchaseOrder;
    private String mDateOrder;
    private String mOrderStatus;

    public adp(String purchaseOrder,String dateOrder,String orderStatus){
        mPurchaseOrder = purchaseOrder;
        mDateOrder = dateOrder;
        mOrderStatus = orderStatus;

    }
    public String getmPurchaseOrder(){
        return mPurchaseOrder;
    }
    public String getmDateOrder(){
        return mDateOrder;
    }
    public String getOrderStatus(){
        return mOrderStatus;
    }

}
