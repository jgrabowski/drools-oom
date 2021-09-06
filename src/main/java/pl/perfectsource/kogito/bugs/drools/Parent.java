package pl.perfectsource.kogito.bugs.drools;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    
    String name;

    List<Child> children = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

}
