package bookcontent.it04;

public abstract class HospitalManager implements hospitalEmployee{
    public void work() {
        System.out.println("hospitalManager start working");
    }
    public Doctor manage(Doctor d){
        System.out.println("doctor"+d+"is under managed");
        return d;
    }
}
