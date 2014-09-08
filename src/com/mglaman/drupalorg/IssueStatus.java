package com.mglaman.drupalorg;

/**
 * PriorityLevel
 */
public enum IssueStatus {
    ACTIVE(1), FIXED(2), CLOSED_DUPLICATE(3), POSTPONED(4), CLOSED_WONTFIX(5), CLOSED_WORKSASDESIGNED(6),
    CLOSED_FIXED(7), NEEDS_REVIEW(8), NEEDS_WORK(13), RTBC(14), PATCH_TBP(15), POSTPONED_MORE_INFO(16),
    CLOSED_CANNOT_REPRODUCE(18);
    private final int levelID;

    private IssueStatus(int value) {
        this.levelID = value;
    }

    /**
     * Returns the human readable name from an field_issue_status.
     * @param value
     *  The value from Drupal.org field field_issue_priority.
     * @return String|null
     */
    public static String getLabel(int value) {
        for(IssueStatus p: IssueStatus.values()) {
            if(p.levelID == value) {
                return p.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        switch (this) {
            case ACTIVE:
                return "Active";
            case FIXED:
                return "Fixed";
            case CLOSED_DUPLICATE:
                return "Closed (Duplicate)";
            case POSTPONED:
                return "Postponed";
            case CLOSED_WONTFIX:
                return "Closed (Won't Fix)";
            case CLOSED_WORKSASDESIGNED:
                return "Closed (Works as Designed)";
            case CLOSED_FIXED:
                return "Closed (Fixed)";
            case NEEDS_REVIEW:
                return "Needs Review";
            case NEEDS_WORK:
                return "Needs Work";
            case RTBC:
                return "Reviewed & Tested by the Community";
            case PATCH_TBP:
                return "Patch (To Be Ported)";
            case POSTPONED_MORE_INFO:
                return "Postponed (Maintainer Needs More Info)";
            case CLOSED_CANNOT_REPRODUCE:
                return "Closed (Cannot Reproduce)";
        }
        return super.toString();
    }
}