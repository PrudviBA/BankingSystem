package com.banking;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Banking_Operations> accounts = new ArrayList<Banking_Operations>();

    public void addAccount(Banking_Operations account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (Banking_Operations account : accounts) {
            System.out.println("Account Balance: " + account.viewBalance());
        }
    }
}
