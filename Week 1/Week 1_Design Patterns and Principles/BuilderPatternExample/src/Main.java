public class Main {
    public static void main(String[] args) {
        // Create a basic computer configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(8)
                .setStorage(256)
                .setOS("Windows 10")
                .build();

        System.out.println(basicComputer);

        // Create a high-end computer configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA GeForce RTX 3080")
                .setOS("Windows 11")
                .build();

        System.out.println(gamingComputer);
    }
}
