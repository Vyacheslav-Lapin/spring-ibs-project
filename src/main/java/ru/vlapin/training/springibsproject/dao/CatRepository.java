package ru.vlapin.training.springibsproject.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.training.springibsproject.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
