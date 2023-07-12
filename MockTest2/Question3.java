package MockTest2;
class Person {
    private String name;
    private int age;
    private String address;

    public String getName(){
        return name;
    }
    public void setNane(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
}
public class Question3 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setNane("Manash");
        obj.setAge(15);
        obj.setAddress("India");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getAddress());
    }
}
