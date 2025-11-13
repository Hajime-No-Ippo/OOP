# Pet Adoption Management System — Overview

This document summarizes the design and structure of a small **Pet Adoption Management System**. It mirrors the style of your transport‑pass sample by describing each component’s role, private state, methods, and how encapsulation/inheritance are used to keep the design clean and extendable.

---

## High‑Level Design

**Purpose:** Manage adoptable pets (Dog, Cat, Bird), track their basic info, calculate manual keeping fees based on conditions, and present a unified interface (`Adoptable`) for actions common to all adoptable items (e.g., making a sound, showing adoption terms).

**Key Abstractions:**
- `Pet` — an **abstract base class** for all pets; centralizes common state/behavior.
- `Adoptable` — an **interface** that standardizes UX/operations around adoption.
- Concrete subclasses: `Dog`, `Cat`, `Bird` (each extends `Pet` and implements `Adoptable`).
- `Breed` — an **enum** for supported breeds/types.
- `PetUtil` — a **utility** class to print lists of pets with subclass‑specific fields.
- `Main` — demo/entry point wiring it all together.

**Core OO principles:** abstraction (abstract class, interface), encapsulation (private fields + getters), inheritance (concrete pets extend `Pet`), and polymorphism (calling subclass overrides through `Pet` references).

---

## Class & Interface Inventory

### 1) `abstract class Pet` (base type)
Represents any pet with shared attributes/behaviors.

**Variables (private/final/static):**
- `private String name` — pet name
- `private int age` — pet age
- `private Breed breed` — type from enum `Breed`
- `final int MAX_AGE = 100` — constant limit displayed in info
- `static int petCount = 1` — project‑wide counter incremented in constructor (note: returned to clients as `petCount - 1` via `getPetCount()`)

**Key Methods:**
- **Constructor** `Pet(String name, int age, Breed breed)` — sets fields; increments `petCount`.
- Getters: `getName()`, `getAge()`, `getBreed()`, `getMaxAge()`.
- `final String getInfo()` — compact info string (non‑overridable).
- `static int getPetCount()` — returns total pets created (`petCount - 1` as an external count).
- `abstract double manualKeptFee()` — **must** be implemented by subclasses, calculates fee depending on subclass rules.
- `void displayInfo()` — prints shared fields, including `MAX_AGE`.

**Encapsulation Notes:** All state is `private` and exposed via getters only. Fee calculation deferred to subclasses to support different pricing rules per pet type.

---

### 2) `interface Adoptable`
Defines adoption‑related operations and common helpers.

**Methods:**
- `default void showAdoptionTerms()` — prints standard adoption terms (implementors may override if needed).
- `static void displayGeneralInfo()` — prints general adoption policy text.
- `static int getAdoptableCount()` — delegates to `Pet.getPetCount()` to expose a global count via the interface.
- `void makeSound()` — **abstract**; each pet provides its own sound.

**Design Notes:** Using `default` and `static` methods in the interface reduces duplication and provides a single place for shared adoption messaging/utilities.

---

### 3) `enum Breed`
Enumerates supported breed/type categories:
- `Dog`, `Cat`, `Bird`

**Role:** Keeps type safety across the codebase (vs. free‑form strings).

---

### 4) `class Dog extends Pet implements Adoptable`
Represents dogs and their specific fee/sound/printing logic.

**Variables (private/final):**
- `private String fluffColor`
- `private int keptDays`
- `final int legs = 4`

**Key Methods:**
- **Constructor** `Dog(String name, int age, Breed breed, String fluffColor, int keptDays)` — calls `super(..., Breed.Dog)` and sets dog‑specific fields.
- Getter: `getFluffColor()`.
- `@Override double manualKeptFee()` — `20.0 + (keptDays > 10 ? 10.0 : 5.0)`
- `@Override void displayInfo()` — calls `super.displayInfo()`, prints fluff color and total fee; emits “ADDITIONAL FEES” banner if `keptDays > 10`.
- `@Override void makeSound()` — `Woof! Woof!`

**Notes:** The constructor ignores the passed `breed` and enforces `Breed.Dog` to ensure integrity.

---

### 5) `class Cat extends Pet implements Adoptable`
Represents cats with their own fee/sound/printing logic.

**Variables (private/final):**
- `private String color`
- `private int keptDays`
- `final int legs = 4`

**Key Methods:**
- **Constructor** `Cat(String name, int age, Breed type, int keptDays, String color)` — calls `super(..., Breed.Cat)` and sets cat‑specific fields.
- Getters: `getLegs()`, `getColor()`.
- `@Override double manualKeptFee()` — `20.0 + (keptDays > 10 ? 15.0 : 10.0)`
- `@Override void displayInfo()` — extends base info, prints color and fee; adds banner if `keptDays > 10`.
- `@Override void makeSound()` — `Meow! Meow!`

**Notes:** Similar structure to `Dog`, with a **higher surcharge** after 10 days.

---

### 6) `class Bird extends Pet implements Adoptable`
Represents birds, optionally requiring special care.

**Variables (private/final):**
- `private String colour`
- `private int keptDays`
- `final int legs = 2`
- `private boolean needSpecialCare`

**Key Methods:**
- **Constructor** `Bird(String name, int age, String breed, int keptDays, String colour)` — calls `super(..., Breed.Bird)`; records kept days and colour.
- Getter: `getColour()`.
- `@Override double manualKeptFee()` — `20.0 + (needSpecialCare && keptDays > 10 ? 8.0 : 7.0)`
- `@Override void makeSound()` — `Tweet! Tweet!`
- `void displayInfo()` — (non‑annotated but overrides the base signature) calls base info, prints colour and fee; shows banner only if **both** `keptDays > 10` **and** `needSpecialCare`.

