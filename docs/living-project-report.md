# Shared Living Platform - Living Project Report

## 1. Project Overview

**Shared Living Platform** is a semester project developed for the Software Development Methodologies course.

The project is being developed individually.

Its main goal is to help people living in shared accommodation organize household responsibilities, manage shared information, communicate with the landlord, report maintenance issues, and participate in social activities.

The main users are:

- Tenants living in shared flats.
- Students and international students.
- Landlords or property managers with limited access.

The project repository is available at:

https://github.com/Luis-sanper/shared-living-platform

This report is a living document and will be updated during the following development sprints.

---

## 2. Initial Project Definition

During Sprint 0, the original project idea was refined into a more realistic scope for an individual semester project.

The system currently focuses on:

- Flat and room management.
- Tenant invitations and room assignment.
- Household tasks.
- Shared and private household storage.
- Maintenance issues.
- Communication between tenants and landlords.
- Public social activities.

Some functionality was intentionally kept out of scope for the first version, including real-time chat, payments, real-time maps, AI recommendations, and advanced social-network features.

More detailed information can be found in:

- [README](../README.md)
- [Features by role](features-by-role.md)
- [Project assumptions](assumptions.md)
- [Project glossary](glossary.md)

---

## 3. Requirements and Backlog

The initial product backlog was divided into high, medium, and low priority items.

High-priority functionality mainly covers the core flat workflow, including authentication, flat and room management, invitations, household tasks, and maintenance issues.

Medium-priority functionality includes storage, task reminders, photo evidence, and tenant-landlord communication.

Low-priority functionality focuses mainly on social activities and location filtering.

Detailed requirements were also defined through acceptance criteria.

These documents are available at:

- [Initial Product Backlog](backlog/Initial-product-backlog.md)
- [Acceptance Criteria](backlog/acceptance-criteria.md)
- [Measurable Quality Scenarios](measurable-quality-scenario.md)

The quality scenarios currently focus mainly on performance, security, and privacy.

---

## 4. Development Approach

The project follows a **Scrumban** approach.

This method was selected because Scrum provides broader sprint goals while Kanban makes it easier to divide the work into small tasks and visualize their progress.

The basic workflow is:

**Todo → In Progress → Done**

Whenever possible, only one task should be in progress at a time.

The project also uses a Definition of Done to determine when work can be considered completed.

Relevant documents:

- [Scrumban Rationale](Scrumban%20Rationale.md)
- [Development Workflow](Development-workflow.md)
- [Individual Project Agreement](inidividual-proyect-agreement.md)
- [Definition of Done](definition-of-done.md)

---

## 5. Initial Architecture

The initial architecture separates the system into several basic layers:

**User → Authentication / Role → Tenant or Landlord UI → REST API → Business Logic → Database**

Tenant and landlord interfaces will provide different functionality while using the same backend.

The REST API will connect the user interfaces with the backend logic, while the business logic will handle system rules, permissions, and validation.

The complete architecture sketch is available at:

[Initial Architecture](architecture.md)

---

## 6. Sprint 0 Technical Setup

During Sprint 0, the first technical foundation of the application was created.

The backend currently uses:

- Java 21.
- Spring Boot.
- Maven.
- Spring Boot Test / JUnit.
- GitHub Actions.

A basic Spring Boot application was created together with a test that verifies that the application context can start correctly.

Continuous Integration was also configured using GitHub Actions.

The CI workflow automatically creates a clean Ubuntu environment, configures Java 21, and executes the backend tests whenever relevant backend or workflow changes are pushed.

The first complete CI execution failed because the Maven Wrapper did not have execution permission in the Linux environment. The workflow was corrected by adding execution permission before running the tests.

After this correction, the CI workflow completed successfully.

Project setup instructions are available at:

[Project Setup Instructions](project-setup-instructions.md)

---

## 7. Git and Pull Request Workflow

Branches and Pull Requests were introduced during Sprint 0.

The first Pull Request was used to test the workflow while adding the Work In Progress rule to the individual project agreement.

**Pull Request #18:**  
https://github.com/Luis-sanper/shared-living-platform/pull/18

A second Pull Request was used to introduce the Spring Boot backend, automated test, and CI workflow.

**Pull Request #19:**  
https://github.com/Luis-sanper/shared-living-platform/pull/19

This established the basic development process that will be used during implementation:

**Branch → implementation → commit → Pull Request → test/CI → merge**

---

## 8. Sprint 0 Review and Retrospective

Sprint 0 was mainly focused on preparing the project before implementation.

The most important results were:

- Refining the original project idea.
- Defining users, roles, scope, assumptions, and risks.
- Creating and prioritizing the product backlog.
- Defining detailed acceptance criteria.
- Selecting Scrumban.
- Defining the workflow and Definition of Done.
- Creating the initial architecture.
- Preparing the Spring Boot backend.
- Adding automated testing and CI.
- Introducing branches and Pull Requests.

One of the main lessons from Sprint 0 was that changing a requirement often affects several related documents, so keeping the documentation consistent requires additional attention.

The initial Git workflow was also less structured, since some early changes were committed directly to `main`. During the sprint, branches and Pull Requests became the preferred workflow.

The CI setup also showed the importance of testing changes in an independent environment instead of relying only on local execution.

The complete review and retrospective is available at:

[Sprint 0 Review and Retrospective](Sprint0-review-retrospective.md)

---

## 9. Current Status and Next Sprint

Sprint 0 is now considered complete.

The project has:

- A defined scope.
- A prioritized backlog.
- Detailed acceptance criteria.
- Quality scenarios.
- A development methodology and workflow.
- An initial architecture.
- A Spring Boot backend skeleton.
- A basic automated test.
- Working Continuous Integration.
- A branch and Pull Request workflow.

Sprint 1 will move from project preparation into implementation.

Development will begin with high-priority functionality, using the acceptance criteria and documentation created during Sprint 0 as a reference.
