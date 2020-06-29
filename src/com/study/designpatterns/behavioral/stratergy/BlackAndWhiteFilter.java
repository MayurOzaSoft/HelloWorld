package com.study.designpatterns.behavioral.stratergy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void filter(String string) {
        System.out.println("Filtering to Black And White");
    }
}
