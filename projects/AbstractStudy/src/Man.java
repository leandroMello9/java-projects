public class Man extends Human {
    @Override
    public String hiWorld() {
        return "I'm man, Nice to meet you!";
    }
    public Integer myAge() {
        return this.age();
    }
}
