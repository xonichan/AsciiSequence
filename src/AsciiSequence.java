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
        public AsciiCharSequence subSequence(int start, int end) {
            String tmpStr = new String(byteArray);
            String tmpStr2 = tmpStr.substring(start, end);
            AsciiCharSequence tmpACS = new AsciiCharSequence(tmpStr2.getBytes());
            return tmpACS;
        }

        @Override
        public String toString() {
            String tmpStr = new String(byteArray);
            return tmpStr;
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
            System.out.println(test_seq.subSequence(2,5));
            System.out.println(test_seq.toString());

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
