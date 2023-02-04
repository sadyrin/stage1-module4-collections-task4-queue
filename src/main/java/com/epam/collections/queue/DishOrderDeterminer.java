package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> outList = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 1 ; i <= numberOfDishes; i++) queue.add(i);
        
        int count = 1;
        
        while(outList.size() < numberOfDishes){
            if(count < everyDishNumberToEat) {
                queue.add(queue.poll());
                count++;
            } else {
                outList.add(queue.poll());
                count = 1;
            }
        }

        return outList;
    }
}
