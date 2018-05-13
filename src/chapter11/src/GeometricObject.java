//used from test #1

public abstract class GeometricObject {
				//change color to yellow
 private String color = "Yellow";
 private boolean filled;
 private java.util.Date dateCreated;

/** Construct a default geometric object */
 protected GeometricObject() {
 dateCreated = new java.util.Date();
 }

/** Construct a geometric object with color and filled value */
 protected GeometricObject(String color, boolean filled) {
 dateCreated = new java.util.Date();
 this.color = color;
 this.filled = filled;
 }

/** Return color */
 public String getColor() {
 return color;
 }

/** Set a new color */
 public void setColor(String color) {
 this.color = color;
 }

/** Return filled. Since filled is boolean,
 * the get method is named isFilled */
 public boolean isFilled() {
 return filled;
 }

/** Set a new filled */
 public void setFilled(boolean filled) {
 this.filled = filled;
 }

/** Get dateCreated */
 public java.util.Date getDateCreated() {
 return dateCreated;
 }

@Override
 public String toString() {
 return "created on " + dateCreated + "\ncolor: " + color +
 " and filled: " + filled;
 }
}