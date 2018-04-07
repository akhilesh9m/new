

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
public class StackTest1 {
   @Test
    public void testPush() {
        System.out.println("push");
        int pushedElement = 10;
         int expResult =1;
            Stack instance = new Stack(3);
        int result;
         result = instance.push(pushedElement);
        assertEquals(expResult, result);
         pushedElement = 20;
         expResult = 1;
          result = instance.push(pushedElement);
        assertEquals(expResult, result);
        String s="2010";
        String s1=instance.printElements();
        assertEquals(s,s1);
        // TODO review the generated test code and remove the default call to fail.
       int element1=instance.pop();
               assertEquals(20,element1);
           element1=instance.pop();
                   assertEquals(10,element1);
                   element1=instance.pop();
                   assertEquals(-1,element1);
                   
    }

    /**
     * Test of pop method, of class Stack.
     */
    
    
}