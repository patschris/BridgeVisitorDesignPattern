import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
        // Dimiourgw lista apo pites kai eisagw oles tis pithanes periptwseis (Bridge pattern)
        // Xrisimopoiw tin abstract klasi Pie kai to interface Crust gia na dimiourgisei
        // diaforetikes pites me diaforetika fulla
		LinkedList<Pie> listOfPies = new LinkedList<Pie>();
		listOfPies.add(new CheesePie(new Sfoliata(),0.93));
		listOfPies.add(new CheesePie(new Kourou(),1.02));
		listOfPies.add(new SpinachPie(new Sfoliata(), 1.12));
		listOfPies.add(new SpinachPie(new Kourou(),1.18));
		listOfPies.add(new SausagePie(new Sfoliata(),1.29));
		listOfPies.add(new SausagePie(new Kourou(),1.38));
		
		// Gia kathe pita tis listas
        for (Pie p : listOfPies) {
			System.out.println("--------------------------------------------");
			
			// kalw tin cook pou ousiastika parousiazei to eidos tis pitas kai to fullo pou xrisimopoih8ike stin paraskeui tis
			p.cook();
			
			// kalw tin accept pou parousiazei tis times tis kathe pitas analoga me to fpa (Visitor pattern)
			p.accept(new TaxVisitorImplementer());
			
			// kalw tin acceptRecipe pou parousiazei ti suntagi analoga me to eidos tis pitas (Visitor pattern)
			p.accepRecipe(new RecipeVisitorImplementer());
        }
		System.out.println("--------------------------------------------");
	}
}