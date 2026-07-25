public class MainTest {
    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        check("example 1", () -> {
            boolean result = new Solution().isPalindrome("Was it a car or a cat I saw?");
            assertEqual(true, result);
        });

        check("example 2", () -> {
            boolean result = new Solution().isPalindrome("tab a cat");
            assertEqual(false, result);
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

    static void assertEqual(Object expected, Object actual) {
        if (!java.util.Objects.equals(expected, actual)) {
            throw new AssertionError("expected " + expected + " but got " + actual);
        }
    }
}
