package bookcontent.it01;

public class People {
    protected double height,weight;
    public void speakHello(){
        System.out.println("hello");
    }
    public void averageHeight(){
        height=175;
        System.out.println("average height:"+height);
    }
    public void averageWeight(){
        weight=60;
        System.out.println("average weight:"+weight+"kg");
    }

}
