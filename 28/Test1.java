class A{
    public void m1(){
        System.out.println("Method m1");
    }
    public void m2(){
        System.out.println("Method m2");
    }
}
class B extends A{
      public void m3(){
        System.out.println("Method m3");
    }
}
class Test{
    public static void main (String[] args){

        A a1=new A();
        a1.m1();
        a1.m2();

        B b1=new B();
        b1.m1();
        b1.m2();
        b1.m3();

    }

}
