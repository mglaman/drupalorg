package com.mglaman.drupalorg;

/**
 * PriorityLevel
 */
public enum IssueCategory {
    BUG_REPORT(1), TASK(2), FEATURE_REQUEST(3), SUPPORT_REQUEST(4);
    private final int levelID;

    private IssueCategory(int value) {
        this.levelID = value;
    }

    /**
     * Returns the human readable name from an integer.
     * @param value
     *  The value from Drupal.org field field_issue_category.
     * @return String|null
     */
    public static String getLabel(int value) {
        for(IssueCategory p: IssueCategory.values()) {
            if(p.levelID == value) {
                return p.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        switch (this) {
            case BUG_REPORT:
                return "Bug Report";
            case TASK:
                return "Task";
            case FEATURE_REQUEST:
                return "Feature Request";
            case SUPPORT_REQUEST:
                return "Support Request";
        }
        return super.toString();
    }
}