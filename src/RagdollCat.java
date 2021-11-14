public class RagdollCat extends Cat{
    boolean isCute;
    public RagdollCat(String name, int age,boolean gender,double price,boolean isCute){
        super(name,age,gender,300);
        this.isCute = isCute;
    }
    public String toString(){
        return "这只猫的名字是"+name+"，年龄是"+age+"，性别为"+gender+"，价格是"+price+"它可爱吗："+isCute;
    }
}
