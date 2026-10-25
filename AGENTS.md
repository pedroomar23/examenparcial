# AGENTS.md

## What this repo is
University coursework for **Estructuras de Datos I — Examen Parcial**. Domain model is a hospital record: `Entidad` with `id`, `nombre`, `edad`, `areaAntecion` (atención), `diasInternado`. `README.md` is only a title; there is no other documentation.

## Build & run
No build system, tests, packages, or dependencies. Plain `javac` (Java 21 Temurin installed).
- Compile: `javac *.java`
- Run: `java Test` — `Test` is the only class with `main`; `Entidad` is a data model with no entrypoint.
- No `package` declarations: keep new classes in the default package at the repo root, or cross-class references break.
- `*.class` output lands beside sources; delete or ignore it.

## Conventions / gotchas
- Field name `areaAntecion` is misspelled in the source (constructor parameter is `areaAtencion`). The assignment is correct — read the field as `areaAntecion`, and only rename it consistently if asked.
- Model style is public mutable fields with no getters/setters and a full constructor. Match it for new model classes.
- Identifiers and comments use Spanish domain terms.
