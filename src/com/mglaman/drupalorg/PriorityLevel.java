package com.mglaman.drupalorg;

/**
 * PriorityLevel
 */
public enum PriorityLevel {
    CRITICAL(400), MAJOR(300), NORMAL(200), MINOR(100);
    private final int levelID;

    private PriorityLevel(int value) {
        this.levelID = value;
    }

    /**
     * Returns the human readable name from an integer.
     * @param value
     *  The value from Drupal.org field field_issue_priority.
     * @return String|null
     */
    public static String getLabel(int value) {
        for(PriorityLevel p: PriorityLevel.values()) {
            if(p.levelID == value) {
                return p.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        switch (this) {
            case CRITICAL:
                return "Critical";
            case MAJOR:
                return "Major";
            case NORMAL:
                return "Normal";
            case MINOR:
                return "Minor";
        }
        return super.toString();
    }
}