package day32maps;

public class EnamRunner {
    public static void main(String[] args) {

        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        System.out.println("FLORIDA Abbreviation = " + UsStates.FLORIDA.getAbbreviation());

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println("stateName = " + stateName);

        String abbreviation = UsStates.getStateCapitalFromAbbreviation("Atlanta");
        System.out.println( abbreviation);


    }



}
