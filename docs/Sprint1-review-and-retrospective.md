# Sprint 1 Review and Retrospective

## 1. Sprint Goal

The goal of Sprint 1 was:

> Build the first working vertical slice of the Shared Living Platform, allowing household tasks to be created and viewed through a simple user interface connected to the backend.

The Sprint Goal was achieved. The project now has its first complete flow connecting the web interface, REST API and backend logic.

---

## 2. Completed work

During Sprint 1, the following work was completed:

- Added Spring Web support to the backend.
- Created the initial household task domain model.
- Implemented basic household task business logic.
- Added temporary in-memory task storage.
- Created REST endpoints for creating and retrieving tasks.
- Added automated tests for the task service.
- Created a simple web interface for household tasks.
- Connected the interface to the REST API.
- Reviewed and merged the first vertical slice into `main`.

The implementation was integrated through Pull Request #47.

The automated GitHub Actions workflow also completed successfully after the changes were pushed.

---

## 3. Demonstrated increment

The current application allows a user to:

1. Open the household task interface.
2. Enter a task title and description.
3. Create the task through the web interface.
4. Send the information to the backend using `POST /tasks`.
5. Store the task temporarily in memory.
6. Retrieve the existing tasks using `GET /tasks`.
7. Display the created tasks in the interface.

When a task is created, the backend automatically assigns an ID and initializes its completion status as `false`.

This represents the first functional vertical slice of the application.

---

## 4. Acceptance criteria demonstrated

The complete Product Backlog item **Create household tasks** is not considered finished yet because several of its original acceptance criteria depend on functionality that has not been implemented.

The current increment demonstrates only part of the expected behaviour:

- A household task can contain a title and description.
- A task can be created through the application.
- A created task is stored by the system while the application is running.
- A created task can later be retrieved and displayed.
- A new task starts as incomplete.

Other acceptance criteria are still pending, including:

- User authorization.
- Flat membership.
- Association of tasks with a flat.
- Due date and time.
- Mandatory landlord tasks.
- Task visibility rules.
- Preventing users from creating tasks for flats they do not belong to.

These items remain in the Product Backlog for future sprints.

---

## 5. Testing and Continuous Integration

Automated tests were added for the household task service.

The tests verify that:

- The first created task receives the expected ID.
- A newly created task starts as incomplete.
- The title and description are stored correctly.
- Multiple tasks are stored.
- Different tasks receive different sequential IDs.

The Pull Request was also validated using the existing GitHub Actions Continuous Integration workflow.

The CI workflow successfully executed the Maven test suite using Java 21 before the changes were merged into `main`.

---

## 6. Peer feedback

The first increment was shown to another person for feedback.

The main feedback was that the basic task creation process is easy to understand, but the functionality currently feels very limited.

More customization when creating a task would be useful, especially options such as adding a due date.

The interface was also considered visually very simple and could be improved to make the application more attractive.

### Developer response

I agree with this feedback.

The task functionality is currently limited because Sprint 1 focused on creating the first complete technical flow between the interface, REST API and backend rather than implementing the complete task system.

Features such as due dates are already included in the existing acceptance criteria and will be progressively implemented in later sprints.

The visual interface was also intentionally kept simple during this sprint. The priority was first to verify that the main architecture and communication between the different parts of the system worked correctly. The visual design can be improved later as the main functionality becomes more complete and stable.

---

## 7. Product Backlog changes

The Sprint 1 implementation showed that the Product Backlog item **Create household tasks** is too large to be completed as a single small development step.

For this reason, future work on household tasks should continue through smaller vertical slices.

The basic task creation and viewing flow is now available, while the remaining task functionality stays in the backlog.

The following task-related areas remain important for future development:

- Due dates.
- Assignment of tasks to tenants.
- Task completion.
- Flat and user permissions.
- Mandatory landlord tasks.
- Visibility rules.

The backlog should continue to prioritize functionality that is required by other features before adding optional improvements.

---

## 8. Process problem

One of the main problems during Sprint 1 was that the REST API task took significantly longer than initially expected.

Issue #26, **Create REST API for household tasks**, was created on November 2 and was not completed until November 15.

During implementation, the first version of the `POST /tasks` endpoint produced `400 Bad Request` errors because the application attempted to deserialize fields such as `id` and `completed`, even though these values should be controlled by the backend.

The problem was solved by changing the request handling so that the client only sends the task information it controls, while the backend generates the ID and initial completion status.

A second integration problem appeared in the frontend when the JavaScript attempted to access the form before the HTML element had been loaded.

Both problems showed that integration between layers can take more time than implementing each component separately.

---

## 9. Retrospective

### Practice to keep

Continue using small development tasks, branches, Pull Requests, automated tests and Continuous Integration.

This workflow made it easier to verify the changes before integrating them into `main`.

### Main impediment

Integration problems between the frontend and backend caused more delays than expected.

Individual components were relatively simple, but connecting the browser, REST API and backend introduced errors that required additional debugging.

### Improvement for Sprint 2

For Sprint 2, each new vertical slice should be tested incrementally as soon as the individual layers are connected instead of waiting until several parts have been implemented.

The objective will be to identify integration problems earlier.

### How the improvement will be measured

For each new Sprint 2 vertical slice, a basic end-to-end test of the functionality should be performed before the related issue is considered finished.

If integration problems are detected before the final review and do not block several subsequent tasks, the improvement will be considered successful.

---

## 10. Current product status

At the end of Sprint 1, the project has established its first complete application flow:

**Web interface → REST API → business logic → temporary storage → REST API → web interface**

The technical foundation created during Sprint 0 is now being used by actual product functionality.

The project is still at an early stage. The current household task implementation is deliberately basic and does not yet satisfy the complete Product Backlog item.

The main uncertainty for future sprints is how the task system will interact with users, flats, permissions and persistent storage as those parts of the application are introduced.
