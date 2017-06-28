package model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTransform {
    private static final Transform.Task TASK = new Transform.Task("TASK");
    static {
        TASK.addOption("option1", 1);
        TASK.addOption("option2", 1.0);
        TASK.addOption("option3", "value");
        TASK.addOption("option4", new Integer[]{1,1,1,1});
    }
    private static final String TASK_STRING = "TASK=option1:1,option2:1.0,option3:value,option4:[1,1,1,1],";

    @Test
    public void testTaskToString() {
        String output = TASK.toString();

        String message = String.format("Task string malformed\nCorrect: %s\nOutput: %s", TASK_STRING, output);
        assertTrue(message, output.equals(TASK_STRING));
    }
}
