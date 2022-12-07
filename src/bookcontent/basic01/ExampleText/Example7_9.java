package bookcontent.basic01.ExampleText;

public class Example7_9 {
    public static void main(String args[]) {
        CargoBoat ship = new CargoBoat();
        ship.setMaxContent(1000);
        int m = 0;
        try{
            m =600;
            ship.loading(m);
            m = 400;
            ship.loading(m);
            m = 367;
            ship.loading(m);//抛出异常
            m = 555;
            ship.loading(m);
        }
        catch(DangerException e) {
            System.out.println(e.warnMess());
            System.out.println("无法再装载重量是"+m+"吨的集装箱");
            try {
                ship.loading(-m); //卸载货物
            }
            catch(DangerException exp) {
                System.exit(0);  //程序退出，不再给机会
            }
        }
        finally {
            System.out.printf("货船将正点启航\n");
            System.out.println("目前装载了"+ship.realContent+"吨货物");
        }
    }
}

class CargoBoat {
    int realContent;  //装载的重量
    int maxContent;   //最大装载量
    public void setMaxContent(int c) {
        maxContent = c;
    }
    public void loading(int m) throws DangerException {
        realContent += m;
        if(realContent>maxContent) {
            throw new DangerException();
        }
    }
}

class DangerException extends Exception {
    final String message = "超重";
    public String warnMess() {
        return message;
    }
}
