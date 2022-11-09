package bookcontent.it04;

public class Test {
    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.setWorkHour(4);
        doc.work();

        HospitalManager HospitalManager=new HospitalManager() {
            public void method() {

            }
        };
        HospitalManager.work();

        HospitalManager.manage(doc);

    }
}