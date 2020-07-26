package Example;

public class NumberExpanded implements Calculations {
    private StringBuffer data;

    public NumberExpanded(String data) {
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
        long number;
        String numberStr;
        StringBuffer expandedNumber = new StringBuffer();
        try {
            number = Long.parseLong(data.toString().trim());
            numberStr = String.valueOf(number);
        } catch (NumberFormatException ex) {
            return new StringBuffer("Некорректное число");
        }

        for (int i = 0; i < numberStr.length(); i++) {
            if (!(numberStr.charAt(i) == '0')) {

                expandedNumber.append(numberStr.charAt(i));
                for (int j = numberStr.length() - i - 1; j > 0; j--) {
                    expandedNumber.append("0");
                }
                if (!(numberStr.length() - 1 == i)) expandedNumber.append("+");
            }
        }
        return expandedNumber;
    }
}
