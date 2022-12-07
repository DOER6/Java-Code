package bookcontent.basic01.ExampleText;

interface Advertisement { //接口
    public void showAdvertisement();
    public String getCorpName();
}
//-----------------------------------------------
class AdvertisementBoard { //负责创建广告牌
    Advertisement adver;
    public void setAdvertisement(Advertisement adver){
        this.adver = adver;
    }//接口类型参数adver
    public void show() {
        if(adver == null){
            System.out.println("广告招商中");
        }
        else {
            adver.showAdvertisement(); //接口回调，调用showAdvertisement方法
        }
    }
}
//-----------------------------------------------
class BlackLandCorp implements Advertisement {
    public void showAdvertisement(){
        System.out.println("**************");
        System.out.printf("劳动是爹\\n土地是妈\\n");
        System.out.println("**************");
    }
    public String getCorpName() {
        return "黑土集团" ;
    }
}
//-----------------------------------------------
class WhiteCloudCorp implements Advertisement { //PhilipsCorp实现Avertisement接口
    public void showAdvertisement(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.printf("飞机中的战斗机，哎yes!\\n");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
    }
    public String getCorpName() {
        return "白云有限公司" ;
    }
}
//-----------------------------------------------
public class Example6_7 {
   public static void main(String args[]) {
       AdvertisementBoard board = new AdvertisementBoard();
       board.show();
       board.setAdvertisement(new BlackLandCorp()); 
       board.show();
       board.setAdvertisement(new WhiteCloudCorp()); 
       board.show();
   }
}
