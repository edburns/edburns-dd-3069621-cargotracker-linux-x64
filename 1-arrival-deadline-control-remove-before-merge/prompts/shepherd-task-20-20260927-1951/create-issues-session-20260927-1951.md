# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `0891fb93-81f4-4b1a-b064-fdf451b2a630`  
> - **Started:** 9/27/2026, 7:51:11 PM  
> - **Duration:** 2m 56s  
> - **Exported:** 9/27/2026, 7:54:08 PM  

---

<sub>2s</sub>

### User

Invoke skill `shepherd-task-20-create-issues-from-plan` with these inputs:

- CAMPAIGN_ID: 6bf3de9a-4edf-4c6a-8f79-122254ff6847
- LESSON_PROPAGATION: off
- REPO: edburns/edburns-dd-3069621-cargotracker-linux-x64
- BASE_BRANCH: experiment/shepherd-control
- PARENT_ISSUE: 1
- PLAN_DIRECTORY: 1-arrival-deadline-control-remove-before-merge
- PLAN_FILE_NAME: add-change-arrival-deadline-feature-ignorance-reduction-plan.md
- QUESTIONS_SECTION: ## Phase 3 — Ignorance reduction: questions to answer before writing code
- IMPLEMENTATION_SECTION: ## Phase 4 — Implementation (five serial issues)
- EXPECTED_TASK_COUNT: 5
- BASE_REMOTE: origin
- LOG_DIRECTORY: /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951
- DRAFT_VALIDATOR: /home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh
- ISSUE_BODY_VERIFIER: /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh
- CHILD_LINK_VERIFIER: /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh

Fixture pagination response contract (mandatory):

- `gh api ... --paginate --slurp` returns a JSON array of page payloads, so a
  one-page response has the shape `[[{...}]]`, not `[{...}]`.
- Before indexing child issue fields such as `.id`, normalize the response to
  one flat issue array exactly once.
- In Bash, use:
  `jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end'`.
- In PowerShell, capture the `gh` output and `$LASTEXITCODE` first, then pass
  the complete JSON through the same `jq` normalization before
  `ConvertFrom-Json`.
- Use the normalized flat array for the pre-creation baseline, final child
  count/order checks, and failure reconciliation. Do not apply `add` a second
  time to an already-flat array.

---

<sub>4s</sub>

### `skill`

**shepherd-task-20-create-issues-from-plan**

<details>
<summary>Arguments</summary>

```json
{
  "skill": "shepherd-task-20-create-issues-from-plan"
}
```

</details>

```
Skill "shepherd-task-20-create-issues-from-plan" loaded successfully. Follow the instructions in the skill context.
```


---

<sub>8s</sub>

### Copilot

I’m validating the campaign inputs, plan structure, and issue-writing conventions before any GitHub mutation.

---

<sub>15s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/01-1682-java-tool-ergonomics.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/01-1682-java-tool-ergonomics.md

<details>
<summary>15 lines</summary>

```
# Example 01: 1682-java-tool-ergonomics-prompts-remove-before-merge

Read `copilot-sdk/1682-java-tool-ergonomics-prompts-remove-before-merge/dd-3018003-ignorance-reduction-for-implementation-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 3 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating issues of type **Task** as children of Epic https://github.com/github/copilot-sdk/issues/1682 . These issues correspond to the sub-sections in `## Phase 4 — Implementation (the build order)`.

I want you to use `gh` to create issues as sub-issues of 1682.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Set the type to **Task**.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `upstream`: `edburns/1682-java-tool-ergonomics`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `1682-java-tool-ergonomics-prompts-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>15s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/02-1810-java-tool-as-lambda.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/02-1810-java-tool-as-lambda.md

<details>
<summary>12 lines</summary>

```
# Example 02: 1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge

Carefully read the plan `copilot-sdk/1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`.

We have completed Phases 1 - 3. We are now on Phase 4.

For each sub item in Phase 4, file a child issue of Feature #1810.

Use `gh` to look at Epic #1682 and its child issues for the standard of verbosity and concreteness for issue descriptions.

The issue should be assignable to a coding agent and there must be sufficient detail in the description for the agent to proceed to completion.

Pull out the specific relevant content from Phase 3 as it applies to this current issue in Phase 4.

Tell the agent to take `edburns/1810-java-tool-ergonomics-tool-as-lambda` as the base branch. When I assign the issue to the coding agent, I will set this as the base branch.

Tell the agent to read `1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`, which is present on the branch, for context.

Tell the agent which sub-item within Phase 4 they are solving.

Tell the agent that each issue will be assigned, resolved and merged to the base branch in the order in which they appear in the plan.

No work is to start until I assign each issue to the coding agent, in turn.
```

</details>


---

<sub>15s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/03-dd-3017826-java-real-estate-demo.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/03-dd-3017826-java-real-estate-demo.md

<details>
<summary>14 lines</summary>

```
# Example 03: dd-3017826-java-real-estate-demo-remove-before-merge

Read `dd-3017826-java-real-estate-demo-remove-before-merge\dd-3017826-java-real-estate-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/2 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #2.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/2-build-out-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `dd-3017826-java-real-estate-demo-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>15s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/04-28-python-agent-demo.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/04-28-python-agent-demo.md

<details>
<summary>16 lines</summary>

```
# Example 04: 28-python-agent-demo-remove-before-merge

Read `28-python-agent-demo-remove-before-merge/28-python-agent-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`. These pertain to the implementation tasks in Phase 3. ✅✅✅ Include relevant spike findings as self-contained prose in the issue description; do not direct the agent to spike directories or source files.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/28 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #28

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Again, ✅✅For each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`, include the relevant Resolution values in the issue description. These pertain to the implementation tasks in Phase 3. ✅✅✅ State relevant spike findings directly in the issue body with enough detail to implement them without reading spike code.

- For tasks dealing with the UI, make sure to refer to the relevant screengrabs, but only ones within `28-python-agent-demo-remove-before-merge/`.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/28-python-agent-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `28-python-agent-demo-remove-before-merge/`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>15s</sub>

### `bash`

**Validate local inputs and list campaign files**

$ set -o pipefail
printf '%s\n' '--- git/remotes/default branch ---'
git remote -v
git branch --list 'experiment/shepherd-control'
git ls-remote --heads origin experiment/shepherd-control
git symbolic-ref --short refs/remotes/origin/HEAD 2>/dev/null || true
printf '%s\n' '--- paths/scripts ---'
test -d '/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951' && test -w '/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951' && echo log-dir-ok
for f in '/home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh' '/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh' '/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh'; do test -x "$f" && echo "executable: $f" || echo "INVALID: $f"; done
printf '%s\n' '--- plan directory listing ---'
find '1-arrival-deadline-control-remove-before-merge' -maxdepth 3 -type f -print | sort

<details>
<summary>23 lines</summary>

```
--- git/remotes/default branch ---
origin	git@github.com:edburns/edburns-dd-3069621-cargotracker-linux-x64.git (fetch)
origin	git@github.com:edburns/edburns-dd-3069621-cargotracker-linux-x64.git (push)
* experiment/shepherd-control
926ec9a43553871bf7de0a3baa9923e71a106e98	refs/heads/experiment/shepherd-control
origin/20260902-2104Z-commit-e7b651f-liberty
--- paths/scripts ---
log-dir-ok
executable: /home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh
executable: /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh
executable: /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh
--- plan directory listing ---
1-arrival-deadline-control-remove-before-merge/.stage20-after.1018247
1-arrival-deadline-control-remove-before-merge/.stage20-before.1018247
1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md
1-arrival-deadline-control-remove-before-merge/campaign-lessons.md
1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/20260927-1951-invoke-shepherd-task-20-create-issues-from-plan-skill.md
1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/20260927-1951-invoke-shepherd-task-20-create-issues-from-plan-skill.sh
1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/create-issues-otel-20260927-1951.jsonl
1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/create-issues-session-20260927-1951.jsonl
1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json
1-arrival-deadline-control-remove-before-merge/shepherd-test-experiment.json
<shellId: 0 completed with exit code 0>
```

</details>


---

<sub>15s</sub>

### `sql`

**Track stage twenty workflow**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Track stage twenty workflow",
  "query": "INSERT OR REPLACE INTO todos (id,title,description,status) VALUES ('validate-stage20','Validating campaign inputs','Validate repository, branch, parent, plan, manifest, examples, and existing children before mutation','in_progress'),('draft-stage20','Drafting ordered issue bodies','Build traceability map and persist five complete issue specifications','pending'),('create-stage20','Creating and linking issues','Validate drafts, create and link each issue serially with ledger updates','pending'),('verify-stage20','Verifying stage postconditions','Verify child links, issue bodies, states, assignees, types, and persist complete result','pending'); INSERT OR REPLACE INTO todo_deps (todo_id,depends_on) VALUES ('draft-stage20','validate-stage20'),('create-stage20','draft-stage20'),('verify-stage20','create-stage20')"
}
```

</details>

<details>
<summary>5 lines</summary>

```
Executed 2 statement(s):

1. INSERT
   4 row(s) inserted. Last inserted row ID: 4.

2. INSERT
   3 row(s) inserted. Last inserted row ID: 3.
```

</details>


---

<sub>27s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 1-240)

<details>
<summary>185 lines</summary>

````
# Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)

Human DRI: Ed Burns
Starting commit: `9b9f311b2a3a2854bdac947593950d9edb6bca7d` (`Make the system ready for implementation`)
Working directory: repository root of the current campaign worktree
Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0
Baseline run instructions: `README.md`
Baseline preparation: fixed source branch and immutable SHA validated by the campaign fixture
Historical issue: `eclipse-ee4j/cargotracker#64`

Related directories and files:

- `src/main/java/org/eclipse/cargotracker/application/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
- `src/main/webapp/admin/dialogs/`
- `src/main/webapp/admin/tables/listNotRouted.xhtml`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

---

## Goal

Add an Administration dashboard operation that lets a shipping administrator
change the arrival deadline of a cargo listed in the **Not Routed Cargo** table.
The operation must preserve Cargo Tracker's layered architecture:

1. The application service owns the domain mutation.
2. The booking facade shields the web layer from domain types.
3. A JSF backing bean loads and submits the editable date.
4. A PrimeFaces dynamic dialog presents the editor.
5. The existing Not Routed Cargo table opens the dialog and refreshes after a
   successful update.

### User-visible acceptance behavior

Using the stable sample cargo `DEF789`:

1. Start the application with Java 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Open `http://localhost:8080/cargo-tracker/`.
3. Select **Administration**.
4. Find `DEF789` in the **Not Routed Cargo** table.
5. The Deadline cell displays its date together with an edit icon.
6. Hovering over the deadline displays:
   `Click to change cargo arrival deadline date.`
7. Selecting the deadline opens a modal dialog titled **Change Deadline**.
8. The dialog displays the cargo's origin and destination as read-only
   context.
9. The date editor is initialized to the cargo's current arrival deadline.
10. Selecting a different date and pressing **Update** closes the dialog and
    refreshes the Administration view.
11. The new date is shown in the Not Routed Cargo table.
12. Reloading the page continues to show the new date for the lifetime of the
    running in-memory sample application.
13. Pressing **Cancel** closes the dialog without changing the deadline.

### Domain acceptance behavior

Changing the deadline must:

- locate the cargo by `TrackingId`;
- preserve its existing origin;
- preserve its existing destination;
- replace only the arrival deadline in its `RouteSpecification`;
- apply the specification through `Cargo.specifyNewRoute(...)`;
- preserve the currently assigned itinerary rather than silently discarding
  it;
- allow the domain model to recalculate routing status and delivery-derived
  values against the new route specification;
- persist the changed cargo through `CargoRepository.store(...)`.

### Hard scope constraints

- Begin from commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d`.
- Preserve Java EE 7 and the `javax.*` namespace.
- Preserve the Java 7 source/target level used by this historical codebase.
- Run the application on JDK 17 using the existing Open Liberty profile.
- Do not migrate the application to Jakarta EE 8+, Jakarta EE 9+, Spring, or a
  different UI framework.
- Do not replace the in-memory Derby configuration or the Open Liberty runtime.
- Do not redesign unrelated cargo booking, routing, destination editing,
  messaging, batch, REST, or persistence behavior.
- Do not copy commits or files from feature-bearing branches. This plan is the
  implementation specification.
- Implement the five build issues below in order. Each issue must be complete
  and gated before the next issue begins.

---

## Completed phases

### Phase 1 ✅ — Establish a runnable feature-absent baseline

- Commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d` is based on the historical
  feature-absent commit and contains only the compatibility work needed to run
  the sample on JDK 17 and Open Liberty.
- `./mvnw clean package -Popenliberty liberty:run` starts the application.
- The home page and Administration flows return HTTP 200.
- JSF view metadata is placed at `UIViewRoot` scope for MyFaces compatibility.
- The internal routing REST client works without a Jersey/MOXy classloading
  conflict.
- The scheduled batch job has the local authorization it needs.

### Phase 2 ✅ — Verify the before and after user experience

- Before implementation, `DEF789` appears in the Not Routed Cargo table with a
  plain-text deadline and no edit operation.
- The neighboring Destination column demonstrates the existing PrimeFaces
  dynamic-dialog interaction pattern.
