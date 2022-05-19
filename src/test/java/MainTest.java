import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Main Test")
class MainTest {
    @DisplayName("Test that Main class has a getIslandSize() method")
    @Test void appHasGetResult() {
        Main classUnderTest = new Main();
        String[] island =  {".#",
			                "#."};

        assertNotNull(classUnderTest.getIslandSize(island), "app should have a getIslandSize()");
    }

    @DisplayName("Test small island, expect 1")
    @Test void testSmallIsland() {
        Main classUnderTest = new Main();
        String[] island =  {".#",
			                "#."};

        assertEquals(classUnderTest.getIslandSize(island), 1, "getIslandSize() should return 1");
    }

    @DisplayName("Test small island without water, expect 4")
    @Test void testIslandWithoutWater() {
        Main classUnderTest = new Main();
        String[] island =  {"##",
			                "##"};

        assertEquals(classUnderTest.getIslandSize(island), 4, "getIslandSize() should return 1");
    }

    @DisplayName("Test small island without water, expect 0")
    @Test void testIslandWithoutLand() {
        Main classUnderTest = new Main();
        String[] island =  {"..",
			                ".."};

        assertEquals(classUnderTest.getIslandSize(island), 0, "getIslandSize() should return 1");
    }

    @DisplayName("Test medium island, expect 4")
    @Test void testMediumIsland() {
        Main classUnderTest = new Main();
        String[] island =  {"..#.",
			                "..##",
			                "...#",
			                "##..",
			                "...#"};

        assertEquals(classUnderTest.getIslandSize(island), 4, "getIslandSize() should return 4");
    }

    @DisplayName("Test large island, expect 8")
    @Test void testLargeIsland() {
        Main classUnderTest = new Main();
        String[] island =  {"..#...",
			                "..####",
			                "...###",
			                "##....",
			                "...#.."};

        assertEquals(classUnderTest.getIslandSize(island), 8, "getIslandSize() should return 8");
    }

    @DisplayName("Test damaged island, expect -1")
    @Test void testDamagedIsland() {
        Main classUnderTest = new Main();
        String[] island =  {"..#...",
			                "..####",
			                "...",
			                "##....",
			                "...#.."};

        assertEquals(classUnderTest.getIslandSize(island), -1, "getIslandSize() should return -1");
    }

    @DisplayName("Test island with wrong characters, expect -1")
    @Test void testIslandWithWrongChars() {
        Main classUnderTest = new Main();
        String[] island =  {"..#...",
			                "..####",
			                "...##",
			                "##..X.",
			                "...#.."};

        assertEquals(classUnderTest.getIslandSize(island), -1, "getIslandSize() should return -1");
    }

    @DisplayName("Test island with null entrx, expect -1")
    @Test void testNullIsland() {
        Main classUnderTest = new Main();

        assertEquals(classUnderTest.getIslandSize(null), -1, "getIslandSize() should return -1");
    }

    @DisplayName("Test island with null entrx, expect -1")
    @Test void testIslandWithWronChars() {
        Main classUnderTest = new Main();
        String[] island =  {"..#...",
			                "..####",
			                null,
			                "##..X.",
			                "...#.."};

        assertEquals(classUnderTest.getIslandSize(island), -1, "getIslandSize() should return -1");
    }
}
