package io.mateu.ui.mdd.client;

import io.mateu.ui.core.client.app.AbstractAction;

public class MDDOpenEditorAction extends AbstractAction {

    private final Class entityClass;
    private final Object id;
    private boolean modifierPressed;

    public MDDOpenEditorAction(String name, Class entityClass, Object id) {
        this(name, entityClass, id, false);
    }

    public MDDOpenEditorAction(String name, Class entityClass) {
        this(name, entityClass, null, false);
    }

    public MDDOpenEditorAction(String name, Class entityClass, Object id, boolean modifierPressed) {
        super(name);
        this.entityClass = entityClass;
        this.id = id;
        this.modifierPressed = modifierPressed;
    }

    @Override
    public void run() {
        MDD.openEditor(entityClass, id, modifierPressed);
    }
}
