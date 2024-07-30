// Main.java
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The image will be loaded from the server when displayed for the first time
        image1.display(); // Output: Loading image: image1.jpg
        //         Displaying image: image1.jpg

        // The image will be loaded from the server when displayed for the first time
        image1.display(); // Output: Displaying image: image1.jpg

        // The image will be loaded from the server when displayed for the first time
        image2.display(); // Output: Loading image: image2.jpg
        //         Displaying image: image2.jpg

        // The image will be loaded from the server when displayed for the first time
        image2.display(); // Output: Displaying image: image2.jpg
    }
}
