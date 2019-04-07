package com.github.javakky.smart.node;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class SmartRootNode extends RootNode {

    private SmartNode bodyNode;

    private String name;

    public SmartRootNode(TruffleLanguage<?> language, FrameDescriptor frameDescriptor, SmartNode node, String name) {
        super(language, frameDescriptor);
        this.bodyNode = node;
        this.name = name;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return bodyNode.executeGeneric(frame);
    }
}
