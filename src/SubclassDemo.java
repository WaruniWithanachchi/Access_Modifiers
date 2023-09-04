public class SubclassDemo extends AccessModifiersDemo
{
    public SubclassDemo(int privateVar,double defaultVar,boolean protectedVar,String publicVar)
    {
        super(privateVar,defaultVar,protectedVar,publicVar);
    }

    public void displayProtectedVar()
    {
        boolean value = getProtectedVar();
        System.out.println("ProtectedVar from SubclassDemo: " + value);
    }
}

