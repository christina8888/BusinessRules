package org.example;

public interface ConditionalAction {
    boolean evaluate(Facts facts);
    void execute(Facts facts);
}
