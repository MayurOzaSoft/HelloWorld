package com.study.designpatterns.behavioral.template;

public class TransferMoney extends Task {

    public TransferMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
