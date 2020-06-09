package java8.fun.stuff;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ParserTest {
    Parser parser = new Parser();


    @Test
    public void testParserCase1() {
        assertTrue(parser.isBalanced("{}()"));

    }

    @Test
    public void testParserCase2() {
        assertTrue(parser.isBalanced("({()})"));
    }

    @Test
    public void testParserCase3() {
        assertFalse(parser.isBalanced("{}("));
    }

}