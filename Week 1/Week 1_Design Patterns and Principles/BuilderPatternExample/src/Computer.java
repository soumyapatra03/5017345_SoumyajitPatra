// Computer.java
public class Computer {
    private String CPU;
    private int RAM; // in GB
    private int storage; // in GB
    private String GPU;
    private String OS;

    // Private constructor to enforce the use of the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.OS = builder.OS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                "GB, storage=" + storage +
                "GB, GPU='" + GPU + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private int RAM; // in GB
        private int storage; // in GB
        private String GPU;
        private String OS;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
