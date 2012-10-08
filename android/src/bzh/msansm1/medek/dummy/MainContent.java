package bzh.msansm1.medek.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainContent {

    public static class MainItem {

        public String id;
        public String content;

        public MainItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static List<MainItem> ITEMS = new ArrayList<MainItem>();
    public static Map<String, MainItem> ITEM_MAP = new HashMap<String, MainItem>();

    static {
        addItem(new MainItem("Livres", "Livres"));
        addItem(new MainItem("CDs", "CDs"));
        addItem(new MainItem("Films", "Films"));
        addItem(new MainItem("Séries", "Séries"));
    }

    private static void addItem(MainItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
}
