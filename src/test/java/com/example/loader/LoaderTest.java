
package com.example.loader;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LoaderTest {
    @Test
    public void testLoader() {
//        System.out.println("Java Path:" + System.getProperty("java.library.path"));
        Loader loader = new Loader();
        String greeting = loader.sayHello("World");
        System.out.println(greeting);
//        assertThat(greeting, equalTo("Bonjour, World!"));
    }

    @Test
    public void testNullLoader() {
        Loader loader = new Loader();
        String greeting = loader.sayHello(null);
        System.out.println(greeting);
//        assertThat(greeting, equalTo("name cannot be null"));
    }
}
