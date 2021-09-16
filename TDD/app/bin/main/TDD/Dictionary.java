package TDD;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class Dictionary {
    private String name;
    
    public Dictionary(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isEmpty()
    {
        return true;
    }
}