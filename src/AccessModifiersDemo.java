public class AccessModifiersDemo {
    private int privateVar;
    double defaultVar;
    protected boolean protectedVar;
    public String publicVar;

    public AccessModifiersDemo(int privateVar,double defaultVar,boolean protectedVar,String publicVar)
    {
        this.privateVar=privateVar;
        this.defaultVar=defaultVar;
        this.protectedVar=protectedVar;
        this.publicVar=publicVar;
    }

    public int getPrivateVar()
    {
        return privateVar;
    }

    double getDefaultVar()
    {
        return defaultVar;
    }

    protected boolean getProtectedVar()
    {
        return  protectedVar;
    }

    public String getPublicVar()
    {
        return publicVar;
    }

}
