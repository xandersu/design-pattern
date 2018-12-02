package com.example.designpattern.creational.singleton;

/**
 * @Author: suxun
 * @Date: 2018/12/2 15:51
 * @Description: 枚举类型单例模式是单例模式最佳实践
 * 可以防止序列化破坏单例和反射破坏单例
 */
public enum EnumInstance {
    //enum类会变成
    //public final class EnumInstance extends Enum{
    //  private EnumInstance(String s, int i){
    //      super(s,i);
    //  }
    //  private static final EnumInstance INSTANCE;
    //  static{
    //      EnumInstance = new EnumInstance("INSTANCE",0);
    //  }
    //}

    INSTANCE {
        protected void printTest() {
            System.out.println("enum pring test");
        }
    };
    //这个方法使外部可以调用枚举内部的printTest方法
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumInstance.getInstance().printTest();
    }
}
