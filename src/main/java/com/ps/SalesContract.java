package com.ps;

public class SalesContract extends DealershipContract {

    private float salesTaxAmount = .05f;
    private int recordingFee = 100;

    public SalesContract(String dateOfContract,
                         String customerName,
                         String customerEmail,
                         boolean vehicleSold,
                         double totalPrice,
                         double monthlyPayment,
                         float salesTaxAmount,
                         int recordingFee
    ) {
        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
