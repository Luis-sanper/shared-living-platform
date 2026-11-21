# Persistence Decision

## Context

The current application stores household tasks temporarily in memory using an `ArrayList`.

This was sufficient for Sprint 1 because the objective was to demonstrate the first working vertical slice between the web interface, REST API and backend.

However, this approach has an important limitation: all stored information is lost when the application stops.

Sprint 2 introduces more domain entities and relationships, including Users, profiles, Flats and more complete HouseholdTasks. These elements require persistent storage so that the application can preserve its state between executions.

## Decision

The project will use a relational database accessed through Spring Data JPA.

For the current development stage, H2 will be used in file-based mode so that data remains stored after the Spring Boot application is stopped and restarted.

The persistence flow will be:

```text
Web Interface
      ↓
REST API
      ↓
Business Logic / Services
      ↓
Repositories
      ↓
H2 Database
```

Spring Data JPA will connect the Java domain entities with the relational database and simplify common persistence operations such as saving, retrieving, updating and deleting data.

## Reasons for the decision

H2 provides real persistence while keeping the project simple and self-contained.

It does not require a separate database server to be installed or configured, which is appropriate for the current size and stage of the project.

Using Spring Data JPA also reduces repetitive persistence code and provides a clear repository layer between the business logic and the database.

Another important advantage is flexibility. Because the persistence layer is based on JPA, the project can later migrate from H2 to a production database such as PostgreSQL or MySQL without redesigning the complete domain model.

The selected approach also keeps the project easy to run locally, which is useful during development, testing and project evaluation.

## Alternatives considered

### Continue using in-memory storage

The current `ArrayList` implementation could be kept because it is simple and already works for the Sprint 1 prototype.

This option was rejected because all information disappears when the application stops.

It would also become difficult to manage persistent relationships between Users, Flats and HouseholdTasks as the project grows.

### Use an external database server

A database such as PostgreSQL or MySQL could be introduced immediately.

This would be closer to a production environment, but it would require additional installation, configuration and infrastructure.

For the current project, this would introduce more complexity than necessary.

## Consequences

### Positive consequences

- Application data persists between executions.
- Domain entities and relationships can be stored in a relational database.
- The application remains simple to run locally.
- Spring Data JPA reduces repetitive database code.
- The persistence layer has a clear separation from the business logic.
- Future migration to another relational database remains possible.

### Trade-offs

- H2 is appropriate for development and the current academic project, but it would not be the preferred final database for a large production system.
- Introducing JPA requires additional entity mapping and database configuration.
- A future production deployment would probably require a dedicated database server.

## Future evolution

If the application is deployed for real users, the Spring Boot backend can continue to act as the central server while H2 is replaced by a production database such as PostgreSQL.

The web interface, REST API and most of the business logic should not need to be redesigned for this change.
