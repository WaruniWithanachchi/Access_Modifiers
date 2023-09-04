public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo ac = new AccessModifiersDemo(1, 3.5, true, "Super class");
        {
            System.out.println("privateVar : " + ac.getPrivateVar());
            System.out.println("defaultVar : " + ac.getDefaultVar());
            System.out.println("protectedVar : " + ac.protectedVar);
            System.out.println("publicVar : " + ac.publicVar);
        }

        SubclassDemo as = new SubclassDemo(12, 46.5, false, "Sub class");
        {
            as.displayProtectedVar();
        }
    }
}

