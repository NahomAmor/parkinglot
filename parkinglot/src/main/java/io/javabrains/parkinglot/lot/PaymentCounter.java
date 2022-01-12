package io.javabrains.parkinglot.lot;

public class PaymentCounter {

    private long totalCash;

    public long getTotalCash() {
        return totalCash;
    }

    public void pay(int amount) {
        totalCash += amount;

    }

    public int calculateCost(int minutes) {
        int amount = 0;
        if (minutes > 1440){
            amount = (minutes/1440) *500;
            minutes -= 1440*(minutes/1440);
        }

        if (minutes<=180){
            amount += minutes*2;
        }else if (minutes<=(1440)){
            amount += minutes;
        }

        return amount;
    }
}
