public class OffByN implements CharacterComparator {

    private int off;

    public OffByN(int N) {
        off = N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        if (x - y == off || x - y == -off) {
            return true;
        }
        return false;
    }

}
