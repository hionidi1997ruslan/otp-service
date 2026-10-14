/*
Настройка Entity для ьыстрого взаимодействия с БД
*/

package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity // Говорим Hibernate: это класс-сущность, следи за ним
@Table(name = "otp") // Явно указываем имя таблицы в БД

public class OtpEntity {

    @Id                                            // Это поле — PRIMARY KEY таблицы
    private UUID id;                               // Тип UUID (в БД будет колонка uuid)

    @Column(nullable = false)                      // Колонка code, NOT NULL
    private String code;                           // Поле хранит OTP-код (в БД varchar)

    public OtpEntity() {}                          // Пустой конструктор — ОБЯЗАТЕЛЕН для Hibernate  // Hibernate создаёт объекты через reflection, ему нужен no-args
          
    public OtpEntity(UUID id, String code) {       // Удобный конструктор — чтобы создавать в одну строку
        this.id = id;                              // Присваиваем id
        this.code = code;                          // Присваиваем code
    }

    public UUID getId() { return id; }             // Геттер — Hibernate читает поле через него
    public void setId(UUID id) { this.id = id; }   // Сеттер — Hibernate пишет через него

    public String getCode() { return code; }       // Геттер code
    public void setCode(String code) { this.code = code; }  // Сеттер code
}                                        

