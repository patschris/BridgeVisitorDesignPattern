JC		=	javac
JVM		=	java
MAIN    =   Main

.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

CLASSES = \
		Pie.java \
		TaxAcceptance.java \
		TaxVisitor.java \
		TaxVisitorImplementer.java \
		RecipeAcceptance.java \
		RecipeVisitor.java \
		RecipeVisitorImplementer.java \
		CheesePie.java \
		Crust.java \
		Kourou.java \
		SausagePie.java\
		Sfoliata.java \
		SpinachPie.java \
		Main.java

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(MAIN)

clean:
	$(RM) *.class
