public class PP5_12Transaction {
    public static void main(String[] args){
        PP5_12Account acct1 = new PP5_12Account( "Ted Murphy", 72354, 25.59 );
        PP5_12Account acct2 = new PP5_12Account("Angelica Adams", 69713, 0);
        PP5_12Account acct3 = new PP5_12Account("Edward Demsey", 93757, 769.32);

        acct1.deposit( 44.10 );

        double adamsBalance = acct2.deposit( 75.25 );
        System.out.println("Adams balance after deposit: " + adamsBalance);

        System.out.println("Edward balance after withdrawal: " + acct3.withdraw( 480,1.50 ));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}

/*
* Modify the Account class from this chapter so that it also permits
* an account to be opened with just a name and an account num-
* ber, assuming an initial balance of zero, Modify the main method
* of the transactions class to demonstrate this new capability
*/