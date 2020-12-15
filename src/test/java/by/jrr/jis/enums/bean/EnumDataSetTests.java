package by.jrr.jis.enums.bean;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.stream.Stream;

public class EnumDataSetTests {

    @Test
    public void mapString() {
        EnumMap<Menu, String> menuToStringEnumMap = new EnumMap<>(Menu.class);
        menuToStringEnumMap.put(Menu.HOME, "custom object could be stored here");
        System.out.println(menuToStringEnumMap);
    }

    @Test
    public void mapObject() {
        EnumMap<Menu, Human> menuToHumanEnumMap = new EnumMap<>(Menu.class);
        menuToHumanEnumMap.put(Menu.HOME, new Human("max"));
        System.out.println(menuToHumanEnumMap);
    }

    @Test
    public void set() {
        EnumSet<Menu> menus = EnumSet.allOf(Menu.class);
        EnumSet<Menu> noMenus = EnumSet.noneOf(Menu.class);
        EnumSet<Menu> rangeMenus = EnumSet.range(Menu.HOME, Menu.BLOG);
        System.out.println("break");
    }

    @Test
    public void populateMap() {

        EnumMap<Menu, String> menuMap = new EnumMap<>(Menu.class);
        Stream.of(Menu.values()).forEach(el -> menuMap.put(el, el.getUri()));
        System.out.println(menuMap);
    }
}
