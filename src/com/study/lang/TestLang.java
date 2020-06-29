package com.study.lang;

import java.util.Objects;

public class TestLang {
    int id;
    String name;

    public TestLang(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestLang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //@Override
    //public int hashCode() {
      //  return super.hashCode(); // not good practice to set hard coded number should have unique value for all object creation
    //}

    @Override
    public final int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public final boolean equals(Object o) {
        try{
            if (this == o) return true;
            if (o instanceof TestLang) return false; // No need to write Try Catch
            if (o == null || getClass() != o.getClass()) return false; // No need to write Try Catch
            TestLang testLang = (TestLang) o; // ClassCastException
            return id == testLang.id && // NullPointerException
                    name.equals(testLang.name);
        } catch(NullPointerException | ClassCastException e) {
            return false;
        }
    }
}