- The desired after behavior has been manually exercised: open the deadline
  editor, choose a new date, update, refresh the table, and observe the
  persisted value.
- The historical architectural boundaries and affected files have been
  identified.

---

## Phase 3 — Ignorance reduction: questions to answer before writing code

Resolve these questions before production implementation begins. The
recommendations intentionally define the desired design closely enough that an
implementing agent should not need to invent a different architecture.

### 3.1 — Which cargos expose the edit operation?

**Question:** Should deadline editing be exposed for all cargos or only for
cargos displayed in the Not Routed Cargo table?

The requested feature originates in the Administration dashboard's Not Routed
Cargo table. Other tables represent routed, misrouted, claimed, or otherwise
progressed cargo. Adding the affordance to every table would expand the feature
and require additional business rules about changing deadlines after handling
has begun.

| Option | UI scope | Trade-off |
|--------|----------|-----------|
| A | Not Routed Cargo table only | Matches the requested feature and the established destination-edit affordance. |
| B | Every Administration cargo table | Broader capability, but introduces lifecycle and authorization questions outside the request. |
| C | Cargo details page only | Avoids table complexity but does not meet the requested dashboard interaction. |

The application-service operation itself does not need to encode a UI-table
restriction. It should accept a tracking ID and apply the domain mutation to
the located cargo. The presentation layer determines where the operation is
offered.

**Recommendation:** Option A. Add the edit affordance only to
`src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
operation generally usable for a valid cargo.

**Resolution:**

Select Option A. Expose the edit affordance only in
`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.

### 3.2 — What is the exact domain mutation?

**Question:** Should the feature mutate the existing `RouteSpecification`, add
a setter to `Cargo`, or replace the specification using the existing domain
operation?

`RouteSpecification` is a value object describing origin, destination, and
arrival deadline. The existing `changeDestination(...)` implementation already
establishes the correct pattern: create a replacement specification, call
`Cargo.specifyNewRoute(...)`, and store the aggregate.

Proposed application-service shape:

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

Proposed implementation:

```java
Cargo cargo = cargoRepository.find(trackingId);
RouteSpecification specification = new RouteSpecification(
        cargo.getOrigin(),
        cargo.getRouteSpecification().getDestination(),
        deadline);

cargo.specifyNewRoute(specification);
cargoRepository.store(cargo);
```

Calling `specifyNewRoute(...)` is significant. It lets the aggregate recalculate
delivery and routing status relative to the new specification. Direct field
mutation or a persistence-only update would bypass that behavior.

**Recommendation:** Replace the `RouteSpecification` through
`Cargo.specifyNewRoute(...)`. Preserve origin, destination, and itinerary.
Persist using the existing repository. Do not add a deadline setter to the
domain model.

**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.

### 3.3 — What should happen to an existing itinerary and delivery state?

**Question:** When a routed cargo's deadline changes, should its itinerary be
cleared, retained, or recomputed?

Although the UI initially exposes the feature only for unrouted cargo, the
application operation should have deterministic domain behavior if invoked for
a routed cargo. The existing `changeDestination(...)` behavior preserves the
assigned itinerary and lets `Cargo.specifyNewRoute(...)` recalculate whether
that itinerary still satisfies the new specification.

The core application test should deliberately invoke the operation after:

1. booking a cargo;
2. requesting route candidates;
3. assigning an itinerary;
4. changing its destination;
5. changing its deadline.

This sequence verifies that the feature uses the aggregate correctly rather
than assuming the cargo always has an empty itinerary.

**Recommendation:** Preserve the itinerary. Let the domain model recompute
routing and delivery-derived state. Assert all unaffected fields explicitly in
`BookingServiceTest`.

**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
````

</details>


---

<sub>27s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 241-520)

<details>
<summary>209 lines</summary>

````
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.

### 3.4 — What type crosses the facade boundary?

**Question:** Should the booking facade accept a `Date`, a formatted string, or
a newly introduced request DTO?

The existing facade already uses `java.util.Date` for
`bookNewCargo(...)`. Introducing another representation for this one operation
would create unnecessary conversion code and depart from the historical
application style.

Proposed facade shape:

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

The implementation converts only the identifier:

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

**Recommendation:** Use `String` for the tracking ID and `java.util.Date` for
the deadline. Do not expose `TrackingId`, `Cargo`, or `RouteSpecification` to
the JSF layer and do not introduce a new DTO solely for this command.

**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.

### 3.5 — How is the DTO's formatted deadline converted for editing?

**Question:** `CargoRoute` exposes its deadline as formatted strings, while
`p:datePicker` binds naturally to `java.util.Date`. How should the backing bean
initialize the editor?

At the starting commit:

- `CargoRoute.getArrivalDeadline()` returns
  `MM/dd/yyyy hh:mm a z`.
- `CargoRoute.getArrivalDeadlineDate()` returns only the date component.
- The table displays `getArrivalDeadlineDate()`.

Options:

| Option | Approach | Trade-off |
|--------|----------|-----------|
| A | Parse `cargo.getArrivalDeadlineDate()` with `MM/dd/yyyy` | Small, localized change; preserves the existing DTO contract. |
| B | Add a `Date` property to `CargoRoute` | Cleaner typing, but broadens a DTO used throughout the application. |
| C | Reload the domain object in the backing bean | Violates the facade boundary. |

The formatter/parser must be created per operation or per view bean; do not add
a shared mutable `SimpleDateFormat`.

**Recommendation:** Option A. Load `CargoRoute` through
`BookingServiceFacade.loadCargoForRouting(trackingId)` and parse
`cargo.getArrivalDeadlineDate()` using `new SimpleDateFormat("MM/dd/yyyy")`.
Surface an explicit failure if the existing DTO value cannot be parsed; do not
silently submit a null date.

**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.

### 3.6 — Which JSF bean scopes and interaction pattern should be used?

**Question:** Should deadline editing introduce a new navigation page, use an
inline editor, or mirror the existing Change Destination dynamic-dialog
pattern?

The baseline already contains:

- `ChangeDestination`, a CDI `@Named` and JSF `@ViewScoped` editor bean;
- `ChangeDestinationDialog`, a session-scoped JSF managed bean that opens and
  closes a PrimeFaces dynamic dialog;
- `changeDestination.xhtml`, a dialog view;
- a `dialogReturn` Ajax listener that refreshes `tableNotRouted`.

Using the same pattern minimizes changes and provides a consistent user
experience.

Proposed bean names:

```text
changeArrivalDeadlineDate
changeArrivalDeadlineDateDialog
```

**Recommendation:** Add a serializable CDI `@Named @ViewScoped`
`ChangeArrivalDeadlineDate` editor and a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped`
launcher. Mirror the existing destination-dialog lifecycle rather than
introducing a new navigation or inline-edit framework.

**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.

### 3.7 — What is the dynamic-dialog contract?

**Question:** What path, request parameters, dimensions, and close result should
the PrimeFaces dialog use?

The launcher needs one parameter, `trackingId`, supplied as a
`Map<String, List<String>>`. The dialog metadata binds the parameter and invokes
the editor bean's `load()` action.

Proposed launcher contract:

```java
PrimeFaces.current().dialog().openDynamic(
        "/admin/dialogs/changeArrivalDeadlineDate.xhtml",
        options,
        params);
```

Required options:

| Option | Value |
|--------|-------|
| `modal` | `true` |
| `draggable` | `true` |
| `resizable` | `false` |
| `contentWidth` | `410` |
| `contentHeight` | `280` |

Required completion behavior:

- successful update: `closeDynamic("DONE")`;
- cancel: `closeDynamic("")`;
- caller listens for `dialogReturn` and updates `tableNotRouted`.

Because Open Liberty uses MyFaces, `<f:metadata>` must be a direct child of the
view root, before `<h:head>` and `<h:body>`. It must not be nested inside
`<h:body>`.

**Recommendation:** Use the contract above and preserve the metadata placement
required by the prepared baseline.

**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.

### 3.8 — What date validation is required?

**Question:** Must the new deadline be non-null, in the future, after the
current date, or after itinerary completion?

The requested feature is an administrative correction to an existing arrival
deadline. No new domain policy about future dates is part of the request.
Inventing such a rule could reject dates accepted by existing cargo booking or
`RouteSpecification` behavior.

The UI must nevertheless prevent a null submission because the operation
requires a concrete replacement deadline.

**Recommendation:** Require a date value in the JSF form and display a normal
Faces validation message when it is absent. Do not add a new minimum-date,
future-date, or itinerary-date business rule. Continue to rely on the existing
domain model for its established invariants.

**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.

### 3.9 — How will the feature be tested on the prepared historical baseline?

**Question:** Which automated and runtime tests are mandatory, given that the
historical JUnit/Arquillian suite is configured for a remote Payara 4
container, while the prepared production baseline runs on JDK 17/Open Liberty?

The starting POM deliberately leaves `skipTests=true`. The Open Liberty profile
builds and compiles all test sources but does not provide a Liberty Arquillian
adapter. Modernizing the entire integration-test runtime is outside this
feature's scope.

The feature still needs layered evidence:

1. Extend `BookingServiceTest` with the domain/application assertions that
   specify the deadline mutation.
2. Ensure all test sources compile as part of
   `./mvnw clean package -Popenliberty`.
3. Add focused JUnit tests for facade and backing-bean delegation where they
   can run without a container, using hand-written fakes rather than adding a
   mocking framework.
4. Perform mandatory end-to-end verification against the running Open Liberty
   application.
5. Preserve the existing Payara Arquillian test path; do not delete, disable,
   or rewrite it to manufacture a passing result.

**Spike needed:** Before Issue 1 implementation, run the starting commit's
standard Open Liberty package command and record whether tests are compiled but
skipped. Confirm the new `BookingServiceTest` method can be added without
expanding the runtime modernization scope.

**Recommendation:** Treat the JDK 17/Open Liberty build plus HTTP/UI acceptance
as the mandatory executable gate. Keep the historical Arquillian test as a
precise application-layer specification and run it only when its documented
Payara environment is available.

**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---

## Phase 4 — Implementation (five serial issues)

Implement these issues in order. Each issue should be a separate commit. Do not
start an issue until the previous issue's gating criteria are satisfied.

### 4.1 — Issue 1: Add the application-layer deadline change operation

**What to build**

Add the core use case to the application layer. This issue must contain no JSF
or PrimeFaces changes.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`
- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

**Required API**

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

**Required implementation behavior**

1. Load the cargo using `cargoRepository.find(trackingId)`.
2. Obtain the current destination from
   `cargo.getRouteSpecification().getDestination()`.
3. Construct a replacement `RouteSpecification` from:
   - `cargo.getOrigin()`;
   - the current destination;
   - the new deadline.
````

</details>


---

<sub>27s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json

<details>
<summary>16 lines</summary>

```
{
  "schemaVersion": 1,
  "campaignId": "6bf3de9a-4edf-4c6a-8f79-122254ff6847",
  "campaignIssueNumber": 1,
  "campaignShortname": "arrival-deadline-control",
  "repository": "edburns/edburns-dd-3069621-cargotracker-linux-x64",
  "baseBranch": "experiment/shepherd-control",
  "lessonPropagation": "off",
  "campaignMetadataDirectory": "1-arrival-deadline-control-remove-before-merge",
  "lessonsFile": "campaign-lessons.md",
  "createdBy": {
    "shepherdTaskVersion": "1.0.5",
    "stageOutcomeProtocolVersion": 1
  },
  "createdAt": "2026-09-27T19:51:07Z"
}
```

</details>


---

<sub>27s</sub>

### `bash`

**Validate GitHub parent and capture child baseline**

$ set -euo pipefail
REPO='edburns/edburns-dd-3069621-cargotracker-linux-x64'
LOG='/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951'
mkdir -p "$LOG/issue-bodies"
repo_json="$(gh api "repos/$REPO")"
printf '%s\n' "$repo_json" | jq '{owner: .owner.login, owner_type: .owner.type, default_branch: .default_branch}'
parent_json="$(gh api "repos/$REPO/issues/1")"
printf '%s\n' "$parent_json" | jq '{number,state,title,repository_url}'
owner_type="$(printf '%s\n' "$repo_json" | jq -r '.owner.type')"
if [ "$owner_type" = Organization ]; then gh api 'orgs/edburns/issue-types' | jq '.'; elif [ "$owner_type" = User ]; then echo 'issue-type: unavailable for user owner'; else echo "unrecognized owner type: $owner_type" >&2; exit 1; fi
children_pages="$(gh api "repos/$REPO/issues/1/sub_issues" --paginate --slurp)"
children_flat="$(printf '%s\n' "$children_pages" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end')"
printf '%s\n' "$children_flat" > "$LOG/.pre-creation-children.tmp"
printf '%s\n' "$children_flat" | jq '[.[] | {id,number,title}]'
printf '%s\n' '--- branch plan identity ---'
git show 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md' | sha256sum
sha256sum '1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'

<details>
<summary>17 lines</summary>

