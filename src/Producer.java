/**
 * Created by IntelliJ IDEA.
 * User: joann
 * Date: 5/5/12
 * Time: 6:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Producer implements Runnable{

    private Shared s;

    Producer(Shared s){
        System.out.println (" 1 ");
        this.s = s;
    }

    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println (" 2 ");
           s.setSharedChar (ch);
           System.out.println (ch + " produced by producer.");
        }
    }

}
