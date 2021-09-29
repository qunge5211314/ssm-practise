package cn.itcast.aop;

public class Target implements TargetInteface {
    @Override
    public void save() {
        System.out.println("save method running......");
    }
}
