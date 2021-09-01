import java.util.ArrayList;

public class genericsDemo2 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList();
        list1.add("1"); //编译通过
        //list1.add(1); //编译错误
        String str1 = list1.get(0); //返回类型就是String

        ArrayList list2 = new ArrayList<String>();
        list2.add("1"); //编译通过
        list2.add(1); //编译通过
        Object object = list2.get(0); //返回类型就是Object

        ArrayList<String>  al = new ArrayList<String>();
        al.add("11"); //编译通过
        //new ArrayList<String>().add(22); //编译错误

        String str2 = al.get(0); //返回类型就是String
    }
}
