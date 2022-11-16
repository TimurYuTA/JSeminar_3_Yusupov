package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 8, 9, 4, 7, 2));
        System.out.println(hw.removeNegativeValue(list));
        System.out.println(hw.getMin(list));
        System.out.println(hw.getMax(list));
        System.out.println(hw.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int minElement = 0;
        if (list.size() > 0){
            minElement = list.get(0);
            for (int item: list){
                if (item < minElement){
                    minElement = item;
                }
            }
        }
        return minElement;
//        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int maxElement = 0;
        if (list.size() > 0){
            maxElement = list.get(0);
            for (int item: list){
                if (item > maxElement){
                    maxElement = item;
                }
            }
        }
        return maxElement;
//        return Collections.max(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int item: list){
            sum += item;
        }
        return sum / 2;
    }
}
