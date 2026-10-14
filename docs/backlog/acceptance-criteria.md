# Acceptance criteria

## High priority

### User registration and login

- A user can create an account by providing the required information.
- The system rejects registration if the email address is already in use.
- A registered user can log in using valid credentials.
- Invalid credentials are rejected.
- After registration, the user selects their role and is redirected to the appropriate dashboard.
- On subsequent logins, the user is automatically redirected to the dashboard associated with their role.

### Create a flat and manage it rooms

- A landlord can create a flat by providing the required information.
- A landlord can create and define the rooms available in the flat.
- A room can be assigned to only one tenant at a time.

### Invite and assign tenants to rooms

- A landlord can invite a tenant to a specific available room.
- A tenant cannot accept an invitation to a room that is no longer available.
- The system records which flat and room is assigned to each tenant.

### Join a flat through an invitation

- Before accepting an invitation, the tenant can view the relevant flat information and the room assigned to them.
- A tenant can accept or reject a flat invitation.
- A tenant can belong to only one flat at a time.
- If a tenant accepts an invitation while already belonging to another flat, the system must ask for confirmation before removing them from the current flat and joining the new one.

### View flat information

- An authorized tenant can view the basic information of the flat the courrently belong to.
- An autorized tenant can view the room assigned to them.
- A landlord can view basic information of their flat an the rooms defined within it.
- A landlord can view which tenant is assigned to each room.
- A user cannot access the private information of a flat the do not belong to or manage.

### Create household tasks

- An authorized tenant can create a household task inside their flat.
- A landlord can create a mandatory household task for their flat.
- A household task must include at least a title and a description.
- A newly created household task is initially visible only to its creator.
- A created task is stored by the system and belongs to the flat where it was created.
- A user cannot create a household task for a flat they do not belong to or manage.

### Assign household tasks to tenants

- A household task can be assigned only after it has been created.
- A tenant can assign a task to themselves or to another tenant belonging to the same flat.
- A landlord can assign a mandatory household task to a tenant belonging to their flat.
- A task cannot be assigned to a tenant who does not belong to the same flat.
- When assigning a task, the creator can define which additional users are allowed to view it.
- The creator can add or remove additional viewers after the task has been assigned.
- The creator and the assigned tenant must always be able to view the task. The creator may also make it visible to selected tenants, all tenants in the flat, and, when selected, to the landlord.
- The system stores both the tenant assigned to the task and the users who are allowed to view it.
- The creator can remove or change the tenant assigned to a task.
- A task can be reassigned later to another tenant belonging to the same flat.
- After assignment, the task becomes visible to the creator, the assigned tenant, and any additional users included in its visibility settings.
- If the assigned tenant leaves the flat, the task is no longer assigned to them.
- An assigned tenant can leave a non-mandatory task, causing it to become unassigned.
- An assigned tenant cannot leave a mandatory task created by the landlord.
  
### Complete assigned household tasks

- A household task must be assigned to a tenant before it can be completed.
- Only the tenant assigned to a task can mark it as completed.
- The assigned tenant can view the information required to complete the task.
- When a task is completed, the system updates and stores its completion status.
- The updated completion status is visible to users who are authorized to view the task.
- A user cannot complete a task assigned to another tenant.

### Report maintenance issues

- A tenant can report a maintenance issue related to their flat.
- A maintenance issue must include at least a title and a description.
- A reported issue is visible to all tenants of the same flat and to the landlord.
- Tenants can add additional details or updates to an existing maintenance issue.
- The original issue description is preserved after additional updates are added.
- The landlord can add updates to the maintenance issue.
- Users from another flat cannot view or modify the issue.

### View maintenance issue status

- Tenants and the landlord can view the current status of maintenance issues related to their flat.
- A maintenance issue can have the statuses Open, In progress, or Resolved.
- Only the landlord can change the status of a maintenance issue.
- The landlord can add status-related updates, such as technician visits, repair results, or replacement plans.
- All authorized users can view the chronological history of updates related to the issue.
- When the landlord changes the status, the new status is stored and immediately visible to authorized users.
- Users from another flat cannot view the status or history of the issue.
- When an issue is resolved, the landlord can close it and it remains available in the maintenance history.

## Medium priority

### Manage shared household items
### Upload photo evidence for tasks
### Create task reminders
### Send messages between tenants and landlord
### View task history

## Low priority

### Create social activities
### Join social activities
### Activity location filters
### Advanced messaging features
Additional search and filtering options
