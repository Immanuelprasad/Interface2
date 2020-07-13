interface Demo
{
    void abc();
    default void show()
    {
        System.out.println("In Demo Show");
    }
}
interface MyDemo
{
    default void show()
    {
        System.out.println("In My Demo Show");
    }
}
class DemoImp implements Demo, MyDemo
{
    public void abc()
    {
        System.out.println("In ABC");
    }
    public void show()
    {
        System.out.println("In DemoImp Show");
    }
}
public class Interface2
{
    public static void main(String[] args)
    {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
