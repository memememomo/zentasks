package components;

import java.util.*;

import org.fluentlenium.core.*;
import org.fluentlenium.core.domain.*;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class Drawer {
    private final FluentWebElement element;

    public Drawer(FluentWebElement element) {
        this.element = element;
    }

    public static Drawer from(Fluent fluent) {
        return new Drawer(fluent.findFirst("nav"));
    }

    public DrawerGroup group(String name) {
        return new DrawerGroup(element.findFirst("#projects > li[data-group=" + name + "]"));
    }

}
