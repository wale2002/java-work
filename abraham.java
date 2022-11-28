import java.util.Scanner;

public class abraham {
    public static void main(String[] args) {
        //Intro code


        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("atm demo app".toUpperCase());
        System.out.print("Balance of your last transaction:");
        long Balance = sc.nextLong();
        while(true) {
            int word1 = 1;
            System.out.println("1.Transfer to Same Bank and Other Banks");
            int word2 = 2;
            System.out.println("2.Check balance");
            int word3 = 3;
            System.out.println("3.Withdrawal");
            int word4 = 4;
            System.out.println("4.Recharge Credit ");
            System.out.println();
            System.out.print("NOTE: in cases of irresponsivenes, kindly text your commands once more\n" + "Proceed:");
            int input = sc.nextInt();
            int d = 1;
            int d1 = 2;
            while (true) {
                if (input == 1) {
                    System.out.println("1.Other Uba Accounts");
                    System.out.println("2.Other Bank Accounts");
                    System.out.println();
                    System.out.print("proceed:");
                    int Enter6 = sc.nextInt();
                    if (Enter6 == d)
                        System.out.print("Kindly input the account details:");
                    long Enter9 = sc.nextLong();
                    while (true) {
                        if (Enter9 >= 000_000_000_00L && Enter9 <= 999_999_999_99L) {
                            System.out.println("Generating details....");
                            break;
                        } else
                            System.out.println("");
                        break;
                    }

                    while (true) {
                        System.out.println("Kindly select bank:");
                        if (Enter6 == d1) ;
                        System.out.println("1.Access Bank Plc\n" +
                                "2.Fidelity Bank Plc\n" +
                                "3.First City Monument Bank Limited\n" +
                                "4.First Bank of Nigeria Limited\n" +
                                "5.Guaranty Trust Holding Company Plc\n" +
                                "6.Union Bank of Nigeria Plc\n" +
                                "7.United Bank for Africqa Plc\n" +
                                "8.Zenith Bank Plc\n");
                        break;
                    }
                }
                //Checking balance
                else if (input == 2) {
                    System.out.println("Checking Balance...");
                    System.out.println("Current Balance:" + Balance);
                    System.out.println();
                }

                //Withdrawal Interface
                else if (input == 3) {
                    System.out.println("Withdrawal Interface");
                    System.out.println();
                    System.out.println("Please Wait...");
                    System.out.println("1.Savings Account");
                    System.out.println("2.Current Account");
                    System.out.println();
                    System.out.print("Proceed:");
                    int Enter22 = sc1.nextInt();
                    if (Enter22 == 1) {

                        System.out.println("Loading...");
                        System.out.println();


                        System.out.println("Pin".toUpperCase());
                        while (true) {
                            System.out.print("Proceed:");
                            int Enter1 = sc1.nextInt();
                            if (Enter1 >= 1000 && Enter1 <= 9999)
                                break;
                            System.out.println("Enter a 4 digits pin number");
                        }
                        System.out.println();
                        System.out.println("How much would you like to transfer?");
                        System.out.println("1.N3,000");
                        int c1 = 3_000;
                        int c2 = 5_000;
                        System.out.println("2.N5,000");
                        int c3 = 10_000;
                        System.out.println("3.N10,000");
                        int c4 = 15_000;
                        System.out.println("4.N15,000");
                        int c5 = 20_000;
                        System.out.println("5.N20,000");
                        System.out.print("Proceed:");
                        int newBalance = sc.nextInt();
                        int Enter3 = sc.nextInt();

                        while (true) {
                            if (Balance < c1 && Balance < c2 && Balance < c3 && Balance < c4 && Balance < c5) {
                                System.out.println("Insufficient Main Balance:" + Balance);
                                if (Balance == c1 || Balance > c2 || Balance > c3 || Balance > c4 || Balance > c5) {
                                    newBalance = (int) Balance - (int) c1;
                                    newBalance = (int) Balance - (int) c2;
                                    newBalance = (int) Balance - (int) c3;
                                    newBalance = (int) Balance - (int) c4;
                                    newBalance = (int) Balance - (int) c5;
                                }
                                break;
                            } else
                                System.out.println("Processing...");
                            System.out.println("Remove cash from counter");
                            System.out.println("NewBalance:" + newBalance);

                            break;
                        }
                    } else {
                        System.out.println("Error: you created a Savings account ");
                    }

                }
                //Recharge Using Utility bills
                else if (input == 4) {
                    System.out.println("1.Recharge Credit");
                    System.out.println("2.installment loans");
                    System.out.println("3.auto loans");
                    System.out.println("4.mortgage loans");
                    System.out.println("5.credit card bills");
                    System.out.println("6.electric bills");
                    System.out.println("7.cable bills");
                    System.out.println();
                    while (true) {
                        System.out.print("Proceed:");
                        int Enter4 = sc1.nextInt();
                        if (Enter4 == 1 && Enter4 == 2 && Enter4 == 3 && Enter4 == 4 && Enter4 == 5 && Enter4 == 6 && Enter4 == 7) {
                            System.out.println("Procssing request,please wait...");
                            break;
                        }
                        System.out.println("Invalid Entry");

                    }

                }
                System.out.println();
                Scanner sc3 = new Scanner(System.in);
                System.out.print("Do you want to perform another transaction?:");
                String Enter45 = sc3.next();
                if (Enter45 == "Yes" || Enter45 == "yes" || Enter45 == "YES") {

                    break;
                } else
                    System.out.print("Do you want to return to homepage?");
                break;
            }
            String Enter46 = sc.next();
            System.out.println();

            if (Enter46 == "Yes" || Enter46 == "yes" || Enter46 == "YES") {

                break;

            } else
                System.out.println("Thank you for banking with us\n" + "Kindly remove your card.");
            break;
        }

    }
}

