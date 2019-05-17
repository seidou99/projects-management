package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "task")
    private List<Attachment> attachments;

    @NotNull
    @ManyToOne(targetEntity = Project.class)
    private Project project;

    @Column(nullable = false)
    private Long code;

    @Size(min = 20, max = 600)
    @Column(length = 600, nullable = false)
    private String description;

    @NotNull
    @ManyToOne(targetEntity = TaskPriority.class)
    private TaskPriority priority;

    @NotNull
    @ManyToOne(targetEntity = TaskStatus.class)
    private TaskStatus status;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date created;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Temporal(TemporalType.DATE)
    private Date resolved;

    @Temporal(TemporalType.DATE)
    private Date closed;

    @Temporal(TemporalType.DATE)
    private Date updated;

    @NotNull
    private int estimation;

    @ManyToOne(targetEntity = User.class)
    private User assignee;

    @NotNull
    @ManyToOne(targetEntity = User.class)
    private User reporter;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public User getReporter() {
        return reporter;
    }

    public void setReporter(User reporter) {
        this.reporter = reporter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getResolved() {
        return resolved;
    }

    public void setResolved(Date resolved) {
        this.resolved = resolved;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return estimation == task.estimation &&
                Objects.equals(id, task.id) &&
                Objects.equals(attachments, task.attachments) &&
                Objects.equals(project, task.project) &&
                Objects.equals(code, task.code) &&
                Objects.equals(description, task.description) &&
                Objects.equals(priority, task.priority) &&
                Objects.equals(status, task.status) &&
                Objects.equals(created, task.created) &&
                Objects.equals(dueDate, task.dueDate) &&
                Objects.equals(resolved, task.resolved) &&
                Objects.equals(closed, task.closed) &&
                Objects.equals(updated, task.updated) &&
                Objects.equals(assignee, task.assignee) &&
                Objects.equals(reporter, task.reporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attachments, project, code, description, priority, status, created, dueDate, resolved, closed, updated, estimation, assignee, reporter);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", attachments=" + attachments +
                ", project=" + project +
                ", code=" + code +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", created=" + created +
                ", dueDate=" + dueDate +
                ", resolved=" + resolved +
                ", closed=" + closed +
                ", updated=" + updated +
                ", estimation=" + estimation +
                ", assignee=" + assignee +
                ", reporter=" + reporter +
                '}';
    }
}