class Hillstations{
    void location(){
System.out.println("Location is: ");
    }
void famous for(){
System.out.println("Famous for");
}
}
class Manali extends Hillstation {
    void location() {
System.out.println("Manali is in Himachal Pradesh")

    }
void famousfor(){
System.out.println("it is Famous for Hadimba Temple and adventure sports");
}
}
class Mussoorie extends Hillstations {
    void location(){
System.out.println("Mussoorie is in Uttarakhand");
    }
void famousfor(){
System.out.println("It is famous for education institutions");
}
}
class Gulmarg extends Hillstation {
    void location(){
System.out.println("Gulmarg is in J&K ");
    }
void famousfor(){
system.out.println("Famous for skiing");
}
}
class Main{
    public static void main(String args[]){
        Hillstation A = new Hillstation();
        Hillstation M = new Manali();
        Hillstation Mu = new Mussoorie();
        Hillstation G = new Gulmarg();

        A.location();
        A.famousfor();
    }
}