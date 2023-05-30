package visitor;

public class StrVal implements RetVal<String> {

    private String val;

    public StrVal(String value) {
        this.val = value;
    }

    @Override
    public String getVal() {
        return val;
    }

    @Override
    public void displayVal() {
        System.out.println(val);
    }
}
