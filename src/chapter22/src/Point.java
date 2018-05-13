class Point implements Comparable<Point> {
 double x;
 double y;  
 
 public Point() {
  this(0, 0);
 } 
 
 public Point(double x, double y) {
  super();
  this.x = x;
  this.y = y;
 }
 
 public double getX() {
  return x;
 }
 public void setX(double x) {
  this.x = x;
 }
 public double getY() {
  return y;
 }
 public void setY(double y) {
  this.y = y;
 }

 @Override
 public int compareTo(Point o) {
  if (x > o.x) {
   return 1;
  } else if (x < o.x) {
   return -1;
  } else {
   if (y > o.y) {
    return 1;
   } else if (y < o.y) {
    return -1;
   } else {
    return 0;
   }
  }
 }  
 
 @Override
 public String toString() {
  return "x: " + x + ", y: " + y;
 }
}