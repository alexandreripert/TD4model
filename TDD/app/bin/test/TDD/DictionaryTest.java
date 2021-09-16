package TDD;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    @Test 
    Dictionary dic = new Dictionary("Example");
    public void testDictionaryName() {
        assertThat(dic.getName(), equalTo("Example"));
    }

    @Test
    public void testIsEmpty() {
        Dictionary d = new Dictionary();
        assertThat(d.isEmpty(), equalsTo(true));
    }

    @Test 
    public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalsTo("against"));
}
}