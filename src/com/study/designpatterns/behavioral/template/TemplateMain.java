package com.study.designpatterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        var template = new TransferMoney(new AuditTrail());
        template.execute();
        // template.doExecute();
    }
}
