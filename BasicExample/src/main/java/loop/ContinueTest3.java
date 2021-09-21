package loop;

import variableTypes.TestObj;

import java.util.ArrayList;
import java.util.List;

public class ContinueTest3 {
    public static void main(String[] args) {
        List<TestObj> list = new ArrayList<>();
        list.add(new TestObj(1,"A",true));
        list.add(new TestObj(2,"B",true));
        list.add(new TestObj(3,"C",false));
        list.add(new TestObj(4,"D",true));
        list.add(new TestObj(5,"E",true));

        for (TestObj obj:list){
            if (!obj.isActive()) continue;;
            System.out.println(obj.toString());
        }

    }
}
