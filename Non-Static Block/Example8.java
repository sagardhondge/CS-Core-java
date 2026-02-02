class HDFC {
    int amountBal;
    {
        System.out.println("Login To verify adhar id and otp");
    }

    HDFC(int amountBal) {
        if (amountBal >= 10000) {
            this.amountBal = amountBal;
            System.out.println("Account is successfully created");
        } else {
            System.out.println("Invalid Amount, Please re-enter Valid Amount");
        }
    }

    void getAmountBal() {
        System.out.println("Your Account Balance is: " + amountBal);
    }
}

class Example8 {
    public static void main(String[] args) {
        System.out.println("Start @ cyber success");
        HDFC cust1 = new HDFC(15000); 
        cust1.getAmountBal();
		System.out.println("Stop @ cyber success");
    }
}