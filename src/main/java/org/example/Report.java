package org.example;

public class Report {
    private final ConditionalAction conditionalAction;
    private final Facts facts;
    private boolean isPositive;

    public Report(final ConditionalAction conditionalAction, final Facts facts, final boolean isPositive) {
        this.conditionalAction = conditionalAction;
        this.facts = facts;
        this.isPositive = isPositive;
    }

    public ConditionalAction getConditionalAction() {
        return conditionalAction;
    }

    public Facts getFacts() {
        return facts;
    }

    public boolean isPositive() {
        return isPositive;
    }

    @Override
    public String toString() {
        return "Report{" +
                "conditionalAction=" + conditionalAction +
                ", facts=" + facts +
                ", result=" + isPositive +
                '}';
    }
}
