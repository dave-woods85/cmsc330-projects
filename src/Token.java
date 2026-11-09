/*
David Woods
CMSC 330
Project1
Prof Suciu
5 Nov 2026

This class provides Tokens for each element in the production. Added new shape classes
(Parallelogram, text, etc.) as well as new tokens for parameters (radius, offset, sides, etc.)
*/

// Enumerated type that defines the list of tokens

enum Token {AT, COLOR, END,	HEIGHT, RECTANGLE, RIGHT_TRIANGLE,
    PARALLELOGRAM, REGULAR_POLYGON, ISOSCELES, TEXT, SCENE,
    WIDTH, COMMA, SEMICOLON, PERIOD, LEFT_PAREN, RIGHT_PAREN,
    IDENTIFIER, STRING, OFFSET, SIDES, RADIUS, NUMBER, EOF}