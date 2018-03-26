import java.util.Arrays;

public class AsciiSequence {

    public class AsciiCharSequence implements CharSequence {
        byte[] byteArray;

        public AsciiCharSequence(byte[] byteArrayInputStream) {
            byteArrayInputStream = this.byteArray;
        }

        /**
         * Returns the length of this character sequence.  The length is the number
         * of 16-bit {@code char}s in the sequence.
         *
         * @return the number of {@code char}s in this sequence
         */
        @Override
        public int length() {
            return 0;
        }

        /**
         * Returns the {@code char} value at the specified index.  An index ranges from zero
         * to {@code length() - 1}.  The first {@code char} value of the sequence is at
         * index zero, the next at index one, and so on, as for array
         * indexing.
         * <p>
         * <p>If the {@code char} value specified by the index is a
         * <a href="{@docRoot}/java/lang/Character.html#unicode">surrogate</a>, the surrogate
         * value is returned.
         *
         * @param index the index of the {@code char} value to be returned
         * @return the specified {@code char} value
         * @throws IndexOutOfBoundsException if the {@code index} argument is negative or not less than
         *                                   {@code length()}
         */
        @Override
        public char charAt(int index) {
            return 0;
        }

        /**
         * Returns a {@code CharSequence} that is a subsequence of this sequence.
         * The subsequence starts with the {@code char} value at the specified index and
         * ends with the {@code char} value at index {@code end - 1}.  The length
         * (in {@code char}s) of the
         * returned sequence is {@code end - start}, so if {@code start == end}
         * then an empty sequence is returned.
         *
         * @param start the start index, inclusive
         * @param end   the end index, exclusive
         * @return the specified subsequence
         * @throws IndexOutOfBoundsException if {@code start} or {@code end} are negative,
         *                                   if {@code end} is greater than {@code length()},
         *                                   or if {@code start} is greater than {@code end}
         */
        @Override
        public CharSequence subSequence(int start, int end) {
            return null;
        }

        @Override
        public String toString() {
            return "AsciiCharSequence{" +
                    "byteArray=" + Arrays.toString(byteArray) +
                    '}';
        }
    }

    public static class AsciiSequencerun{
        public  void run(String[] args){
            String init_str= "Test string";
            AsciiCharSequence test_seq = new AsciiCharSequence(String.getBytes(init_str));

        }
    }

    public static void main(String[] args){
        System.out.println("Go!");
        try
        {
            AsciiSequencerun obj = new AsciiSequencerun ();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
}
