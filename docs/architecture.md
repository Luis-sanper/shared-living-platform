# Initial Architecture Sketch

                 ┌─────────────────────┐
                 │        User         │
                 └──────────┬──────────┘
                            │
                  Authentication / Role
                            │
              ┌─────────────┴─────────────┐
              │                           │
      ┌───────▼────────┐          ┌───────▼────────┐
      │   Tenant UI    │          │  Landlord UI   │
      └───────┬────────┘          └───────┬────────┘
              │                           │
              └─────────────┬─────────────┘
                            │
                    ┌───────▼────────┐
                    │    REST API    │
                    └───────┬────────┘
                            │
                    ┌───────▼────────┐
                    │ Business Logic │
                    └───────┬────────┘
                            │
                    ┌───────▼────────┐
                    │    Database    │
                    └────────────────┘

## Main components

- **Authentication / Role:** identifies the user and determines whether they are a tenant or landlord.
- **Tenant UI:** provides access to tenant-specific features such as household tasks, shared items, maintenance reports, communication, and social activities.
- **Landlord UI:** provides access to landlord-specific features such as mandatory tasks, maintenance issues, tenant communication, and flat supervision.
- **REST API:** receives requests from both interfaces and sends them to the backend.
- **Business Logic:** applies system rules, permissions, validations, and processes user actions.
- **Database:** stores persistent information such as users, flats, rooms, invitations, tasks, storage items, maintenance issues, messages and social activities.

## Basic login

                 User logs in
                      ↓
              System checks role
                 ↙           ↘
            Tenant         Landlord
              ↓               ↓
      Tenant dashboard   Landlord dashboard

## Tenant dashboard

    Tenant dashboard
       ├─ Flat space
       │    ├─ Household tasks
       │    │    ├─ Shared tasks
       │    │    └─ Private tasks
       │    ├─ Household items
       │    │    ├─ Shared items
       │    │    └─ Private items
       │    └─ Private only information
       │
       ├─ Landlord communication
       │    ├─ Messages
       │    │    ├─ Flat-wide messages
       │    │    └─ Direct messages
       │    ├─ Mandatory tasks
       │    └─ Maintenance reports
       │
       └─ Social space
            ├─ Activities
            │    ├─ Join activities
            │    └─ Leave activities
            └─ Create activity

## Landlord dashboard

    Landlord dashboard
       ├─ Flat overview
       │    ├─ Tenants
       │    └─ Relevant flat information
       │
       ├─ Mandatory tasks
       │    ├─ Create task
       │    ├─ View status
       │    └─ View photo evidence
       │
       ├─ Maintenance
       │    ├─ View reports
       │    ├─ Post updates
       │    └─ Mark issue as resolved
       │
       └─ Communication
            ├─ Whole flat
            └─ Individual tenants
