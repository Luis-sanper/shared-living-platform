# Sprint 0 Review and Retrospective

## Sprint 0 Review

Sprint 0 was focused on preparing the project before starting the implementation sprints.

During this sprint, the initial idea of the Shared Living Platform was refined into a more realistic and manageable project. The main users, roles, scope, features, assumptions, and risks were defined.

The initial product backlog was created and prioritized, and acceptance criteria were written for the main features. Measurable quality scenarios were also added for performance, security, and privacy.

The project development process was defined using Scrumban. The development workflow, Definition of Done, individual project agreement, and Work In Progress limit were documented to establish how the project will be developed and reviewed.

The initial architecture was defined, separating the user interfaces, REST API, business logic, and database.

Finally, the technical environment was prepared. A Spring Boot backend using Java 21 and Maven was created, a basic automated test was added, and GitHub Actions was configured to execute backend tests automatically through CI.

By the end of Sprint 0, the project had a defined scope, documented requirements, development methodology, initial architecture, working development process, and technical foundation for the following sprints.

## Sprint 0 Retrospective

### What went well

A major improvement during Sprint 0 was progressively refining the project idea. Some features were initially too broad, so they were simplified or reduced while keeping the main purpose of the platform.

Defining acceptance criteria was especially useful because it forced several behaviours to be clarified before implementation, particularly task permissions and visibility, tenant and landlord responsibilities, room assignments, maintenance issues, reminders, and shared or private storage.

The project documentation also became much more consistent as the backlog, assumptions, glossary, architecture, workflow, and features by role were refined.

The use of Scrumban fits the project well because it allows work to be divided into small tasks while still maintaining sprint objectives. The Work In Progress limit also provides a simple rule for keeping development focused.

The technical setup was also completed successfully. The project now has an initial Spring Boot backend, a basic automated test, and a working CI workflow in GitHub Actions.

### What could be improved

Some decisions took longer than expected because changing one requirement often required checking and updating several related documents.

At the beginning, the Git workflow was also less structured. Some changes were committed directly to `main` before branches and Pull Requests became the normal way of working.

The first CI setup also required some corrections before it worked properly, which showed the importance of checking the complete workflow instead of assuming that a local test is enough.

### Retrospective action

For Sprint 1, the work will be more implementation-focused.

High-priority features will be developed first and large tasks will be divided into smaller pieces before implementation.

Development changes will normally be made in dedicated branches, validated with tests and CI, and integrated through Pull Requests.

The existing acceptance criteria and project documentation will be used as a reference during implementation, and they will only be updated when a real change in the project requires it.
