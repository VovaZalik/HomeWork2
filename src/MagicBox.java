import java.util.Random;
public class MagicBox <T> {
        protected Object[] objects;

        public MagicBox(int maxObjects) {
            this.objects = new Object[maxObjects];
        }

        public boolean add(T item) {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null) {
                    objects[i] = item;
                    return true;
                }
            }
            return false;
        }

        public T pick() {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null)
                    throw new RuntimeException(String.format("Коробка не полна и осталось ещё %s",
                            objects.length - i));

            }
            Random random = new Random();
            int randomInt = random.nextInt(objects.length);
            T object = (T) objects[randomInt];
            return object;
        }
    }

