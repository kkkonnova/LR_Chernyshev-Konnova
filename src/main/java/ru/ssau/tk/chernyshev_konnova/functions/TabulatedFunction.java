package ru.ssau.tk.chernyshev_konnova.functions;

public interface TabulatedFunction extends MathFunction {
    int getCount();

    double getX(int index);

    void setY(int index, double value);

    int indexOfX(double x);

    int indexOfY(double y);

    double leftBound();

    double rightBound();
}
