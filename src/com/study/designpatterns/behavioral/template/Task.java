package com.study.designpatterns.behavioral.template;

public class Task {

    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected void doExecute(){}
}
