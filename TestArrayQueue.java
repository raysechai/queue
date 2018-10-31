package Queue;

public class TestArrayQueue {
    public static void main(String[] args) {
        QueueInterface kids = new ArrayQueue(2);
        kids.add("Sara");
        kids.add("John");
        kids.add("Andy");
        System.out.println(kids);
        System.out.println("kinds.size(): "+kids.size());
        System.out.println("kinds.first(): "+kids.first());
        System.out.println("kinds.remove(): "+kids.remove());
        System.out.println("kinds.size(): "+kids.size());
        System.out.println("kinds.first(): "+kids.first());
        kids.add("Mike");
        System.out.println("kinds.size(): "+kids.size());
        System.out.println("kinds.first(): "+kids.first());
        System.out.println("kinds.remove(): "+kids.remove());
        System.out.println("kinds.size(): "+kids.size());
        System.out.println("kinds.first(): "+kids.first());
        System.out.println("kinds.remove(): "+kids.remove());
        System.out.println("kinds.size(): "+kids.size());
        System.out.println("kinds.first(): "+kids.first());
        System.out.println("kinds.remove(): "+kids.remove());
        System.out.println("kinds.size(): "+kids.size());
        System.out.println("kinds.first(): "+kids.first());
    }
}
