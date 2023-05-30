package visitor;

import java.util.ArrayList;
import java.util.List;

public class ProcVal implements RetVal {

    private List<RetVal> prams;
    private RetVal procBody;

    private Env parEnv;

    public ProcVal() {
        this.prams = new ArrayList<>();
    }
    @Override
    public RetVal getVal() {
        return procBody;
    }

    public void addPram(RetVal value) {
        prams.add(value);
    }

    public List<RetVal> getPrams() {
        return prams;
    }

    public void setPrams(List<RetVal> prams) {
        this.prams = prams;
    }

    public RetVal getProcBody() {
        return procBody;
    }

    public void setProcBody(RetVal procBody) {
        this.procBody = procBody;
    }

    public Env getParEnv() {
        return parEnv;
    }

    public void setParEnv(Env parEnv) {
        this.parEnv = parEnv;
    }

    @Override
    public void displayVal() {
        String procMsg = "<procedure: lambda (";
        String str = "";
        for(RetVal par : prams) {
            str += par.getVal().toString() + " ";
        }
        procMsg += str.trim();
        procMsg += ")>";
        System.out.println(procMsg);
    }
}
