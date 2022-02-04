
Implement Solid Principles With Examples
Single Responsibility
For example, let's look at a class to represent a simple book:

public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters
}
In this code, we store the name, author and text associated with an instance of a Book.

Let's now add a couple of methods to query the text:

public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
Open  Closed Principle

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }
}
public class PersistenceManager {
    InvoicePersistence invoicePersistence;
    BookPersistence bookPersistence;
    
    public PersistenceManager(InvoicePersistence invoicePersistence,
                              BookPersistence bookPersistence) {
        this.invoicePersistence = invoicePersistence;
        this.bookPersistence = bookPersistence;
    }
}

Liskov Substitution Principle

class Rectangle {
	protected int width, height;

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}

class Square extends Rectangle {
	public Square() {}

	public Square(int size) {
		width = height = size;
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
}

Interface Segregation Principle

public interface ParkingLot {

	void parkCar();	// Decrease empty spot count by 1
	void unparkCar(); // Increase empty spots by 1
	void getCapacity();	// Returns car capacity
	double calculateFee(Car car); // Returns the price based on number of hours
	void doPayment(Car car);
}

class Car {

}
public class FreeParking implements ParkingLot {

	@Override
	public void parkCar() {
		
	}

	@Override
	public void unparkCar() {

	}

	@Override
	public void getCapacity() {

	}

	@Override
	public double calculateFee(Car car) {
		return 0;
	}

	@Override
	public void doPayment(Car car) {
		throw new Exception("Parking lot is free");
	}
}

Dependency Inversion Principle  


public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

}

public interface Keyboard { }
public class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}