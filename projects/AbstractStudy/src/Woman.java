public class Woman extends Human{
    @Override
    public String hiWorld() {
        return "I'm woman, Nice To Meet You man";
    }
    public Integer myAge() {
        return this.age();
    }
}