```
{
  "owner": "edburns",
  "owner_type": "User",
  "default_branch": "20260902-2104Z-commit-e7b651f-liberty"
}
{
  "number": 1,
  "state": "open",
  "title": "[Campaign][off] Cargo Tracker arrival-deadline control",
  "repository_url": "https://api.github.com/repos/edburns/edburns-dd-3069621-cargotracker-linux-x64"
}
issue-type: unavailable for user owner
[]
--- branch plan identity ---
359154714c7b791f3d31a7f63fadfc219d815907748f34411fe8b48e3a678056  -
359154714c7b791f3d31a7f63fadfc219d815907748f34411fe8b48e3a678056  1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md
<shellId: 2 completed with exit code 0>
```

</details>


---

<sub>27s</sub>

### `bash`

**Inspect plan headings and campaign manifest**

$ set -euo pipefail
PLAN='1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'
printf '%s\n' '--- headings ---'
rg -n '^#{1,6} ' "$PLAN"
printf '%s\n' '--- resolution markers ---'
rg -n 'Resolution:' "$PLAN"
printf '%s\n' '--- campaign manifest on branch ---'
git show 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json'
printf '%s\n' '--- campaign lessons exists ---'
git cat-file -e 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/campaign-lessons.md' && echo yes

```
--- headings ---
/bin/bash: line 4: rg: command not found
<shellId: 1 completed with exit code 127>
```


---

<sub>35s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 160-360)

<details>
<summary>149 lines</summary>

````
tracking ID; they do not encode knowledge of dashboard table membership.

### 3.2 — What is the exact domain mutation?

**Question:** Should the feature mutate the existing `RouteSpecification`, add
a setter to `Cargo`, or replace the specification using the existing domain
operation?

`RouteSpecification` is a value object describing origin, destination, and
arrival deadline. The existing `changeDestination(...)` implementation already
establishes the correct pattern: create a replacement specification, call
`Cargo.specifyNewRoute(...)`, and store the aggregate.

Proposed application-service shape:

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

Proposed implementation:

```java
Cargo cargo = cargoRepository.find(trackingId);
RouteSpecification specification = new RouteSpecification(
        cargo.getOrigin(),
        cargo.getRouteSpecification().getDestination(),
        deadline);

cargo.specifyNewRoute(specification);
cargoRepository.store(cargo);
```

Calling `specifyNewRoute(...)` is significant. It lets the aggregate recalculate
delivery and routing status relative to the new specification. Direct field
mutation or a persistence-only update would bypass that behavior.

**Recommendation:** Replace the `RouteSpecification` through
`Cargo.specifyNewRoute(...)`. Preserve origin, destination, and itinerary.
Persist using the existing repository. Do not add a deadline setter to the
domain model.

**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.

### 3.3 — What should happen to an existing itinerary and delivery state?

**Question:** When a routed cargo's deadline changes, should its itinerary be
cleared, retained, or recomputed?

Although the UI initially exposes the feature only for unrouted cargo, the
application operation should have deterministic domain behavior if invoked for
a routed cargo. The existing `changeDestination(...)` behavior preserves the
assigned itinerary and lets `Cargo.specifyNewRoute(...)` recalculate whether
that itinerary still satisfies the new specification.

The core application test should deliberately invoke the operation after:

1. booking a cargo;
2. requesting route candidates;
3. assigning an itinerary;
4. changing its destination;
5. changing its deadline.

This sequence verifies that the feature uses the aggregate correctly rather
than assuming the cargo always has an empty itinerary.

**Recommendation:** Preserve the itinerary. Let the domain model recompute
routing and delivery-derived state. Assert all unaffected fields explicitly in
`BookingServiceTest`.

**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.

### 3.4 — What type crosses the facade boundary?

**Question:** Should the booking facade accept a `Date`, a formatted string, or
a newly introduced request DTO?

The existing facade already uses `java.util.Date` for
`bookNewCargo(...)`. Introducing another representation for this one operation
would create unnecessary conversion code and depart from the historical
application style.

Proposed facade shape:

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

The implementation converts only the identifier:

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

**Recommendation:** Use `String` for the tracking ID and `java.util.Date` for
the deadline. Do not expose `TrackingId`, `Cargo`, or `RouteSpecification` to
the JSF layer and do not introduce a new DTO solely for this command.

**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.

### 3.5 — How is the DTO's formatted deadline converted for editing?

**Question:** `CargoRoute` exposes its deadline as formatted strings, while
`p:datePicker` binds naturally to `java.util.Date`. How should the backing bean
initialize the editor?

At the starting commit:

- `CargoRoute.getArrivalDeadline()` returns
  `MM/dd/yyyy hh:mm a z`.
- `CargoRoute.getArrivalDeadlineDate()` returns only the date component.
- The table displays `getArrivalDeadlineDate()`.

Options:

| Option | Approach | Trade-off |
|--------|----------|-----------|
| A | Parse `cargo.getArrivalDeadlineDate()` with `MM/dd/yyyy` | Small, localized change; preserves the existing DTO contract. |
| B | Add a `Date` property to `CargoRoute` | Cleaner typing, but broadens a DTO used throughout the application. |
| C | Reload the domain object in the backing bean | Violates the facade boundary. |

The formatter/parser must be created per operation or per view bean; do not add
a shared mutable `SimpleDateFormat`.

**Recommendation:** Option A. Load `CargoRoute` through
`BookingServiceFacade.loadCargoForRouting(trackingId)` and parse
`cargo.getArrivalDeadlineDate()` using `new SimpleDateFormat("MM/dd/yyyy")`.
Surface an explicit failure if the existing DTO value cannot be parsed; do not
silently submit a null date.

**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.

### 3.6 — Which JSF bean scopes and interaction pattern should be used?

**Question:** Should deadline editing introduce a new navigation page, use an
inline editor, or mirror the existing Change Destination dynamic-dialog
pattern?

The baseline already contains:

- `ChangeDestination`, a CDI `@Named` and JSF `@ViewScoped` editor bean;
- `ChangeDestinationDialog`, a session-scoped JSF managed bean that opens and
  closes a PrimeFaces dynamic dialog;
- `changeDestination.xhtml`, a dialog view;
- a `dialogReturn` Ajax listener that refreshes `tableNotRouted`.

Using the same pattern minimizes changes and provides a consistent user
experience.

Proposed bean names:

```text
changeArrivalDeadlineDate
changeArrivalDeadlineDateDialog
```

**Recommendation:** Add a serializable CDI `@Named @ViewScoped`
`ChangeArrivalDeadlineDate` editor and a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped`
launcher. Mirror the existing destination-dialog lifecycle rather than
introducing a new navigation or inline-edit framework.

**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.

### 3.7 — What is the dynamic-dialog contract?
````

</details>


---

<sub>35s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 361-620)

<details>
<summary>191 lines</summary>

````

**Question:** What path, request parameters, dimensions, and close result should
the PrimeFaces dialog use?

The launcher needs one parameter, `trackingId`, supplied as a
`Map<String, List<String>>`. The dialog metadata binds the parameter and invokes
the editor bean's `load()` action.

Proposed launcher contract:

```java
PrimeFaces.current().dialog().openDynamic(
        "/admin/dialogs/changeArrivalDeadlineDate.xhtml",
        options,
        params);
```

Required options:

| Option | Value |
|--------|-------|
| `modal` | `true` |
| `draggable` | `true` |
| `resizable` | `false` |
| `contentWidth` | `410` |
| `contentHeight` | `280` |

Required completion behavior:

- successful update: `closeDynamic("DONE")`;
- cancel: `closeDynamic("")`;
- caller listens for `dialogReturn` and updates `tableNotRouted`.

Because Open Liberty uses MyFaces, `<f:metadata>` must be a direct child of the
view root, before `<h:head>` and `<h:body>`. It must not be nested inside
`<h:body>`.

**Recommendation:** Use the contract above and preserve the metadata placement
required by the prepared baseline.

**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.

### 3.8 — What date validation is required?

**Question:** Must the new deadline be non-null, in the future, after the
current date, or after itinerary completion?

The requested feature is an administrative correction to an existing arrival
deadline. No new domain policy about future dates is part of the request.
Inventing such a rule could reject dates accepted by existing cargo booking or
`RouteSpecification` behavior.

The UI must nevertheless prevent a null submission because the operation
requires a concrete replacement deadline.

**Recommendation:** Require a date value in the JSF form and display a normal
Faces validation message when it is absent. Do not add a new minimum-date,
future-date, or itinerary-date business rule. Continue to rely on the existing
domain model for its established invariants.

**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.

### 3.9 — How will the feature be tested on the prepared historical baseline?

**Question:** Which automated and runtime tests are mandatory, given that the
historical JUnit/Arquillian suite is configured for a remote Payara 4
container, while the prepared production baseline runs on JDK 17/Open Liberty?

The starting POM deliberately leaves `skipTests=true`. The Open Liberty profile
builds and compiles all test sources but does not provide a Liberty Arquillian
adapter. Modernizing the entire integration-test runtime is outside this
feature's scope.

The feature still needs layered evidence:

1. Extend `BookingServiceTest` with the domain/application assertions that
   specify the deadline mutation.
2. Ensure all test sources compile as part of
   `./mvnw clean package -Popenliberty`.
3. Add focused JUnit tests for facade and backing-bean delegation where they
   can run without a container, using hand-written fakes rather than adding a
   mocking framework.
4. Perform mandatory end-to-end verification against the running Open Liberty
   application.
5. Preserve the existing Payara Arquillian test path; do not delete, disable,
   or rewrite it to manufacture a passing result.

**Spike needed:** Before Issue 1 implementation, run the starting commit's
standard Open Liberty package command and record whether tests are compiled but
skipped. Confirm the new `BookingServiceTest` method can be added without
expanding the runtime modernization scope.

**Recommendation:** Treat the JDK 17/Open Liberty build plus HTTP/UI acceptance
as the mandatory executable gate. Keep the historical Arquillian test as a
precise application-layer specification and run it only when its documented
Payara environment is available.

**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---

## Phase 4 — Implementation (five serial issues)

Implement these issues in order. Each issue should be a separate commit. Do not
start an issue until the previous issue's gating criteria are satisfied.

### 4.1 — Issue 1: Add the application-layer deadline change operation

**What to build**

Add the core use case to the application layer. This issue must contain no JSF
or PrimeFaces changes.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`
- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

**Required API**

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

**Required implementation behavior**

1. Load the cargo using `cargoRepository.find(trackingId)`.
2. Obtain the current destination from
   `cargo.getRouteSpecification().getDestination()`.
3. Construct a replacement `RouteSpecification` from:
   - `cargo.getOrigin()`;
   - the current destination;
   - the new deadline.
4. Apply it using `cargo.specifyNewRoute(routeSpecification)`.
5. Persist using `cargoRepository.store(cargo)`.
6. Log the tracking ID and new deadline at `Level.INFO`, following the style of
   `changeDestination(...)`.

Do not:

- add a setter to `Cargo` or `RouteSpecification`;
- modify the origin or destination;
- clear or replace the itinerary directly;
- update persistence entities behind the aggregate's back.

**Tests to write first**

Append a sequential `testChangeDeadline()` case to `BookingServiceTest` after
`testChangeDestination()`. Build a new deadline one month after the test's
original `deadline`, invoke the service, reload the cargo with
`Cargo.findByTrackingId`, and assert:

- origin remains Chicago;
- destination remains Helsinki;
- stored deadline is the same calendar day as the requested new deadline;
- assigned itinerary remains unchanged;
- transport status remains `NOT_RECEIVED`;
- last known location remains `Location.UNKNOWN`;
- current voyage remains `Voyage.NONE`;
- cargo is not marked misdirected;
- estimated time of arrival is `Delivery.ETA_UNKOWN`;
- next expected activity is `Delivery.NO_ACTIVITY`;
- cargo is not unloaded at destination;
- routing status reflects the domain model's recalculation and remains
  `MISROUTED` for the established test sequence.

**Gating criteria**

- The test source compiles.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- No web, facade, REST, Liberty, or persistence configuration files change in
  this issue.

### 4.2 — Issue 2: Expose deadline changes through the booking facade

**What to build**

Expose the use case to presentation clients without leaking domain identifier
types into the web layer.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`

**Optional focused test file**

- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`

**Required API**

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

**Required implementation**

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

The facade must not:

- load and mutate `Cargo` itself;
- call `CargoRepository.store(...)`;
- parse a formatted date;
- introduce JSF or PrimeFaces types.

**Tests**

Where a container-free test is added, use a hand-written `BookingService` fake
or spy and prove that:

- the same `Date` object/value reaches the application service;
- the tracking-ID string is converted to an equivalent `TrackingId`;
- the facade delegates exactly once;
- no repository work is duplicated in the facade.

Do not add Mockito or another dependency solely for this test.

**Gating criteria**

- Existing facade consumers still compile.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- The application-layer test added in Issue 1 remains unchanged and compiling.

### 4.3 — Issue 3: Implement the deadline editor backing model

**What to build**

Add the view-scoped backing bean that loads a cargo's current deadline and
````

</details>


---

<sub>35s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 621-900)

<details>
<summary>205 lines</summary>

````
submits a replacement deadline through the booking facade. Do not add the
dialog launcher or XHTML in this issue.

