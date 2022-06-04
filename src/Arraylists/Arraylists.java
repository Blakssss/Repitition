package Arraylists;

import java.util.ArrayList;

public class Arraylists {
    ArrayList<String> list= new ArrayList<>();
    public void addingStuff(){
        list.add("hello");
        list.remove(0);
        list.add("me");
        list.add("you");
        System.out.println(list.get(1));
        list.set(0,"notMe");
        System.out.println(list);
        list.clear();
        System.out.println(list + "empty");
    }

    public static void main(String[] args) {
        Arraylists arr = new Arraylists();
        arr.addingStuff();
    }
}
