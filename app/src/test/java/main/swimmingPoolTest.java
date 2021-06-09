package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SwimmingPoolTest {


  @Test
  void test01() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertThrows(Exception.class,()->s1.swimming(false,2,true,false,6),"Can not come in");;
  }

  @Test
  void test02() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(100, s1.swimming(false, 9, true, true,12));
  }

  @Test
  void test03() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertThrows(Exception.class,()->s1.swimming(true, 30 ,false,false,23),"Can not come in");
  }

  @Test
  void test04() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(125,s1.swimming(true, 65 ,false,true,12));
  }

  @Test
  void test05() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertThrows(Exception.class,()->s1.swimming(false, 90 ,false,true,11),"Can not come in");
  }


  @Test
  void test06() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(200,s1.swimming(false, 30 ,false,false,12));
  }
  @Test
  void test07() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(140,s1.swimming(false, 30 ,true,false,12));
  }

  @Test
  void test08() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(160,s1.swimming(false, 30 ,false,false,6));
  }

  @Test
  void test09() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(160,s1.swimming(false, 65 ,false,false,12));
  }
}