**File to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`

**Required bean shape**

```java
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;
}
```

Required properties and methods:

- `getTrackingId()` / `setTrackingId(String)`
- `getCargo()`
- `getArrivalDeadlineDate()` / `setArrivalDeadlineDate(Date)`
- `load()`
- `changeArrivalDeadline()`

**Load behavior**

1. Call `bookingServiceFacade.loadCargoForRouting(trackingId)`.
2. Store the returned `CargoRoute`.
3. Parse `cargo.getArrivalDeadlineDate()` using `MM/dd/yyyy`.
4. Store the resulting `Date` in `arrivalDeadlineDate`.
5. Do not query a repository or domain object directly.
6. Do not ignore a parsing failure or merely print its stack trace. Surface a
   clear application/view error consistent with existing JSF behavior.

**Submit behavior**

1. Refuse a null date through JSF validation or explicit bean validation.
2. Call
   `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`.
3. Close the dynamic dialog with:

   ```java
   PrimeFaces.current().dialog().closeDynamic("DONE");
   ```

4. Do not close the dialog if the facade call fails.

**Tests to write**

Add a container-free JUnit test if practical, using a hand-written fake facade,
that proves:

- `load()` requests the correct tracking ID;
- `load()` converts an `MM/dd/yyyy` DTO date into the editable `Date`;
- `changeArrivalDeadline()` delegates the selected date and tracking ID;
- a malformed DTO deadline is surfaced rather than converted to null;
- a null selected date is rejected.

Do not add a mocking framework solely for these tests.

**Gating criteria**

- The bean is serializable and uses the established CDI/JSF annotations.
- The bean references only facade DTOs, not domain model classes.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.

### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog

**What to build**

Add the session-scoped dialog launcher and the dynamic dialog view. The dialog
must work when addressed directly with a `trackingId` query parameter, but it
is not yet linked from the dashboard in this issue.

**Files to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`

**Launcher requirements**

Use:

```java
@ManagedBean(name = "changeArrivalDeadlineDateDialog")
@SessionScoped
```

Implement:

- `showDialog(String trackingId)`
- `handleReturn(SelectEvent event)`
- `cancel()`

`showDialog(...)` must:

- set the options documented in Question 3.7;
- pass `trackingId` as a dynamic-dialog request parameter;
- open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`.

`cancel()` must close the dialog without invoking the facade.

**XHTML requirements**

The page title must be:

```xhtml
<title>Change Deadline</title>
```

Place metadata directly beneath the root `<html>` element and before
`<h:head>`:

```xhtml
<f:metadata>
    <f:viewParam name="trackingId"
                 value="#{changeArrivalDeadlineDate.trackingId}"/>
    <f:viewAction action="#{changeArrivalDeadlineDate.load}"/>
</f:metadata>
```

The form must display:

- `Origin:` and `changeArrivalDeadlineDate.cargo.originName`;
- `Destination:` and
  `changeArrivalDeadlineDate.cargo.finalDestinationName`;
- `Deadline:` and a `p:datePicker` bound to
  `changeArrivalDeadlineDate.arrivalDeadlineDate`;
- **Cancel**, invoking
  `changeArrivalDeadlineDateDialog.cancel()`;
- **Update**, invoking
  `changeArrivalDeadlineDate.changeArrivalDeadline()`.

The date picker must require a value. The Update action must reload or refresh
the calling Administration view after a successful dialog close, following the
existing destination-dialog behavior.

**Runtime tests**

With the application running, request:

```text
http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789
```

Verify:

- HTTP 200;
- title is **Change Deadline**;
- origin and destination render;
- the existing deadline is selected;
- no `TagException`, `Parent UIComponent`, `FacesException`, or server error is
  present;
- Cancel does not change the persisted deadline;
- Update changes the deadline.

**Gating criteria**

- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
- Direct dialog loading and both actions work.
- Destination editing continues to work.
- Stop Liberty cleanly before completing the issue.

### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard

**What to build**

Replace the plain deadline text in the Not Routed Cargo table with the
PrimeFaces command-link affordance that opens the completed dialog and refreshes
the table after return.

**File to modify**

- `src/main/webapp/admin/tables/listNotRouted.xhtml`

**Required UI shape**

Within the existing Deadline column, add a `p:commandLink` that:

- calls
  `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;
- retains the displayed
  `cargoNotRouted.arrivalDeadlineDate`;
- adds the existing Font Awesome edit icon style;
- uses a stable component ID such as `arrivalDeadlineToUpdate`;
- listens for `dialogReturn`;
- invokes
  `changeArrivalDeadlineDateDialog.handleReturn`;
- updates `tableNotRouted`;
- provides the tooltip:
  `Click to change cargo arrival deadline date.`

Follow the adjacent Destination column's established structure and styling. Do
not alter tracking-ID routing or destination editing.

**End-to-end acceptance test**

1. Start from a clean build on JDK 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Confirm the home page returns HTTP 200.
3. Open Administration and locate `DEF789`.
4. Record the original deadline.
5. Confirm the deadline now has an edit icon and tooltip.
6. Open the deadline dialog.
7. Confirm origin and destination identify the same cargo.
8. Choose a visibly different date.
9. Press **Update**.
10. Confirm the dialog closes and the Not Routed Cargo table refreshes.
11. Confirm the table shows the selected date.
12. Reload the browser and confirm the selected date remains.
13. Reopen the dialog and confirm the editor initializes to the changed date.
14. Press **Cancel** and confirm no additional change occurs.
15. Verify the Destination edit dialog still opens.
16. Verify selecting `DEF789` for routing still loads without an error page.

**Log acceptance**

The final run must contain none of:

- `<f:metadata> Parent UIComponent`;
- `TagException`;
- `VerifyError`;
- `FacesException`;
- `CWWKZ0002E` or `CWWKZ0003E`;
- recurring batch authorization failures;
- new FFDC files attributable to this feature.

Transient JMS activation-order warnings are acceptable only if all message
endpoints subsequently activate, as established by the prepared baseline.

**Final regression and scope checks**

- `./mvnw clean package -Popenliberty` succeeds.
- The existing test sources and the new deadline test compile.
- No Java EE namespace migration occurred.
- No Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST
  compatibility fix from the starting commit was reverted.
- The feature affects only the intended application, facade, web, dialog,
  table, and test surfaces.
- Stop Liberty cleanly.

---

## Phase 5 — Documentation and implementation handoff

- Update `README.md` only if user-facing Administration capabilities are
  enumerated there; add one concise sentence that administrators can change an
  unrouted cargo's arrival deadline.
- Record the exact JDK 17 run command in the final issue or pull-request
  description:

  ```bash
  ./mvnw clean package -Popenliberty liberty:run
  ```

- Include `DEF789` and the before/after deadline values in the acceptance
  evidence.
- State explicitly that data is in-memory and resets when the application is
  rebuilt/restarted.

---

## Cross-cutting concerns

| Concern | Required handling |
|---------|--------------------|
| Domain-driven design | Mutate the aggregate through `Cargo.specifyNewRoute(...)`; do not bypass it with persistence-level field updates. |
| Layering | Web bean → booking facade → booking service → cargo repository. |
````

</details>


---

<sub>35s</sub>

### `rg`

**^#{1,6} |Resolution:**

"^#{1,6} |Resolution:" (1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md)

<details>
<summary>37 matches</summary>

```
[grep content: 35 matches across 1 file(s) under 1-arrival-deadline-control-remove-before-merge]

add-change-arrival-deadline-feature-ignorance-reduction-plan.md (35 match(es)):
  1: # Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)
  22: ## Goal
  35: ### User-visible acceptance behavior
  62: ### Domain acceptance behavior
  77: ### Hard scope constraints
  95: ## Completed phases
  97: ### Phase 1 ✅ — Establish a runnable feature-absent baseline
  109: ### Phase 2 ✅ — Verify the before and after user experience
  123: ## Phase 3 — Ignorance reduction: questions to answer before writing code
  129: ### 3.1 — Which cargos expose the edit operation?
  155: **Resolution:**
  162: ### 3.2 — What is the exact domain mutation?
  201: **Resolution:**
  211: ### 3.3 — What should happen to an existing itinerary and delivery state?
  237: **Resolution:**
  245: ### 3.4 — What type crosses the facade boundary?
  273: **Resolution:**
  281: ### 3.5 — How is the DTO's formatted deadline converted for editing?
  311: **Resolution:**
  321: ### 3.6 — Which JSF bean scopes and interaction pattern should be used?
  351: **Resolution:**
  360: ### 3.7 — What is the dynamic-dialog contract?
  401: **Resolution:**
  412: ### 3.8 — What date validation is required?
  430: **Resolution:**
  438: ### 3.9 — How will the feature be tested on the prepared historical baseline?
  473: **Resolution:**
  488: ## Phase 4 — Implementation (five serial issues)
  493: ### 4.1 — Issue 1: Add the application-layer deadline change operation
  561: ### 4.2 — Issue 2: Expose deadline changes through the booking facade
  616: ### 4.3 — Issue 3: Implement the deadline editor backing model
  695: ### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog
  792: ### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard
  876: ## Phase 5 — Documentation and implementation handoff
  895: ## Cross-cutting concerns
```

</details>


---

<sub>35s</sub>

### `bash`

**Verify branch manifest and exact plan structure**

$ set -euo pipefail
printf '%s\n' '--- campaign manifest on branch ---'
git show 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json' | jq '.'
printf '%s\n' '--- campaign lessons exists ---'
git cat-file -e 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/campaign-lessons.md' && echo yes
printf '%s\n' '--- exact heading counts ---'
PLAN_CONTENT="$(git show 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md')"
printf 'questions=%s\n' "$(printf '%s\n' "$PLAN_CONTENT" | grep -Fxc '## Phase 3 — Ignorance reduction: questions to answer before writing code')"
printf 'implementation=%s\n' "$(printf '%s\n' "$PLAN_CONTENT" | grep -Fxc '## Phase 4 — Implementation (five serial issues)')"
printf 'direct_tasks=%s\n' "$(printf '%s\n' "$PLAN_CONTENT" | sed -n '/^## Phase 4 — Implementation (five serial issues)$/,$p' | grep -Ec '^### 4\.[0-9]+ — ')"

<details>
<summary>24 lines</summary>

```
--- campaign manifest on branch ---
{
  "schemaVersion": 1,
  "campaignId": "6bf3de9a-4edf-4c6a-8f79-122254ff6847",
  "campaignIssueNumber": 1,
  "campaignShortname": "arrival-deadline-control",
  "repository": "edburns/edburns-dd-3069621-cargotracker-linux-x64",
  "baseBranch": "experiment/shepherd-control",
  "lessonPropagation": "off",
  "campaignMetadataDirectory": "1-arrival-deadline-control-remove-before-merge",
  "lessonsFile": "campaign-lessons.md",
  "createdBy": {
    "shepherdTaskVersion": "1.0.5",
    "stageOutcomeProtocolVersion": 1
  },
  "createdAt": "2026-09-27T19:51:07Z"
}
--- campaign lessons exists ---
yes
--- exact heading counts ---
questions=1
implementation=1
direct_tasks=5
<shellId: 3 completed with exit code 0>
```

</details>


---

<sub>37s</sub>

### Copilot

All nine implementation questions have substantive resolutions, the five direct tasks match the expected count, and no child issues currently exist. The repository owner is a user account, so the children will be created **without an issue type**; I’m now persisting the five complete specifications and stage ledger files.

---

<sub>40s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh.**

/home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh

<details>
<summary>65 lines</summary>

```
#!/usr/bin/env bash
# shepherd-task-version: 1.0.5

set -euo pipefail

[[ $# -eq 3 ]] || {
    echo "Usage: $0 <body-directory> <expected-count> <off|campaign>" >&2
    exit 1
}

body_directory="$1"
expected_count="$2"
lesson_propagation="$3"

[[ -d "$body_directory" ]] || {
    echo "Stage-20 body directory does not exist: $body_directory" >&2
    exit 1
}
[[ "$expected_count" =~ ^[1-9][0-9]*$ ]] || {
    echo "Expected count must be a positive integer." >&2
    exit 1
}
[[ "$lesson_propagation" == "off" || "$lesson_propagation" == "campaign" ]] || {
    echo "Lesson propagation must be off or campaign." >&2
    exit 1
}

body_files=()
for body_file in "$body_directory"/*-body.md; do
    [[ -f "$body_file" ]] || continue
    [[ "$body_file" != *-observed-body.md ]] || continue
    body_files+=("$body_file")
done
[[ ${#body_files[@]} -eq $expected_count ]] || {
    echo "Expected $expected_count persisted stage-20 body files; found ${#body_files[@]}." >&2
    exit 1
}

required_headings=(
    '## Campaign context and required reading'
    '## Branch and execution order'
    '## Implement'
    '## Completion gates'
    '## Out of scope'
)

for body_file in "${body_files[@]}"; do
    [[ -s "$body_file" && "$(awk 'END { print NR }' "$body_file")" -gt 1 ]] || {
        echo "Persisted issue body must contain physical Markdown lines: $body_file" >&2
        exit 1
    }
    first_nonblank="$(awk 'NF { print; exit }' "$body_file")"
    [[ "$first_nonblank" =~ ^##[[:space:]]+[^[:space:]] ]] || {
        echo "Persisted issue body must begin with a level-two heading: $body_file" >&2
        exit 1
    }
    for heading in "${required_headings[@]}"; do
        grep -Fqx -- "$heading" "$body_file" || {
            echo "Persisted issue body is missing the physical heading '$heading': $body_file" >&2
            exit 1
        }
    done
    if [[ "$lesson_propagation" == "campaign" ]]; then
        grep -Fqx -- '## Campaign lessons (REQUIRED)' "$body_file" || {
            echo "Treatment issue body is missing its campaign-lessons heading: $body_file" >&2
            exit 1
        }
    elif grep -Fqx -- '## Campaign lessons (REQUIRED)' "$body_file"; then
        echo "Control issue body unexpectedly contains a campaign-lessons heading: $body_file" >&2
        exit 1
    fi
done
```

