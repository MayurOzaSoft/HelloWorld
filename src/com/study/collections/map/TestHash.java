package com.study.collections.map;

public class TestHash {
    int hashKey;

    public TestHash(int hashKey) {
        this.hashKey = hashKey;
    }

    @Override
    public int hashCode() {
        return hashKey;
    }

    @Override
    public String toString() {
        return hashKey + "";
    }
}
