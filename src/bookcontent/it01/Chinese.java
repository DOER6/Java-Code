package bookcontent.it01;

public class Chinese extends People{
    public void speakHello(){
        System.out.println("你好");
    }
    public void averageHeight(){
        height=173.22;
        System.out.println("中国人的平均身高："+height+"cm");
    }
    public void averageWeight() {
        weight=61;
        System.out.println("中国人的平均体重"+weight+"kg");
    }
    public void chinaGongfu(){
        System.out.println("行如风，坐如钟，站如松");
    }
}