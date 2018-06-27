package pattern.template;

public class TemplateMain {

    public static void main(String[] args) {

        Coffe coffe = new Coffe();
        coffe.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
