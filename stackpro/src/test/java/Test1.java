

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author akhilesh
 */
public class StackTest {


    
    @Test
    public void testPush() {
        System.out.println("push");
        int pushedElement = 10;
            Stack instance = new Stack(3);
        int expResult = 1;
        int result = instance.push(pushedElement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       int element1=instance.pop();
               assertEquals(10,element1);
           element1=instance.pop();
                   assertEquals(-1,element1);
    }

  
}