**Notes:** Combines a special‑care flag with duration to adjust fees slightly differently than dogs/cats.

---

### 7) `class PetUtil`
Utility for pretty printing pet lists.

**Methods:**
- `static void printPetsList(ArrayList<Pet> pets)` — Iterates pets, calls `pet.displayInfo()` polymorphically, then **pattern‑matches** instances to print subclass‑specific attributes:
  - `Cat` → `Color`
  - `Dog` → `Fluff Color`
  - `Bird` → `Colour`

**Design:** Demonstrates polymorphism + `instanceof` with pattern variables for concise downcasts.

---

### 8) `class Main` (entry point)
Demo scaffold that wires everything together.

**Flow:**
1. `Adoptable.displayGeneralInfo()` prints shared policy text.
2. Creates an `ArrayList<Pet>` with:
   - `new Cat("Whiskers", 3, Breed.Cat, 5, "Gray")`
   - `new Dog("Buddy", 4, Breed.Dog, "Golden", 12)`
   - `new Bird("Tweety", 2, "Canary", 8, "Yellow")`
3. `PetUtil.printPetsList(pets)` prints details and calculated fees for each.
4. Prints total adoptables with `Adoptable.getAdoptableCount()` (delegates to `Pet.getPetCount()`).

---

## Encapsulation, Abstraction, Inheritance, Polymorphism

- **Encapsulation:** All pet fields are `private`; access is via getters. Fee logic is hidden behind `manualKeptFee()` and `displayInfo()`.
- **Abstraction:** `Pet` is `abstract` and declares `manualKeptFee()`; `Adoptable` abstracts adoption UX with `makeSound()` and default/static helpers.
- **Inheritance:** `Dog`, `Cat`, and `Bird` extend `Pet` to reuse common state/printing and override fee/sound behavior.
- **Polymorphism:** `ArrayList<Pet>` stores heterogeneous pets; `PetUtil` calls `displayInfo()` on the base type, and downcasts only for extra fields.

---

## Validation & Integrity Hooks

- Constructors fix `breed` to the correct enum regardless of constructor parameters (`Breed.Dog`, `Breed.Cat`, `Breed.Bird`) to avoid mismatches.
- `MAX_AGE` exposes an upper bound through `displayInfo()`; future validation could enforce it in constructors/setters.
- Global count is measured via `petCount` and exposed through `getPetCount()`; `Adoptable.getAdoptableCount()` provides a neutral façade for callers.

---

## Scalability & Extension Points

- **New pet types** can be added by creating new subclasses of `Pet` that also `implements Adoptable`, and optionally extending `Breed`.
- **Pricing policy** is isolated per subclass in `manualKeptFee()`; switch to a **strategy** if rules grow complex (e.g., age‑based, seasonal, special care tiers).
- **Adoption UX** can grow in the interface (`Adoptable`) with additional default/static helpers (e.g., eligibility checks, terms rendering).
- **Printing/Reporting** can expand in `PetUtil` or move to a formatter/visitor if needed to remove `instanceof` branches.

---

## Example Output Behavior (Conceptual)

- **Dog (keptDays > 10)** → Base 20.0 + 10.0 surcharge; shows “ADDITIONAL FEES” banner.
- **Cat (keptDays > 10)** → Base 20.0 + 15.0 surcharge; shows banner.
- **Bird (keptDays > 10 && needSpecialCare)** → Base 20.0 + 8.0 surcharge; shows banner only when both conditions hold.

---

## Notes & Minor Observations

- `Bird.displayInfo()` omits `@Override` but matches the signature and effectively overrides; adding `@Override` would improve linting.
- In `Dog`’s constructor a `Breed` parameter is accepted but ignored (always `Breed.Dog` is passed to `super`). This enforces correctness but the extra parameter could be removed.
- `petCount` starts at `1` and `getPetCount()` returns `petCount - 1`. If the intention is “exactly how many pets have been constructed,” consider starting at `0` and returning `petCount` directly (or keep as‑is for backward compatibility).

---

## UML‑Style Summary (Textual)

```
Adoptable (interface)
  + showAdoptionTerms() default
  + displayGeneralInfo() static
  + getAdoptableCount() static
  + makeSound()

Pet (abstract)
  - name: String
  - age: int
  - breed: Breed
  - MAX_AGE: int = 100
  - petCount: int (static)
  + getName(): String
  + getAge(): int
  + getBreed(): Breed
  + getMaxAge(): int
  + getInfo(): String (final)
  + getPetCount(): int (static)
  + manualKeptFee(): double (abstract)
  + displayInfo(): void

Dog : Pet, Adoptable
  - fluffColor: String
  - keptDays: int
  - legs: int = 4
  + getFluffColor(): String
  + manualKeptFee(): double
  + displayInfo(): void
  + makeSound(): void

Cat : Pet, Adoptable
  - color: String
  - keptDays: int
  - legs: int = 4
  + getLegs(): int
  + getColor(): String
  + manualKeptFee(): double
  + displayInfo(): void
  + makeSound(): void

Bird : Pet, Adoptable
  - colour: String
  - keptDays: int
  - legs: int = 2
  - needSpecialCare: boolean
  + getColour(): String
  + manualKeptFee(): double
  + displayInfo(): void
  + makeSound(): void

Breed (enum) = { Dog, Cat, Bird }

PetUtil
  + printPetsList(pets: ArrayList<Pet>): void

Main
  + main(String[] args): void
```
