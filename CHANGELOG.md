# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

- Automated release tooling: centralized `qilletniDocgenVersion`/`qilletniCoreVersion` in
  `gradle.properties`, `.qilletni/release.yml`, japicmp public-API compatibility gate,
  CycloneDX SBOM generation, dependency locking, and marker-based tag/publish/dispatch
  automation shared with `Qilletni/Qilletni`. See that repository's `RELEASE.md` for the
  updated release process.

## [1.0.0] - 2025-11-01

### Added

- Initial implementation
