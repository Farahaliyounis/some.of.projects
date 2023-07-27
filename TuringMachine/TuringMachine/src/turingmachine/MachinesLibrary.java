package turingmachine;
import java.util.Locale;
import java.util.Scanner;

public final class MachinesLibrary 
{
	private MachinesLibrary() {}
	
	public static TuringMachine EqualBinaryWords()
	{
		TuringMachine newTM = new TuringMachine();
        Scanner sc = new Scanner(System.in);
        //// Adding Satates/////////////////////////////////////
        System.out.println("Enter Number of States:");
        int numStates = sc.nextInt();

        for (int i = 1; i <= numStates; i++) {
            newTM.addNewState(String.format("q%d", i));
        }

        newTM.addNewState("qa");
        newTM.addNewState("qr");
        newTM.addTheStartState("q1");
        newTM.applyAcceptState("qa");
        newTM.applyRejectState("qr");

        ////////////////////////Transition Table/////////////////////////////////
        System.out.println("Enter Num of Transition table rows:");
        int numTransitionRows = sc.nextInt();

        System.out.println("Entre Each Row OF Table:>> Don\'t Worry Machine Will Know Symbols from Transition Table \n Make Sure You Fill Like This Form:\n (ReadState,ReadSymbol,WriteState,WriteSymbol,Movement Direction oF The head R Meaning move to right and L to left) ");

        for (int i = 0; i < numTransitionRows; i++) {
            Object[] row = new Object[5];

            for (int j = 0; j < 5; j++) {
                row[j] = sc.next();
            }

            if ("R".equals((String) row[4])) {
                newTM.addTmTransitions((String) row[0], ((String) row[1]).charAt(0), (String) row[2], ((String) row[3]).charAt(0), true);
            } else {
                newTM.addTmTransitions((String) row[0], ((String) row[1]).charAt(0), (String) row[2], ((String) row[3]).charAt(0), false);
            }
        }

//        newTM.addTmTransitions("q1", '1', "q3", 'x', true);
//        newTM.addTmTransitions("q1", '0', "q2", 'x', true);
//        newTM.addTmTransitions("q1", '#', "q8", '#', true);
//        newTM.addTmTransitions("q2", '0', "q2", '0', true);
//        newTM.addTmTransitions("q2", '1', "q2", '1', true);
//        newTM.addTmTransitions("q2", '#', "q4", '#', true);
//        newTM.addTmTransitions("q3", '0', "q3", '0', true);
//        newTM.addTmTransitions("q3", '1', "q3", '1', true);
//        newTM.addTmTransitions("q3", '#', "q5", '#', true);
//        newTM.addTmTransitions("q4", 'x', "q4", 'x', true);
//        newTM.addTmTransitions("q4", '0', "q6", 'x', false);
//        newTM.addTmTransitions("q5", 'x', "q5", 'x', true);
//        newTM.addTmTransitions("q5", '1', "q6", 'x', false);
//        newTM.addTmTransitions("q6", '0', "q6", '0', false);
//        newTM.addTmTransitions("q6", '1', "q6", '1', false);
//        newTM.addTmTransitions("q6", 'x', "q6", 'x', false);
//        newTM.addTmTransitions("q6", '#', "q7", '#', false);
//        newTM.addTmTransitions("q7", '0', "q7", '0', false);
//        newTM.addTmTransitions("q7", '1', "q7", '1', false);
//        newTM.addTmTransitions("q7", 'x', "q1", 'x', true);
//        newTM.addTmTransitions("q8", 'x', "q8", 'x', true);
//        newTM.addTmTransitions("q8", '_', "qa", '_', true);
        return newTM;
    }
}