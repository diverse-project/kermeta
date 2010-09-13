package view;

public class PropertyEditor {
    private Selectable element;

    public PropertyEditor()
    {

    }

    public void setSelectable(Selectable s)
    {
        element=s;
    }

    public Selectable getSelectable()
    {
        return element;
    }
}
