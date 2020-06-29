package com.study.advance.streams;

import java.util.Optional;

public class UserStats {
    Optional<Long> visitCount;

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    public UserStats setVisitCount(Optional<Long> visitCount) {
        this.visitCount = visitCount;
        return this;
    }

    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
}
