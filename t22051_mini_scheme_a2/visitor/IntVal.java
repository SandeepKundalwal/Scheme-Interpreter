package visitor;

public class IntVal implements RetVal<Integer> {

    public Integer val;

    public IntVal(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    @Override
    public void displayVal() {
        System.out.println(val);
    }
}
