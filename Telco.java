public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    public Telco(Integer dataAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }
    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(getTelcoName(), getPromoPrice());
    }
    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(getTelcoName(), getUnliCallText());
    }

    public String getTelcoName() {
        return telcoName;
    }
    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }
    public double getPromoPrice() {
        return promoPrice;
    }
    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }
    public Integer getDataAllowance() {
        return dataAllowance;
    }
    public void setDataAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }
    public boolean getUnliCallText() {
        return unliCallText;
    }
    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}