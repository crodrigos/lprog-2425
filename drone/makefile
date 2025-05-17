# Nome do executável final
TARGET = drone

# Ficheiros de origem
LEXER = drone.l
PARSER = drone.y
MAIN = main.c

# Ficheiros gerados
PARSER_C = drone.tab.c
PARSER_H = drone.tab.h
LEXER_C = lex.yy.c

# Compilador
CC = gcc

# Flags
CFLAGS = -Wall

# Regra padrão
all: $(TARGET)

# Compilar tudo
$(TARGET): $(PARSER_C) $(LEXER_C) $(MAIN)
	$(CC) $(CFLAGS) -o $(TARGET) $(MAIN) $(PARSER_C) $(LEXER_C) -lfl

# Gerar parser com Bison
$(PARSER_C) $(PARSER_H): $(PARSER)
	bison -d -o $(PARSER_C) $(PARSER)

# Gerar lexer com Flex
$(LEXER_C): $(LEXER)
	flex $(LEXER)

# Limpeza dos ficheiros gerados
clean:
	rm -f $(TARGET) $(PARSER_C) $(PARSER_H) $(LEXER_C)
