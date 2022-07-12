package ru.vlapin.training.springibsproject.annotations.hell;

import static org.assertj.core.api.Assertions.*;

import lombok.SneakyThrows;
import lombok.experimental.ExtensionMethod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;

@ExtensionMethod({
    AnnotationUtils.class,
    AnnotatedElementUtils.class})
class AnnotationHellSolverTest {

  private static final String NAME = "annotationUtilsWorksCorrectlyForAnnotationHellSolveTest";

  @Test
  @SneakyThrows
  @MyAnnotation("123")
  @DisplayName("AnnotationUtils works correctly for Annotation Hell solve")
  void annotationUtilsWorksCorrectlyForAnnotationHellSolveTest() {
    assertThat(AnnotationHellSolverTest.class.getDeclaredMethod(NAME)
                   .findMergedAnnotation(MyDeepAnnotation.class)).isNotNull()
        .isInstanceOf(MyDeepAnnotation.class)
        .extracting(MyDeepAnnotation::value, MyDeepAnnotation::overdraft)
        .contains(
            "Lorem ipsum dolor sit amet",
            "123");
  }
}
