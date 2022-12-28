class A{
    final void m1(){
        System.out.println("Method 1");
    }
   public void m2(){
        System.out.println("Method 1");
    }
}
class B extends A{
    public void m1(){
        System.out.println("Method 123");
    }
}
class Test{
    public static void main(String args[]){
        B a1=new B();
        a1.m1();
    }
}