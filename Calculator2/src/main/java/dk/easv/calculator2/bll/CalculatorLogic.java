package dk.easv.calculator2.bll;

public class CalculatorLogic {

    public double calculate (String operator, double savedValue2, double savedValue3) {
        return switch (operator) {
            case "+" -> savedValue3 + savedValue2;
            case "-" -> savedValue3 - savedValue2;
            case "*" -> savedValue3 * savedValue2;
            case "/" -> savedValue3 / savedValue2;
            case "%" -> savedValue3 / 100;
            default -> 0;
        };
    }

    public double procentInEnd (String operator, double savedValue2, double savedValue3) {
        savedValue2 = savedValue2 * savedValue3;

        return switch (operator) {
            case "+" -> savedValue3 + savedValue2;
            case "-" -> savedValue3 - savedValue2;
            case "*" -> savedValue3 * savedValue2;
            case "/" -> savedValue3 / savedValue2;
            case "%" -> savedValue3 / 100;
            default -> 0;
        };
    }
}
