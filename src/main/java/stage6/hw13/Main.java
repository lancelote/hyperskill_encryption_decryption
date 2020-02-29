package stage6.hw13;

public class Main {}

class AsciiCharSequence implements CharSequence {
    byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    public String toString() {
        return new String(this.bytes);
    }

    @Override
    public int length() {
        return this.bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(this.bytes, start, end));
    }
}
