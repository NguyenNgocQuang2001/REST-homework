package homework.com.calculator;

public class Calculator {
    
    double a;
    double b;
    String operator;
    public Calculator() {

        this.a = 0;
        this.b = 1;
    }

    public Calculator(double _a, double _b, String _operator) {

        this.a = _a;
        this.b = _b;
        this.operator = _operator;
    }

    public double calc() {

        if (this.operator.equals("+")) {

            return this.a + this.b;
        } else if (this.operator.equals("-")) {

            return this.a - this.b;
        } else if (this.operator.equals("*")) {

            return this.a * this.b;
        } else if (this.operator.equals("^")) {

            return Math.pow(this.a, this.b);
        } else if (this.operator.equals("/")) {

            if (this.b == 0) {

                throw new ArithmeticException("ko the chia cho 0");
            } else {

                return this.a / this.b;
            }
        } else {

            throw new ArithmeticException("phep toan khong hop le");
        }
    }
}
