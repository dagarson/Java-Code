public class pointsProgram {
 public static void main(String[] args) {
  Point[] points = new Point[500];
  for (int i = 0; i < points.length; i++) {
   points[i] = new Point((int)(Math.random() * 1000000), (int)(Math.random() * 1000000));
  }
  Pair pair = Pair.getClosestPair(points);
  System.out.println("The closest pair of points are: " + pair.getP1());
 System.out.println("and: " + pair.getP2());
  System.out.println("With a distance of: " + pair.getDistance());
 }
}

