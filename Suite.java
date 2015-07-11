import junit.framework.Test;
import junit.framework.TestSuite;

public class Suite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(login.class);
    suite.addTestSuite(Create_film.class);
    suite.addTestSuite(Delete_film.class);
    suite.addTestSuite(logout.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
