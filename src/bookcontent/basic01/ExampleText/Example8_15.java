package bookcontent.basic01.ExampleText;

public class Example8_15 {
    public static void main(String args[]) {
        StringBuffer str=new StringBuffer();
        System.out.println("capacity:"+str.capacity());
        str.append("大家好");
        System.out.println("str:"+str);
        System.out.println("length:"+str.length());
        System.out.println("capacity:"+str.capacity());
        str.setCharAt(0 ,'w');//将位置是0的字符替换为w
        str.setCharAt(1 ,'e');//将位置是1的字符替换为e
        System.out.println(str);
        str.insert(2, " are all");//在位置2的前插入
        System.out.println(str);
        int index=str.indexOf("好");//求”好“字符的索引位置
        str.replace(index,str.length()," right");//
        System.out.println(str);
        str.append("我们大家都很好.");
        System.out.println(str);
        System.out.println("capacity:"+str.capacity());
        str.delete(0,str.length());//str全部被删除
        System.out.println(str);
        System.out.println("capacity:"+str.capacity());
        System.out.println("length:"+str.length());
    }
}


