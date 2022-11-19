package caseStudy.models;

public class Contract extends Booking{
    private int numContract;
    private double deposit;
    private double totalPayment;
    public Contract() {
    }

    public Contract(Integer idBooking, int numContract, double deposit, double totalPayment) {
        super(idBooking);
        this.numContract = numContract;
        this.deposit = deposit;
        this.totalPayment=totalPayment;
    }

    public int getNumContract() {
        return numContract;
    }

    public void setNumContract(int numContract) {
        this.numContract = numContract;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numContract=" + numContract +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
