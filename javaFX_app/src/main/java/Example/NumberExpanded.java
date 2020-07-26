package Example;

public class NumberExpanded implements Calculations {
    private StringBuffer data;

    public NumberExpanded(String data) {
        this.data = new StringBuffer(data.subSequence(0, data.length()));
    }

    @Override
    public StringBuffer run() {
        return new StringBuffer("Number");
    }

    public StringBuffer getData() {
        return data;
    }

    public void setData(StringBuffer data) {
        this.data = data;
    }
}
