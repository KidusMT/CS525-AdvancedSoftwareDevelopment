package skeleton;

public class CheckingStrategyImpl extends InterestStrategy {

    @Override
    public double addInterest(double balance) {
        double interest = 0.0;

        if(balance < 1000)
            interest = balance * 0.015;
        else if(balance > 1000)
            interest = balance * 0.025;

        return interest;
    }
}
