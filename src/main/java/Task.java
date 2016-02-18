import java.time.LocalDateTime;
import java.util.ArrayList;


public class Task {
  private static ArrayList<Task> instances = new ArrayList<Task>();

  private String mDescription;
  private LocalDateTime mCreatedAt;
  private boolean mCompleted;
  private int mId;


  public Task(String description) {
    mDescription = description;
    mCreatedAt = LocalDateTime.now();
    mCompleted = false;
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public LocalDateTime getCreateAt() {
    return mCreatedAt;
  }

  public static ArrayList<Task> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Task find(int id) {
    try {
          return instances.get(id - 1);
    } catch(IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }

}
