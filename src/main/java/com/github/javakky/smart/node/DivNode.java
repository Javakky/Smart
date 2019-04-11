package com.github.javakky.smart.node;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class DivNode extends BinaryNode {
    @Specialization(rewriteOn = ArithmeticException.class)
    protected long div(long left, long right) {
        return Math.floorDiv(left, right);
    }
}