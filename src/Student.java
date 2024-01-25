public class Student extends Person {
    public double gpa;

    Student( String name,String surname,double gpa){
        super(name,surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
