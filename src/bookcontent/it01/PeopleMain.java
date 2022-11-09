package bookcontent.it01;

public class PeopleMain {
    public static void main(String[] args) {
        Chinese chinaPeople=new Chinese();
        American americanPeple=new American();
        Beijingman beijingPeople=new Beijingman();
        chinaPeople.speakHello();
        americanPeple.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeple.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeple.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeple.AmericamBoxing();
        beijingPeople.beijingOpera();
        chinaPeople.chinaGongfu();
    }
}
