package com.tneshcheret;

public class Task1 {

    public static void main(String[] args) {
        //   Задание: Завершить пример который мы делали на занятии.
        Fruit greenApple = new Fruit();
        greenApple.setColor(Color.GREEN);
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setPrice(25.90);
        greenApple.setWeight(186);
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, 246, 34.90);

        double checkAmount = greenApple.calculatePrice() + redApple.calculatePrice() + banana.calculatePrice() + lemon.calculatePrice();
        System.out.printf("Сумма чека составит %.2f грн", checkAmount);
    }
}
