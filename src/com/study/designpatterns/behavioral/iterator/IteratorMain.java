package com.study.designpatterns.behavioral.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        var browserHistory = new BrowserHistory();
        browserHistory.push("test.prn.com");
        browserHistory.push("demo.com");
        browserHistory.push("abc.com");

        Iterator iterator = browserHistory.createIterator();
        while (iterator.hasNext()){
            String url = (String) iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
