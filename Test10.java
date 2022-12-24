class Test {
    int a;
    int b;
    static int c;
    public static void main(String[] args) {
         Test t1=new Test();
        
        System.out.println("Hello, World!"); 
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(c);
        System.out.println(Test.c);
        System.out.println(t1.c);
        
    }
   
}
