package cmput301.refactoring.exercise1;


/**
 * @see cmput301.refactoring.exercise1.Movie#NEW_RELEASE
 */
public class NewRelease_1 extends PriceCode_1 {
	public int frequentRenterPoints(int frequentRenterPoints, Rental each) {
		if (each.getDaysRented() > 1) {
			frequentRenterPoints += 2;
		}
		return frequentRenterPoints;
	}
}