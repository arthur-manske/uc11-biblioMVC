package biblioMVC;

import biblioMVC.controller.BookController;
import biblioMVC.controller.PreferencesController;
import biblioMVC.view.BookForm;
import biblioMVC.view.SwingConfig;
import java.awt.Color;

public final class App {
    private final BookForm bookForm;
    
    private App(String path)
    {
       final var bookController = new BookController(path);
       final var prefController = new PreferencesController(this.getClass().getName());
       
       SwingConfig.setFlatLafTheme(prefController.isDarkModeEnabled(), prefController.getAccentColor());
       this.bookForm = new BookForm(bookController, prefController);
    }
    
    private void run()
    {
        this.bookForm.setVisible(true);
    }
    
    public static void main(String[] args)
    {    
        new App("biblioteca.db").run();
    }
}