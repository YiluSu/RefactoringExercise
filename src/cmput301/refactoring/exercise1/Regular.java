package cmput301.refactoring.exercise1;


/**
 * @see cmput301.refactoring.exercise1.Movie#REGULAR
 */
public class Regular extends PriceCode {
	public double getCharge(double result, Rental aRental) {
		result += 2;
		if (aRental.getDaysRented() > 2)
			result += (aRental.getDaysRented() - 2) * 1.5;
		return result;
	}
}