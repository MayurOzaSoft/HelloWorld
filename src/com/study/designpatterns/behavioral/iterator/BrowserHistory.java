package com.study.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private List<String> listUrls = new ArrayList<>();
    private String[] arrayUrls = new String[10];
    private int index;

    public void push(String url){
        // if(index >= 10) throw new ArrayIndexOutOfBoundsException("LIMIT EXCEEDED, INCREASE SIZE OF YOUR POOL");
        // arrayUrls[index ++] = url;
        listUrls.add(url);
    }

    public String pop(){
        var index = arrayUrls.length - 1;
        var lastUrl = listUrls.get(index);
        // return arrayUrls[-- index];
        listUrls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls(){
        return listUrls;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {

        private BrowserHistory browserHistory;
        private int index;

        public ListIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }

        @Override
        public void next() {
            index ++;
        }

        @Override
        public String current() {
            return browserHistory.listUrls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < browserHistory.listUrls.size();
        }
    }

    public class ArrayIterator implements Iterator<String> {

        private BrowserHistory browserHistory;
        private int index;

        public ArrayIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }

        @Override
        public void next() {
            index ++;
        }

        @Override
        public String current() {
            return browserHistory.arrayUrls[index];
        }

        @Override
        public boolean hasNext() {
            return index < browserHistory.index;
        }
    }
}
