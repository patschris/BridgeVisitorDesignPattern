// ulopoiei tis sunartiseis visit pou orizontai sto RecipeVisitor
// oi visit ektupwnoun tis suntages tis kathe pitas
public class RecipeVisitorImplementer implements RecipeVisitor {

	@Override
	public void visitRecipe(CheesePie cheesePie) {
		System.out.println("I suntagi tis turopitas einai : "
				+ "https://akispetretzikis.com/el/categories/almyres-pites-tartes/tyropita");
	}

	@Override
	public void visitRecipe(SpinachPie spinachPie) {
		System.out.println("I suntagi tis spanakopitas einai : "
				+ "https://akispetretzikis.com/el/categories/almyres-pites-tartes/spanakopita-me-feta");		
	}

	@Override
	public void visitRecipe(SausagePie sausagePie) {
		System.out.println("I suntagi tis loukanikopitas einai : "
				+ "https://cookpad.com/gr/sintages/3070905-eukoli-loukanikopita");
	}
}