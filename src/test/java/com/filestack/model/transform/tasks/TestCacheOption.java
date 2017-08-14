package com.filestack.model.transform.tasks;

import static org.junit.Assert.assertTrue;

import com.filestack.model.transform.base.TransformTask;
import org.junit.Test;

public class TestCacheOption {

  @Test
  public void testToString() {
    String correct = "cache="
        + "expiry:2592000";

    TransformTask task = new CacheOption(2592000);

    String output = task.toString();

    String message = String.format("Task string malformed\nCorrect: %s\nOutput: %s",
        correct, output);
    assertTrue(message, output.equals(correct));
  }
}