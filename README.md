# S.O.L.I.D. Principles Examples
- S - Single-responsiblity principle
- O - Open-closed principle
- L - Liskov substitution principle
- I - Interface segregation principle
- D - Dependency Inversion Principle

## Single-responsiblity principle
A class should have one and only one reason to change, meaning that a class should have only one job.

## Open-closed principle
Objects or entities should be open for extension, but closed for modification.

Well, in the land of software development, it’s possible for an item to be opened for extension and be closed for modification.
It means you or your team members should be able to add new functionalities to an existing software system without changing the existing code.

## Liskov substitution principle
Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
- Objects of a superclass should be able to be replaced with objects of a subclass without affecting the program
- Object of subclass should be able to access the all the methods and properties of the superclass.

## Interface segregation principle
A client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use.

More specifically, the ISP suggests that software developers should break down large interfaces into smaller,
more specific ones, so that clients only need to depend on the interfaces that are relevant to them. This can make the codebase easier to maintain.
This principle is fairly similar to the single responsibility principle (SRP). But it’s not just about a single interface doing only one thing – it’s about breaking the whole codebase into multiple interfaces or components.

## Dependency Inversion Principle
Entities must depend on abstractions not on concretions. It states that the high level module must not depend on the low level module, but they should depend on abstractions.
The dependency inversion principle is about decoupling software modules. That is, making them as separate from one another as possible.

The principle states that high-level modules should not depend on low-level modules. Instead, they should both depend on abstractions. Additionally, abstractions should not depend on details, but details should depend on abstractions.

In simpler terms, this means instead of writing code that relies on specific details of how lower-level code works, you should write code that depends on more general abstractions that can be implemented in different ways.

This makes it easier to change the lower-level code without having to change the higher-level code.
