class Bank{
    String name;
    String officeAddress;
    String manager;
    int ifcCode;
    double fixDepositRate;
    double personalInterestRate;
    double businessLoneRate;

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public void setIfcCode(int ifcCode) {
        this.ifcCode = ifcCode;
    }

    public void setFixDepositRate(double fixDepositRate) {
        this.fixDepositRate = fixDepositRate;
    }

    public void setPersonalInterestRate(double personalInterestRate) {
        this.personalInterestRate = personalInterestRate;
    }

    public void setBusinessLoneRate(double businessLoneRate) {
        this.businessLoneRate = businessLoneRate;
    }

    public String getName() {
        return name;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public String getManager() {
        return manager;
    }

    public int getIfcCode() {
        return ifcCode;
    }

    public double getFixDepositRate() {
        return fixDepositRate;
    }

    public double getBusinessLoneRate() {
        return businessLoneRate;
    }

    public double getPersonalInterestRate() {
        return personalInterestRate;
    }
}

class SBI extends Bank{
    public SBI(String name,String officeAddress,String manager,int ifcCode,double fixDepositRate,double personalInterestRate,double businessLoneRate){
        this.name=name;
        this.officeAddress=officeAddress;
        this.manager=manager;
        this.ifcCode=ifcCode;
        this.fixDepositRate=fixDepositRate;
        this.personalInterestRate=personalInterestRate;
        this.businessLoneRate=businessLoneRate;
    }

    @Override
    public String toString() {
        return "SBI{" +
                "name='" + name + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", manager='" + manager + '\'' +
                ", ifcCode=" + ifcCode +
                ", fixDepositRate=" + fixDepositRate +
                ", personalInterestRate=" + personalInterestRate +
                ", businessLoneRate=" + businessLoneRate +
                '}';
    }
}

class BOI extends Bank{
    public BOI(String name,String officeAddress,String manager,int ifcCode,double fixDepositRate,double personalInterestRate,double businessLoneRate){
        this.name=name;
        this.officeAddress=officeAddress;
        this.manager=manager;
        this.ifcCode=ifcCode;
        this.fixDepositRate=fixDepositRate;
        this.personalInterestRate=personalInterestRate;
        this.businessLoneRate=businessLoneRate;
    }

    @Override
    public String toString() {
        return "BOI{" +
                "name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", ifcCode=" + ifcCode +
                ", fixDepositRate=" + fixDepositRate +
                ", personalInterestRate=" + personalInterestRate +
                ", businessLoneRate=" + businessLoneRate +
                '}';
    }
}

class ICIC extends Bank {
    public ICIC(String name, String officeAddress, String manager, int ifcCode, double fixDepositRate, double personalInterestRate, double businessLoneRate) {
        this.name = name;
        this.officeAddress = officeAddress;
        this.manager = manager;
        this.ifcCode = ifcCode;
        this.fixDepositRate = fixDepositRate;
        this.personalInterestRate = personalInterestRate;
        this.businessLoneRate = businessLoneRate;
    }

    @Override
    public String toString() {
        return "ICIC{" +
                "name='" + name + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", manager='" + manager + '\'' +
                ", ifcCode=" + ifcCode +
                ", personalInterestRate=" + personalInterestRate +
                ", fixDepositRate=" + fixDepositRate +
                ", businessLoneRate=" + businessLoneRate +
                '}';
    }
}
    public class Question6 {
}
