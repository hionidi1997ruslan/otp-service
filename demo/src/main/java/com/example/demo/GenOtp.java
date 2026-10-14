package com.example.demo;

import java.security.SecureRandom;



public class GenOtp {
    //Константа для выбора символов
    private static String APLHABET = "0123456789";

    //Генератор случайных чисел
    private static final SecureRandom RANDOM = new SecureRandom();

    //Длина токена
    private static final int LENGTH = 6;

    //Метод, возвращающий токен
    public static String generator() {
        
        //Стринг билдер с емкостью LENGTH
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < LENGTH; i++) {
            int index = RANDOM.nextInt(APLHABET.length()); //генерируем число
            char symbol = APLHABET.charAt(index); //извлекаем индекс символа
            sb.append(symbol); //добавляем символ в токен
            }
        return sb.toString();
    }

}