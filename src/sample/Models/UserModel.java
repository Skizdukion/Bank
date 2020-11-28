package sample.Models;

public class UserModel {
    private String accountID;

    private String email;

    private String name;

    private String personalID;

    private String phoneNumber;

    private String address;

    private String memberSince;

    private String balance;

    private String cardNumber;

    private String PIN;

    private String cardCreationDate;


    public UserModel(String accountID, String email, String name, String personalID, String phoneNumber, String address, String memberSince, String balance, String cardNumber, String PIN, String createionDate) {
        this.accountID = accountID;
        this.email = email;
        this.name = name;
        this.personalID = personalID;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.memberSince = memberSince;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.PIN = PIN;
        this.cardCreationDate = createionDate;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPersonalID() {
        return personalID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public String getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPIN() {
        return PIN;
    }

    public String getCardCreationDate() {
        return cardCreationDate;
    }
}
