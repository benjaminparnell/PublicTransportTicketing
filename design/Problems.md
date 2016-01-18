# Problems

This document holds all the problems we have found with the design while
building it.

---

## Responsibility problems

- Account has an address, an occupation and a date of birth. The User class
    should have all of these things.

## Incorrect types

- Server has `UI userInterface` where it should be `UserInterface userInterface`.
- Server has `ListOfRoutes allRoutes` where it should be `RouteList allRoutes`.
