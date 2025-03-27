package StreamOfEmployee;

import java.util.Comparator;

public class ProjectsComparator<E extends Projects> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return 1;
    }
}
