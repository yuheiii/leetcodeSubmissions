package com.leetcode;

import java.util.*;

class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        if (words.length == 0) {
            return null;
        }
        Map<String, Integer> map = getFreqMap(words);
        PriorityQueue<Map.Entry<String, Integer>> minHeap
                = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue() == e2.getValue() ? e2.getKey().compareTo(e1.getKey()) : e1.getValue().compareTo(e2.getValue());
            }
        });


        for (Map.Entry<String, Integer> e : map.entrySet()) {
            minHeap.offer(e);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return freqList(minHeap);
    }

    private Map<String, Integer> getFreqMap(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            Integer freq = map.get(s);
            if (freq == null) {
                map.put(s, 1);
            } else {
                map.put(s, freq + 1);
            }
        }
        return map;
    }

    private List<String> freqList(PriorityQueue<Map.Entry<String, Integer>> minHeap) {
        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(0, minHeap.poll().getKey());
        }
        return result;
    }


    public static void main(String[] args) {
        TopKFrequentWords s = new TopKFrequentWords();
        List<String> res = s.topKFrequent(
                new String[]{"i", "love", "leetcode", "i", "love", "coding"},
        1);
        System.out.println(res.toString());
    }
}
