package by.jrr.jis.enums.service;

public enum Calculator {
    PLUS,
    MINUS,
    MULT,
    DIV;

    double calculate(double x, double y) {
        switch (this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case MULT: return x * y;
            case DIV: return x / y;
            default: throw  new AssertionError("Unknown");
        }
    }
}
