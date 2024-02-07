package basicprogram.oops.entity;

protected class Account {
    Long accountNo;
    String ifscCode;

    public Account() {
    }

    public Account(Long accountNo, String ifscCode) {
        this.accountNo = accountNo;
        this.ifscCode = ifscCode;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
