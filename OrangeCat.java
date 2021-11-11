public class OrangeCat extends Cat{
    boolean isFat;
    public OrangeCat(String name, int age,boolean gender,double price,boolean isFat){
        super(name,age,gender,200);
        this.isFat = isFat;
    }
    public String toString(){
        return "这只猫的名字是"+name+"，年龄是"+age+"，性别为"+gender+"，价格是"+price+",它胖吗："+isFat;
    }
}
