---
bookmarks: []
---

# YTP-2: [trivial] Project-specific README

## Notes

## Debrief summary

### 2026-10-10

**What went well**
- Quick and smooth: the trivial path (branch, single README commit, PR, no review loop) fit a content-only rewrite.
- The ticket spec listed every README section explicitly, so no clarification round was needed.

**What was hard or surprising**
- The agent first looked up YTP-2 in Linear and got "not found": user-level Linear MCP tools were loaded in the session, while this repo's PM tool is GitHub Issues (`[providers].pm = "github"`). Nothing at session start pointed the agent to the configured provider.

**What to change**
- `AGENTS.md` session start step 1 now says to read `[providers].pm` in `skill_router.toml` first, map `YTP-N` to GitHub issue #N when it is `github`, and ignore other PM MCP tools in the session.
