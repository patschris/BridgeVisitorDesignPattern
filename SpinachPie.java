/*
Katigoria pitas. Exei tin upoxrewsi na ulopoihsei tin cook, opou parousiazei ton
eauto tis kai to fullo tous, mesw tou crustAPI, pou periexetai stin uperklasi tis.
Ylopoiei tin accept, acceptRecipe wste na einai sumvati me visitor pattern gia emfanisi
tis timis me fpa kai tis suntagis tis pitas
*/
public class SpinachPie extends Pie implements TaxAcceptance, RecipeAcceptance {

	double netPrice; // timi xwris fpa

	public SpinachPie(Crust crust, double netPrice) {
		super(crust);
		this.netPrice = netPrice;
	}

	public double getNetPrice() {
		return netPrice;
	}

	@Override
	public void cook() {
		System.out.print("Ftiaxnw spanakopita ");
		crust.useCrust();
	}

	@Override
	public void accept(TaxVisitor taxVisitor) {
		taxVisitor.visit(this);		
	}

	@Override
	public void accepRecipe(RecipeVisitor recipeVisitor) {
		recipeVisitor.visitRecipe(this);			
	}
}
