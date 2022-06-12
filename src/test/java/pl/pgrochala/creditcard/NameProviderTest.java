package pl.pgrochala.creditcard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NameProviderTest {

@Test
    void itPassNamesList(){
        NameProvider nameProvider = new NameProvider();
        assertEquals(nameProvider.allNames(), Arrays.asList("Kuba", "Michal", "Kasia"));

    }
}
