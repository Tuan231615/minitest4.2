package model;

import java.time.LocalDate;

public class CrispyFlour extends Material{
    private double quantity;

    public CrispyFlour() {
    }
    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public double getAmount() {
        return getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate today = getManufacturingDate();
        LocalDate ExpiryDate = getExpiryDate();
        if (today.isAfter(ExpiryDate.minusMonths(2))) {
            return getAmount() - (getAmount() * 0.4);
        } else if (today.isAfter(ExpiryDate.minusMonths(4))) {
            return getAmount() - (getAmount() * 0.2);
        } else {
            return getAmount() - (getAmount() * 0.05);
        }
    }
}
