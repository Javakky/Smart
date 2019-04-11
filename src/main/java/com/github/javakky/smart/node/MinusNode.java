package com.github.javakky.smart.node;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class MinusNode extends UnaryNode {
    @Specialization(rewriteOn = ArithmeticException.class)
    protected long minus(long node) {
        return Math.negateExact(node);
    }
}
