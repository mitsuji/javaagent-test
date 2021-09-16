package org.mitsuji.javaagent.test;

import java.lang.instrument.Instrumentation;

public class JavaagentTest {
    public static void premain(String agentArgs, Instrumentation inst) {
	System.out.println("JavaagentTest.premain !!");
    }
}
