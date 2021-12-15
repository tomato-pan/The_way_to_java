package java_005;

import java.util.*;

public class CollectDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add(null);
        list.add("banana");
        String s1 = list.get(1);
        System.out.println(s1);
        list.set(2,"kiwifruit");
        list.remove(1);
        System.out.println(list);
        Collections.sort(list);// 排序
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for (String ll:list) {
            System.out.println(ll);
        }

        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("google");
        linkedlist.add("baidu");
        linkedlist.addFirst("wiki"); // 添加头部
        linkedlist.addLast("wiki"); // 添加尾部
        linkedlist.removeFirst(); // 移除头部
        linkedlist.removeLast(); // 移除尾部
        System.out.println(linkedlist);
        for (int i = 0; i < linkedlist.size() ; i++) {
            System.out.println(linkedlist.get(i));
        }
        for (String ll:linkedlist) {
            System.out.println(ll);
        }
    }
}
