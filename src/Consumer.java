import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer20010315OmitComments;

/**
 * Created by IntelliJ IDEA.
 * User: joann
 * Date: 5/5/12
 * Time: 6:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Consumer implements Runnable{

     private Shared s;

    Consumer (Shared s){
        System.out.println (" 3 ");
        this.s = s;
    }

    public void run(){
        char ch;

        do{
            System.out.println (" 4 ");
            ch = s.getSharedChar();
            System.out.println(ch+" consumed by consumer");
        }  while (ch != 'Z');
    }

}
