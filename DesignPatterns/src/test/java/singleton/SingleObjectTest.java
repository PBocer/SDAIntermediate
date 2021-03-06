package singleton;

import org.junit.Test;
import sda.poznan.phone.MobilePhone;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;


public class SingleObjectTest {
    @Test
    public void getInstance() throws Exception {
//        SingleObject singleObject = new SingleObject();

        MobilePhone object = SingleObject.getInstance();
        MobilePhone  object1 = SingleObject.getInstance();

        assertNotNull(object);
        assertNotNull(object1);
        assertSame(object, object1);
    }

}