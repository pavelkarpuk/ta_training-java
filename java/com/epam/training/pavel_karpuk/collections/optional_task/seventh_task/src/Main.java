public class Main {
    public static void main(String[] args) {
        String line = "(, ), [, ], {, }";
        ValidatorOfBrackets validatorOfBrackets = new ValidatorOfBrackets();
        boolean answer = validatorOfBrackets.checkTheCorrectPlacementOfBrackets(line);
        System.out.println("The brackets are placed " + (answer ? "" : "in") + "correctly");
    }
}