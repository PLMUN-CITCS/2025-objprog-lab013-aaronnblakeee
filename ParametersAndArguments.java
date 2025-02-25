public class Main {

    // Method to calculate the area of a rectangle (room)
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    // Main method
    public static void main(String[] args) {
        // Declaring width and height for the room
        int roomWidth = 10;
        int roomHeight = 15;

        // Calling the calculateArea method with roomWidth and roomHeight as arguments
        int area = calculateArea(roomWidth, roomHeight);

        // Printing the calculated area
        System.out.println("The calculated area is: " + area);
    }
}
