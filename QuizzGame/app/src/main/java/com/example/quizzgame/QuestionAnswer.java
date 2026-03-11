package com.example.quizzgame;

public class QuestionAnswer {

    public static String java_question[]={
            "Which keyword is used to prevent method overriding in java?",
            "What is the output of 'System.out.println(10>9)' in java?",
            "Which operator is used for concatenating two strings in java",
            "What is the default value of byte variable in java?",
            "Which keyword is used to define subclass in java?",
            "How do you declare a constant variable in java?",
            "Which loop is guaranteed to execute at least once in java?",
            "What is the size of boolean datatype in java?",
            "How do you convert a string to an integer in java?",
            "Which keyword is used to allocate memory space to a class object in java?"
    };

    public static String java_choices[][]={
            {"override","final","static","abstract"},
            {"true","false","1","0"},
            {"+","-","&","/"},
            {"0","0.0","null","false"},
            {"child","sub","extends","inherits"},
            {"constant int pi=3.14","final float pi=3.14","const double pi=3.14","static final pi=3.14"},
            {"for loop","do-while loop","while loop","switch loop"},
            {"1 byte","2 byte","4 byte","8 byte"},
            {"int.parseInt()","Integer.parseInt()","String.toInt()","parseString()"},
            {"new","alloc","create","instantiate"}
    };

    public static String java_correctAnswer[]={
            "final","true","+","0","extends","final float pi=3.14","while loop",
            "1 byte","Integer.parseInt()","new"
    };


    public static String python_question[]={

            "Which of the following is not a valid variable name in python?",
            "How do you declare a single-line comment in python?",
            "Which of the following data structure is mutable in python?",
            "What will 'type(3.14)' return in python? ",
            "How do you convert a string to uppercase in python?",
            "How do you check the length of a list named 'my_list' in python?",
            "What will 'print(2 << 2)' output in python?",
            "What is the result of '3 + 2 * 4 // 2'in python?",
            "How do you create a tuple in python?",
            "Which of the following is used to iterate over a sequence in python?"

    };

    public static String python_choices[][]={

            {"my_var","2var","_var","var2"},
            {"//comment","/*comment*/","#comment","<!--comment-->"},
            {"tuple","list","string","set"},
            {"int","float","str","bool"},
            {"str.upper()","string.upper()","toUpperCase()","upperCase()"},
            {"length(my_list)","my_list.size()","len(my_list)","my_list.length()"},
            {"8","4","2","1"},
            {"10","5","4","3"},
            {"(1,2,3)","[1,2,3]","{1,2,3}","1,2,3"},
            {"while loop","for loop","do-while loop","loop"}

    };

    public static String python_correctAnswer[]={

            "2var","#comment","list","float","str.upper()","len(my_list)","8",
            "5","(1,2,3)","for loop"


    };


    public static String cplus_question[]={

            "Which of the following is a reserved keyword in C++?",
            "Which of the following is used for dynamic memory allocation in C++?",
            "Which of the following is not a valid variable name in C++?",
            "Which of the following operators is used to access the value at the address stored in a pointer variable?",
            "What is the size of an int data type in C++?",
            "Which of the following is the correct way to declare an array in C++?",
            "Which of the following is not a loop structure in C++?",
            "Which of the following is the address operator in C++?",
            "Which of the following access specifiers is used in C++ to make a member accessible only within its own class?",
            "Which of the following is the correct way to call the base class constructor from a derived class in C++?"

    };

    public static String cplus_choices[][]={
            {"function","main","array","return"},
            {"malloc","calloc","new","realloc"},
            {"myVar","_myVar","2myVar","myVar2"},
            {"&","*","->","."},
            {"2 bytes","4 bytes","8 bytes","16 bytes"},
            {"int array[10]","array int[10]","int[10] array","array[10] int"},
            {"for","while","do-while","repeat"},
            {"*","&","->","%"},
            {"private","protected","public","internal"},
            {"baseClass::baseClass()" , "derivedClass::baseClass()" , "baseClass()", "baseClass::derivedClass()"}


    };

    public static String cplus_correctAnswer[]={

            "return","new","2myVar","*","4 bytes","int array[10]","for","&",
            "private","baseClass::baseClass()"


    };


    public static String C_question[]={
            "Which programming language is called as mother of programming language?",
            "Who is the father of C language?",
            "Which of the following cannot be a variable name in C?",
            "Which is not keyword in 'c'?",
            "Which header file is needed to use the strlen() function?",
            "Which of the following is used to terminate a switch case in C?",
            "In C, which of the following is not a valid data type?",
            "Which of the following is not a valid c data type?",
            "Which of the following is used to terminate a statement in c?",
            "The global variable are..."

    };

    public static String C_choices[][]={
                    {"c++","c","Java","COBOL"},
                    {"Steve Jobs","James Gosling","Dennis Ritchi","Rasmus Lerdorf"},
                    {"volatile","true","friend","export"},
                    {"typedef","const","near","complex"},
                    {"<stdlib.h>","<stdio.h>","<string.h>","<math.h>"},
                    {"break","continue","return","exit"},
                    {"float","real","double","long double"},
                    {"int","float","boolean","char"},
                    {",",".",";",":"},
                    {"External","Internal","Both External and Internal","None of the above"}

                    };

    public static String C_correctAnswer[]={
            "c","Dennis Ritchie","volatile","complex","<string.h>","break","real","boolean",";","External"

    };




    public static String js_question[]={
            "Which type of JavaScript language is ",
            "The function and var are known as",
            "Which one of the following is not a keyword",
            "A set of unordered properties that, has a name and value is called",
            "The linkage of a set of prototype object is known as",
            "If a function which does not return a value is known as",
            "Which one of the following is not a example of closures?",
            "Which HTML element is used to put the JavaScript code?",
            "Which of the following type of a variable is volatile?",
            " In the JavaScript, which one of the following is not considered as an error:"
    };

    public static String js_choices[][]={

            {"Object-Oriented","Object-Based","Assembly-language","High-level"},
            {"keywords", "Data types", "Declaration statements", "prototypes"},
            {"if", "with", "debugger", "use strict"},
            {"String", "Array", "Serialized object", "Object"},
            {"prototype stack", "prototype", "prototype class", "prototype chain"},
            {"Static function", "Procedures", "Method", "Dynamic function"},
            {"Graphics", "Variables", "Function", "Objects"},
            {"<javascript>", "<js>", "<scripting>", "<script>"},
            {"Mutable variable", "Dynamic variable", "Volatile variable", "Immutable variable"},
            {"Syntax error", "Missing of semicolons", "Division by zero", "Missing of Bracket"}

            };

    public static String js_correctAnswer[]={
            "object-Based", "Declaration statement", "use strict", "Object ", "prototype chain", "Procedures", "Graphics ","<script>","Mutable variable ",
            "Division by zero"

    };

}




