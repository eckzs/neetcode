public class MainTest {
    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        check("example 1", () -> {
            int result = new Solution().maxArea(new int[]{1, 7, 2, 5, 4, 7, 3, 6});
            assertEqual(36, result);
        });

        check("example 2", () -> {
            int result = new Solution().maxArea(new int[]{1, 2, 1});
            assertEqual(2, result);
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

    static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("expected " + expected + " but got " + actual);
        }
    }
}
