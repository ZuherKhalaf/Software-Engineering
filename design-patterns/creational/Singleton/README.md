
## Singleton Design Pattern 
## Intent
A creational design pattern that ensures a class has only one instance and provides a global point of access to it.

## Motivation
This pattern is particularly useful in scenarios like managing configurations, logging, caching or database connections, where a single share resource is necessary to coordinate actions across the system.

## Applicability
Use the Singleton pattern when
- there must be exactly one instance of a class.
- the sole instance allows to be extended through subclassing, enabling clients to utilize the extended version without altering their existing code.



## Structure
![Singleton Diagram](../../resources/png/singleton.png)

## Purpose
- Understand how to restrict instantiation of a class to a single object.
- Explore different implementation techniques (eager, lazy, and thread-safe).
- Learn how to manage global state efficiently and safely.

