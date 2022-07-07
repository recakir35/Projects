public class Accountancy {
    double salary;
    double payment;

    public Accountancy() {
    }

    public Accountancy(double salary, double payment) {
        this.salary = salary;
        this.payment = payment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Muhasebe{" +
                "salary=" + salary +
                ", payment=" + payment +
                '}';
    }
}
