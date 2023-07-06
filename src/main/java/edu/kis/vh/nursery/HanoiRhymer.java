package edu.kis.vh.nursery;

/**
 * To jest klasa, która zawiera wyliczankę służącą do przeprowadzania rozrywek całkowito liczbowych.
 * Wyróżnia się tym, że nie jest w niej możliwe zgłoszenie (countIn) liczby większej niż bieżąca (peakaboo)
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    private static final int ZERO = 0;
    private int totalRejected = ZERO;

    /**
     * @return zwraca aktualną ilość niepasujących (rejected) liczb
     */
    protected int reportRejected() {
        return totalRejected;
    }

    /**
     * @param in liczba do dodania
     * Funkcja dodaje liczbę in do stosu jeśli jest poprawna bądź zwiększa ilość niepasujących (rejected) liczb
     */
    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * @return zwraca aktualną ilość niepasujących (rejected) liczb
     */
    public int getTotalRejected() {
        return totalRejected;
    }

    /**
     * @param totalRejected ilość odrzuconych liczb do ustawienia
     * Funkcja ustawia ilość niepasujących (rejected) liczb na podaną w parametrze totalRejected
     */
    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
