package visitor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Env {
    public Map<String, RetVal> map;

    public Env parEnv;

    public Env() {
        map = new LinkedHashMap<>();
    }

}
