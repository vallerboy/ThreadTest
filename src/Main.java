public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        for (int i = 0; i < 10000; i++) {
            new Thread1(operation).start();
        }

        System.out.println(operation.oskar);
    }


    private static class Operation {
        private int oskar = 0;
         public int operation() {
            oskar++;
            oskar--;
            return oskar;
        }
    }

    private static class Thread1 extends Thread  {
        Operation operation;

        public Thread1(Operation o ) {
            operation = o;
        }

        @Override
        public void run() {
            for(int i = 0; i <= 10000; i++){
                operation.operation();
            }

            System.out.println(operation.oskar);

        }
    }
}
