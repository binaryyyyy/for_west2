public abstract class Cat {
    protected String name;
    protected int age;
    protected boolean gender;
    protected double price;
    public Cat(String name, int age,boolean gender,double price){      //母猫为true
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }
    public abstract String toString();
}