</details>


---

<sub>40s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh.**

/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh

<details>
<summary>30 lines</summary>

```
#!/usr/bin/env bash
# shepherd-task-version: 1.0.5

set -euo pipefail

if [[ $# -ne 3 ]]; then
    echo "Usage: $0 <PRE_CREATION_CHILDREN_JSON> <FINAL_CHILDREN_JSON> <CREATION_LEDGER_JSON>" >&2
    exit 2
fi

for command_name in jq; do
    command -v "$command_name" >/dev/null 2>&1 || {
        echo "Error: Required command '$command_name' was not found." >&2
        exit 1
    }
done

script_dir="$(cd "$(dirname "$0")" && pwd)"
filter_path="$script_dir/verify-stage20-child-links.jq"
[[ -f "$filter_path" ]] || {
    echo "Error: Stage-20 child-link verification filter was not found: $filter_path" >&2
    exit 1
}

for input_path in "$@"; do
    [[ -f "$input_path" ]] || {
        echo "Error: Stage-20 child-link verification input was not found: $input_path" >&2
        exit 1
    }
done

jq -n \
    --slurpfile baseline "$1" \
    --slurpfile final "$2" \
    --slurpfile ledger "$3" \
    -f "$filter_path"
```

</details>


---

<sub>40s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh.**

/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh

<details>
<summary>131 lines</summary>

```
#!/usr/bin/env bash
# shepherd-task-version: 1.0.5
set -euo pipefail

fail() {
    printf 'verify-github-issue-body: %s\n' "$*" >&2
    exit 1
}

[[ $# -ge 3 && $# -le 6 ]] ||
    fail "usage: $0 OWNER/REPO ISSUE_NUMBER EXPECTED_BODY_PATH [MAX_ATTEMPTS] [DELAY_SECONDS] [DIAGNOSTIC_PATH]"

repository="$1"
issue_number="$2"
expected_body_path="$3"
max_attempts="${4:-6}"
delay_seconds="${5:-5}"
diagnostic_path="${6:-}"
gh_command="${GH_COMMAND:-gh}"

[[ "$repository" =~ ^[A-Za-z0-9_.-]+/[A-Za-z0-9_.-]+$ ]] ||
    fail "invalid repository: $repository"
[[ "$issue_number" =~ ^[1-9][0-9]*$ ]] ||
    fail "invalid issue number: $issue_number"
[[ "$max_attempts" =~ ^[1-9][0-9]*$ ]] ||
    fail "MAX_ATTEMPTS must be a positive integer"
[[ "$delay_seconds" =~ ^[0-9]+$ ]] ||
    fail "DELAY_SECONDS must be a non-negative integer"
[[ -f "$expected_body_path" ]] ||
    fail "expected issue body file not found: $expected_body_path"

temp_directory="$(mktemp -d)"
trap 'rm -rf "$temp_directory"' EXIT
response_path="$temp_directory/response.json"
actual_path="$temp_directory/actual.txt"
actual_normalized="$temp_directory/actual-normalized.txt"
expected_normalized="$temp_directory/expected-normalized.txt"

normalize_file() {
    jq -b -Rsj 'gsub("\r\n|\r"; "\n")' "$1" >"$2"
}

equivalent_files() {
    local actual="$1"
    local expected="$2"
    local candidate="$temp_directory/candidate.txt"

    cmp -s -- "$actual" "$expected" && return 0
    cp "$actual" "$candidate"
    printf '\n' >>"$candidate"
    cmp -s -- "$candidate" "$expected" && return 0
    cp "$expected" "$candidate"
    printf '\n' >>"$candidate"
    cmp -s -- "$actual" "$candidate"
}

sha256_file() {
    if command -v sha256sum >/dev/null 2>&1; then
        sha256sum "$1" | awk '{print $1}'
    else
        shasum -a 256 "$1" | awk '{print $1}'
    fi
}

write_diagnostic() {
    local reason="$1"
    local attempts="$2"
    [[ -n "$diagnostic_path" ]] || return 0

    mkdir -p "$(dirname "$diagnostic_path")"
    local expected_length actual_length expected_hash actual_hash first_offset
    expected_length="$(wc -c <"$expected_normalized" | tr -d ' ')"
    actual_length="$(wc -c <"$actual_normalized" | tr -d ' ')"
    expected_hash="$(sha256_file "$expected_normalized")"
    actual_hash="$(sha256_file "$actual_normalized")"
    first_offset="$( (cmp -l -- "$actual_normalized" "$expected_normalized" 2>/dev/null || true) | awk 'NR == 1 { print $1 - 1 }')"
    [[ -n "$first_offset" ]] || first_offset="null"

    jq -n \
        --arg repository "$repository" \
        --argjson issueNumber "$issue_number" \
        --arg endpoint "repos/$repository/issues/$issue_number" \
        --argjson attempts "$attempts" \
        --arg observedAt "$(date -u +%Y-%m-%dT%H:%M:%SZ)" \
        --arg reason "$reason" \
        --argjson expectedLength "$expected_length" \
        --argjson actualLength "$actual_length" \
        --arg expectedSha256 "$expected_hash" \
        --arg actualSha256 "$actual_hash" \
        --argjson firstDifferenceOffset "$first_offset" \
        '{
            schemaVersion: 1,
            repository: $repository,
            issueNumber: $issueNumber,
            endpoint: $endpoint,
            attempts: $attempts,
            observedAt: $observedAt,
            reason: $reason,
            expectedLength: $expectedLength,
            actualLength: $actualLength,
            expectedSha256: $expectedSha256,
            actualSha256: $actualSha256,
            firstDifferenceOffset: $firstDifferenceOffset
        }' >"$diagnostic_path"
}

normalize_file "$expected_body_path" "$expected_normalized"
last_reason=""

for ((attempt = 1; attempt <= max_attempts; attempt++)); do
    set +e
    "$gh_command" api "repos/$repository/issues/$issue_number" >"$response_path" 2>"$temp_directory/error.txt"
    exit_code=$?
    set -e

    if [[ $exit_code -ne 0 ]]; then
        last_reason="GitHub REST request failed with exit code $exit_code."
        error_message="$(cat "$temp_directory/error.txt")"
        authentication_error_pattern='HTTP[[:space:]]+(401|403)|[Aa]uthentication|[Nn][Oo][Tt][[:space:]]authorized|[Rr]esource[[:space:]]not[[:space:]]accessible'
        if [[ "$error_message" =~ $authentication_error_pattern ]]; then
            : >"$actual_normalized"
            write_diagnostic "$last_reason" "$attempt"
            fail "unable to fetch issue #$issue_number from $repository: $error_message"
        fi
    elif ! jq -e 'type == "object" and has("body")' "$response_path" >/dev/null 2>&1; then
        last_reason="GitHub REST response was invalid JSON."
    else
        jq -b -j '.body // ""' "$response_path" >"$actual_path"
        normalize_file "$actual_path" "$actual_normalized"
        if equivalent_files "$actual_normalized" "$expected_normalized"; then
            cat "$response_path"
            exit 0
        fi
        last_reason="GitHub issue body differs from the persisted draft."
    fi

    if [[ $attempt -lt $max_attempts ]]; then
        printf 'verify-github-issue-body: %s Retrying issue #%s body verification (%s/%s).\n' \
            "$last_reason" "$issue_number" "$attempt" "$max_attempts" >&2
        ((delay_seconds > 0)) && sleep "$delay_seconds"
    fi
done

[[ -f "$actual_normalized" ]] || : >"$actual_normalized"
write_diagnostic "$last_reason" "$max_attempts"
diagnostic_suffix=""
[[ -z "$diagnostic_path" ]] || diagnostic_suffix=" Diagnostic: $diagnostic_path"
fail "issue #$issue_number body verification failed after $max_attempts attempts. $last_reason$diagnostic_suffix"
```

</details>


---

<sub>40s</sub>

### `view`

**view the file at /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 895-980)

<details>
<summary>14 lines</summary>

```
## Cross-cutting concerns

| Concern | Required handling |
|---------|--------------------|
| Domain-driven design | Mutate the aggregate through `Cargo.specifyNewRoute(...)`; do not bypass it with persistence-level field updates. |
| Layering | Web bean → booking facade → booking service → cargo repository. |
| Date handling | Use `java.util.Date` at service/facade boundaries and `MM/dd/yyyy` for the date-only editor representation. |
| Time zones | Acceptance compares the calendar date displayed by the application; do not introduce a new timezone policy in this feature. |
| Error handling | Do not silently swallow parse, lookup, validation, or persistence failures. A failed update must not look successful. |
| JSF compatibility | Keep `<f:metadata>` at view-root scope for MyFaces. |
| Bean lifecycle | Editor is CDI `@ViewScoped`; dynamic-dialog launcher mirrors the existing session-scoped JSF managed bean. |
| Accessibility | Preserve visible labels; the date editor must have an associated label and validation feedback. |
| Backward compatibility | Existing destination editing, routing, tracking, REST, messaging, batch, and startup behavior must remain intact. |
| Test discipline | Add tests before production code where practical; every issue must preserve all prior gates. |
| Experiment integrity | Implement from this specification starting at `9b9f311b2a3a2854bdac947593950d9edb6bca7d`; do not cherry-pick or inspect feature-bearing commits. |
```

</details>


---

<sub>1m 33s</sub>

### `apply_patch`

<details>
<summary>Arguments</summary>

