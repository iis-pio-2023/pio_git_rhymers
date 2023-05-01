package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    /**
     stala okreslajaca maksymalna wielkosc tablicy na 12
     */
    public static final int MAX_SIZE = 12;

    /**
     stala okreslajaca maksymalny indeks tablicy
     */
    public static final int INDEX = MAX_SIZE - 1;

    /**
     * domyslna wartosc bledu ma -1
     */

    public static final int DEFAULT = -1;

    /**
     * deklaracja tablicy o wielkosci MAX_SIZe
     */
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int totalNumbers = -1;

    /**
     * Funkcja dodajaca nowy element do tablicy
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++totalNumbers] = in;
    }
    public boolean callCheck() {
        return totalNumbers == DEFAULT;
    }


    /**
     * @return
     * isFull
     * zwraca wartosc logiczna w zaleznosci od tego czy tablica jest pelna czy nie
     */
    public boolean isFull() {
        return totalNumbers == INDEX;
    }


    /**
     * @return
     * peekaboo
     * zwraca ostani element tablicy
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return NUMBERS[totalNumbers];
    }


    /**
     * countOut
     * funkcja zwraca i usuwa ostatni element dodany do tablicy
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return NUMBERS[totalNumbers--];
    }
}
