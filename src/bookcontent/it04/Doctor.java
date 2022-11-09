package bookcontent.it04;

public class Doctor extends MedicalStaff implements hospitalEmployee{

    public void method() {
    }

    public void resting() {
        System.out.println("Medical staff resting");
    }
    int hours;
    public Integer setWorkHour(int t) {
        hours =t;
        return (hours);
    }
    public void work(){
        System.out.println("Doctor working "+hours+" hours");
    }
}
