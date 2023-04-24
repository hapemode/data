import com.ppx.structure.SinglyLinkedList;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void t1() {
        SinglyLinkedList node = new SinglyLinkedList();
        node.addFirst(1);
        node.addFirst(2);
        node.addFirst(3);
        node.addFirst(4);
        node.addFirst(5);
        node.loopWhile();
    }

    @Test
    public void t2() {
        SinglyLinkedList node = new SinglyLinkedList();
        node.addLast(1);
        node.addLast(2);
        node.addLast(3);
        node.addLast(4);
        node.loopRecursion();
    }

    @Test
    public void t3() {
        SinglyLinkedList node = new SinglyLinkedList();
        node.addLast(1, 2, 3, 4, 5);
        node.loopRecursion();
    }

    @Test
    public void t4() {
        SinglyLinkedList node = new SinglyLinkedList();
        node.addLast(1, 2, 3, 4, 5);
        int byIndex = node.findByIndex(0);
        System.out.println("byIndex = " + byIndex);
        int byIndex1 = node.findByIndex(1);
        System.out.println("byIndex1 = " + byIndex1);
        int byIndex2 = node.findByIndex(2);
        System.out.println("byIndex2 = " + byIndex2);
        int byIndex5 = node.findByIndex(5);
        System.out.println("byIndex5 = " + byIndex5);
    }
}
