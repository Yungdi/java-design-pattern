import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    @Test(expected = UnsupportedOperationException.class)
    public void test() {
        List<String> list = new ArrayList<>();
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("world");
    }

}
