import java.util.*;

public class QuickSort {
    public List<Integer> quickSort(List<Integer> _list) {
        int len = _list.size();
        if (len > 2) {
            int mod = Math.floorDiv(_list.size(), 2);
            List<Integer> fHalf = new ArrayList<>(_list.subList(0, mod));
            List<Integer> sHalf = new ArrayList<>(_list.subList(mod, len));
            // QUESTIONS
        } else {
            // 
        }

        return null;
    }

    public List<Integer> returnQuick(List<Integer> _list) {
        List<Integer> newList = this.quickSort(_list);
        return newList;
    }
}
