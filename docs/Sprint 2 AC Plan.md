# Sprint 2 Acceptance Criteria

This checklist contains the acceptance criteria selected for Sprint 2.
It will be updated during the sprint as the corresponding behaviour is implemented and verified.

## Selected Product Backlog acceptance criteria

### Create household tasks

- [ ] An authorized tenant can create a household task inside their flat.
- [ ] A household task can include a due date and time.
- [ ] A household task must include at least a title and a description.
- [ ] A created task is stored by the system and belongs to the flat where it was created.
- [ ] A user cannot create a household task for a flat they do not belong to or manage.

### Join and belong to a flat

- [ ] A tenant can belong to only one flat at a time.

## Sprint 2 domain foundation

These criteria support the Product Backlog functionality selected for this sprint.

- [ ] The system represents users with an assigned role.
- [ ] The system represents shared flats.
- [ ] A user can be associated with a flat.
- [ ] A flat can contain multiple users.
- [ ] User-flat relationships are stored persistently.
- [ ] Household tasks are stored persistently.
- [ ] A household task is associated with its creator.
- [ ] A household task is associated with the flat where it was created.

## Stretch goal — task assignment

If the Sprint 2 core functionality is completed and stable:

- [ ] A household task can be assigned only after it has been created.
- [ ] A tenant can assign a task to themselves or to another tenant belonging to the same flat.
- [ ] A task cannot be assigned to a tenant who does not belong to the same flat.
- [ ] The system stores the tenant assigned to the task.
