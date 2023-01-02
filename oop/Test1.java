class Test1{
    private int eId;
    private String eName;
    public void seteId(int id){
        this.eId=id;
    }
    public int geteId(){
        return eId;
    }public void seteName(String eName){
        this.eName=eName;
    }
    public String geteName(){
        return eName;
    }
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.seteId(101);
        e1.seteName("Sai");
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());
        e2.seteId(102);
        e2.seteName("Tharun");
        System.out.println(e2.geteId());
        System.out.println(e2.geteName());

    }
}