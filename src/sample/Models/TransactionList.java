package sample.Models;

import java.util.Random;

public class TransactionList {
    public TransactionModel[] transactionList;
    private int length;

    public TransactionList(int length) {
        this.length = length;
        transactionList = new TransactionModel[length];
        for (int i=0;i<length;i++)
        {
            Random rand = new Random();
            int upperbound = 899999;
            int int_random = rand.nextInt(upperbound) + 100000;
            transactionList[i] = new TransactionModel(int_random + "", "#015", "281100", "Withdrawal", "", "","999,999,000$","20/11/2020");
        }
    }

    public TransactionList(TransactionModel[] transactionList) {
        this.transactionList = transactionList;
    }

    public int getLength() {
        return length;
    }

    public TransactionModel getTransactionListInIndex(int index) {
        return transactionList[index];
    }
}
