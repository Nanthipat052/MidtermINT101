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
        // addFriend("Most");
        // ["",["Most",["Nut",["Fern",null]]]];
        // start = this.next = ["Most",null]
        // c.next != null
        // c.friend == friend return false

        FriendList c = this;

        // ["",null]
        //
        // addFriend("Most")
        //
        // ["", ["Most",null]]

        // เพิ่มเพื ่อน
        while (c.next != null) {
            c = c.next;
            // c = ["Most",null]
        }
        c.next = new FriendList(friend);

        FriendList c2 = this;
        // add("Most")
        // ["",["Most",null]]
        // add("Most")
        // ["",["Most",["Most",null]]]

        // เช็คว่ามีเพื่อนชื่อนี้อยู่หรือยัง
        while (c2.next != null) {
            if (friend == c2.friend) {
                c.next = null;
                return false;
            }
            c2 = c2.next;
        }

        return true;
    }

    public void popFriend() {
        // this = ["",["Most",["Fern",null]]]
        // popFriend()
        // this = ["",["Most",null]]

        // ["",["Most",["Fern",null]]]
        FriendList c = this;
        // ["",["Most",["Fern",null]]]
        FriendList prev = c;
        while (c.next != null) {
            // ["",["Most",["Fern",null]]]
            // ["Most",["Fern",null]]
            prev = c;
            // ["Most",["Fern",null]]
            // ["Fern",null]
            c = c.next;
        }
        prev.next = null;

    }

    // ["Most",....]
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        // ["",["Most",null]]

        FriendList c = this.next;
        // ["",["Most",null]]
        // ["Most",null]
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
