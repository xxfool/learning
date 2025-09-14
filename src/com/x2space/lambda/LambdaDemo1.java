package com.x2space.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("swimming...");
            }
        };

        Swim s2 = () -> {
            System.out.println("swimming...");
        };

        s1.swimming();
        s2.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public void swimming();
}