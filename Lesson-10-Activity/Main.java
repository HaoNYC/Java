
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	double gpa(double gpa){
		if (gpa >= 90)
			return gpa * 1.1;
		else
			return gpa;
	}
	boolean isGraduating(String grade, int credits){
		if (grade == "Senior" && credits >= 44)
			return true;
		else
			return false;
	}
	String BMI(double weightPounds, double heightInches) {
		double weightKg = weightPounds * 0.453592;
        double heightMeters = heightInches * 0.0254;
        double bmi = weightKg / (heightMeters * heightMeters);
		if (bmi <= 18.4) 
            return "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9) 
            return "Normal";
        else if (bmi >= 25.0 && bmi <= 39.9) 
            return "Overweight";
        else 
            return "Obese";
    }
	double shippingCost(double weightPounds) {
        if (weightPounds <= 10)
            return 0.00;
        else if (weightPounds > 10 && weightPounds <= 15)
            return 5.00;
        else if (weightPounds > 15 && weightPounds <= 25)
            return 10.00;
        else
            return 10.00 + (0.02 * (weightPounds - 25));
    }
	boolean blueOrViolet(double frequencyTHz) {
        if ((frequencyTHz >= 600 && frequencyTHz <= 670)||(frequencyTHz >= 700 && frequencyTHz <= 750))
			return true;
		else
			return false;
	}
	void init(){
		System.out.println(gpa(95));
		if (isGraduating("Senior",44)) {
            System.out.println("Student is Graduating");
        } else {
            System.out.println("Student is NOT Graduating");
    	}
		System.out.println(BMI(120,68));
		System.out.println(shippingCost(15));
		System.out.println(blueOrViolet(700));
  }

 
  
}