package bookcontent.it01;

public class American extends People {
    public void speakHello(){
        System.out.println("Hello，how are you？");
    }
    public void averageHeight(){
        height=170;
        System.out.println("American's average height:"+height+"cm");
    }
    public void averageWeight(){
        weight=75;
        System.out.println("American's average weight:"+weight+"kg");
    }
    public void AmericamBoxing(){
        System.out.println("Straight Fist, Hook Fist, Combination Fist");
    }

}
