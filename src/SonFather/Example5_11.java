package SonFather;

class  animal {
   void cry() {
   }  
}
class dog extends animal {
   void cry() {
      System.out.println("汪汪.....");
   }  
}
class cat extends animal  {
   void cry() {
      System.out.println("喵喵.....");
   }  
}
public class Example5_11 { 
   public static void main(String args[]) {
      animal animal1;
      animal1 = new dog();
      animal1.cry();
      animal animal2=new cat();
      animal2.cry();
  }
}
