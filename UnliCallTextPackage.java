public class UnliCallTextPackage implements UnliCallTextOffer{
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + (unliCallText ? " unlimited calls and texts" : " do not offer any free calls or texts" ); 
    }

    
}