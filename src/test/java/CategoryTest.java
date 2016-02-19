import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Category_instantiatesCorrectly_true() {
    Category myCategory = new Category("Homework");
    assertEquals(true, myCategory instanceof Category);
  }

  public void Category_hasName_true() {
    Category myCategory = new Category("Homework");
    assertEquals("Homework", myCategory.getName());
  }


}





/*
  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void Task_instantiatesWithDescription_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }
*/