````json
"*** Begin Patch\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/01-4-1-body.md\n+## Campaign context and required reading\n+\n+**On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.**\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`, especially `### Domain acceptance behavior` and `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.3 — What should happen to an existing itinerary and delivery state?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.1 — Issue 1: Add the application-layer deadline change operation`\n+- `## Cross-cutting concerns`\n+\n+The resolved design is to replace the cargo's `RouteSpecification` through `Cargo.specifyNewRoute(...)`, preserving origin, destination, and itinerary, and then persist through `CargoRepository.store(...)`. Do not add mutable deadline setters. The aggregate recalculates delivery and routing state; in the established sequential test, the itinerary is unchanged and routing remains `MISROUTED`.\n+\n+Research established that the Open Liberty build compiles the historical Arquillian test sources but retains `skipTests=true`; executing that suite still requires its remote Payara environment. Treat the Arquillian test as an exact application-layer specification. Do not modernize its runtime or add a mocking dependency.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` from remote `origin` as the base branch. This is task 1 of 5. The tasks are assigned, completed, and merged serially in plan order. Do not start until this issue is assigned; later tasks must not start until this task's gates pass and its PR is merged to the base branch.\n+\n+Preserve Java EE 7, `javax.*`, Java 7 source/target compatibility, JDK 17 execution, Open Liberty, and the prepared historical baseline.\n+\n+## Implement\n+\n+Add the application-layer deadline-change use case, with no facade or web-layer changes:\n+\n+- Add `void changeDeadline(TrackingId trackingId, Date deadline)` to `src/main/java/org/eclipse/cargotracker/application/BookingService.java`.\n+- Implement it in `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`.\n+- Load with `cargoRepository.find(trackingId)`.\n+- Read the current destination from `cargo.getRouteSpecification().getDestination()`.\n+- Construct a replacement `RouteSpecification` from `cargo.getOrigin()`, that current destination, and the supplied deadline.\n+- Apply it with `cargo.specifyNewRoute(routeSpecification)`.\n+- Persist with `cargoRepository.store(cargo)`.\n+- Log the tracking ID and new deadline at `Level.INFO`, matching `changeDestination(...)` style.\n+\n+Write the test first in `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`. Append sequential `testChangeDeadline()` after `testChangeDestination()`. Advance the original deadline by one month, invoke the service, reload through `Cargo.findByTrackingId`, and prove:\n+\n+- origin remains Chicago and destination remains Helsinki;\n+- the stored deadline is the same calendar day as requested;\n+- the assigned itinerary is unchanged;\n+- transport status is `NOT_RECEIVED`;\n+- last known location is `Location.UNKNOWN`;\n+- current voyage is `Voyage.NONE`;\n+- the cargo is not misdirected and is not unloaded at destination;\n+- ETA is `Delivery.ETA_UNKOWN`;\n+- next expected activity is `Delivery.NO_ACTIVITY`;\n+- routing status remains `MISROUTED`.\n+\n+Date handling must continue to use `java.util.Date`; do not introduce a timezone policy. The administrative UI will ultimately require a non-null date but no new chronological policy: no requirement that the replacement be after today, the old deadline, or itinerary legs.\n+\n+## Completion gates\n+\n+- The new test source compiles in its established sequence and asserts every preserved/recalculated field above.\n+- With `JAVA_HOME=/usr/lib/jvm/msopenjdk-17-amd64`, `./mvnw clean package -Popenliberty` succeeds.\n+- Existing application behavior and prior test sources remain compiling.\n+- The diff is limited to the application service interface, its implementation, and `BookingServiceTest`.\n+- Failures in lookup, domain mutation, or persistence remain explicit; no success-shaped fallback is added.\n+\n+## Out of scope\n+\n+- No JSF, PrimeFaces, XHTML, facade, REST, persistence mapping, Derby, Liberty, or dependency changes.\n+- No itinerary clearing, rerouting, direct persistence-field update, or domain deadline setter.\n+- No Payara/Arquillian modernization and no Mockito or other new test framework.\n+- Do not inspect or copy feature-bearing commits or spike source code.\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/02-4-2-body.md\n+## Campaign context and required reading\n+\n+**On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.**\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`, especially the layered architecture and `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.2 — Issue 2: Expose deadline changes through the booking facade`\n+- `## Cross-cutting concerns`\n+\n+The resolved facade contract is `void changeDeadline(String trackingId, Date arrivalDeadline)`. The facade converts only the identifier to `new TrackingId(trackingId)` and passes the same `Date` to the application service. It must not expose domain types, introduce a command DTO, parse a formatted date, or duplicate aggregate/repository work.\n+\n+Research established that the mandatory JDK 17/Open Liberty build compiles tests while the historical Arquillian runtime remains skipped unless its remote Payara environment is supplied. Preserve that setup; no runtime modernization or mocking dependency belongs here.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` from remote `origin` as the base branch. This is task 2 of 5. The tasks are assigned, completed, and merged serially in plan order. Do not start until this issue is assigned and task 1 is merged to the base branch.\n+\n+Build on the application-layer `changeDeadline(TrackingId, Date)` operation delivered by task 1; do not rework it.\n+\n+## Implement\n+\n+Expose the operation through the booking facade:\n+\n+- Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`.\n+- Implement it in `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java` as a single delegation:\n+\n+```java\n+bookingService.changeDeadline(\n+        new TrackingId(trackingId),\n+        arrivalDeadline);\n+```\n+\n+If practical within the repository's existing test style, add `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java` with a hand-written `BookingService` fake or spy. Prove that:\n+\n+- the string becomes an equivalent `TrackingId`;\n+- the exact same `Date` object/value reaches the application service;\n+- delegation occurs exactly once;\n+- no repository or aggregate mutation is duplicated in the facade.\n+\n+Keep all public boundary types consistent with the historical application: `String` for the tracking ID and `java.util.Date` for the deadline. The presentation layer must remain shielded from `TrackingId`, `Cargo`, and `RouteSpecification`.\n+\n+## Completion gates\n+\n+- Existing facade consumers compile unchanged.\n+- With `JAVA_HOME=/usr/lib/jvm/msopenjdk-17-amd64`, `./mvnw clean package -Popenliberty` succeeds.\n+- The task 1 application-layer test remains unchanged and compiling.\n+- Any focused facade test uses only existing test dependencies and verifies exact single delegation.\n+- The diff is limited to the facade API, facade implementation, and an optional focused facade test.\n+\n+## Out of scope\n+\n+- No JSF/PrimeFaces types, backing beans, XHTML, dialogs, or dashboard integration.\n+- No formatted-date parsing and no new DTO.\n+- No direct cargo lookup, `Cargo` mutation, or `CargoRepository.store(...)` call in the facade.\n+- No changes to the task 1 application operation or test.\n+- No dependency, Payara/Arquillian, Liberty, persistence, REST, messaging, or batch changes.\n+- Do not inspect or copy feature-bearing commits or spike source code.\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/03-4-3-body.md\n+## Campaign context and required reading\n+\n+**On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.**\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`, including `### User-visible acceptance behavior` and `### Hard scope constraints`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.3 — Issue 3: Implement the deadline editor backing model`\n+- `## Cross-cutting concerns`\n+\n+The resolved editor design is a serializable CDI `@Named @ViewScoped` bean. It loads only through `BookingServiceFacade`, parses the DTO's `MM/dd/yyyy` date using a per-load formatter, and submits `String` plus `java.util.Date` to the facade. Do not introduce a shared mutable `SimpleDateFormat`, a new DTO, or direct domain/repository access.\n+\n+Research established that parsing the leading date portion exposed by `CargoRoute` produces the same calendar date displayed by `getArrivalDeadlineDate()`. Parse failure must be surfaced explicitly rather than becoming a null date. The only new validation rule is non-null selection; do not invent a future-date or itinerary chronology rule.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` from remote `origin` as the base branch. This is task 3 of 5. The tasks are assigned, completed, and merged serially in plan order. Do not start until this issue is assigned and tasks 1 and 2 are merged to the base branch.\n+\n+Build on the facade operation from task 2. Do not add the dialog launcher or XHTML yet.\n+\n+## Implement\n+\n+Create `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java` with this established shape:\n+\n+```java\n+@Named\n+@ViewScoped\n+public class ChangeArrivalDeadlineDate implements Serializable {\n+    private static final long serialVersionUID = 1L;\n+\n+    private String trackingId;\n+    private CargoRoute cargo;\n+    private Date arrivalDeadlineDate;\n+\n+    @Inject\n+    private BookingServiceFacade bookingServiceFacade;\n+}\n+```\n+\n+Provide:\n+\n+- `getTrackingId()` and `setTrackingId(String)`;\n+- `getCargo()`;\n+- `getArrivalDeadlineDate()` and `setArrivalDeadlineDate(Date)`;\n+- `load()`;\n+- `changeArrivalDeadline()`.\n+\n+`load()` must call `bookingServiceFacade.loadCargoForRouting(trackingId)`, retain the returned `CargoRoute`, parse its `getArrivalDeadlineDate()` representation with a new `SimpleDateFormat(\"MM/dd/yyyy\")` for that load, and retain the resulting `Date`. Keep conversion in the view bean and surface malformed data as a clear application/view error consistent with existing JSF behavior; do not swallow or print-and-ignore it.\n+\n+`changeArrivalDeadline()` must reject null, invoke `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`, and only after successful return call `PrimeFaces.current().dialog().closeDynamic(\"DONE\")`. A facade failure must leave the dialog open and remain observable.\n+\n+Add a container-free JUnit test if practical, using a hand-written facade fake, that covers:\n+\n+- the correct tracking ID passed by `load()`;\n+- exact `MM/dd/yyyy` conversion into the editable `Date`;\n+- submission of the selected date and ID;\n+- malformed DTO date surfaces an error instead of null;\n+- null selection is rejected;\n+- the update path does not report success when delegation fails.\n+\n+## Completion gates\n+\n+- The bean is serializable and uses the repository's established CDI `@Named` and JSF `@ViewScoped` annotations.\n+- The bean depends only on the facade and facade DTOs, never domain model or repository classes.\n+- Date parsing uses a non-shared formatter and explicit failure handling.\n+- With `JAVA_HOME=/usr/lib/jvm/msopenjdk-17-amd64`, `./mvnw clean package -Popenliberty` succeeds.\n+- Prior application and facade gates remain intact.\n+\n+## Out of scope\n+\n+- No dialog launcher, XHTML, table command link, or dashboard integration.\n+- No direct `Cargo`, `TrackingId`, `RouteSpecification`, or repository use.\n+- No new date policy beyond non-null; no timezone redesign.\n+- No shared formatter, new DTO, mocking dependency, runtime modernization, or infrastructure/configuration changes.\n+- Do not inspect or copy feature-bearing commits or spike source code.\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/04-4-4-body.md\n+## Campaign context and required reading\n+\n+**On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.**\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`, especially `### User-visible acceptance behavior` and `### Hard scope constraints`\n+- `### Phase 2 ✅ — Verify the before and after user experience`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog`\n+- `## Cross-cutting concerns`\n+\n+The resolved interaction mirrors Change Destination: a serializable session-scoped JSF managed launcher opens a PrimeFaces dynamic dialog backed by the task 3 CDI view-scoped editor. Research on the prepared MyFaces/Open Liberty baseline established that `<f:metadata>` must be a direct child of the root `<html>` before `<h:head>` and `<h:body>`; placing it in the body causes the known `UIViewRoot` failure.\n+\n+The fixed dialog contract is one `trackingId` request parameter; modal and draggable `true`; resizable `false`; content width `410`; content height `280`; success result `\"DONE\"`; cancellation result `\"\"`.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` from remote `origin` as the base branch. This is task 4 of 5. The tasks are assigned, completed, and merged serially in plan order. Do not start until this issue is assigned and tasks 1 through 3 are merged to the base branch.\n+\n+The dashboard link is task 5. This task must make the dialog work when opened directly.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`\n+- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`\n+\n+The launcher must be serializable and use:\n+\n+```java\n+@ManagedBean(name = \"changeArrivalDeadlineDateDialog\")\n+@SessionScoped\n+```\n+\n+Implement `showDialog(String trackingId)`, `handleReturn(SelectEvent event)`, and `cancel()`. `showDialog(...)` must pass `trackingId` as `Map<String, List<String>>`, set the exact options above, and open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`. `cancel()` closes with the empty string and must not invoke the facade. Preserve the destination-dialog lifecycle and compatibility patterns.\n+\n+The XHTML title is `Change Deadline`. Put this metadata directly beneath `<html>` and before `<h:head>`:\n+\n+```xhtml\n+<f:metadata>\n+    <f:viewParam name=\"trackingId\"\n+                 value=\"#{changeArrivalDeadlineDate.trackingId}\"/>\n+    <f:viewAction action=\"#{changeArrivalDeadlineDate.load}\"/>\n+</f:metadata>\n+```\n+\n+The form must visibly label and render:\n+\n+- origin from `changeArrivalDeadlineDate.cargo.originName`;\n+- destination from `changeArrivalDeadlineDate.cargo.finalDestinationName`;\n+- a required `p:datePicker` bound to `changeArrivalDeadlineDate.arrivalDeadlineDate`, with associated label and validation feedback;\n+- Cancel calling `changeArrivalDeadlineDateDialog.cancel()`;\n+- Update calling `changeArrivalDeadlineDate.changeArrivalDeadline()`.\n+\n+Successful Update must close with `\"DONE\"` and support refreshing the caller through the existing return-handler pattern. Cancellation must preserve the deadline.\n+\n+## Completion gates\n+\n+- With JDK 17, `./mvnw clean package -Popenliberty liberty:run` succeeds.\n+- A direct request to `/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789` returns HTTP 200.\n+- The title, origin, destination, and current selected deadline render correctly.\n+- Missing/null date produces normal validation feedback.\n+- Cancel does not change the persisted value; Update changes it and returns success.\n+- Logs contain no `TagException`, `Parent UIComponent`, `FacesException`, or new server error attributable to the feature.\n+- Existing Change Destination still works.\n+- Stop Liberty cleanly before completion.\n+\n+## Out of scope\n+\n+- Do not modify `listNotRouted.xhtml` or add the dashboard affordance yet.\n+- No new navigation page or inline editor.\n+- No facade/application/domain changes, date chronology rule, runtime modernization, dependency, Liberty, Derby, REST, messaging, or batch changes.\n+- Do not place `<f:metadata>` inside `<h:body>`.\n+- Do not inspect or copy feature-bearing commits or spike source code.\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/05-4-5-body.md\n+## Campaign context and required reading\n+\n+**On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.**\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`, including all `### User-visible acceptance behavior`, `### Domain acceptance behavior`, and `### Hard scope constraints`\n+- `### Phase 2 ✅ — Verify the before and after user experience`\n+- `### 3.1 — Which cargos expose the edit operation?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard`\n+- `## Phase 5 — Documentation and implementation handoff`\n+- `## Cross-cutting concerns`\n+\n+The resolved UI scope is only the Not Routed Cargo table. The application/facade remain generally callable, but do not add the affordance to routed, misrouted, claimed, details, or other tables. The resolved interaction is the existing PrimeFaces dynamic-dialog pattern: successful result `\"DONE\"`, `dialogReturn`, and refresh of `tableNotRouted`.\n+\n+Research on the prepared baseline established that `DEF789` is the stable acceptance cargo and that in-memory data persists only for the running sample application, resetting on rebuild/restart. The JDK 17/Open Liberty run plus HTTP and complete browser flow are mandatory; the historical Arquillian runtime remains outside scope.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` from remote `origin` as the base branch. This is task 5 of 5. The tasks are assigned, completed, and merged serially in plan order. Do not start until this issue is assigned and tasks 1 through 4 are merged to the base branch.\n+\n+Integrate the completed launcher/dialog without changing their established contracts.\n+\n+## Implement\n+\n+Modify only `src/main/webapp/admin/tables/listNotRouted.xhtml` for the feature integration. In the existing Deadline column, replace plain deadline text with a `p:commandLink` that:\n+\n+- calls `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;\n+- still displays `cargoNotRouted.arrivalDeadlineDate`;\n+- uses the neighboring Destination column's established structure, styling, and existing Font Awesome edit-icon style;\n+- has a stable ID such as `arrivalDeadlineToUpdate`;\n+- contains a `dialogReturn` listener invoking `changeArrivalDeadlineDateDialog.handleReturn`;\n+- updates `tableNotRouted`;\n+- exposes the exact tooltip `Click to change cargo arrival deadline date.`\n+\n+Do not change tracking-ID routing or destination editing.\n+\n+Run the complete `DEF789` acceptance flow from a clean JDK 17 Open Liberty start:\n+\n+1. Confirm home and Administration load successfully.\n+2. Record the original `DEF789` deadline.\n+3. Verify the edit icon and exact tooltip.\n+4. Open the dialog and verify origin/destination identify `DEF789`.\n+5. Choose a visibly different date and Update.\n+6. Verify close, table refresh, and the selected date.\n+7. Reload and verify the selected date remains.\n+8. Reopen and verify the editor initializes to that changed date.\n+9. Cancel and verify no additional change.\n+10. Verify Destination editing still opens.\n+11. Verify selecting `DEF789` for routing does not produce an error page.\n+\n+If README already enumerates Administration capabilities, add one concise sentence about changing an unrouted cargo's arrival deadline; otherwise do not broaden documentation scope. Record the exact command `./mvnw clean package -Popenliberty liberty:run`, `DEF789`, before/after values, and the in-memory reset behavior in final PR evidence.\n+\n+## Completion gates\n+\n+- `./mvnw clean package -Popenliberty` succeeds with JDK 17 and all test sources compile.\n+- The complete browser acceptance flow above passes.\n+- Final logs contain none of `<f:metadata> Parent UIComponent`, `TagException`, `VerifyError`, `FacesException`, `CWWKZ0002E`, `CWWKZ0003E`, recurring batch authorization failures, or feature-attributable new FFDC files.\n+- Transient JMS activation-order warnings are acceptable only when every endpoint subsequently activates, matching the prepared baseline.\n+- No Java EE namespace migration or regression to destination editing, routing, tracking, REST, messaging, batch, startup, Open Liberty, Derby, Jackson, or MyFaces compatibility.\n+- Stop Liberty cleanly.\n+\n+## Out of scope\n+\n+- No affordance outside `listNotRouted.xhtml`.\n+- No redesign of the completed application, facade, backing bean, launcher, or dialog contracts.\n+- No new chronological rule, timezone policy, runtime modernization, framework migration, dependency, persistence, or infrastructure change.\n+- Do not inspect or copy feature-bearing commits or spike source code.\n*** End Patch\n"
````

