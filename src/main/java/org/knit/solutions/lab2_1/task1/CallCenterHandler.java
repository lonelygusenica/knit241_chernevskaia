package org.knit.solutions.lab2_1.task1;

class CallCenterHandler extends ComplaintHandler {

    public CallCenterHandler() {
        setNextHandler(new ManagerHandler());
    }

    @Override
    protected boolean canHandle(Complaint complaint) {
        return complaint.getDifficulty() <= 3;
    }

    @Override
    protected void resolve(Complaint complaint) {
        System.out.println("Колл-центр решил проблему: " + complaint.getDescription());
    }
}
