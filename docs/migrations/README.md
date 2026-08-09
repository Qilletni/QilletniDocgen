# Migration Guides

A major release (`X.0.0`) of `qilletni-docgen` that introduces a breaking public API
change requires a migration guide at `docs/migrations/X.Y.Z.md` (named after the new
version being released), or the japicmp compatibility gate in `release.yml` will reject
the release. See `Qilletni/Qilletni`'s `RELEASE.md` and
`tools/release/release/japicmp_policy.py`.

Each guide should describe, for every breaking change:

- What changed and why.
- The affected public API (class/method/field).
- How consumers should migrate their code.
