package org.junit;

import static org.junit.Assert.assertEquals;





public class CarpetWashingTest {

  

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

   

    @Test
    public void test() {
        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
        System.out.println("test");

    }

    

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    

}
