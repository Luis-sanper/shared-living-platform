# Domain Model

## Purpose

This document describes the main domain entities introduced for Sprint 2 and the relationships between them.

The objective is to define the structure of the shared-living domain before implementing it in the application.

## Main domain entities

### User

Represents the common identity of a person using the platform.

A User contains the information shared independently of how the person participates in the system, such as account and authentication information.

A User may have a TenantProfile, a LandlordProfile, both profiles, or initially none of them.

### TenantProfile

Represents the tenant side of a User.

The TenantProfile contains the information and relationships that only make sense when the User acts as a tenant.

A TenantProfile can belong to one Flat at a time.

In future development, it may also contain relationships such as the assigned room, household tasks, storage and maintenance reports.

### LandlordProfile

Represents the landlord side of a User.

The LandlordProfile contains the information and relationships required when the User acts as a landlord.

A LandlordProfile can manage one or more Flats.

In future development, it may also be responsible for room management, tenant invitations, mandatory tasks and maintenance management.

### Flat

Represents a shared living space managed through the platform.

A Flat can be managed by a LandlordProfile and can contain multiple TenantProfiles.

Household tasks created inside the platform belong to a specific Flat.

### HouseholdTask

Represents a task related to the organization, cleaning or maintenance of a Flat.

A HouseholdTask belongs to one Flat and has a creator.

It contains the task information required by the current implementation and may include a due date and time.

Task assignment will be introduced when the required tenant and flat relationships are available.

## User and profiles

The system separates the user's identity from the way the user participates in the platform.

A `User` represents the common account information, while `TenantProfile` and `LandlordProfile` represent the two different ways in which the same account can participate in the system.

This model was chosen instead of inheritance because Tenant and Landlord are not mutually exclusive specializations of a User. The same account may act as a tenant in one context and as a landlord in another.

Using separate profiles keeps common user information in one place while allowing each profile to contain its own data, responsibilities and relationships.

The profiles cannot exist independently from a User.

Conceptually:

```text
User
├── TenantProfile
└── LandlordProfile
```

## Main relationships

```text
User
├── has → TenantProfile
└── has → LandlordProfile

TenantProfile
└── belongs to → Flat

LandlordProfile
└── manages → Flat

Flat
└── contains → HouseholdTask

HouseholdTask
├── belongs to → Flat
└── created by → User
```

A future task assignment relationship may also be added:

```text
HouseholdTask
└── assigned to → TenantProfile
```

## Main domain rules

- A TenantProfile cannot exist without an associated User.
- A LandlordProfile cannot exist without an associated User.
- A User may have no profile, one profile, or both profiles.
- A TenantProfile can belong to only one Flat at a time.
- A LandlordProfile can manage one or more Flats.
- A HouseholdTask belongs to one Flat.
- A HouseholdTask has a creator.
- Private Flat information should only be accessible to Users related to that Flat.
- Task assignment must only involve tenants belonging to the appropriate Flat.

## Current Sprint 2 scope

Sprint 2 focuses on introducing the core domain structure required to connect Users, profiles, Flats and HouseholdTasks.

More advanced behaviour, such as profile switching, complete room management, task visibility rules and full task assignment behaviour, may be implemented in later increments.
