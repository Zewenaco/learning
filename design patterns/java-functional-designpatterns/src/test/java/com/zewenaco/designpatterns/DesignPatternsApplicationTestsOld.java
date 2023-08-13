package com.zewenaco.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
public class DesignPatternsApplicationTestsOld {

  @Test
  @DisplayName("My 1st JUnit 5 test! 😎")
  public void contextLoads() {
    int num = 0;
    assertEquals(0, num, "should be equal");
  }
}
