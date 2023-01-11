package org.snva.helloworld.beans;

public class Role {
//    private long roleId;
//
//
//    public long getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(long roleId) {
//        this.roleId = roleId;
//    }
//
//    public String getRoleName() {
//        return roleName;
//    }
//
//    public void setRoleName(String roleName) {
//        this.roleName = roleName;
//    }
//
//    public String getRoleDescription() {
//        return roleDescription;
//    }
//
//    public void setRoleDescription(String roleDescription) {
//        this.roleDescription = roleDescription;
//    }
//
//    private String roleName;
//    private String roleDescription;
//
//    @Override
//    public String toString() {
//        return "Role{" +
//                "roleId=" + roleId +
//                ", roleName='" + roleName + '\'' +
//                ", roleDescription='" + roleDescription + '\'' +
//                '}';
//    }
//
//    public void init(){
//        System.out.println("Role has been created");
//    }
//
//    public void destroy(){
//        System.out.println(this.roleName + "with has been destroyed" );
//    }

    private String learner;
    private String instructor;
    private String reason;

    public String getLearner() {
        return learner;
    }

    public void setLearner(String learner) {
        this.learner = learner;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Role{" +
                "learner='" + learner + '\'' +
                ", instructor='" + instructor + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
