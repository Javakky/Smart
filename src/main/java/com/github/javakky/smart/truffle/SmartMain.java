package com.github.javakky.smart.truffle;

import java.io.IOException;
import java.util.Scanner;

import com.oracle.truffle.api.Truffle;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

public class SmartMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Truffle runtime: " + Truffle.getRuntime().getName());

        Context context = Context.create();
        context.getEngine().getLanguages().forEach((s, l) -> System.out.println("Language: " + l.getName()));

        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");
                String program = s.nextLine().trim();

                if (program.equalsIgnoreCase("quit")) {
                    break;
                }

                Object answer = runCode(context, program);
                System.out.println("answer: " + answer);
                System.out.println();
            }
        }
    }

    private static Object runCode(Context context, String program) throws IOException {
        Source source = Source.newBuilder("smartlang", program, "SMART").build();
        Value value = context.eval(source);
        return value;
    }
}
