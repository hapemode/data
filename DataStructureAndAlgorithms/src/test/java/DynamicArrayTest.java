import com.ppx.structure.DynamicArray;
import org.junit.Test;

public class DynamicArrayTest {

    @Test
    public void t1() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
        dynamicArray.addLast(5);
        dynamicArray.addLast(6);
        dynamicArray.addLast(7);
        dynamicArray.addLast(8);

        int remove = dynamicArray.remove(2);
        System.out.println("remove = " + remove);
        System.out.println("--------------");
        dynamicArray.loop(integer -> System.out.println(integer));
    }
}
