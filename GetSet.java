class GetSet {
    private String name;
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

}
class Test{
    public static void main(String[] args) {
        GetSet s= new GetSet();
        s.setname("Harini");
        System.out.println(s.getname());
    }
}