package fitnesse.wikitext.test;

import fitnesse.wikitext.test.ParserTest;
import fitnesse.wikitext.parser.SymbolType;
import org.junit.Test;

public class LiteralTest {
    @Test public void scansLiteral() {
        ParserTest.assertScansTokenType("!- stuff -!", "Literal", true);
    }

    @Test public void translatesLiteral() {
        ParserTest.assertTranslatesTo("!-stuff-!", "stuff");
        ParserTest.assertTranslatesTo("!-''not italic''-!", "''not italic''");
        ParserTest.assertTranslatesTo("!-break\n-!|", "break\n|");
    }
}