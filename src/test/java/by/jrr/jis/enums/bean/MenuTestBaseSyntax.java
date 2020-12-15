package by.jrr.jis.enums.bean;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MenuTestBaseSyntax {

    @Test
    void values() {
        Menu[] values = Menu.values();
        Arrays.stream(values).forEach(System.out::println);
        Menu[] valuesExpected = {Menu.LOGIN, Menu.HOME};
        assertArrayEquals(valuesExpected, values);
    }

    @Test
    void valueOf() {
        Menu menuElement = Menu.valueOf("LOGIN");
        assertEquals(Menu.LOGIN, menuElement);
    }

    @Test
    void name(){
        String elementAsString = Menu.LOGIN.name();
        assertEquals("LOGIN", elementAsString);
    }

    @Test
    void ordinal(){
        int elementAsString = Menu.LOGIN.ordinal();
        assertEquals(0, elementAsString);
    }
}
