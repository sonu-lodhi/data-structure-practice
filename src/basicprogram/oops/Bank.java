package basicprogram.oops;

import basicprogram.oops.entity.Account;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(8821873527L, "SBIN000380");
        System.out.println(ac.getAccountNo());
    }
}
