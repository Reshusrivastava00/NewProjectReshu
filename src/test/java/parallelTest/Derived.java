package parallelTest;
 class Derived extends Base {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.bar();
    }
    void bar(){
        System.out.println("Derived::bar");
    }

     @Override
     void foo() {

     }
 }
