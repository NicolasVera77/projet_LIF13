CC = javac
options = -g
.SUFFIXES: .java .class
bin = ../bin

.java.class:
	$(CC) -d $(bin) $(objets) $*.java

CLASSES = \
		Coup.java \
		Point.java \
		Joueur.java \
		Partie.java \
		Plateau.java \
		Case.java \
		Piece.java \
		Fou.java \
		Cavalier.java \
		Pion.java \
		Reine.java \
		Roi.java \
		Tour.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm -rf ../bin/*.class