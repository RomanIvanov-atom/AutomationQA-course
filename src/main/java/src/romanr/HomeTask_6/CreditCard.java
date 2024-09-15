package src.romanr.HomeTask_6;

import java.util.Scanner;

public class CreditCard {
    String cardNumber;
    double currentSum;

    public CreditCard(String cardNumber, double currentSum) {
        this.cardNumber = cardNumber;
        this.currentSum = currentSum;
    }

    public void minusMoney(double money) {
        this.currentSum -= money;
    }

    public void plusMoney(double money) {
        this.currentSum += money;
    }

    public void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CreditCard {" +
                "cardNumber='" + cardNumber + '\'' +
                ", currentSum=" + currentSum +
                '}';
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start sum (NOT < 0 OR = 0) for 1st card: ");
        double startSum1 = scanner.nextDouble();

        System.out.println("Enter start sum (NOT < 0 OR = 0) for 2nd card: ");
        double startSum2 = scanner.nextDouble();

        System.out.println("Enter start sum (NOT < 0 OR = 0) for 3rd card: ");
        double startSum3 = scanner.nextDouble();

        if (startSum1 <= 0 || startSum2 <= 0 || startSum3 <= 0) {
            throw new Exception("Start sum can not be <= 0");
        }

        CreditCard card1 = new CreditCard("someNumber_1", startSum1);
        CreditCard card2 = new CreditCard("someNumber_2", startSum2);
        CreditCard card3 = new CreditCard("someNumber_3", startSum3);

        CreditCard[] cards = new CreditCard[] {card1, card2, card3};

        System.out.println("Start cards state: ");
        for (CreditCard card : cards) {
            card.getInfo();
            System.out.println();
        }

        //test
        card1.plusMoney(10);
        card2.plusMoney(20);
        card3.minusMoney(30);

        System.out.println("Cards state after test: ");
        for (CreditCard card : cards) {
            card.getInfo();
            System.out.println();
        }
    }
}
