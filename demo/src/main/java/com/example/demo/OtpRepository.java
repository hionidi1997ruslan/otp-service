package com.example.demo;                        

import org.springframework.data.jpa.repository.JpaRepository;  // Импорт базового интерфейса Spring Data JPA
import java.util.UUID;                             // Импорт класса UUID — типа первичного ключа

public interface OtpRepository extends JpaRepository<OtpEntity, UUID> {
    // interface — не класс. Мы описываем только контракт (какие методы нужны),
    // а реализацию Spring сгенерирует сам в рантайме.

    // extends JpaRepository<OtpEntity, UUID> — наследуемся от базового репозитория Spring.
    //   Первый параметр OtpEntity — с какой сущностью работаем (какая таблица).
    //   Второй параметр UUID — тип первичного ключа этой сущности.

    // Внутри пусто — потому что все нужные методы (save, findById, findAll, delete, count)
    // уже есть в JpaRepository. Если понадобится свой метод — добавлю здесь.
}