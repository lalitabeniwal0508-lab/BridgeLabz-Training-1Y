package com.GLA.Package.Level1;

public class Derived extends Base {
    public void testAccess() {
        publicMethod();       // Accessible
        protectedMethod();    // Accessible (subclass in same package)
        defaultMethod();      // Accessible (same package)
        // privateMethod();   // Not accessible (private to Base)
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();

        System.out.println("\nAccessibility Summary:");
        System.out.println("✔ Public method accessible");
        System.out.println("✔ Protected method accessible");
        System.out.println("✔ Default method accessible (same package)");
        System.out.println("✘ Private method NOT accessible");
    }
}