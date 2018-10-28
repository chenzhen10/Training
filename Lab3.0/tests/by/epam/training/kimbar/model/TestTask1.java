package by.epam.training.kimbar.model;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTask1 {
    Task1 task1= null;

    @Before
    public void init(){
        task1 = new Task1();
    }

    @After
    public void destroy(){
        task1 = null;
    }


    @Test
    public void test(){ //придумать как затестить
        int num = 12;
        assertNotNull(task1.headsOrTails(num));
    }
}
