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

    }

}
