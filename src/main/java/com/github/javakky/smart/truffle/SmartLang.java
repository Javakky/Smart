package com.github.javakky.smart.truffle;

import com.github.javakky.smart.antlr.SmartLexer;
import com.github.javakky.smart.antlr.SmartParser;
import com.github.javakky.smart.node.SmartRootNode;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.source.Source;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointBuffer;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

@TruffleLanguage.Registration(
        id = "smartlang",
        name = "Smart Language",
        version = "0.0.1")
public class SmartLang extends TruffleLanguage<SmartContext> {

    @Override
    protected SmartContext createContext(Env env) {
        return new SmartContext();
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        SmartRootNode main = parseSource(request.getSource());
        return Truffle.getRuntime().createCallTarget(main);
    }

    private SmartRootNode parseSource(Source source) throws IOException {
        // get user input
        String input = source.getCharacters().toString();

        System.out.println("inputed String: " + input);

        // convert user input to ANTLR character stream
        // java.lang.UnsupportedOperationException causes when use CharBuffer
        CharStream charStream = CodePointCharStream.fromBuffer(
                CodePointBuffer.withBytes(
                        ByteBuffer.wrap(
                                input.getBytes())));

        // lexing
        SmartLexer mathLexer = new SmartLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(mathLexer);

        // parsing
        SmartParser mathParser = new SmartParser(tokenStream);
        SmartParser.MainContext prog = mathParser.main();

        // creates Truffle nodes from ANTLR parse result
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        SmartParseTreeListener listener = new SmartParseTreeListener();
        treeWalker.walk(listener, prog);

        return listener.getRoot(this);
    }

    protected boolean isObjectOfLanguage(Object object) {
        // return true if this language can deal with such object in "native way"
        return false;
    }
}
