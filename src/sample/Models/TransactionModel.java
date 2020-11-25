package sample.Models;

import javafx.beans.value.ObservableValue;

public class TransactionModel {
    private String transactionID;
    private String type;
    private String amount;
    private String exeDate;
    private String atmID;
    private String customerID;
    private String additionalData;

    public TransactionModel() {

    }

    public TransactionModel(String transactionID, String type, String amount, String exeDate, String atmID, String customerID, String additionalData) {
        this.transactionID = transactionID;
        this.type = type;
        this.amount = amount;
        this.exeDate = exeDate;
        this.atmID = atmID;
        this.customerID = customerID;
        this.additionalData = additionalData;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getExeDate() {
        return exeDate;
    }

    public void setExeDate(String exeDate) {
        this.exeDate = exeDate;
    }

    public String getAtmID() {
        return atmID;
    }

    public void setAtmID(String atmID) {
        this.atmID = atmID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }
}
