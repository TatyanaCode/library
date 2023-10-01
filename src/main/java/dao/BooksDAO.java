package dao;

import bookModel.BookModel;

import java.util.Collection;
import java.util.Optional;

public interface BooksDAO <T, I> {
    BookModel get(int id);
    Collection getAll();
    Optional save(T t);
    void update(T t);
    void delete(T t);

}
