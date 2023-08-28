import lombok.Data;

@Data
public class MyJSON {
        private int count;
        private String[] items;
        @Override
        public String toString() {
            return "JsonResponse{" +
                    "\nid'" + count + '\'' +
                  //  ", \ndoi='" + getItems() + '\'' +
                    '}';
        }
    }
