import com.ppx.structure.SinglyLinkedListSentinel;
import org.junit.Test;

public class SinglyLinkedListSentinelTest {

    @Test
    public void t1() {
        SinglyLinkedListSentinel sentinel = new SinglyLinkedListSentinel();
        sentinel.addFirst(1);
        sentinel.addFirst(2);
        sentinel.addFirst(3);
        sentinel.forEach();
    }

    @Test
    public void t2() {
        SinglyLinkedListSentinel sentinel = new SinglyLinkedListSentinel();
        sentinel.addLast(0);
        sentinel.addLast(1);
        sentinel.addLast(2);
        sentinel.addLast(3);
        sentinel.forEach();
    }

    @Test
    public void t3() {
        SinglyLinkedListSentinel sentinel = new SinglyLinkedListSentinel();
        sentinel.addLast(0);
        sentinel.addLast(1);
        sentinel.addLast(2);
        sentinel.removeFirst();
        sentinel.forEach();
    }
}
