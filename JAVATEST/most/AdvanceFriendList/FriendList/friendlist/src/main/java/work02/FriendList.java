package work02;

public class FriendList {

    private final String friend;
    private FriendList next;

    private FriendList(String friend) {
        this.friend = friend;
    }

    public static FriendList newList() {
        return new FriendList("");
    }

    public boolean addFriend(String friend) {
        if (friend.equals(null) || friend.isBlank()) {
            return false;
        }

        FriendList c = this;

        while (c.next != null) {
            c = c.next;
        }
        c.next = new FriendList(friend);

        FriendList c2 = this;

        while (c2.next != null) {
            if (friend == c2.friend) {
                c.next = null;
                return false;
            }
            c2 = c2.next;
        }

        return true;
    }

    public boolean popFriend() {
        FriendList c = this;
        if (this.next == null) {
            return false;
        }
        FriendList prev = c;
        while (c.next != null) {
            prev = c;
            c = c.next;
        }
        prev.next = null;
        return true;
    }

    public boolean unshiftFriend(String friend) {
        if (friend.equals(null) || friend.isBlank()) {
            return false;
        }

        FriendList c = this;
        if (c.next == null) {
            c.next = new FriendList(friend);
        }

        FriendList newObj = new FriendList(friend);
        newObj.next = c.next;

        this.next = newObj;
        return true;
    }

    public boolean shiftFriend() {
        if (this.next == null) {
            return false;
        }

        FriendList c = this;
        FriendList nextC = this.next;

        FriendList newList = new FriendList("");
        while (nextC.next != null) {
            nextC = nextC.next;
            newList.addFriend(nextC.friend);
        }

        this.next = newList.next;

        return true;
    }

    public int countFriends() {
        int count = 0;
        FriendList c = this;

        while (c.next != null) {
            count++;
            c = c.next;
        }
        return count;
    }

    public FriendList searchFriend(int index) {
        int countFriends = this.countFriends();
        if (index > countFriends) {
            throw new IllegalArgumentException();
        } else if (index == 0) {
            return this;
        } else if (index < 0) {
            // 4 - 1 = 3
            index = (countFriends + index) + 1;
            if (index == 0) {
                return this;
            } else if (index < 0) {
                throw new IllegalArgumentException();
            }
        }

        FriendList c = this.next;
        for (int i = 1; i < index; i++) {
            c = c.next;
        }

        return c;
    }

    public String getNameFriend(int index) {
        return this.searchFriend(index).friend;
    }

    public boolean ChangeName(int index, String friend) {
        int countFriends = this.countFriends();
        if (index == 0 || index > countFriends) {
            throw new IllegalArgumentException();
        } else if (index < 0) {
            // 4 - 1 = 3
            index = (countFriends + index) + 1;
            if (index <= 0) {
                throw new IllegalArgumentException();
            }
        }
        //["",["Most",["Fern",null]]]
        FriendList c = this;
        FriendList search = this.searchFriend(index - 1).next;
        FriendList newList = new FriendList(friend);
        while (search.next != null) {
            search = search.next;
            newList.addFriend(search.friend);
        }

        for (int i = 1; i < index; i++) {
            c = c.next;
        }

        c.next = newList;

        return true;
    }

    public void deleteAllFriends() {
        this.next = null;
    }

    public boolean deleteFriend(int index) {
        int countFriends = this.countFriends();
        if (index > countFriends) {
            throw new IllegalArgumentException();
        } else if (index == 0) {
            return false;
        } else if (index < 0) {
            // 4 - 1 = 3
            index = (countFriends + index) + 1;
            if (index == 0) {
                return false;
            } else if (index < 0) {
                throw new IllegalArgumentException();
            }
        }
        // "" Most Fern Both Pos
        FriendList c = this;
        // Most Fern Both Pos
        FriendList search = this.searchFriend(index);
        System.out.println("c = " + c);
        System.out.println("c.friend = " + c.friend);

        System.out.println("search = " + search);
        System.out.println("search.friend = " + search.friend);
        for (int i = 1; i < index; i++) {
            c = c.next;
        }
        c.next = search.next;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        FriendList c = this.next;
        while (c != null) {
            s.append(c.friend);
            c = c.next;
            if (c != null) {
                s.append(", ");
            }
        }

        return s.toString();
    }

}
