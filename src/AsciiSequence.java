import java.util.Arrays;

import static java.lang.String.*;

public class AsciiSequence {

    public static class AsciiCharSequence implements CharSequence {
        byte[] byteArray;

        public AsciiCharSequence(byte[] byteArrayInputStream) {
            this.byteArray =  byteArrayInputStream;
        }

        @Override
        public int length() {
            return this.byteArray.length;
        }

        @Override
        public char charAt(int index) {
            return (char)byteArray[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            CharSequence tmpCS;
            tmpCS = (CharSequence)byteArray[].toString();
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
            System.out.println(init_str);
            byte[] tmpByteArray;
            tmpByteArray = init_str.getBytes();
            System.out.println(tmpByteArray.length);
            AsciiCharSequence test_seq = new AsciiCharSequence(tmpByteArray);
            System.out.println(test_seq.length());
            System.out.println(test_seq.charAt(3));

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
