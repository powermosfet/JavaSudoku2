PACKAGE=com.liseth.javaSudoku2
JAVAC=javac
JAVA=java
CLASSDIR=classes
JAVACFLAGS=-d $(CLASSDIR) -cp $(CLASSPATH)
JAVAFLAGS=-cp $(CLASSPATH)
CLASSPATH=/usr/share/java/junit.jar:$(CLASSDIR)
JUNIT=org.junit.runner.JUnitCore
sources = $(wildcard src/*.java)
classes = $(sources:.java=.class)
testSources = $(wildcard tests/*.java)
testClasses = $(subst .java,.class,$(testSources))

all: $(classes)

clean :
		rm -v `find -type f -name *.class`

%.class : %.java
		$(JAVAC) $(JAVACFLAGS) $<

test: all $(testClasses)
	$(JAVA) $(JAVAFLAGS) $(JUNIT) $(addprefix $(PACKAGE).,$(notdir $(basename $(testClasses))))
