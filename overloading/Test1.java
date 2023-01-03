class Sai{
    public void m1(){
        System.out.println("M1 method zero arguments");
    }
    public void m1(int a){
        System.out.println("M1 method one arguments");
    }
    public void m1(int id,String eName){
        System.out.println("M1 method Two arguments");
    }

}
class Test{
    public static void main(String[] args){
        Sai a1=new Sai();
        a1.m1();
        System.out.println(a1);
    }
}