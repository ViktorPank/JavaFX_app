package Example;

public class LexicOrderArray implements Calculations{

    private StringBuffer data;

    public LexicOrderArray(String data) {
        this.data = new StringBuffer(data.subSequence(0, data.length()));
    }

    public StringBuffer getData() {
        return data;
    }

    public void setData(StringBuffer data) {
        this.data = data;
    }

    @Override
    public StringBuffer run() {
        return new StringBuffer("Lexic");
    }
}
