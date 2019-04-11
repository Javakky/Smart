package com.github.javakky.smart.node;

import com.oracle.truffle.api.dsl.Specialization;

import java.math.BigInteger;

public abstract class PowNode extends BinaryNode {
    @Specialization(rewriteOn = ArithmeticException.class)
    protected long pow(long left, long right) {
        return (BigInteger.valueOf(left)).pow((int)right).longValue();
    }
}