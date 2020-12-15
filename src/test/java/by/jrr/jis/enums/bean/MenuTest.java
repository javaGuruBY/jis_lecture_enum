package by.jrr.jis.enums.bean;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void getUri() {
        assertEquals("/home", Menu.HOME.getUri());
        assertEquals("/login", Menu.LOGIN.getUri());

        assertEquals("/defaultPage", Menu.BLOG.getUri());
    }

    @Test
    void isReleased() {
        assertTrue(Menu.LOGIN.isReleased());
        assertFalse(Menu.HOME.isReleased());
    }

    @Test
    void printReleasedEndpoints() {
        Menu.LOGIN.printReleasedEndpoints();
        Menu.HOME.printReleasedEndpoints();

        Stream.of(Menu.values())
                .forEach(a -> a.printReleasedEndpoints());
    }

    @Test
    void commonMethod() {
        Menu.LOGIN.commonMethod();
        Menu.HOME.commonMethod();
        Menu.BLOG.commonMethod();
    }

    @Test
    void abstractMethod() throws Exception {
        Menu.LOGIN.abstractMethod();
        Menu.HOME.abstractMethod();
    }

    @Test
    void abstractMethodThrowsException() throws Exception {
        Exception exception = assertThrows(ExecutionControl.NotImplementedException.class, () ->
                Menu.BLOG.abstractMethod());
        assertEquals("BLOG is not implemented yet", exception.getMessage());
    }

    @Test
    void specialMethodOnlyInHome() {
        Menu.HOME.specialMethod();
        Menu.LOGIN.specialMethod();
    }

    @Test
    void compareOutsideEnumWithString() {
        String choice = "BLOG";
        Menu menuOption = Menu.valueOf(choice);
        assertEquals(Menu.BLOG, menuOption);
        selectByUserChoice(menuOption);
    }
    

    @Test
    void compareOutsideEnumWithInteger() {
        int userChoice = 1;
        Menu selectedOption = Menu.values()[userChoice];
        assertEquals(Menu.HOME, selectedOption);
        selectByUserChoice(selectedOption);
    }


    @Test
    void compareByField() throws Exception {
        String userChoice = "home";
        Menu selectedOption = Menu.findByUri(userChoice);
        assertEquals(Menu.HOME, selectedOption);
        selectByUserChoice(selectedOption);
    }


    private void selectByUserChoice(Menu menu) {
        switch (menu) {
            case HOME:
                // do stuff
                break;
            case LOGIN:
                // do stuff
                break;
            case BLOG:
                // do stuff
                break;
        }
    }
}
