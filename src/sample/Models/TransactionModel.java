package sample.Models;

import javafx.beans.value.ObservableValue;

public class TransactionModel {
    private String transactionID;

    private String atmID;

    private String accountID;

    private String transactionType;

    private String recipientID;

    private String paymentID;

    private String amount;

    private String exeDate;

    public TransactionModel() {

    }

    public TransactionModel(String transactionID, String atmID, String accountID, String transactionType, String recipientID, String paymentID, String amount, String exeDate) {
        this.transactionID = transactionID;
        this.atmID = atmID;
        this.accountID = accountID;
        this.transactionType = transactionType;
        this.recipientID = recipientID;
        this.paymentID = paymentID;
        this.amount = amount;
        this.exeDate = exeDate;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getAtmID() {
        return atmID;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getAmount() {
        return amount;
    }

    public String getExeDate() {
        return exeDate;
    }
}
