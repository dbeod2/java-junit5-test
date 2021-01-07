import org.junit.jupiter.api.*;

public class JunitTest {

  @BeforeAll
  @DisplayName("현재 클래스의 모든 테스트 메서드보다 먼저 실행된다.")
  static void setUp() {
    System.out.println("@BeforeAll - executes once before all test methods in this class");
  }

  @BeforeEach
  @DisplayName("각 테스트 메서드 전에 실행")
  void init() {
    System.out.println("@BeforeEach - executes before each test method in this class");
  }

  @DisplayName("테스트")
  @Test
  public void success() {
    System.out.println("success");
  }

  @DisplayName("테스트 코드 비활성화")
  @Test
  @Disabled("비활성화 된 테스트")
  public void disabled() {
    System.out.println("disabled ? ");
  }
}
