/*
Abstract klasi Pie pou exei ws upoklaseis tis CheesePie, SausagePie, SpinachPie
Xrisimopoiei to Crust interface wste na uparxei h gefura metaksu fullou kai pitas
*/
public abstract class Pie implements TaxAcceptance, RecipeAcceptance {
	
    protected Crust crust;

	public Pie(Crust crust) {
		this.crust = crust;
	}
	
	public abstract void cook(); // tha ulopoih8ei stis upoklaseis, auti einai abstract
}
