package java_005;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(null);
        list.add("banana");
        String s1 = list.get(1);
        System.out.println(s1);
        System.out.println(list);

        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("google");
        linkedlist.add("baidu");
        linkedlist.add("taobao");
        linkedlist.add("weixin");
        System.out.println(linkedlist);
    }
}
