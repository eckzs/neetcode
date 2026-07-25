import java.util.Arrays;

public class MainTest {
    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        check("example 1", () -> {
            int[] result = new Solution().twoSum(new int[]{1, 2, 3, 4}, 3);
            assertArrayEqual(new int[]{1, 2}, result);
        });

        check("example 2", () -> {
            int[] result = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
            assertArrayEqual(new int[]{1, 2}, result);
        });

        System.out.println(passed + " passed, " + failed + " failed");
        if (failed > 0) {
            System.exit(1);
        }
    }

    interface TestCase {
        void run() throws Exception;
    }

    static void check(String name, TestCase test) {
        try {
            test.run();
            passed++;
            System.out.println("PASS: " + name);
        } catch (Throwable e) {
            failed++;
            System.out.println("FAIL: " + name + " -> " + e.getMessage());
        }
    }

    static void assertArrayEqual(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("expected " + Arrays.toString(expected) + " but got " + Arrays.toString(actual));
        }
    }
}
