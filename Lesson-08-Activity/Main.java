class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String message) {
        System.out.println(message);
	}

	double FtoC(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0;
	}

	double sphereVolume(double radius) {
    	return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	double coneVolume(double radius, double height) {
    	return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
	}

	double distance(double x1, double y1, double x2, double y2) {
    	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
  	void init(){
		print("Hello, World!");
		print("Celsius: " + FtoC(98.6));
		print("Volume: " + sphereVolume(3));
		print("Volume: " + coneVolume(3, 5));
		print("Distance: " + distance(0, 0, 3, 4));
  	}

  
 
}