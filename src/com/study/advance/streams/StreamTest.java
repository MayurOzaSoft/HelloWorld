package com.study.advance.streams;

import java.util.*;

public class StreamTest {

    public static void main(String[] args) {
        Map<String, UserStats> statsMap = new HashMap<>();
        statsMap.put("111111", new UserStats(Optional.of(12L)));

        Map<String, UserStats> statsMap1 = new HashMap<>();
        statsMap1.put("123455", new UserStats(Optional.of(15L)));

        Map<String, UserStats> statsMap2 = new HashMap<>();
        statsMap1.put("absdsddf", new UserStats(Optional.of(0L)));

        Map<String, UserStats> statsMap3 = new HashMap<>();
        statsMap1.put(null, new UserStats(Optional.of(0L)));

        count(statsMap, statsMap1, statsMap3);
    }

    public static Map<Long, Long> count(Map<String, UserStats>... visits) {

        Map<Long, Long> counterMap = new HashMap<>();

        Arrays.stream(visits)
                .map(stringUserStatsMap -> stringUserStatsMap.entrySet())
                .flatMap(entries -> entries.stream()
                        .filter(stringUserStatsEntry ->
                        {
                            if (stringUserStatsEntry.getKey() != null) {
                                return isNumeric(stringUserStatsEntry.getKey().trim());
                            }
                            return false;
                        })
                        .filter(stringUserStatsEntry -> null != stringUserStatsEntry.getValue())
                        .filter(stringUserStatsEntry -> null != stringUserStatsEntry.getValue() &&
                                !stringUserStatsEntry.getValue().getVisitCount().isEmpty()))
                .forEach(stringUserStatsEntry -> counterMap.put(Long.valueOf(stringUserStatsEntry.getKey()), Long.valueOf(stringUserStatsEntry.getValue().getVisitCount().get())));

        System.out.println(counterMap);
        return counterMap;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(.\\d+)?");
    }
}
