package info.joninousiainen.examples.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.spring.annotation.VaadinUI;

@VaadinUI
@Theme("valo")
public class AppUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        Page.getCurrent().setTitle("App");

        final VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);
        layout.setSpacing(true);

        layout.addComponent(new Label("Hello Vaadin!"));

        this.setContent(layout);
    }
}