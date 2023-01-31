package sol;

import org.junit.Test;
import src.FuncList;

public class Homework1BTest {

    private FuncList toFuncList(Object... args) {
        FuncList funcListBuilder = new FuncList<>();
        for (int i = args.length - 1; i >= 0; i--) {
            funcListBuilder = funcListBuilder.link(args[i]);
        }
        return funcListBuilder;
    }

    @Test
    public void testMember() {
        // TODO: Task 1
    }

    @Test
    public void testInsert() {
        // TODO: Task 2
    }

    @Test
    public void testSpellCheck() {
        // TODO: Task 3
    }

    @Test
    public void testDaysInRange() {
        // TODO Task 4
    }

    @Test
    public void testAllInRange() {
        // TODO Task 4
    }

    @Test
    public void testQuicksort() {
        // TODO Task 6
    }
}
