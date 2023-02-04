package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(10, new Comparator<String> () {

            @Override
            public int compare(String e1, String e2) {
                return e2.compareTo(e1);
            }
        });

        queue.addAll(firstList);
        queue.addAll(secondList);

        return queue;
    }
}
