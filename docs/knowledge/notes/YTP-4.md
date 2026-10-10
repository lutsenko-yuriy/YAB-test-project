---
bookmarks: []
---

# YTP-4: skill_router: misleading errors on Python < 3.11 and for context-less providers

## Notes

## Debrief summary

### 2026-10-10

**What went well**
- Reproducing on both interpreters split one vague error into two distinct bugs: the config silently dropped on Python 3.9, and the github provider lacking context methods on 3.12.
- Test-first kept each fix small. Exit code 2 reuses the existing "can't route" contract, so the skill-stub fallback is unchanged.

**What was hard or surprising**
- The in-session fallback hid the router failures for a whole ticket. Every skill "worked", so the misleading errors looked like noise.
- The router tests aren't in CI, so three `ProjectIdTests` that error on 3.9 went unnoticed.

**What to change**
- Run `scripts/skill_router/tests` in CI on 3.12, and skip the tomllib-dependent tests below 3.11.
