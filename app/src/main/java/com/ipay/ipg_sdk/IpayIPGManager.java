package com.ipay.ipg_sdk;

import android.content.Context;

public class IpayIPGManager  {

    private Context context;
    private String packageName;
    private String integrationToken;
    private String totalAmount;
    private String orderId;
    private String orderDescription;
    private String paymentMethod;
    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private String merchantParam1;
    private String merchantParam2;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setIntegrationToken(String integrationToken) {
        this.integrationToken = integrationToken;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setMerchantParam1(String merchantParam1) {
        this.merchantParam1 = merchantParam1;
    }

    public void setMerchantParam2(String merchantParam2) {
        this.merchantParam2 = merchantParam2;
    }

    public void initiatePayment() throws IpayIPGFieldValidationException {
        if(validatesFields()){

        }
    }

    public boolean validatesFields()throws IpayIPGFieldValidationException{

        if(integrationToken == null){
            throw new IpayIPGFieldValidationException("Integration token Not Found!");
        }

        if(packageName == null){
            throw new IpayIPGFieldValidationException("App package name Not Found!");
        }

        if(!validateAppPackageName(packageName)){
            throw new IpayIPGFieldValidationException("Invalid App package name!");
        }

        return true;
    }

    private boolean validateAppPackageName(String packageName){
        String regex = "^([A-Za-z]{1}[A-Za-z\\d_]*\\.)+[A-Za-z][A-Za-z\\d_]*$";
        return packageName.matches(regex);
    }
}
