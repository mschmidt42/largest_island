import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Main Test")
class MainTest {
    @DisplayName("Test that Mann has a getResult() method")
    @Test void appHasGetResult() {
        Main classUnderTest = new Main();
        assertNotNull(classUnderTest.getResult(), "app should have a getResult()");
    }
}
