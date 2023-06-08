package task_two;

import java.util.ArrayList;
import java.util.List;

public class Academy {
    private List<Group> groups;

    public Academy() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.remove(group);
    }

    public List<Group> getGroups() {
        return groups;
    }
}
