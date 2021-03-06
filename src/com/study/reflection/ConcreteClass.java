package com.study.reflection;

import com.study.annotation.TestAnnotation;

@Deprecated
public class ConcreteClass extends BaseClass implements BaseInterface {
    public int publicInt;
    private String privateString = "private string";
    protected boolean protectedBoolean;
    Object defaultObject;

    public ConcreteClass(int i){
        this.publicInt = i;
    }

    @Override
    @TestAnnotation(date = "01-01-2019")
    public void method1() {
        System.out.println("Method1 impl.");
    }

    @Override
    public int method2(String str) {
        System.out.println("Method2 impl.");
        return 0;
    }

    @Override
    public int method4(){
        System.out.println("Method4 overridden.");
        return 0;
    }

    public final int[] method4(int... i){
        System.out.println("Method4 Overloaded.");
        return i;
    }

    // inner classes
    public class ConcreteClassPublicClass{}
    private class ConcreteClassPrivateClass{}
    protected class ConcreteClassProtectedClass{}
    class ConcreteClassDefaultClass{}

    // member enum
    enum ConcreteClassDefaultEnum{}
    public enum ConcreteClassPublicEnum{}

    // member interface
    public interface ConcreteClassPublicInterface{}
}
