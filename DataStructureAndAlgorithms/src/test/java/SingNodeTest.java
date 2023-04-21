import com.ppx.structure.SingNode;
import org.junit.Test;

public class SingNodeTest {

    @Test
    public void t1() {
        SingNode node = new SingNode();
        node.addFirst(1);
        node.addFirst(2);
        node.addFirst(3);
        node.addFirst(4);
        node.addFirst(5);
        node.loopWhile();
    }
}
