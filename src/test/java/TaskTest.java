import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

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

  @Test
  public void isComplete_isFalseAfterInstantion_false() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(false, myTask.isCompleted());
  }

  @Test
  public void getCreateAt_instantiatesWithCurrentTime_today() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myTask.getCreateAt().getDayOfWeek());
  }

  @Test
  public void all_returnsAllInstancesOfTask_true() {
    Task firstTask = new Task("Mow the lawn");
    Task secondTask = new Task("Buy groceries");
    assertTrue(Task.all().contains(firstTask));
    assertTrue(Task.all().contains(secondTask));
  }

  @Test
  public void newId_tasksInstantiatedWithAnID_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(Task.all().size(), myTask.getId());
  }

  @Test
  public void find_returnsTaskWithSameId_secondTask() {
    Task firstTask = new Task("Mow the lawn");
    Task secondTask = new Task("Buy groceries");
    assertEquals(Task.find(secondTask.getId()), secondTask);
  }

  @Test
  public void find_returnsNullWhenNoTaskFound_true() {
    assertTrue(Task.find(999) == null);
  }

  @Test
  public void clear_emptiesAllTasksFromArrayList() {
    Task myTask = new Task("Mow the lawn");
    Task.clear();
    assertEquals(Task.all().size(), 0);
  }

}
