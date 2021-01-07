import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LambdaTest {

  @Test
  @DisplayName("람다 표현 테스트")
  public void 람다_표현_테스트() {
    int sum = Stream.of(6, 4).mapToInt(e -> e).sum();
    assertTrue(sum == 10);
  }

  // TODO. 추가 예정
}
