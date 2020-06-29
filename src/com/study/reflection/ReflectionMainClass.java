package com.study.reflection;

import com.study.annotation.TestAnnotation;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReflectionMainClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class aClass = ConcreteClass.class;
        aClass = new ConcreteClass(5).getClass();
        aClass = Class.forName("com.study.reflection.ConcreteClass");

        System.out.println(aClass.getCanonicalName());

        System.out.println("------------------------------");
        // For Primitive Type Wrapper class
        Class booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());

        Class doubleClass = Double.class;
        System.out.println(doubleClass.getCanonicalName());

        Class arrayClass = Class.forName("[D");
        System.out.println(arrayClass);

        Class twoStringArray = String[][].class;
        System.out.println(twoStringArray);

        System.out.println("------------------------------");
        Class superClass = Class.forName("com.study.reflection.ConcreteClass");
        System.out.println(superClass.getSuperclass());
        System.out.println(Object.class.getSuperclass());
        System.out.println(String[][].class.getSuperclass());

        Class[] classes = aClass.getClasses();
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(classes));
        Arrays.stream(classes).forEach(System.out::println);

        System.out.println("------------------------------");
        Class[] classes1 = aClass.getDeclaredClasses();
        Arrays.stream(classes1).forEach(System.out::println);

        System.out.println("------------------------------");
        Class aClass1 = Class.forName("com.study.reflection.ConcreteClass$ConcreteClassPublicEnum");
        System.out.println(aClass1.getDeclaringClass());
        System.out.println(aClass1.getPackage().getName());

        System.out.println("------------------------------");
        System.out.println(Modifier.toString(aClass.getModifiers()));

        System.out.println("------------------------------");
        Class classHashMap = Class.forName("java.util.HashMap");
        Arrays.stream(classHashMap.getTypeParameters()).forEach(System.out::println);
        Arrays.stream(classHashMap.getGenericInterfaces()).forEach(System.out::println);

        System.out.println("------------------------------");
        Arrays.stream(aClass.getMethods()).forEach(System.out::println);

        System.out.println("------------------------------");
        Arrays.stream(aClass.getFields()).forEach(System.out::println);

        System.out.println("------------------------------");
        Arrays.stream(aClass.getAnnotations()).forEach(System.out::println);

        System.out.println("------------------------------");
        Field field = Class.forName("com.study.reflection.ConcreteClass").getField("publicInt");
        ConcreteClass obj = new ConcreteClass(5);
        System.out.println(field.get(obj)); //prints 5
        field.setInt(obj, 10); //setting field value to 10 in object
        System.out.println(field.get(obj)); //prints 10

        System.out.println("------------------------------");
        Field privateField = Class.forName("com.study.reflection.ConcreteClass").getDeclaredField("privateString");
        privateField.setAccessible(true);

        ConcreteClass objTest = new ConcreteClass(1);
        System.out.println(privateField.get(objTest));
        privateField.set(objTest, "Private String Updated");
        System.out.println(privateField.get(objTest));

        System.out.println("------------------------------");

        Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
        // get method parameter types, prints "[class java.lang.Object, class java.lang.Object]"
        System.out.println(Arrays.toString(method.getParameterTypes()));
        // get method return type, return "class java.lang.Object", class reference for void
        System.out.println(method.getReturnType());
        // get method modifiers
        System.out.println(Modifier.toString(method.getModifiers())); // prints "public"

        Map<String, String> stringMap = new HashMap<>();
        method.invoke(stringMap, "KEY-TEST", "VALUE-TEST");
        System.out.println(stringMap);

        System.out.println("------------------------------");

        Method method1 = Class.forName("com.study.reflection.BaseClass").getDeclaredMethod("method3", null);
        method1.setAccessible(true);
        method1.invoke(null, null);

        System.out.println("-------------------------------");

        Constructor<?> constructor = Class.forName("com.study.reflection.ConcreteClass").getConstructor(int.class);
        // getting constructor parameters
        System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

        Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
        System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"

        System.out.println("-------------------------------");

        Object myObj = constructor.newInstance(10);
        Method myObjMethod = myObj.getClass().getMethod("method1", null);
        myObjMethod.invoke(myObj, null); //prints "Method1 impl."

        HashMap<String,String> myMap = (HashMap<String,String>) hashMapConstructor.newInstance(null);
        System.out.println(myMap);

        TestAnnotation testAnnotation  = myObjMethod.getAnnotation(TestAnnotation.class);
        System.out.println(testAnnotation.date());
    }
}