</details>

```
Added 5 file(s): /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/01-4-1-body.md, /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/02-4-2-body.md, /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/03-4-3-body.md, /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/04-4-4-body.md, /home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951/issue-bodies/05-4-5-body.md
```


---

<sub>1m 41s</sub>

### `bash`

**Validate all persisted issue drafts**

$ set -euo pipefail
LOG='/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951'
VALIDATOR='/home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh'
"$VALIDATOR" "$LOG/issue-bodies" 5 off
for f in "$LOG"/issue-bodies/*-body.md; do printf '%s  lines=%s  bytes=%s\n' "$(basename "$f")" "$(wc -l < "$f")" "$(wc -c < "$f")"; done

<details>
<summary>6 lines</summary>

```
01-4-1-body.md  lines=66  bytes=4907
02-4-2-body.md  lines=62  bytes=4037
03-4-3-body.md  lines=80  bytes=4728
04-4-4-body.md  lines=80  bytes=4792
05-4-5-body.md  lines=72  bytes=5139
<shellId: 4 completed with exit code 0>
```

</details>


---

<sub>1m 41s</sub>

### `bash`

**Print complete question resolution blocks**

$ python - <<'PY'
from pathlib import Path
p=Path('1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md')
lines=p.read_text().splitlines()
qstart=lines.index('## Phase 3 — Ignorance reduction: questions to answer before writing code')
qend=lines.index('## Phase 4 — Implementation (five serial issues)')
heads=[i for i in range(qstart+1,qend) if lines[i].startswith('### 3.')]
for n,start in enumerate(heads):
    end=heads[n+1] if n+1<len(heads) else qend
    marker=next((i for i in range(start,end) if 'Resolution:' in lines[i]),None)
    print(lines[start])
    if marker is None:
        print('NO RESOLUTION BLOCK')
    else:
        block='\n'.join(lines[marker:end]).strip().rstrip('-').rstrip()
        print(block)
    print('\n---')
PY

```
/bin/bash: line 1: python: command not found
<shellId: 5 completed with exit code 127>
```


---

<sub>1m 54s</sub>

### `bash`

**Review complete question resolution blocks**

$ set -euo pipefail
awk '
/^## Phase 3 — Ignorance reduction: questions to answer before writing code$/ {in_questions=1; next}
/^## Phase 4 — Implementation \(five serial issues\)$/ {exit}
in_questions && /^### 3\./ {if (seen) print "\n---"; print; seen=1; in_resolution=0; next}
in_questions && /Resolution:/ {in_resolution=1}
in_questions && in_resolution {print}
' '1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'

<details>
<summary>85 lines</summary>

```
### 3.1 — Which cargos expose the edit operation?
**Resolution:**

Select Option A. Expose the edit affordance only in
`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.


---
### 3.2 — What is the exact domain mutation?
**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.


---
### 3.3 — What should happen to an existing itinerary and delivery state?
**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.


---
### 3.4 — What type crosses the facade boundary?
**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.


---
### 3.5 — How is the DTO's formatted deadline converted for editing?
**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.


---
### 3.6 — Which JSF bean scopes and interaction pattern should be used?
**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.


---
### 3.7 — What is the dynamic-dialog contract?
**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.


---
### 3.8 — What date validation is required?
**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.


---
### 3.9 — How will the feature be tested on the prepared historical baseline?
**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---
<shellId: 6 completed with exit code 0>
```

</details>


---

<sub>1m 54s</sub>

### `sql`

**Advance drafting workflow**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Advance drafting workflow",
  "query": "UPDATE todos SET status='done', updated_at=CURRENT_TIMESTAMP WHERE id='validate-stage20'; UPDATE todos SET status='done', updated_at=CURRENT_TIMESTAMP WHERE id='draft-stage20'; UPDATE todos SET status='in_progress', updated_at=CURRENT_TIMESTAMP WHERE id='create-stage20'"
}
```

</details>

<details>
<summary>7 lines</summary>

```
Executed 3 statement(s):

1. UPDATE
   1 row(s) updated.

2. UPDATE
   1 row(s) updated.

3. UPDATE
   1 row(s) updated.
```

</details>


---

<sub>2m 0s</sub>

### Copilot

The persisted drafts passed the supplied validator. I’m beginning the one-shot GitHub mutation now: each issue will be created, body-verified, linked, and durably recorded before proceeding to the next.

---

<sub>2m 24s</sub>

### `bash`

**Create, verify, and link five ordered issues**

$ set -euo pipefail
REPO='edburns/edburns-dd-3069621-cargotracker-linux-x64'
PARENT=1
LOG='/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951'
BODY_VERIFIER='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh'
LEDGER="$LOG/creation-ledger.json"
RESULT="$LOG/stage-20-result.json"
PRE="$LOG/pre-creation-children.json"

atomic_write() {
  local path="$1" content="$2" tmp
  tmp="$(mktemp "$(dirname "$path")/.stage20.XXXXXX")"
  printf '%s\n' "$content" > "$tmp"
  mv "$tmp" "$path"
}

update_ledger_flag() {
  local number="$1" field="$2" value="$3" updated
  updated="$(
    jq \
      --argjson number "$number" \
      --arg field "$field" \
      --argjson value "$value" \
      'map(if .number == $number then .[$field] = $value else . end)' \
      "$LEDGER"
  )" || return 1
  atomic_write "$LEDGER" "$updated"
}

fail_stage() {
  local operation="$1" error="$2" pages flat reconciled failed
  set +e
  pages="$(gh api "repos/$REPO/issues/$PARENT/sub_issues" --paginate --slurp 2>&1)"
  query_status=$?
  if [ "$query_status" -eq 0 ]; then
    flat="$(printf '%s\n' "$pages" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end')"
    reconciled="$(jq --argjson children "$flat" 'map(.linked = ([ $children[].id ] | index(.id) != null))' "$LEDGER")"
    atomic_write "$LEDGER" "$reconciled"
  else
    error="$error; reconciliation query failed: $pages"
  fi
  failed="$(jq -n --arg error "$operation: $error" '{schemaVersion:1,status:"failed",ledgerFile:"creation-ledger.json",operationError:$error}')"
  atomic_write "$RESULT" "$failed"
  printf 'FAILED OPERATION: %s\nERROR: %s\n' "$operation" "$error" >&2
  jq -r '.[] | "#\(.number) | \(.title) | \(.url) | \(.bodyFile) | body_verified=\(.body_verified) | linked=\(.linked)"' "$LEDGER" >&2
  jq -r '.[] | "gh issue delete \(.number) --repo \"edburns/edburns-dd-3069621-cargotracker-linux-x64\" --yes"' "$LEDGER" >&2
  exit 1
}

# Persist the already normalized fixture baseline exactly once.
mv "$LOG/.pre-creation-children.tmp" "$PRE"
atomic_write "$LEDGER" '[]'
atomic_write "$RESULT" '{"schemaVersion":1,"status":"in_progress","ledgerFile":"creation-ledger.json","operationError":null}'

subsections=(
  '4.1 — Issue 1: Add the application-layer deadline change operation'
  '4.2 — Issue 2: Expose deadline changes through the booking facade'
  '4.3 — Issue 3: Implement the deadline editor backing model'
  '4.4 — Issue 4: Implement the PrimeFaces deadline dialog'
  '4.5 — Issue 5: Integrate deadline editing into the Administration dashboard'
)
titles=(
  '4.1 — Add the application-layer deadline change operation'
  '4.2 — Expose deadline changes through the booking facade'
  '4.3 — Implement the deadline editor backing model'
  '4.4 — Implement the PrimeFaces deadline dialog'
  '4.5 — Integrate deadline editing into the Administration dashboard'
)
bodies=(
  'issue-bodies/01-4-1-body.md'
  'issue-bodies/02-4-2-body.md'
  'issue-bodies/03-4-3-body.md'
  'issue-bodies/04-4-4-body.md'
  'issue-bodies/05-4-5-body.md'
)

for i in 0 1 2 3 4; do
  title="${titles[$i]}"
  subsection="${subsections[$i]}"
  relative_body="${bodies[$i]}"
  body="$LOG/$relative_body"
  if ! issue_json="$(gh api "repos/$REPO/issues" -X POST -f title="$title" -F "body=@$body" --jq '{id,number,node_id,html_url,title}')"; then
    fail_stage "create issue for $subsection" "GitHub issue creation failed"
  fi
  id="$(printf '%s\n' "$issue_json" | jq -r '.id')"
  number="$(printf '%s\n' "$issue_json" | jq -r '.number')"
  url="$(printf '%s\n' "$issue_json" | jq -r '.html_url')"
  entry="$(printf '%s\n' "$issue_json" | jq --arg subsection "$subsection" --arg body "$relative_body" '{implementationSubsection:$subsection,bodyFile:$body,id:.id,number:.number,title:.title,url:.html_url,body_verified:false,linked:false}')"
  updated="$(jq --argjson entry "$entry" '. + [$entry]' "$LEDGER")" || fail_stage "persist ledger for issue #$number" "Unable to append ledger entry"
  atomic_write "$LEDGER" "$updated"
  if ! observed="$("$BODY_VERIFIER" "$REPO" "$number" "$body" 6 5 "$LOG/issue-$number-body-verification-failure.json")"; then
    fail_stage "verify body for issue #$number" "Persisted draft did not match GitHub issue body"
  fi
  update_ledger_flag "$number" body_verified true || fail_stage "persist body verification for issue #$number" "Unable to update ledger"
  linked=false
  link_error=''
  for attempt in 1 2 3; do
    if printf '{"sub_issue_id": %s}\n' "$id" | gh api "repos/$REPO/issues/$PARENT/sub_issues" -X POST --input - >/dev/null; then
      linked=true
      break
    else
      link_error="link attempt $attempt failed"
      [ "$attempt" -eq 3 ] || sleep 2
    fi
  done
  [ "$linked" = true ] || fail_stage "link issue #$number to parent #$PARENT" "$link_error"
  update_ledger_flag "$number" linked true || fail_stage "persist link state for issue #$number" "Unable to update ledger"
  printf 'created and linked #%s: %s\n' "$number" "$title"
done

jq '.' "$LEDGER"

<details>
<summary>58 lines</summary>

```
created and linked #2: 4.1 — Add the application-layer deadline change operation
created and linked #3: 4.2 — Expose deadline changes through the booking facade
created and linked #4: 4.3 — Implement the deadline editor backing model
created and linked #5: 4.4 — Implement the PrimeFaces deadline dialog
created and linked #6: 4.5 — Integrate deadline editing into the Administration dashboard
[
  {
    "implementationSubsection": "4.1 — Issue 1: Add the application-layer deadline change operation",
    "bodyFile": "issue-bodies/01-4-1-body.md",
    "id": 5605766466,
    "number": 2,
    "title": "4.1 — Add the application-layer deadline change operation",
    "url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/2",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.2 — Issue 2: Expose deadline changes through the booking facade",
    "bodyFile": "issue-bodies/02-4-2-body.md",
    "id": 5605766718,
    "number": 3,
    "title": "4.2 — Expose deadline changes through the booking facade",
    "url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/3",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.3 — Issue 3: Implement the deadline editor backing model",
    "bodyFile": "issue-bodies/03-4-3-body.md",
    "id": 5605767023,
    "number": 4,
    "title": "4.3 — Implement the deadline editor backing model",
    "url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/4",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.4 — Issue 4: Implement the PrimeFaces deadline dialog",
    "bodyFile": "issue-bodies/04-4-4-body.md",
    "id": 5605767262,
    "number": 5,
    "title": "4.4 — Implement the PrimeFaces deadline dialog",
    "url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/5",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.5 — Issue 5: Integrate deadline editing into the Administration dashboard",
    "bodyFile": "issue-bodies/05-4-5-body.md",
    "id": 5605767742,
    "number": 6,
    "title": "4.5 — Integrate deadline editing into the Administration dashboard",
    "url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/6",
    "body_verified": true,
    "linked": true
  }
]
<shellId: 7 completed with exit code 0>
```

</details>


---

<sub>2m 31s</sub>

### Copilot

All five children were created and linked in order. I’m running the authoritative child-link verifier and final repeated body/state/assignee checks before marking the stage complete.

---

<sub>2m 42s</sub>

### `bash`

**Verify all final stage postconditions**

$ set -euo pipefail
REPO='edburns/edburns-dd-3069621-cargotracker-linux-x64'
PARENT=1
LOG='/home/edburns/workareas/edburns-dd-3069621-cargotracker-linux-x64-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260927-1951'
BODY_VERIFIER='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh'
LINK_VERIFIER='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh'
LEDGER="$LOG/creation-ledger.json"
RESULT="$LOG/stage-20-result.json"
PRE="$LOG/pre-creation-children.json"
FINAL="$LOG/final-children.json"

atomic_write() {
  local path="$1" content="$2" tmp
  tmp="$(mktemp "$(dirname "$path")/.stage20.XXXXXX")"
  printf '%s\n' "$content" > "$tmp"
  mv "$tmp" "$path"
}

fail_stage() {
  local operation="$1" error="$2" pages flat reconciled failed
  set +e
  pages="$(gh api "repos/$REPO/issues/$PARENT/sub_issues" --paginate --slurp 2>&1)"
  query_status=$?
  if [ "$query_status" -eq 0 ]; then
    flat="$(printf '%s\n' "$pages" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end')"
    reconciled="$(jq --argjson children "$flat" 'map(. as $entry | .linked = ([ $children[].id ] | index($entry.id) != null))' "$LEDGER")"
    atomic_write "$LEDGER" "$reconciled"
  else
    error="$error; reconciliation query failed: $pages"
  fi
  failed="$(jq -n --arg error "$operation: $error" '{schemaVersion:1,status:"failed",ledgerFile:"creation-ledger.json",operationError:$error}')"
  atomic_write "$RESULT" "$failed"
  printf 'FAILED OPERATION: %s\nERROR: %s\n' "$operation" "$error" >&2
  jq -r '.[] | "#\(.number) | \(.title) | \(.url) | \(.bodyFile) | body_verified=\(.body_verified) | linked=\(.linked)"' "$LEDGER" >&2
  jq -r '.[] | "gh issue delete \(.number) --repo \"edburns/edburns-dd-3069621-cargotracker-linux-x64\" --yes"' "$LEDGER" >&2
  exit 1
}

pages="$(gh api "repos/$REPO/issues/$PARENT/sub_issues" --paginate --slurp)" || fail_stage 'fetch final child snapshot' 'GitHub child query failed'
flat="$(printf '%s\n' "$pages" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end')" || fail_stage 'normalize final child snapshot' 'Unable to normalize paginated response'
atomic_write "$FINAL" "$flat"
if ! "$LINK_VERIFIER" "$PRE" "$FINAL" "$LEDGER"; then
  fail_stage 'verify final child links' 'Authoritative child-link verifier failed'
fi

while IFS=$'\t' read -r number body_file; do
  full_body="$LOG/$body_file"
  if ! issue_json="$("$BODY_VERIFIER" "$REPO" "$number" "$full_body" 6 5 "$LOG/issue-$number-final-body-verification-failure.json")"; then
    fail_stage "final body verification for issue #$number" 'Issue body differs from persisted specification'
  fi
  state="$(printf '%s\n' "$issue_json" | jq -r '.state')"
  assignees="$(printf '%s\n' "$issue_json" | jq '.assignees | length')"
  [ "$state" = open ] || fail_stage "verify state for issue #$number" "Expected open, observed $state"
  [ "$assignees" -eq 0 ] || fail_stage "verify assignees for issue #$number" "Expected none, observed $assignees"
done < <(jq -r '.[] | [.number,.bodyFile] | @tsv' "$LEDGER")

atomic_write "$RESULT" '{"schemaVersion":1,"status":"complete","ledgerFile":"creation-ledger.json","operationError":null}'
printf '%s\n' '--- stage result ---'
jq '.' "$RESULT"
printf '%s\n' '--- ordered final children ---'
jq '[.[] | {number,title,html_url}]' "$FINAL"

<details>
<summary>48 lines</summary>

```
{
  "baselineCount": 0,
  "ledgerCount": 5,
  "finalCount": 5,
  "newIssueIds": [
    5605766466,
    5605766718,
    5605767023,
    5605767262,
    5605767742
  ]
}
--- stage result ---
{
  "schemaVersion": 1,
  "status": "complete",
  "ledgerFile": "creation-ledger.json",
  "operationError": null
}
--- ordered final children ---
[
  {
    "number": 2,
    "title": "4.1 — Add the application-layer deadline change operation",
    "html_url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/2"
  },
  {
    "number": 3,
    "title": "4.2 — Expose deadline changes through the booking facade",
    "html_url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/3"
  },
  {
    "number": 4,
    "title": "4.3 — Implement the deadline editor backing model",
    "html_url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/4"
  },
  {
    "number": 5,
    "title": "4.4 — Implement the PrimeFaces deadline dialog",
    "html_url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/5"
  },
  {
    "number": 6,
    "title": "4.5 — Integrate deadline editing into the Administration dashboard",
    "html_url": "https://github.com/edburns/edburns-dd-3069621-cargotracker-linux-x64/issues/6"
  }
]
<shellId: 8 completed with exit code 0>
```

</details>


---

<sub>2m 48s</sub>

### `rg`

**shepherd-task-25-given-list|given-list**

"shepherd-task-25-given-list|given-list" in *.md (~/.copilot/plugins/shepherd-task)

<details>
<summary>42 matches</summary>

```
[grep content: 35 matches across 7 file(s) under /home/edburns/.copilot/plugins/shepherd-task]

figure (7 match(es)):
  05- post-mortem.md:3:The given-list exit path invokes stage 50 for both successful and failed runs.
  01- shepherd-task-25-given-list.md:1:# Figure 01 — Stage 25 given-list batch orchestration
  01- shepherd-task-25-given-list.md:3:Stage 25 (`shepherd-task-25-given-list`) owns one serial run. It validates the durable campaign
  01- shepherd-task-25-given-list.md:12:    participant GL as Stage 25: shepherd-task-25-given-list
  01- shepherd-task-25-given-list.md:14:    participant RM as given-list run manifest
  02- shepherd-task.md:4:existing given-list run directory. It derives repository, base branch, campaign
  02- shepherd-task.md:10:    participant GL as Stage 25 given-list runner

README.md (16 match(es)):
  33: - one or more `shepherd-task-25-given-list` runs.
  54: | 25         |                                                    | `shepherd-task-25-given-list`                     | Runs selected child issues serially, invokes `shepherd-task` separately for each issue to perform stages 30 and 40, and always invokes stage 50 |
  57: | 50         | `shepherd-task-50-create-post-mortem`              |                                                   | Writes an evidence-based report for the given-list run                               |
  256: ./plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh \
  264: .\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1 `
  295: - [Figure 01 — stage 25 given-list batch orchestration](figure-01-shepherd-task-25-given-list.md)
  307:   <given-list-run-directory> \
  448: Every given-list invocation creates
  449: `shepherd-task-25-given-list-run.json`:
  542:     ├── shepherd-task-25-given-list-run.json
  554: Each given-list invocation has its own run directory. A campaign may have
  559: The given-list exit path invokes stage 50 after success or failure. Stage 50
  584:   <given-list-run-directory>
  604: - A given-list run stops on the first failed issue but still runs stage 50 and
  606: - Resume a campaign by starting a new given-list run with the remaining issues.
  627: | `scripts/shepherd-task-25-given-list.*` | Run stage 25: create a run and dispatch issues serially |

workshop.md (3 match(es)):
  215: & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `
  229: /Users/edburns/.copilot/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh 2\,3 1-math-control-remove-before-merge
  241: By the time you have invoked `shepherd-task-25-given-list` the work proceeds in an entirely human hands-off manner. See `awesome-copilot-01/plugins/shepherd-task/README.md` Sections **Stage 30 readiness boundary** through **Workflow approval helper** and **Post-mortem behavior**.
making-of.md:248: `shepherd-task-25-given-list-run.json`. The run begins as `running` and is

skills/shepherd-task (4 match(es)):
  50- create-post-mortem/SKILL.md:13:This skill is designed to be invoked from `shepherd-task-25-given-list.ps1` / `shepherd-task-25-given-list.sh` in a `finally` / `trap EXIT` path so it runs for **all outcomes**, not only after success.
  50- create-post-mortem/SKILL.md:60:2. If `shepherd-task-25-given-list-run.json` exists, verify its campaign ID,
  20- create-issues-from-plan/SKILL.md:345:2. Comma-separated child issue numbers for `shepherd-task-25-given-list`.
  20- create-issues-from-plan/SKILL.md:346:3. Suggested campaign-aware given-list invocation using the ordered issue numbers and `PLAN_DIRECTORY`; stage 25 derives `LESSON_PROPAGATION` from the campaign manifest.

test/simple-math-treatment-control/README.md (2 match(es)):
  407: & "$ShepherdPlugin/scripts/shepherd-task-25-given-list.ps1" `
  416: & "$ShepherdPlugin/scripts/shepherd-task-25-given-list.ps1" `

test/cargotracker-add-change-arrival-deadline-feature-treatment-control/README.md (2 match(es)):
  305: & "$ShepherdPlugin\scripts\shepherd-task-25-given-list.ps1" `
  310: & "$ShepherdPlugin\scripts\shepherd-task-25-given-list.ps1" `
```

</details>


---

<sub>2m 48s</sub>

### `sql`

**Complete stage workflow**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Complete stage workflow",
  "query": "UPDATE todos SET status='done', updated_at=CURRENT_TIMESTAMP WHERE id IN ('create-stage20','verify-stage20'); SELECT id,status FROM todos ORDER BY created_at,id"
}
```

</details>

<details>
<summary>11 lines</summary>

```
Executed 2 statement(s):

1. UPDATE
   2 row(s) updated.

2. SELECT
   4 row(s) returned:
   
   | id | status |
   | --- | --- |
   | create-stage20 | done |
   | draft-stage20 | done |
   | validate-stage20 | done |
   | verify-stage20 | done |
```

</details>


---

<sub>2m 51s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/README.md.**

/home/edburns/.copilot/plugins/shepherd-task/README.md (lines 240-272)

<details>
<summary>24 lines</summary>

````
studies its bundled issue examples, drafts all child bodies, and persists them
before creating anything. It prefers an enabled organization issue type named
`Task`; otherwise it creates ordinary untyped issues.

Stage 20 creates and links issues one at a time and records every result in
`creation-ledger.json`. It is deliberately one-shot, not resumable. On partial
failure it stops, reconciles the ledger, prints deletion commands, and requires
manual cleanup before another invocation. The launcher requires
`stage-20-result.json` to explicitly report `complete`; a zero Copilot process
exit alone is not treated as successful issue creation.

### 5. Run stage 25 with an ordered issue list

Bash:

```bash
./plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh \
  "<issue-number>,<issue-number>" \
  <campaign-metadata-directory>
```

PowerShell:

```powershell
.\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1 `
  -TaskIssues "<issue-number>,<issue-number>" `
  -CampaignMetadataDirectory <campaign-metadata-directory>
```

Stage 25 invokes `shepherd-task` for each issue in order.

**Note:** Manually invoking `shepherd-task` is also supported entry-point.
````

</details>


---

<sub>2m 54s</sub>

### Copilot

Created and verified five ordered child issues under #1. `stage-20-result.json` reports `complete`; all issues are open, unassigned, linked exactly once, and created **without an issue type**.

| Implementation subsection | Issue | Title |
|---|---:|---|
| 4.1 | #2 | Add the application-layer deadline change operation |
| 4.2 | #3 | Expose deadline changes through the booking facade |
| 4.3 | #4 | Implement the deadline editor backing model |
| 4.4 | #5 | Implement the PrimeFaces deadline dialog |
| 4.5 | #6 | Integrate deadline editing into the Administration dashboard |

**Ordered given-list:** `2,3,4,5,6`

```bash
/home/edburns/.copilot/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh \
  "2,3,4,5,6" \
  1-arrival-deadline-control-remove-before-merge
```

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>
