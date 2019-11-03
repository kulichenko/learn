//Ch15Ex18 По образу BankTeller.java создайте пример, в котором в океане большие рыбы едят маленьких рыб.

package ru.kulichenkom.ekkel.chapter15;

import ru.kulichenkom.ekkel.chapter15.coffee.Generator;

import java.util.*;

class SmallFish {
    private static long counter = 1;
    private final long id = counter++;

    public SmallFish() {
    }

    public static Generator<SmallFish> generator() {
        return new Generator<SmallFish>() {
            @Override
            public SmallFish next() {
                return new SmallFish();
            }
        };
    }

    @Override
    public String toString() {
        return "SmallFish " + id;
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    public BigFish() {
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }

    @Override
    public String toString() {
        return "BigFish " + id;
    }
}

public class Ocean {
    public static void eat(BigFish bigFish, SmallFish smallFish) {
        System.out.println(bigFish + " eats " + smallFish);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Queue<SmallFish> fishQueue = new LinkedList<>();
        Generators.fill(fishQueue, SmallFish.generator(), 25);
        List<BigFish> bigFishList = new ArrayList<>();
        Generators.fill(bigFishList, BigFish.generator(), 5);
        for (SmallFish small : fishQueue) {
            eat(bigFishList.get(random.nextInt(bigFishList.size())), small);
        }
    }
}
