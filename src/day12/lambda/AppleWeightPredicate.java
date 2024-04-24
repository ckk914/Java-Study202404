package day12.lambda;

public class AppleWeightPredicate implements ApplePredicate {

    @Override
    public Boolean test(Apple apple) {
        return apple.getWeight()>=100;
    }
}
