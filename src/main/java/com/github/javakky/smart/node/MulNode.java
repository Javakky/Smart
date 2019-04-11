package com.github.javakky.smart.node;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class MulNode extends BinaryNode {
    @Specialization(rewriteOn = ArithmeticException.class)
    protected long mul(long left, long right) {
        return Math.multiplyExact(left, right);
    }
}