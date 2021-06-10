package logical;

public class LogicalOperations {

    public static void main(String[] args) {

        Something x = null;

        try {
            if (x != null && x.getValue() < 5) {
                System.out.println("Doing Something");
            }
        } catch (NullPointerException e) {
            System.out.println("1 koşul");
        }

        try {
            if (x != null & x.getValue() < 5) {
                System.out.println("Doing Something");
            }
        } catch (NullPointerException e) {
            System.out.println("2 koşul");
        }


    }


    private static class Something {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
