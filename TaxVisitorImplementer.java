// ulopoiei tis sunartiseis visit pou orizontai sto TAxVisitor
// oi visit orizoun kapoio fpa kai upologizoun tin timi tis pitas me vasi auto
import java.text.DecimalFormat;

public class TaxVisitorImplementer implements TaxVisitor {

	DecimalFormat df = new DecimalFormat("#.##");

	@Override
	public void visit(CheesePie cheesePie) {
		double taxPercentage = 13.0;
		double price = Double.parseDouble(df.format(cheesePie.getNetPrice()*(100+taxPercentage)/100));
		System.out.println("Timi turopitas me fpa: " + price + "€");
	}

	@Override
	public void visit(SpinachPie spinachPie) {
		double taxPercentage = 13.0;
		double price = Double.parseDouble(df.format(spinachPie.getNetPrice()*(100+taxPercentage)/100));
		System.out.println("Timi spanakopitas me fpa: " + price + "€");
	}

	@Override
	public void visit(SausagePie sausagePie) {
		double taxPercentage = 15.0;
		double price = Double.parseDouble(df.format(sausagePie.getNetPrice()*(100+taxPercentage)/100));
		System.out.println("Timi loukanikopitas me fpa: " + price + "€");
	}
}
