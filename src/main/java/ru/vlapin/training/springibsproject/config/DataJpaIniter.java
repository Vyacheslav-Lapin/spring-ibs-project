package ru.vlapin.training.springibsproject.config;

import static ru.vlapin.training.springibsproject.common.Loggable.LogLevel.*;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.training.springibsproject.common.Log;
import ru.vlapin.training.springibsproject.common.Loggable;
import ru.vlapin.training.springibsproject.dao.CatRepository;
import ru.vlapin.training.springibsproject.model.Cat;

@Component
@Loggable(INFO)
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
