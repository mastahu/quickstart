package it.morfoza.quickstart.library.database;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;

public class BookDao {

    private NamedParameterJdbcTemplate template;

    public BookDao(DataSource ds) {
        template = new NamedParameterJdbcTemplate(ds);
    }

    public List<Book> getBooks() {
        return template.query("SELECT * FROM users", new HashMap<>(), (rs, rowNum) -> new Book(rs.getString("title"), rs.getString("author")));
    }

}