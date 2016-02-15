# Problems

This document holds all the problems we have found with the design while
building it.

---

## Responsibility problems

- Account has an address, an occupation and a date of birth. The User class
    should have all of these things.
- Account didn't have access to `TokenList`. Added it so we can validate a `Token`.
- ManagementUI shouldn't really be in charge of login **and** other stuff. Added
    ManagementLoginUI to get round this.

## Incorrect types

- Server has `UI userInterface` where it should be `UserInterface userInterface`.
- Server has `ListOfRoutes allRoutes` where it should be `RouteList allRoutes`.

## Sequence Diagram Issues

- In the **Add Money** sequence, to check for the validity of the `Token` they go to the `TokenList` and loop though it... I don't think we need it as we could just query the token directly if it is valid?

## Methods Issues

- Account Class
  - `checkBalance` - parameter should be `float`
