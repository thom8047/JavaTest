// DONT FORGET IMPORTS/PACKAGES!!!

import java.util.*;

public class BubbleSort {
    public List<Integer> sort(List<Integer> _list, int pass) {
        pass++;
        boolean cont = false;
        
        try {
            for (int i = 0; i < _list.size(); i++) {
                int element = _list.get(i);
                int nextEle = _list.get(i+1);

                if (element > nextEle) {
                    cont = true;
                    _list.set(i, nextEle);
                    _list.set(i+1, element);
                }
            }
        } catch (Exception e) {
            if (cont) {
                System.out.println(_list);
                this.sort(_list, pass);
            } else {
                System.out.print("successful after " + pass + " passes: ");
            }
        }
        return _list;
    }

    public List<Integer> returnBubble(List<Integer> _list) {
        List<Integer> sortedList = this.sort(_list, 0);
        return sortedList;
    }
}
