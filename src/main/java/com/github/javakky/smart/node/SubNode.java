package com.github.javakky.smart.node;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class SubNode extends BinaryNode {
    @Specialization(rewriteOn = ArithmeticException.class)
    protected long sub(long left, long right) {
        return Math.subtractExact(left, right);
    }
}