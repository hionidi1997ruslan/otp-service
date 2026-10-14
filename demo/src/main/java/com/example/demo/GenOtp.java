package com.example.demo;

import java.security.SecureRandom;

// генератор otp кодов
public class GenOtp {

    // из каких символов собираем код
    private static String APLHABET = "0123456789";

    // SecureRandom а не Random, чтобы код нельзя было угадать (обычный random может выжать свое состояние по нескольким сгенерированным кодам, а в секьюр подмешиваются шумы желаза и прочее)
    private static final SecureRandom RANDOM = new SecureRandom();

    // длина кода
    private static final int LENGTH = 6;

    // возвращает новый код, например "048213"
    public static String generator() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < LENGTH; i++) {
            int index = RANDOM.nextInt(APLHABET.length()); // случайный индекс от 0 до 9
            char symbol = APLHABET.charAt(index);          // берем символ по индексу
            sb.append(symbol);                             // дописываем в код
        }
        return sb.toString();
    }

}
