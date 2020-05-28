package entities;

public class Customer extends Person {
    private String taxpayerId;
    
    public void add() {
        System.out.println("Add en Customer");
    }

    public void receivePay() {
        System.out.println("Cobrar en Customer");
    }



    

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }


}