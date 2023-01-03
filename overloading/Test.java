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
    public void m1(int id,int Eid){
        System.out.println("M1 method Two arguments");
    }
    public void m1(float f){
        System.out.println("M1 method float arguments");
    }
    public void m1(double db){
        System.out.println("M1 method double arguments");
    }
    public void m1(String b){
        System.out.println("M1 method String arguments");
    }

}
class Test{
    public static void main(String[] args){
        Sai a1=new Sai();
        a1.m1();
        a1.m1(10);
        a1.m1(10,20);
        a1.m1(null);
        a1.m1(200.00);
        a1.m1(200.00f);
        
    }
}