package org.knit.solutions.lab2_1.task1;

class LegalDepartmentHandler extends ComplaintHandler {


    @Override
    protected boolean canHandle(Complaint complaint) {
        return true;
    }

    @Override
    protected void resolve(Complaint complaint) {
        System.out.println("Юридический отдел решил проблему: " + complaint.getDescription());
    }
}