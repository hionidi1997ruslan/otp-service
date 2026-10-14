package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

// репозиторий для таблицы otp
// OtpEntity - что храним, UUID - тип id
// реализацию спринг создает сам, save/findById/count/delete уже есть из коробки
public interface OtpRepository extends JpaRepository<OtpEntity, UUID> {
}
