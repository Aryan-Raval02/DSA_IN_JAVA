public class Problem2469 
{
    public double[] convertTemperature(double celsius) {
        // double[] ans = new double[2];
        // ans[0] = celsius + 273.15d;
        // ans[1] = celsius * 1.80d + 32.00d;

        // return ans;

        return new double[]{celsius + 273.15d, celsius * 1.80d + 32.00d};
    }    
}
