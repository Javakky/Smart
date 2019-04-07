package com.github.javakky.smart.node;

import com.github.javakky.smart.truffle.SmartTypes;
import com.github.javakky.smart.truffle.SmartTypesGen;
import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeInfo
@TypeSystemReference(SmartTypes.class)
public abstract class SmartNode extends Node {

    public abstract Object executeGeneric(VirtualFrame frame);

    public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
        return SmartTypesGen.expectLong(executeGeneric(frame));
    }
}
