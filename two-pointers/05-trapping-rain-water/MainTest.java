public class MainTest {
    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        check("example 1", () -> {
            int result = new Solution().trap(new int[]{0, 2, 0, 3, 1, 0, 1, 3, 2, 1});
            assertEqual(9, result);
        });

        check("example 2", () -> {
            int result = new Solution().trap(new int[]{4, 2, 0, 3, 2, 5});
            assertEqual(9, result);
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
