
package com.example.loader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URL;
import java.nio.file.Files;

public class Loader {

    static {
        NativeLoader.loadLibrary(Loader.class.getClassLoader(), "jni-greeter");
    }

    public native String sayHello(String name);
}
