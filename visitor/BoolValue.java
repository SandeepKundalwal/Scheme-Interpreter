package visitor;

public class BoolValue implements RetVal<Boolean> {

    private Boolean value;

    public BoolValue(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getVal() {
        return value;
    }

    @Override
    public void displayVal() {
        if(value) {
            System.out.println("#t");
        } else {
            System.out.println("#f");
        }
    }
}
