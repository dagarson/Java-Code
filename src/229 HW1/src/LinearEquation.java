public class LinearEquation {
	
	double A;
	double B;
	double C;
	double D;
	double E;
	double F;

	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.A = a;
		this.B = b;
		this.C = c;
		this.D = d;
		this.E = e;
		this.F = f;
	}

	
	public double getA() {
		return A;
	}

	public double getB() {
		return B;
	}

	
	public double getC() {
		return C;
	}

	
	public double getD() {
		return D;
	}

	
	public double getE() {
		return E;
	}

	public double getf() {
		return F;
	}

	
	public boolean notZero() {
		return A * D - B * C != 0;
	}

	
	public double X() {
		return (E * D - B * F) / (A * D - B * C);
	}

	
	public double Y() {
		return (A * F - E * C) / (A * D - B * C);
	}
}