package com.example.patterns;

import com.example.patterns.interpreter.*;
/**
 * Command Pattern
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Test complete");
        Expression john = new TerminalExpression("John");
        Expression robert = new TerminalExpression("Robert");

        Expression isMale = new OrExpression(robert, john);

        System.out.println("John is Male? " + isMale.interpret("John"));
        System.out.println("Lisa is Male? " + isMale.interpret("Lisa"));

        Expression tobias = new TerminalExpression("Tobias");
        Expression linus = new TerminalExpression("Linus");
        Expression son = new TerminalExpression("son");

        Expression isSon1 = new AndExpression(linus, son);
        Expression isSon2 = new AndExpression(tobias, isSon1);
        System.out.println("Linus is Tobias son ? " + isSon2.interpret("Linus is Tobias son"));
        System.out.println("Linus is Tobias child ? " + isSon2.interpret("Linus is Tobias child"));

    }
}
