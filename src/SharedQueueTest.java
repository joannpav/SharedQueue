/**
 * Created by IntelliJ IDEA.
 * User: joann
 * Date: 5/5/12
 * Time: 6:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class SharedQueueTest {

    public static void main(String[] argv){
      Shared s = new Shared();
      new Producer(s).run();
      new Consumer (s).run();
    }
}

