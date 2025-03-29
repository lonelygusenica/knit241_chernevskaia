package org.knit.solutions.lab2_1.task1;

class SeniorManagerHandler extends ComplaintHandler {

    public SeniorManagerHandler() {
        setNextHandler(new LegalDepartmentHandler());
    }

    @Override
    protected boolean canHandle(Complaint complaint) {
        return complaint.getDifficulty() <= 9;
    }

    @Override
    protected void resolve(Complaint complaint) {
        System.out.println("Старший менеджер решил проблему: " + complaint.getDescription());
    }
}
