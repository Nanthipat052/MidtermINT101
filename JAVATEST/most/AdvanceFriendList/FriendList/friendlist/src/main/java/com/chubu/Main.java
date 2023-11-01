package com.chubu;

import work02.FriendList;

public class Main {

    public static void main(String[] args) {
        FriendList f1 = FriendList.newList();
        
        f1.addFriend("Most");
        f1.addFriend("Fern");
        f1.addFriend("Both");
        f1.addFriend("Pos");

        System.out.println("Result : " + f1);
    }
}
