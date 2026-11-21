# Context Map

The project contains more than one possible bounded context, but Sprint 2 focuses only on the central one.

## Shared Living / Household Management

This is the main bounded context currently being developed.

It includes the core concepts of the application:

- User
- TenantProfile
- LandlordProfile
- Flat
- Room
- HouseholdTask
- Maintenance Issue
- Household Storage

This context represents the main shared-living functionality of the platform and contains the domain structure required by most of the high-priority Product Backlog items.

Because it forms the core of the application, Sprint 2 focuses on developing and connecting these concepts before adding secondary functionality.

## Social Activities

The project also includes a separate social area.

This context includes concepts such as:

- SocialActivity
- ActivityParticipant
- Location

Social activities follow different rules from household management and are not directly dependent on a user's flat in the same way as household tasks, rooms or maintenance issues.

For this reason, Social Activities can be considered a separate bounded context.

## Current Sprint 2 decision

Sprint 2 will work only on the Shared Living / Household Management context.

The Social Activities context is recognized in the domain model but will remain outside the current implementation scope.

This decision allows development to focus first on the central structure of the application. The secondary social functionality can be developed during a later phase once the core shared-living functionality is stable.

## Simplified context map

```text
+--------------------------------------+
| Shared Living / Household Management |
|                                      |
| User                                 |
| TenantProfile                        |
| LandlordProfile                      |
| Flat                                 |
| Room                                 |
| HouseholdTask                        |
| Maintenance Issue                    |
| Household Storage                    |
+--------------------------------------+

                 future interaction

+--------------------------------------+
| Social Activities                    |
|                                      |
| SocialActivity                       |
| ActivityParticipant                  |
| Location                             |
+--------------------------------------+
```
