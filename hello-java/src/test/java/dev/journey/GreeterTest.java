// GreeterTest.java
package dev.journey;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterTest {
    @Test
    void greetsByName() {
        assertEquals("Hello, Bob!", new Greeter().greet("Bob"));
    }
}