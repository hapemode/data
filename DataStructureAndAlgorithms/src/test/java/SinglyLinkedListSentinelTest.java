import com.ppx.structure.SinglyLinkedListSentinel;
import org.junit.Test;

public class SinglyLinkedListSentinelTest {

    @Test
    public void t1() {
        SinglyLinkedListSentinel sentinel = new SinglyLinkedListSentinel();
        sentinel.addLast(0);
        sentinel.addLast(1);
        sentinel.addLast(2);
        sentinel.addLast(3);
        sentinel.forEach();
    }
}
