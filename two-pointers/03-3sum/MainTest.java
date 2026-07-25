import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainTest {
    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        check("example 1", () -> {
            List<List<Integer>> result = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
            assertSetEqual(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), result);
        });

        check("example 2", () -> {
            List<List<Integer>> result = new Solution().threeSum(new int[]{0, 1, 1});
            assertSetEqual(List.of(), result);
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

    static void assertSetEqual(List<List<Integer>> expected, List<List<Integer>> actual) {
        Set<List<Integer>> expectedSet = new HashSet<>(expected);
        Set<List<Integer>> actualSet = new HashSet<>(actual);
        if (!expectedSet.equals(actualSet)) {
            throw new AssertionError("expected " + expected + " but got " + actual);
        }
    }
}
