package com.github.javakky.smart.node;

import com.oracle.truffle.api.frame.VirtualFrame;

public class LongNode extends SmartNode {

    private final long value;

    public LongNode(long l) {
        this.value = l;
    }

    public long executeLong(VirtualFrame frame) {
        return this.value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return this.value;
    }
}
