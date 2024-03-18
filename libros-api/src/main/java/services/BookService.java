package services;

import model.Book;
import org.springframework.stereotype.Service;
import repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    /*
    Book book1 = new Book (1L, "El nuevo reino", "Wilbur Smith", "Emece", 400 , "Ficcion historica", 26900.0 );

    Book book2 = new Book (2L, "Un lugar soleado para gente sombria", "Mariana Enriquez", "Anagrama", 232 , "Ficcion moderna", 21500.0 );

    Book book3 = new Book (3L, "Dune", "Frank Herbert", "", 784 , "Ciencia ficcion", 27699.0 );



    public List<Book> listarBooks() {

        return List.of(book1, book2);
    }


     */


    BookRepository bookRepository;

    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
    public Book updateBook(Book book) {
        bookRepository.save(book);
        return bookRepository.findById(book.getId()).orElse(null);
    }


}
