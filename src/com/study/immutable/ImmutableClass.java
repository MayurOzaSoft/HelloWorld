package com.study.immutable;

import java.util.Collections;
import java.util.List;

public final class ImmutableClass extends SecurityManager {
    private final int number;
    private final String name;
    private final List<String> stringList;

    public ImmutableClass(int number, String name, List<String> stringList) {
        this.number = number;
        this.name = name;
        this.stringList = Collections.unmodifiableList(stringList);
        System.setSecurityManager(new SecurityManager());
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public List<String> getStringList() {
        return stringList;
    }

    @Override
    public void checkPackageAccess(String pkg) {
        super.checkPackageAccess(pkg);
        if(pkg.equals("java.lang.reflect")){
            throw new UnsupportedOperationException();
        }
    }
}
