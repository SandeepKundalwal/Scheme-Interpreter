package visitor;

import java.util.List;

public class ListVal implements RetVal<List<Integer>> {
    public List<Integer> arr;

    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public ListVal(List<Integer> list) {
        this.arr = list;
    }

    public ListVal(ListVal listValue) {
        this.arr = listValue.arr;
    }

    @Override
    public List<Integer> getVal() {
        return arr;
    }

    @Override
    public void displayVal() {
        String str = "(";
        for(Integer val : arr) {
            str += val + " ";
        }
        str = str.trim();
        str += ")";
        System.out.println(str);
    }
}
