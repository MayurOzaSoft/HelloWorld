package com.study.designpatterns.creational.singleton;

import java.io.*;

public class SerializableSingletonDemo {

    public static void main(String[] args) {

        SingletonWithHelper instanceOne = SingletonWithHelper.getSingletonClass();

        // Serialize
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("out.ser");
            ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(instanceOne);
            objectOutput.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try {
            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("out.ser"));
            SingletonWithHelper instanceTwo = (SingletonWithHelper) objectInput.readObject();
            objectInput.close();

            System.out.println("instanceOne hashCode="+instanceOne.hashCode());
            System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
