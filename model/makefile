model.tab.c model.tab.h: model.y
	bison -d model.y

lex.yy.c: model.l
	flex model.l

parser: model.tab.c model.tab.h lex.yy.c 
	gcc -o parser model.tab.c lex.yy.c -lfl

run: parser
	./parser

runex: parser
	./parser < model_example.txt

clean:
	rm -f parser.exe model.tab.c model.tab.h lex.yy.c
	rm -f *.o
	dir -ls