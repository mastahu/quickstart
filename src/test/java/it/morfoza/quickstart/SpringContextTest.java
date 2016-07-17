package it.morfoza.quickstart;

import it.morfoza.quickstart.library.jpa.Book;
import it.morfoza.quickstart.library.jpa.BookDao;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SpringContextTest {

    @Test
    public void isBootingUp() {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
        assertNotNull(context);
    }

    @Test
    public void jpaBookDaoReadsBooks() {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
        assertNotNull(context);
        final BookDao repository = context.getBean(BookDao.class);
        assertNotNull(repository);
        assertEquals(3,repository.count());

        assertEquals(3, makeCollection(repository.findAll()).size());
    }

    public static <E> Collection<E> makeCollection(Iterable<E> iter) {
        Collection<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }
}
