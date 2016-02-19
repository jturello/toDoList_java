import java.util.ArrayList;


public class Category {
  private static ArrayList<Category> categories = new ArrayList<Category>();

  private String mName;

  public Category(String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }

  public static void clear() {
    categories.clear();
  }


}
