package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

// одна строка таблицы otp в виде java объекта
@Entity              // hibernate будет мапить этот класс на таблицу
@Table(name = "otp") // имя таблицы в бд
public class OtpEntity {

    @Id              // первичный ключ
    private UUID id; // в postgres колонка типа uuid

    @Column(nullable = false) // not null
    private String code;      // сам код, в бд varchar

    // пустой конструктор нужен hibernate, без него он не сможет создать объект при чтении из бд
    public OtpEntity() {}

    // конструктор чтобы создать запись одной строкой
    public OtpEntity(UUID id, String code) {
        this.id = id;
        this.code = code;
    }

    // геттеры и сеттеры
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
