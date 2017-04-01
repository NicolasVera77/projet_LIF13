CC = javac
options = -g
.SUFFIXES: .java .class
bin = ./bin

.java.class:
	$(CC) -d $(bin) $(objets) src/*.java

CLASSES = \
		src/Coup.java \
		src/Point.java \
		src/Joueur.java \
		src/Partie.java \
		src/Plateau.java \
		src/Case.java \
		src/Piece.java \
		src/Fou.java \
		src/Cavalier.java \
		src/Pion.java \
		src/Reine.java \
		src/Roi.java \
		src/Tour.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm -rf ./bin/*.class