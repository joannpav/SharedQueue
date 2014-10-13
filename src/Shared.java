/**
 * Created by IntelliJ IDEA.
 * User: joann
 * Date: 5/5/12
 * Time: 6:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Shared {
   private char c = '\u0000';
   private boolean writeable = true;

   synchronized void setSharedChar (char c)
   {
      while (!writeable)
         //try
         //{
             System.out.println (" 5 ");
            //wait ();
         //}
         //catch (InterruptedException e) {}
       System.out.println (" 6 ");

      this.c = c;
      writeable = false;
      //notify ();
   }

   synchronized char getSharedChar ()
   {
      while (writeable)
         //try
         //{
             System.out.println (" 7 ");
           // wait ();
         //}
         //catch (InterruptedException e) { }
        System.out.println (" 8 ");
      writeable = true;
      //notify ();

      return c;
   }
}
