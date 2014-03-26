package cmput301.refactoring.exercise1;


/**
 * @see cmput301.refactoring.exercise1.Movie#CHILDRENS
 */
public class Childrens extends PriceCode {
	public double getCharge(double result, Rental aRental) {
		result += 1.5;
		if (aRental.getDaysRented() > 3)
			result += (aRental.getDaysRented() - 3) * 1.5;
		return result;
	}
}