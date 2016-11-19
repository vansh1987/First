package variables;

/**
 * Created by Demo on 11/16/2016.
 */
public class Local_Variable_2
{
    public static void main(String[] args)
    {
        System.out.println("This is main function");
        Local_Variable_2 l = new Local_Variable_2();
        l.m1();
    }

    public void m1()
    {
        int a = 10;
        System.out.println(a);
    }
}
