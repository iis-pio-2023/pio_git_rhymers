package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int INITIAL_VALUE = -1;
    private static final int TOTAL = -1;

    private final int[] NUMBERS = new int[SIZE];

    private int total = TOTAL;

    /***
     * Funkcja zwraca size tablicy NUMBERS
     * @return SIZE - ilość elementów w tablicy
     */
    public static int getSIZE() {
        return SIZE;
    }

    /***
     * Funkcja zwraca INITIAL_VALUE
     * @return INITIAL_VALUE wartość początkowa miejsca wpisania wartości
     */
    public static int getInitialValue() {
        return INITIAL_VALUE;
    }

    /***
     * Funkcja zwraca wartość TOTAl
     * @return TOTAL liczba wskazująca na ostatnie zapełnione miejsce w tablicy
     */
    public static int getTOTAL() {
        return TOTAL;
    }

    /***
     * Funkcja dodaje wartość do tablicy
     * @param in wartość do wpisania do tablicy
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /***
     * Funkcja sprawdza czy tablica jest pusta
     * @return true/false
     */
    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    /***
     * Funkcja sprawdza czy tablica jest pełna
     * @return true/false
     */
    public boolean isFull() {
        return total == SIZE - 1;
    }

    /***
     * Fukcja zwraca ostatnią wpisaną wartość do tablicy, w przypadku pustej tablicy zwraca INITIAL_VALUE
     * @return NUMBERS[TOTAL] ostatnia wpisana wartość do tablicy
     */
    protected int peekaboo() {
        if (callCheck())
            return INITIAL_VALUE;
        return NUMBERS[total];
    }

    /***
     * Funkcja usuwa ostatnią wpisaną wartość z tablicy, w przypadku pustej tablicy zwraca INITIAL_VALUE
     * @return NUMBERS[TOTAL] ostatnia wartość wpisana do tablicy
     */
    public int countOut() {
        if (callCheck())
            return INITIAL_VALUE;
        return NUMBERS[total--];
    }

    /***
     * Funkcja sprawdza ile elementów znajduje się w tablicy
     * @return total - ilość elementów w tablicy
     */
    public int getTotal() {
        return total;
    }

    /***
     * Funkcja zwraca tablicę elementów
     * @return NUMBERS tablica elementów
     */
    public int[] getNUMBERS() {
        return NUMBERS;
    }

}