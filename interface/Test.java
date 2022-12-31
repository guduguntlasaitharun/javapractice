interface Testdao{
    int x=200;
}
class Test implements Testdao{
    public static void main(String[] args){
       // x=50; finail default
        System.out.println(x);
        System.out.println(Test.x);
        Test t1=new Test();
        System.out.println(t1.x);
    }
}