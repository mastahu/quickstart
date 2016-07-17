package it.morfoza.quickstart;

import it.morfoza.quickstart.library.jpa.BookDao;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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
    }
}
