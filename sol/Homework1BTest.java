package sol;

import org.junit.Test;
import src.FuncList;

import static org.junit.Assert.assertTrue;

/**
 * Tests for Homework 1B
 */
public class Homework1BTest {

    private FuncList toFuncList(Object... args) {
        FuncList funcListBuilder = new FuncList<>();
        for (int i = args.length - 1; i >= 0; i--) {
            funcListBuilder = funcListBuilder.link(args[i]);
        }
        return funcListBuilder;
    }

    /**
     * Some examples of how to use toFuncList
     */
    @Test
    public void testToFuncList() {
        assertTrue(this.toFuncList().equals(new FuncList<>()));
        assertTrue(this.toFuncList(1).equals(new FuncList<Integer>().link(1)));
        assertTrue(this.toFuncList("a", "b", "c").equals(
                new FuncList<>().link("c").link("b").link("a")));
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
