package crudRepositoryes;

import bookModel.BookModel;

public class CrudOperations {
    private BookModel bookModel;

    @Override
    public String toString() {
        return "BookModel["
                + "id=" + bookModel.getId()
                + ", title=" + bookModel.getTitle()
                + ", genre=" + bookModel.getGenre()
                + ", price=" + bookModel.getPrice()
                + ']';
    }
}


