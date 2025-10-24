import java.util.Arrays;

/**
 * Model a 1D elementary cellular automaton.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class Automaton
{
    // The number of cells.
    private final int numberOfCells;
    // The state of the cells.
    private int[] state;
    
    /**
     * Create a 1D automaton consisting of the given number of cells.
     * @param numberOfCells The number of cells in the automaton.
     */
    public Automaton(int numberOfCells)
    {
        this.numberOfCells = numberOfCells;
        state = new int[numberOfCells];
        // Seed the automaton with a single 'on' cell in the middle.
        state[numberOfCells / 2] = 1;
    }
    
    /**
     * Print the current state of the automaton.
     */
    public void print()
    {
        for(int cellValue : state) {
            if(cellValue == 1) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }   
    
    private int calculateNextState(int left, int center, int right) {
     return (left + right) % 2;
    }
    
    /**
     * Update the automaton to its next state.
     */
    public void update()
    {
       int[] extendedState = new int[numberOfCells + 1];
       System.arraycopy(state, 0, extendedState, 0, numberOfCells);
       extendedState[numberOfCells] = 0;// Build the new state in a separate array.
        int[] nextState = new int[numberOfCells];
        // Naively update the state of each cell
        // based on the state of its two neighbors.
        int left = 0;
        int center = extendedState[0];
        for(int i = 0; i < numberOfCells; i++) {
            int right = extendedState[i + 1];
            nextState[i] = calculateNextState(left, center, right);
            left = center;
            center = right;
        }
        state = nextState;
    }
    
    /**
     * Reset the automaton.
     */
    public void reset()
    {
        Arrays.fill(state, 0);
        // Seed the automaton with a single 'on' cell.
        state[numberOfCells / 3] = 1;
        state[2 * numberOfCells / 3] = 1;
    }
    
}
