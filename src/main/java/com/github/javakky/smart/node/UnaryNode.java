package com.github.javakky.smart.node;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;

@NodeChildren({@NodeChild("Node") })
public abstract class UnaryNode extends SmartNode{
}
