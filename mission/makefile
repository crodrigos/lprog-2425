parser: mission.tab.c mission.tab.h lex.yy.c 
	gcc -o parser mission.tab.c lex.yy.c -lfl

mission.tab.c mission.tab.h: mission.y
	bison -d mission.y

lex.yy.c: mission.l
	flex mission.l

run: parser
	./parser

runex: parser
	./parser < mission_example.txt

clean:
	rm -f parser.exe mission.tab.c mission.tab.h lex.yy.c
	rm -f *.o
	dir -ls