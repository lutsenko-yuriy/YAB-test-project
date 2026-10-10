---
bookmarks: []
---

# YTP-5: Remove YAB template entries from CHANGELOG [Unreleased]

## Notes

## Debrief summary

### 2026-10-10

**What went well**
- The trivial path (branch, PR, no review loop) fit a content-only cleanup.

**What was hard or surprising**
- The YAB template's own CHANGELOG history came along with it and was only spotted at release time.
- The first `/ship` put `[0.1.0]` above `[Unreleased]`, which this ticket also had to fix.

**What to change**
- Consider having onboarding strip template CHANGELOG entries, so adopters start from a clean history.
