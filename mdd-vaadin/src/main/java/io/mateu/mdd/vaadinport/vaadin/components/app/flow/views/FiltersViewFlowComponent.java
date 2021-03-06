package io.mateu.mdd.vaadinport.vaadin.components.app.flow.views;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import io.mateu.mdd.vaadinport.vaadin.MyUI;
import io.mateu.mdd.vaadinport.vaadin.components.app.flow.FlowViewComponent;
import io.mateu.mdd.vaadinport.vaadin.components.views.CRUDViewComponent;

public class FiltersViewFlowComponent extends VerticalLayout implements FlowViewComponent {

    private final CRUDViewComponent crudViewComponent;
    private final String state;

    @Override
    public String getViewTile() {
        return "All filters for " + crudViewComponent.getViewTitle();
    }

    @Override
    public String getStatePath() {
        return state;
    }


    public FiltersViewFlowComponent(String state, CRUDViewComponent crudViewComponent) {
        this.state = state;
        this.crudViewComponent = crudViewComponent;

        addStyleName("filtersflowcomponent");

        addComponent(crudViewComponent.getFiltersViewComponent());

        Button b;
        addComponent(b = new Button("Search", VaadinIcons.SEARCH));
        b.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                MyUI.get().getNavegador().goBack();
            }
        });


    }

}
